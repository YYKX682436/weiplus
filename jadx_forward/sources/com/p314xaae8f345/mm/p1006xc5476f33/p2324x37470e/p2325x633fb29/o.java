package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a abaResult, r45.i70 outputConfig) {
        java.util.List<java.lang.Integer> m69137x6a08be81;
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abaResult, "abaResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputConfig, "outputConfig");
        if (abaResult.f257070a == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = abaResult.f257074e;
            int i19 = abaResult.f257071b;
            if (i19 > 0 && (i17 = abaResult.f257072c) > 0 && (i18 = abaResult.f257073d) > 0) {
                outputConfig.f458313i = i19;
                outputConfig.f458314m = i17;
                outputConfig.f458315n = i18;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17683x770f5025);
                outputConfig.D = c17683x770f5025.crf / 100.0f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17683x770f5025);
                outputConfig.E = c17683x770f5025.f37991x6c41574b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionInfoConverter", "video abaResult, width:" + outputConfig.f458313i + ", height:" + outputConfig.f458314m + ", " + outputConfig.f458315n + ", crf:" + outputConfig.D + ", vbvBufferSize:" + outputConfig.E);
            }
            if (c17683x770f5025 == null || (m69137x6a08be81 = c17683x770f5025.m69137x6a08be81()) == null) {
                return;
            }
            outputConfig.f458321t.addAll(m69137x6a08be81);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParams, "videoParams");
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1> arrayList = composition.f257130c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var : arrayList) {
            if (i1Var.f257150b == 2) {
                java.lang.String str = i1Var.f257149a;
                rm5.j jVar = i1Var.f257160l;
                bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b(str, jVar.f479037f, jVar.f479038g);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.d.b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.d.f257108a, arrayList2, videoParams, i17, i18, z17, 0, 32, null);
    }

    public final int c(int i17) {
        return i17 % 2 != 0 ? i17 - 1 : i17;
    }

    public final void d(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams, r45.i70 outputConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParams, "videoParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputConfig, "outputConfig");
        outputConfig.f458315n = videoParams.f152727g;
        outputConfig.f458316o = videoParams.f152726f;
        outputConfig.f458317p = videoParams.f152730m;
        outputConfig.f458318q = videoParams.f152731n;
        outputConfig.f458319r = videoParams.f152732o;
        outputConfig.f458320s = videoParams.f152733p;
        outputConfig.f458322u = videoParams.f152738u;
    }
}
