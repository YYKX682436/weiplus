package df2;

/* loaded from: classes3.dex */
public final class md extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.od f312305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pb2 f312306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(df2.od odVar, r45.pb2 pb2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312305d = odVar;
        this.f312306e = pb2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.md(this.f312305d, this.f312306e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.md mdVar = (df2.md) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mdVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.od odVar = this.f312305d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f) odVar.S6(com.p314xaae8f345.mm.R.id.ubl);
        r45.pb2 pb2Var = this.f312306e;
        if (!odVar.b7((r45.ug1) pb2Var.m75936x14adae67(0))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 Z6 = df2.od.Z6(odVar);
            if (Z6 != null && c14400x1527540f != null) {
                c14400x1527540f.f(Z6);
            }
        } else if (c14400x1527540f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 Z62 = df2.od.Z6(odVar);
            if (Z62 != null) {
                boolean contains = c14400x1527540f.f199183p.contains(Z62);
                java.lang.String str = odVar.f312486m;
                if (!contains) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add banner item");
                    c14400x1527540f.c(Z62);
                    Z62.post(new df2.kd(Z62, odVar, pb2Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar = odVar.f312487n;
                    if (rxVar != null) {
                        java.util.LinkedList linkedList = rxVar.S;
                        if (linkedList == null || linkedList.isEmpty()) {
                            rxVar.h0(null);
                        }
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(df2.od.a7(odVar, odVar.f312489p), df2.od.a7(odVar, (r45.ug1) pb2Var.m75936x14adae67(0)))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "same one, do noting");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update banner item");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = Z62.f199220e;
                    if (c14334xd566b302 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("txtView");
                        throw null;
                    }
                    c14334xd566b302.e();
                    Z62.post(new df2.ld(Z62, odVar, pb2Var));
                }
            }
            c14400x1527540f.m57907x50542051(800);
        }
        boolean isShown = c14400x1527540f != null ? c14400x1527540f.isShown() : false;
        android.view.View S6 = odVar.S6(com.p314xaae8f345.mm.R.id.egj);
        if (S6 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = S6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = isShown ? odVar.O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) : -2;
            }
            S6.requestLayout();
        }
        android.view.View S62 = odVar.S6(com.p314xaae8f345.mm.R.id.fj9);
        if (S62 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = S62.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = isShown ? odVar.O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) : 0;
            }
            S62.requestLayout();
        }
        odVar.f312489p = (r45.ug1) pb2Var.m75936x14adae67(0);
        return jz5.f0.f384359a;
    }
}
