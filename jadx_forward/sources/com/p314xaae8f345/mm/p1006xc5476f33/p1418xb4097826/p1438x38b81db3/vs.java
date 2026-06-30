package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class vs extends in5.r {
    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i17 = ty2.y.f504655m;
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ty2.y yVar = new ty2.y(context, ty2.r.f504646d, null);
        float b17 = i65.a.b(context, 1);
        yVar.m56019xba0484c9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30(b17, b17, b17, b17));
        return yVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.edn;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r3, in5.c r4, int r5, int r6, boolean r7, java.util.List r8) {
        /*
            r2 = this;
            js2.c r4 = (js2.c) r4
            java.lang.String r5 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r5)
            java.lang.String r5 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r5)
            android.view.View r5 = r3.f3639x46306858
            boolean r6 = r5 instanceof ty2.y
            r7 = 0
            if (r6 == 0) goto L16
            ty2.y r5 = (ty2.y) r5
            goto L17
        L16:
            r5 = r7
        L17:
            if (r5 != 0) goto L1b
            goto L9e
        L1b:
            bw5.q5 r6 = new bw5.q5
            r6.<init>()
            com.tencent.mm.protobuf.g r4 = r4.f383052d
            byte[] r4 = r4.f273689a
            if (r4 != 0) goto L27
            goto L38
        L27:
            r6.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> L2b
            goto L39
        L2b:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "safeParser"
            java.lang.String r8 = ""
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r6, r8, r4)
        L38:
            r6 = r7
        L39:
            if (r6 != 0) goto L3c
            goto L9e
        L3c:
            com.tencent.mm.plugin.finder.convert.ts r4 = new com.tencent.mm.plugin.finder.convert.ts
            r4.<init>(r6)
            r5.setOnClickListener(r4)
            android.content.Context r4 = r3.f374654e
            java.lang.String r8 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r8)
            boolean r8 = r4 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
            if (r8 == 0) goto L61
            r8 = r4
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8
            pf5.z r0 = pf5.z.f435481a
            pf5.v r8 = r0.a(r8)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r8
            goto L62
        L61:
            r8 = r7
        L62:
            if (r8 == 0) goto L68
            r45.qt2 r7 = r8.V6()
        L68:
            android.view.View r8 = r3.f3639x46306858
            java.lang.String r0 = "itemView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            java.lang.String r1 = "prodcut_card"
            dy1.a.i(r8, r1)
            android.view.View r8 = r3.f3639x46306858
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            com.tencent.mm.plugin.finder.convert.us r1 = new com.tencent.mm.plugin.finder.convert.us
            r1.<init>(r7, r6)
            dy1.a.a(r8, r1)
            android.view.View r3 = r3.f3639x46306858
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            r7 = 40
            r8 = 25496(0x6398, float:3.5728E-41)
            dy1.a.l(r3, r7, r8)
            int r3 = i65.a.B(r4)
            r7 = 1111490560(0x42400000, float:48.0)
            int r4 = i65.a.a(r4, r7)
            int r3 = r3 - r4
            int r3 = r3 / 2
            r5.d(r6, r3)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vs.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }
}
