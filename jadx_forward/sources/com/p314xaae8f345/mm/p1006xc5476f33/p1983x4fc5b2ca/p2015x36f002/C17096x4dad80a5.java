package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/util/MultiMediaVideoChecker;", "", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Lqc0/d1;", "getVideoInfoBySightJNI", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker */
/* loaded from: classes10.dex */
public final class C17096x4dad80a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5 f237984a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f237985b = new java.util.HashMap();

    /* renamed from: getVideoInfoBySightJNI */
    private final qc0.d1 m68398xe57fb7b2(java.lang.String path) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(path, true);
            if (d17 == null) {
                return null;
            }
            int i17 = d17.f243928n;
            if (i17 < 0) {
                i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(path);
            }
            qc0.d1 d1Var = new qc0.d1(d17.f243917c, d17.f243918d, d17.f243919e, d17.f243915a, d17.f243916b, i17, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69204x8998e7bb(path), d17.f243921g, d17.f243920f, d17.f243922h, d17.f243926l);
            d1Var.f442907l = d17;
            return d1Var;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final qc0.d1 a(java.lang.String path) {
        hs0.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        hs0.a aVar2 = null;
        try {
            aVar = new hs0.a(path);
        } catch (java.lang.Exception unused) {
            aVar = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            android.media.MediaFormat mediaFormat = aVar.f366085f;
            boolean z17 = true;
            long j17 = (mediaFormat != null && mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : 0L) / 1000;
            int integer = mediaFormat != null && mediaFormat.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) ? mediaFormat.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) : 0;
            int integer2 = mediaFormat != null && mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 0;
            if (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) {
                z17 = false;
            }
            qc0.d1 d1Var = new qc0.d1(0, 0, 0.0f, j17, 0, 0, true, integer, integer2, z17 ? mediaFormat.getInteger("sample-rate") : 0, -1);
            aVar.d();
            return d1Var;
        } catch (java.lang.Exception unused2) {
            if (aVar != null) {
                aVar.d();
            }
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            aVar2 = aVar;
            if (aVar2 != null) {
                aVar2.d();
            }
            throw th;
        }
    }

    public final qc0.d1 b(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return c(path, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:21|(1:23)(1:151)|24|(22:25|26|27|28|29|(1:143)(1:33)|(1:35)(1:142)|36|(1:141)(1:40)|(1:42)(1:140)|43|(1:139)(1:47)|(1:49)(1:138)|50|51|(1:137)(1:55)|(1:57)(1:136)|58|(1:135)(1:62)|(1:64)(1:134)|(1:66)|68)|(5:70|71|72|73|(17:75|(2:126|127)(1:77)|78|(1:125)(1:82)|(1:84)(1:124)|85|(1:123)(1:89)|(2:91|92)(1:122)|93|(1:121)(1:97)|(1:99)(1:120)|100|101|102|103|104|105))(1:133)|128|(0)(0)|78|(1:80)|125|(0)(0)|85|(1:87)|123|(0)(0)|93|(1:95)|121|(0)(0)|100|101|102|103|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b A[Catch: all -> 0x017d, Exception -> 0x017f, TRY_LEAVE, TryCatch #0 {Exception -> 0x017f, blocks: (B:127:0x010f, B:78:0x0116, B:80:0x011f, B:84:0x012b, B:87:0x0135, B:91:0x0141, B:95:0x014e, B:99:0x015c, B:100:0x0165), top: B:126:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141 A[Catch: all -> 0x017d, Exception -> 0x017f, TRY_LEAVE, TryCatch #0 {Exception -> 0x017f, blocks: (B:127:0x010f, B:78:0x0116, B:80:0x011f, B:84:0x012b, B:87:0x0135, B:91:0x0141, B:95:0x014e, B:99:0x015c, B:100:0x0165), top: B:126:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c A[Catch: all -> 0x017d, Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:127:0x010f, B:78:0x0116, B:80:0x011f, B:84:0x012b, B:87:0x0135, B:91:0x0141, B:95:0x014e, B:99:0x015c, B:100:0x0165), top: B:126:0x010f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qc0.d1 c(java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.c(java.lang.String, boolean):qc0.d1");
    }
}
