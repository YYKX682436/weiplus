package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.f f257363a = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.C18791x7f70e5ad f257364b;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory] */
    static {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
        f257364b = new com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator() { // from class: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory
            @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator
            /* renamed from: createMediaMuxer */
            public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 mo72402xdf726115(java.lang.String path, int format) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c(path, format);
            }

            @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator
            /* renamed from: parallelMux */
            public int mo72403x25db7049(java.util.List<? extends com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422> muxers) {
                java.lang.Object obj;
                java.lang.Object obj2;
                java.lang.Object obj3;
                java.lang.Object obj4;
                int i17;
                boolean z17;
                int i18;
                float f17;
                java.util.ArrayList arrayList;
                java.util.Iterator it;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b17;
                if (muxers == null || !(kz5.n0.X(muxers) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c)) {
                    return -1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.f.f257363a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", "parallelMuxImp size:" + muxers.size());
                java.util.Iterator<T> it6 = muxers.iterator();
                while (true) {
                    obj = null;
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj2).b() != null) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj2;
                com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036 = cVar != null ? cVar.f257350c : null;
                java.util.Iterator<T> it7 = muxers.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it7.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj3).a();
                    if ((a17 != null ? a17.f257339c : null) != null) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj3;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a18 = cVar2 != null ? cVar2.a() : null;
                java.util.Iterator<T> it8 = muxers.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it8.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj4).b();
                    if ((b18 != null ? b18.f257339c : null) != null) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c cVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj4;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b19 = cVar3 != null ? cVar3.b() : null;
                android.media.MediaFormat mediaFormat = a18 != null ? a18.f257339c : null;
                android.media.MediaFormat mediaFormat2 = b19 != null ? b19.f257339c : null;
                int a19 = fVar.a(mediaFormat, "sample-rate", 0);
                int a27 = fVar.a(mediaFormat, "channel-count", 0);
                int a28 = fVar.a(mediaFormat2, "frame-rate", 0);
                int a29 = fVar.a(mediaFormat2, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, 0);
                float a37 = fVar.a(mediaFormat2, "frame-rate", 0);
                float f18 = b19 != null ? (b19.f257340d * 1000.0f) / b19.f257341e : 30.0f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", "audioSampleRate:" + a19 + " \naudioChannelCount:" + a27 + " \nmediaFormatFps:" + a28 + " \nvideoBitrate:" + a29 + "\nduration:$0\ncountFps:" + f18 + "\nconfigToSoftEncode:");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportConfig: \naudioSampleRate:");
                sb6.append(c25679xbb204036 != null ? java.lang.Integer.valueOf(c25679xbb204036.m96735x317dfe9c()) : null);
                sb6.append("\naudioChannelCount:");
                sb6.append(c25679xbb204036 != null ? java.lang.Integer.valueOf(c25679xbb204036.m96733x2721f40c()) : null);
                sb6.append("\nvideoBitrate:");
                sb6.append(c25679xbb204036 != null ? java.lang.Integer.valueOf(c25679xbb204036.m96745x52061508()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", sb6.toString());
                if (a19 <= 0 && c25679xbb204036 != null) {
                    c25679xbb204036.m96735x317dfe9c();
                }
                if (a27 <= 0) {
                    a27 = c25679xbb204036 != null ? c25679xbb204036.m96733x2721f40c() : 0;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                kz5.n0.F0(muxers, new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.e());
                if (a37 < 1.0f) {
                    a37 = f18;
                }
                java.util.Iterator<T> it9 = muxers.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it9.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) next).b() != null) {
                        obj = next;
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c cVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) obj;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("device_make_b_frame", (cVar4 == null || (b17 = cVar4.b()) == null || b17.f257347k <= 30) ? false : true);
                com.p314xaae8f345.mm.p871x7fa16b7e.C10908xb9e4d52f c10908xb9e4d52f = new com.p314xaae8f345.mm.p871x7fa16b7e.C10908xb9e4d52f();
                c10908xb9e4d52f.e();
                java.util.Iterator it10 = muxers.iterator();
                java.lang.String str = "";
                long j17 = 0;
                while (it10.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c cVar5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) it10.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b27 = cVar5.b();
                    if (b27 != null) {
                        java.lang.String str2 = b27.f257342f;
                        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("muxer[");
                        it = it10;
                        sb7.append(cVar5.f257354g);
                        sb7.append("] write video,path:");
                        sb7.append(str2);
                        sb7.append(" size:");
                        sb7.append(k17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", sb7.toString());
                        if (k17 <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TAVKitParallelMuxer", "mux error,empty video file.index:" + cVar5.f257354g + " info:" + cVar5.f257355h);
                            i17 = 0;
                            i18 = 0;
                            break;
                        }
                        long[] T0 = kz5.n0.T0(b27.f257344h);
                        java.util.ArrayList arrayList3 = b27.f257343g;
                        long[] T02 = kz5.n0.T0(arrayList3);
                        c10908xb9e4d52f.c(T0, a37);
                        c10908xb9e4d52f.b(T02, a37);
                        arrayList2.add(str2);
                        f17 = a37;
                        arrayList = arrayList2;
                        long j18 = b27.f257340d + j17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", "muxer[" + cVar5.hashCode() + "] size:" + arrayList3.size() + " pts-size:" + T0.length + " dts-size:" + T02.length + " frame-size:" + b27.f257340d + " total:" + j18);
                        j17 = j18;
                    } else {
                        f17 = a37;
                        arrayList = arrayList2;
                        it = it10;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a38 = cVar5.a();
                    if (a38 != null) {
                        java.lang.String str3 = a38.f257342f;
                        long k18 = com.p314xaae8f345.mm.vfs.w6.k(str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", "muxer[" + cVar5.f257354g + "] write audio,path:" + str3 + " size:" + k18);
                        if (k18 <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TAVKitParallelMuxer", "mux error,empty audio file.index:" + cVar5.f257354g + " info:" + cVar5.f257355h);
                            i17 = 0;
                            i18 = 0;
                            break;
                        }
                        c10908xb9e4d52f.a(kz5.n0.T0(a38.f257344h));
                        str = str3;
                    }
                    it10 = it;
                    arrayList2 = arrayList;
                    a37 = f17;
                }
                float f19 = a37;
                java.util.ArrayList arrayList4 = arrayList2;
                if (a27 <= 0 || android.text.TextUtils.isEmpty(str)) {
                    i17 = 0;
                    z17 = true;
                } else {
                    i17 = 0;
                    z17 = false;
                }
                int f27 = c10908xb9e4d52f.f((java.lang.String[]) arrayList4.toArray(new java.lang.String[i17]), str, ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.c) kz5.n0.X(muxers)).f257348a, j17, f19, z17);
                c10908xb9e4d52f.g();
                java.util.Iterator it11 = arrayList4.iterator();
                while (it11.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it11.next();
                    if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                        com.p314xaae8f345.mm.vfs.w6.h(str4);
                    }
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelMuxer", "stop ret:" + f27);
                i18 = f27 == 0 ? 1 : i17;
                if (i18 != 0) {
                    return i17;
                }
                return -1;
            }
        };
    }

    public final int a(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        return (mediaFormat != null && mediaFormat.containsKey(str)) ? mediaFormat.getInteger(str) : i17;
    }
}
