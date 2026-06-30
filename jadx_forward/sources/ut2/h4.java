package ut2;

/* loaded from: classes3.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f512435a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f512436b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f512437c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f512438d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f512439e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f512440f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zv f512441g;

    public h4(android.view.ViewGroup root, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f512435a = root;
        this.f512436b = buContext;
        this.f512437c = root.findViewById(com.p314xaae8f345.mm.R.id.v4m);
        this.f512438d = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.u0l);
        this.f512439e = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.u0k);
        this.f512440f = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.u0m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View a(bw5.yv yvVar) {
        android.widget.TextView textView;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int i17 = yvVar.f117240d;
        boolean[] zArr = yvVar.f117249p;
        android.view.ViewGroup viewGroup = this.f512435a;
        if (i17 == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("text, wording: ");
            sb6.append(zArr[5] ? yvVar.f117244h : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingPanelHeaderGuideHolder", sb6.toString());
            android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
            textView2.setText(zArr[5] ? yvVar.f117244h : "");
            textView2.setTextSize(1, yvVar.f117245i);
            textView2.setTextColor(android.graphics.Color.parseColor(zArr[7] ? yvVar.f117246m : ""));
            textView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            textView = textView2;
        } else if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShoppingPanelHeaderGuideHolder", "error itemType: " + yvVar.f117240d);
            textView = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("img, url: ");
            sb7.append(zArr[2] ? yvVar.f117241e : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingPanelHeaderGuideHolder", sb7.toString());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(viewGroup.getContext());
            c22699x3dcdb352.m82040x7541828(0);
            c22699x3dcdb352.setColorFilter(0);
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(zArr[2] ? yvVar.f117241e : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e))).c(c22699x3dcdb352);
            c22699x3dcdb352.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i65.a.b(viewGroup.getContext(), yvVar.f117243g), i65.a.b(viewGroup.getContext(), yvVar.f117242f)));
            textView = c22699x3dcdb352;
        }
        if (textView == null) {
            return null;
        }
        if (yvVar.f117248o == 3) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i65.a.b(viewGroup.getContext(), yvVar.f117247n));
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i65.a.b(viewGroup.getContext(), yvVar.f117247n));
            }
        }
        return textView;
    }

    public final void b() {
        bw5.zv zvVar = this.f512441g;
        if (zvVar != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l lVar = new jz5.l("guide_bar_id", pm0.v.u(zvVar.f117723g));
            jz5.l lVar2 = new jz5.l("extra_report_json", zvVar.f117726m[5] ? zvVar.f117724h : "");
            gk2.e eVar = this.f512436b;
            ((cy1.a) rVar).Bj("ec_shelf_guide_bar", "view_exp", kz5.c1.k(lVar, lVar2, new jz5.l("live_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0))), new jz5.l("feed_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410516m)), new jz5.l("finder_username", ((mm2.c1) eVar.a(mm2.c1.class)).f410385o)), 12, false);
        }
    }
}
