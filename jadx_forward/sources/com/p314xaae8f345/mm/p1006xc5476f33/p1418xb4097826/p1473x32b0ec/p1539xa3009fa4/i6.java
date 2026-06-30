package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class i6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        super(0);
        this.f198677d = b8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        int width = (k0Var == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null || (viewGroup = o9Var.f446856d) == null) ? 0 : viewGroup.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f198677d;
        android.view.View findViewById = b8Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f566296fg3);
        int width2 = findViewById.getWidth();
        int i17 = 2;
        if (j65.f.f379476g <= 1.0f) {
            int i18 = width2 - width;
            i17 = ((i18 >= 0 ? i18 : 0) / 2) + ((int) b8Var.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        }
        findViewById.setPadding(i17, findViewById.getPaddingTop(), i17, findViewById.getPaddingBottom());
        return jz5.f0.f384359a;
    }
}
