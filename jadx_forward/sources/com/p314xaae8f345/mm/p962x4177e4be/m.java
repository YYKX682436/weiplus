package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public gp.c f153232a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.l f153233b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.l f153234c;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f153237f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153238g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153239h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f153240i;

    /* renamed from: j, reason: collision with root package name */
    public long f153241j;

    /* renamed from: k, reason: collision with root package name */
    public long f153242k;

    /* renamed from: n, reason: collision with root package name */
    public int f153245n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f153235d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f153236e = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public int f153243l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f153244m = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153246o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153247p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f153248q = false;

    public java.lang.String a() {
        if (this.f153239h == null) {
            this.f153239h = this.f153238g + "video_temp.mp4";
        }
        return this.f153239h;
    }

    public void b(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        java.util.List list;
        java.util.List list2;
        gp.d dVar;
        java.lang.String str3;
        java.util.Objects.toString(c11120x15dce88d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || c11120x15dce88d == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.CHINA, "Argument's null or nil. src = %s; dst = %s; param = %s", str, str2, c11120x15dce88d));
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (!r6Var.m() || !r6Var.h() || r6Var.C() == 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.CHINA, "Argument src video file can not be read or empty %s", str));
        }
        this.f153237f = str;
        this.f153238g = str2;
        this.f153240i = c11120x15dce88d;
        gp.c cVar = new gp.c();
        this.f153232a = cVar;
        cVar.k(str);
        gp.c cVar2 = this.f153232a;
        int d17 = cVar2.d();
        int i17 = 0;
        while (true) {
            list = this.f153235d;
            list2 = this.f153236e;
            if (i17 >= d17) {
                break;
            }
            android.media.MediaFormat e17 = cVar2.e(i17);
            if (e17.containsKey("mime") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.getString("mime"))) {
                java.lang.String string = e17.getString("mime");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranferH265toH264", "mime: %s", string);
                if (string.startsWith("audio/")) {
                    ((java.util.ArrayList) list2).add(new com.p314xaae8f345.mm.p962x4177e4be.l(this, e17, i17));
                } else if (string.startsWith("video/")) {
                    ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.p962x4177e4be.l(this, e17, i17));
                }
            }
            i17++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranferH265toH264", "findMediaFormat mAudioSelectedTrackList.size() = %d, mVideoSelectedTrackList.size() = %d", java.lang.Integer.valueOf(((java.util.ArrayList) list2).size()), java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
        if (list == null || ((java.util.ArrayList) list).size() == 0) {
            throw new com.p314xaae8f345.mm.p962x4177e4be.k("Can not find video or audio track in this video file.");
        }
        int i18 = -1;
        if (list2 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list2;
            if (arrayList.size() != 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p962x4177e4be.l lVar = (com.p314xaae8f345.mm.p962x4177e4be.l) it.next();
                    if (lVar.f153230a.containsKey("max-input-size")) {
                        i18 = java.lang.Math.max(lVar.f153230a.getInteger("max-input-size"), i18);
                    }
                }
            }
        }
        if (list != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (arrayList2.size() != 0) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p962x4177e4be.l lVar2 = (com.p314xaae8f345.mm.p962x4177e4be.l) it6.next();
                    if (lVar2.f153230a.containsKey("max-input-size")) {
                        i18 = java.lang.Math.max(lVar2.f153230a.getInteger("max-input-size"), i18);
                    }
                }
            }
        }
        this.f153243l = i18;
        try {
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                if (fp.h.c(17)) {
                    str3 = dVar.extractMetadata(24);
                } else {
                    str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str) + "";
                }
                dVar.extractMetadata(19);
                dVar.extractMetadata(18);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
                try {
                    dVar.release();
                } catch (java.io.IOException unused) {
                }
                this.f153244m = P;
                this.f153246o = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoTranferH265toH264", "init cost time %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (dVar != null) {
                    try {
                        dVar.release();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar = null;
        }
    }

    public final boolean c(gp.c cVar, int i17, int i18) {
        com.p314xaae8f345.mm.p962x4177e4be.l lVar = this.f153234c;
        if (lVar == null) {
            return false;
        }
        cVar.i(lVar.f153231b);
        cVar.h(this.f153241j * 1000, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        try {
            this.f153234c.f153230a.getInteger("channel-count");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoTranferH265toH264", "get channel count error: %s", 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranferH265toH264", "audio channel count");
        while (true) {
            allocateDirect.clear();
            int f17 = cVar.f(allocateDirect, 0);
            if (f17 > 0) {
                if (cVar.b() >= this.f153242k * 1000) {
                    break;
                }
                if (cVar.c() != this.f153234c.f153231b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoTranferH265toH264", "track index not match! break");
                    break;
                }
                allocateDirect.position(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66904xb00a27f9(i18, allocateDirect, f17);
                cVar.a();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranferH265toH264", "VideoClipperAPI18.muxAudio size = %d. Saw eos.", java.lang.Integer.valueOf(f17));
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p962x4177e4be.m.d(long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011c A[Catch: all -> 0x01ae, Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x001e, B:6:0x0027, B:8:0x0052, B:10:0x0068, B:11:0x0089, B:17:0x00dc, B:19:0x011c, B:20:0x014f, B:22:0x0156, B:23:0x0163, B:25:0x0167, B:26:0x017c, B:34:0x0173, B:35:0x013c, B:38:0x00cf), top: B:2:0x001e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0156 A[Catch: all -> 0x01ae, Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x001e, B:6:0x0027, B:8:0x0052, B:10:0x0068, B:11:0x0089, B:17:0x00dc, B:19:0x011c, B:20:0x014f, B:22:0x0156, B:23:0x0163, B:25:0x0167, B:26:0x017c, B:34:0x0173, B:35:0x013c, B:38:0x00cf), top: B:2:0x001e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0167 A[Catch: all -> 0x01ae, Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x001e, B:6:0x0027, B:8:0x0052, B:10:0x0068, B:11:0x0089, B:17:0x00dc, B:19:0x011c, B:20:0x014f, B:22:0x0156, B:23:0x0163, B:25:0x0167, B:26:0x017c, B:34:0x0173, B:35:0x013c, B:38:0x00cf), top: B:2:0x001e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0173 A[Catch: all -> 0x01ae, Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x001e, B:6:0x0027, B:8:0x0052, B:10:0x0068, B:11:0x0089, B:17:0x00dc, B:19:0x011c, B:20:0x014f, B:22:0x0156, B:23:0x0163, B:25:0x0167, B:26:0x017c, B:34:0x0173, B:35:0x013c, B:38:0x00cf), top: B:2:0x001e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c A[Catch: all -> 0x01ae, Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x001e, B:6:0x0027, B:8:0x0052, B:10:0x0068, B:11:0x0089, B:17:0x00dc, B:19:0x011c, B:20:0x014f, B:22:0x0156, B:23:0x0163, B:25:0x0167, B:26:0x017c, B:34:0x0173, B:35:0x013c, B:38:0x00cf), top: B:2:0x001e, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.p314xaae8f345.mm.p962x4177e4be.r r24, gp.c r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p962x4177e4be.m.e(com.tencent.mm.modelvideoh265toh264.r, gp.c, int, int):void");
    }
}
