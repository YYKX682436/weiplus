package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h f257365a = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.C18792x78d795a5 f257366b;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory] */
    static {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
        f257366b = new com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator() { // from class: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory
            @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator
            /* renamed from: createMediaMuxer */
            public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 mo72402xdf726115(java.lang.String path, int format) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d(path, format);
            }

            @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.MediaMuxerCreator
            /* renamed from: parallelMux */
            public int mo72403x25db7049(java.util.List<? extends com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422> muxers) {
                java.lang.Object obj;
                java.lang.Object obj2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h hVar;
                java.util.ArrayList arrayList;
                java.util.Iterator it;
                if (muxers == null) {
                    return -1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h hVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h.f257365a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "parallelMuxImp size:" + muxers.size());
                com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 exportConfig = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) kz5.n0.X(muxers)).getExportConfig();
                java.util.Iterator<T> it6 = muxers.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) obj).getAudioFormat() != null) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) obj;
                android.media.MediaFormat audioFormat = dVar != null ? dVar.getAudioFormat() : null;
                java.util.Iterator<T> it7 = muxers.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) obj2).getVideoFormat() != null) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d dVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) obj2;
                android.media.MediaFormat videoFormat = dVar2 != null ? dVar2.getVideoFormat() : null;
                int integer = (audioFormat != null && audioFormat.containsKey("channel-count")) ? audioFormat.getInteger("channel-count") : 0;
                int integer2 = (videoFormat != null && videoFormat.containsKey("frame-rate")) ? videoFormat.getInteger("frame-rate") : 0;
                if (integer2 < 1) {
                    integer2 = 30;
                }
                int m96733x2721f40c = exportConfig != null ? exportConfig.m96733x2721f40c() : 0;
                if (integer < 0) {
                    integer = m96733x2721f40c;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                kz5.n0.F0(muxers, new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.g());
                com.p314xaae8f345.mm.p871x7fa16b7e.C10908xb9e4d52f c10908xb9e4d52f = new com.p314xaae8f345.mm.p871x7fa16b7e.C10908xb9e4d52f();
                c10908xb9e4d52f.e();
                java.util.Iterator it8 = muxers.iterator();
                java.lang.String str = "";
                long j17 = 0;
                while (it8.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d dVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) it8.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h sightEncode = dVar3.getSightEncode();
                    java.lang.String m69180xc04a2645 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69180xc04a2645(sightEncode != null ? sightEncode.f243948a : 0);
                    android.media.MediaFormat videoFormat2 = dVar3.getVideoFormat();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h hVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h.f257365a;
                    if (videoFormat2 == null || !com.p314xaae8f345.mm.vfs.w6.j(m69180xc04a2645)) {
                        hVar = hVar2;
                        if (dVar3.getVideoFormat() != null && !com.p314xaae8f345.mm.vfs.w6.j(m69180xc04a2645)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TAVKitParallelSoftEncodeMuxer", "mux error,empty video file index:" + dVar3.getIndex() + " path:" + m69180xc04a2645);
                            hVar3.a(c10908xb9e4d52f, muxers);
                            return -2;
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h sightEncode2 = dVar3.getSightEncode();
                        int i17 = sightEncode2 != null ? sightEncode2.f243948a : -1;
                        arrayList3.add(java.lang.Integer.valueOf(i17));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m69180xc04a2645);
                        arrayList2.add(m69180xc04a2645);
                        hVar = hVar2;
                        j17 += dVar3.getVideoFrameCount();
                        long[] m69184x1be0ef2c = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69184x1be0ef2c(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m69184x1be0ef2c, "getSoftEncodeDtsArray(...)");
                        float f17 = integer2;
                        c10908xb9e4d52f.b(m69184x1be0ef2c, f17);
                        long[] m69185xfa6f09a0 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69185xfa6f09a0(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m69185xfa6f09a0, "getSoftEncodePtsArray(...)");
                        c10908xb9e4d52f.d(m69185xfa6f09a0, dVar3.getVideoFrameCount(), f17);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = dVar3.f257362d;
                    if (bVar != null) {
                        java.lang.String str2 = bVar.f257342f;
                        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
                        arrayList = arrayList3;
                        it = it8;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "muxer[" + dVar3.getIndex() + "] write audio,path:" + str2 + " size:" + k17);
                        if (k17 <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TAVKitParallelSoftEncodeMuxer", "mux error,empty audio file.index:" + dVar3.getIndex());
                            hVar3.a(c10908xb9e4d52f, muxers);
                            return -3;
                        }
                        c10908xb9e4d52f.a(kz5.n0.T0(bVar.f257344h));
                        str = str2;
                    } else {
                        arrayList = arrayList3;
                        it = it8;
                    }
                    arrayList3 = arrayList;
                    hVar2 = hVar;
                    it8 = it;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.h hVar4 = hVar2;
                boolean z17 = integer <= 0 || android.text.TextUtils.isEmpty(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "parallelMuxImp before start,videoFrameCount:" + j17 + " audioChannelCount " + integer + " mute:" + z17);
                int f18 = c10908xb9e4d52f.f((java.lang.String[]) arrayList2.toArray(new java.lang.String[0]), str, ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) kz5.n0.X(muxers)).f257359a, j17, (float) integer2, z17);
                hVar4.a(c10908xb9e4d52f, muxers);
                java.util.Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it9.next();
                    if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                        com.p314xaae8f345.mm.vfs.w6.h(str3);
                    }
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "stop ret:" + f18);
                return f18;
            }
        };
    }

    public final void a(com.p314xaae8f345.mm.p871x7fa16b7e.C10908xb9e4d52f c10908xb9e4d52f, java.util.List list) {
        c10908xb9e4d52f.g();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.d) it.next();
            dVar.mo72388x41012807();
            dVar.mo72372xbfab417b();
        }
    }
}
