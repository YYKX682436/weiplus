package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public final class t3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f291405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(boolean z17, android.view.View view) {
        super(4);
        this.f291405d = z17;
        this.f291406e = view;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View v17 = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        e3.d dVar = (e3.d) obj3;
        ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("avoidNavigationBarForApi35CompatLandscapeMode navHeight=");
        sb6.append(intValue);
        sb6.append(" bottom=");
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f328580d) : null);
        sb6.append(" left=");
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f328577a) : null);
        sb6.append(" right=");
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f328579c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Edge2EdgeHelper", sb6.toString());
        boolean z17 = this.f291405d;
        android.view.View view = this.f291406e;
        if (z17) {
            view.setPadding(dVar != null ? dVar.f328577a : view.getPaddingLeft(), view.getPaddingTop(), dVar != null ? dVar.f328579c : view.getPaddingRight(), view.getPaddingBottom());
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(dVar != null ? dVar.f328579c : marginLayoutParams.getMarginEnd());
            }
            view.setLayoutParams(marginLayoutParams);
        }
        return jz5.f0.f384359a;
    }
}
