package df2;

/* loaded from: classes3.dex */
public final class v9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.x9 f313122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(df2.x9 x9Var) {
        super(0);
        this.f313122d = x9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r3.booleanValue() == false) goto L18;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r20 = this;
            r0 = r20
            df2.x9 r1 = r0.f313122d
            java.lang.String r1 = r1.f313299m
            java.lang.String r2 = "[preloadProductList]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f314913e
            boolean r2 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419
            r3 = 0
            if (r2 == 0) goto L15
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) r1
            goto L16
        L15:
            r1 = r3
        L16:
            if (r1 == 0) goto Lde
            um2.x5 r1 = r1.m129745xca56ce03()
            if (r1 == 0) goto Lde
            java.lang.Class<mm2.f6> r2 = mm2.f6.class
            androidx.lifecycle.c1 r4 = r1.c(r2)
            mm2.f6 r4 = (mm2.f6) r4
            boolean r4 = r4.f410568i
            if (r4 == 0) goto Lde
            com.tencent.mm.plugin.finder.live.plugin.ui r4 = r1.f510611u0
            if (r4 == 0) goto L45
            com.tencent.mm.plugin.finder.live.widget.dk r4 = r4.f196101p
            if (r4 == 0) goto L3a
            boolean r3 = r4.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L3a:
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Boolean"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r3, r4)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Lde
        L45:
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r4 = r1.c(r3)
            mm2.c1 r4 = (mm2.c1) r4
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f410379n
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L5f
            long r7 = vd2.a2.f517173k
            long r9 = r4.m76784x5db1b11()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L5f
            r4 = r5
            goto L60
        L5f:
            r4 = r6
        L60:
            if (r4 != 0) goto Lde
            java.lang.Class<ml2.r0> r4 = ml2.r0.class
            i95.m r4 = i95.n0.c(r4)
            ml2.r0 r4 = (ml2.r0) r4
            r4.K = r5
            androidx.lifecycle.c1 r4 = r1.c(r2)
            mm2.f6 r4 = (mm2.f6) r4
            boolean r4 = r4.f410589z
            if (r4 != 0) goto Lde
            androidx.lifecycle.c1 r2 = r1.c(r2)
            mm2.f6 r2 = (mm2.f6) r2
            r2.f410589z = r5
            dk2.xf r2 = r1.h()
            if (r2 == 0) goto Lde
            androidx.appcompat.app.AppCompatActivity r4 = r1.f101138b
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r4, r5)
            r8 = r4
            com.tencent.mm.ui.MMActivity r8 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r8
            java.lang.Class<mm2.e1> r4 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r1.c(r4)
            mm2.e1 r5 = (mm2.e1) r5
            r45.nw1 r5 = r5.f410521r
            long r9 = r5.m75942xfb822ef2(r6)
            androidx.lifecycle.c1 r5 = r1.c(r4)
            mm2.e1 r5 = (mm2.e1) r5
            long r11 = r5.f410516m
            androidx.lifecycle.c1 r5 = r1.c(r4)
            mm2.e1 r5 = (mm2.e1) r5
            java.lang.String r13 = r5.f410517n
            androidx.lifecycle.c1 r5 = r1.c(r3)
            mm2.c1 r5 = (mm2.c1) r5
            java.lang.String r14 = r5.f410385o
            androidx.lifecycle.c1 r4 = r1.c(r4)
            mm2.e1 r4 = (mm2.e1) r4
            byte[] r15 = r4.f410518o
            r16 = 0
            r17 = 1
            androidx.lifecycle.c1 r3 = r1.c(r3)
            mm2.c1 r3 = (mm2.c1) r3
            java.lang.String r3 = r3.f410377m5
            um2.t r4 = new um2.t
            java.lang.ref.SoftReference r5 = new java.lang.ref.SoftReference
            r5.<init>(r1)
            java.lang.String r1 = r1.f510565f
            r4.<init>(r5, r1)
            r7 = r2
            dk2.r4 r7 = (dk2.r4) r7
            r18 = r3
            r19 = r4
            r7.R(r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
        Lde:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.v9.mo152xb9724478():java.lang.Object");
    }
}
