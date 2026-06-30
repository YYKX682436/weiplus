package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class y50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f196690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        super(0);
        this.f196690d = r60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f196690d;
        android.view.ViewGroup viewGroup = r60Var.f195635w;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
            throw null;
        }
        viewGroup.removeAllViews();
        df2.pv pvVar = (df2.pv) r60Var.U0(df2.pv.class);
        if (pvVar != null) {
            pvVar.b7(r60Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(r60Var, null, r60Var.f195631s, false, 4, null);
        return jz5.f0.f384359a;
    }
}
