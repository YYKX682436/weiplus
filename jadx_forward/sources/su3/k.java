package su3;

/* loaded from: classes5.dex */
public final class k extends su3.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f494320d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f494321e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d f494322f;

    /* renamed from: g, reason: collision with root package name */
    public final int f494323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ su3.m f494324h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(su3.m mVar, android.view.View itemView) {
        super(mVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f494324h = mVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.non);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f494320d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nop);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f494321e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.noo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f494322f = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d) findViewById3;
        this.f494323g = i65.a.d(itemView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9x);
    }

    @Override // su3.f
    public void i(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        su3.m mVar = this.f494324h;
        boolean z17 = i17 == mVar.f494327e;
        this.f3639x46306858.setSelected(z17);
        android.graphics.drawable.Drawable i18 = i65.a.i(this.f3639x46306858.getContext(), mVar.f494330h);
        android.content.res.ColorStateList e17 = i65.a.e(this.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f561060a75);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f494320d;
        c22699x3dcdb352.setImageDrawable(i18);
        c22699x3dcdb352.m82040x7541828(e17.getColorForState(c22699x3dcdb352.getDrawableState(), 0));
        if (info.f237247h.isEmpty()) {
            str = info.f237256t;
        } else {
            str = info.f237256t + " - " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(info.f237247h, ",");
        }
        this.f494321e.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d.f237589o.a(str, mVar.f494328f, this.f494323g));
        java.util.ArrayList arrayList = info.f237246g;
        java.lang.String str2 = mVar.f494328f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d = this.f494322f;
        c17048x9295f61d.b(arrayList, str2);
        c17048x9295f61d.d(z17, -1);
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.nom);
        if (findViewById != null) {
            findViewById.setTag(com.p314xaae8f345.mm.R.id.e5q, str);
        }
    }
}
