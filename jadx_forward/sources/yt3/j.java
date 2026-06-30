package yt3;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f547032d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547033e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f547034f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f547035g;

    /* renamed from: h, reason: collision with root package name */
    public r45.tl5 f547036h;

    public j(android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547032d = parent;
        this.f547033e = status;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.d7l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f547034f = relativeLayout;
        android.view.View findViewById2 = parent.findViewById(com.p314xaae8f345.mm.R.id.d7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = parent.findViewById(com.p314xaae8f345.mm.R.id.d7k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f547035g = imageView;
        this.f547036h = new r45.tl5();
        ((android.widget.ImageView) findViewById2).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79787x448e46cd, -1));
        imageView.setImageDrawable(parent.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80880xec2114a5));
        relativeLayout.setOnClickListener(this);
        com.p314xaae8f345.mm.ui.bl.b(parent.getContext());
    }

    public final void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("get_poi_classify_id", this.f547036h.f468090i);
        intent.putExtra("get_poi_from_scene", "story");
        intent.putExtra("get_city", this.f547036h.f468087f);
        intent.putExtra("poi_show_none", true);
        intent.putExtra("select_radio_icon_color", "#0E9CE6");
        j45.l.n(this.f547032d.getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
    }

    @Override // yt3.r2
    /* renamed from: onActivityResult */
    public void mo47332x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (2 == i17 && i18 == -1 && intent != null) {
            r45.tl5 tl5Var = this.f547036h;
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            tl5Var.f468088g = stringExtra;
            r45.tl5 tl5Var2 = this.f547036h;
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            tl5Var2.f468087f = stringExtra2 != null ? stringExtra2 : "";
            this.f547036h.f468086e = intent.getFloatExtra("get_lat", -1000.0f);
            this.f547036h.f468085d = intent.getFloatExtra("get_lng", -1000.0f);
            this.f547036h.f468090i = intent.getStringExtra("get_poi_classify_id");
            boolean z18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f547036h.f468088g) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f547036h.f468087f)) ? false : true;
            android.widget.ImageView imageView = this.f547035g;
            if (z18) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_EDIT_POI_INFO", this.f547036h.mo14344x5f01b1f6());
            this.f547033e.w(ju3.c0.N, bundle);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionLocation.k(view != null ? view.getContext() : null, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a();
        nu3.i.f421751a.d(10);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f547036h = new r45.tl5();
        this.f547035g.setVisibility(8);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547034f.setVisibility(i17);
    }
}
