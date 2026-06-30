package l94;

/* loaded from: classes4.dex */
public final class k extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f398904h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f398905i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewGroup f398906j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super("WsFoldAdCardComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // l94.e
    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        return true;
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        l94.e qVar;
        int e17;
        l94.e gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "the fold sns info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
            return;
        }
        switch (b17.f453614q) {
            case 1:
                qVar = new l94.q(f());
                break;
            case 2:
                qVar = new l94.e0(f());
                break;
            case 3:
            case 4:
            case 6:
            case 9:
                qVar = new l94.b0(f());
                break;
            case 5:
            case 7:
            case 8:
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the style is invalid");
                qVar = null;
                break;
            case 10:
            case 11:
            case 12:
                qVar = new l94.t(f(), b17.f453614q);
                break;
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            r45.c43 c43Var = b17.f453619v;
            e17 = ca4.n0.e(c43Var != null ? c43Var.f452800e : null, 0);
        } else {
            r45.c43 c43Var2 = b17.f453619v;
            e17 = ca4.n0.e(c43Var2 != null ? c43Var2.f452799d : null, 0);
        }
        android.view.ViewGroup viewGroup = this.f398905i;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(e17);
        }
        if (qVar != null) {
            b(qVar, this.f398905i);
            qVar.c(adInfo);
        }
        switch (b17.f453614q) {
            case 10:
            case 11:
            case 12:
                gVar = new l94.g(f());
                break;
            default:
                gVar = new l94.i(f());
                break;
        }
        b(gVar, this.f398906j);
        android.view.ViewGroup viewGroup2 = this.f398904h;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new l94.j(b17, adInfo));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(f());
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new al5.z1(c44.b.a(8)));
        frameLayout.setForeground(frameLayout.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563770da4));
        this.f398904h = frameLayout;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout);
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            layoutParams3.width = -1;
            linearLayout.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            layoutParams4.height = -2;
            linearLayout.setLayoutParams(layoutParams4);
        }
        c44.a.m();
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(i65.a.d(linearLayout.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        int a17 = c44.b.a(8);
        linearLayout.setPadding(a17, a17, a17, a17);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(linearLayout.getContext());
        linearLayout.addView(frameLayout2);
        frameLayout2.setId(com.p314xaae8f345.mm.R.id.vpm);
        this.f398905i = frameLayout2;
        frameLayout2.setClipToOutline(true);
        frameLayout2.setOutlineProvider(new al5.z1(c44.b.a(4)));
        android.content.Context context = frameLayout2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        jz5.l c17 = j94.b.c(context, 0, 0, 6, null);
        int intValue = ((java.lang.Number) c17.f384366d).intValue();
        int intValue2 = ((java.lang.Number) c17.f384367e).intValue();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(intValue, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = frameLayout2.getLayoutParams();
            layoutParams5.width = intValue;
            frameLayout2.setLayoutParams(layoutParams5);
        }
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, intValue2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = frameLayout2.getLayoutParams();
            layoutParams6.height = intValue2;
            frameLayout2.setLayoutParams(layoutParams6);
        }
        android.view.View view = new android.view.View(linearLayout.getContext());
        linearLayout.addView(view);
        c44.a.l();
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            layoutParams7.width = -1;
            view.setLayoutParams(layoutParams7);
        }
        int a18 = c44.b.a(8);
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            layoutParams8.height = a18;
            view.setLayoutParams(layoutParams8);
        }
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout.getContext());
        linearLayout.addView(frameLayout3);
        this.f398906j = frameLayout3;
        c44.a.l();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = frameLayout3.getLayoutParams();
            layoutParams9.width = -1;
            frameLayout3.setLayoutParams(layoutParams9);
        }
        c44.a.o();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = frameLayout3.getLayoutParams();
            layoutParams10.height = -2;
            frameLayout3.setLayoutParams(layoutParams10);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        return frameLayout;
    }

    @Override // l94.e
    public void l(h94.a adInfo, l94.l eventData) {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        l94.m mVar = l94.m.f398911d;
        l94.m mVar2 = eventData.f398907a;
        if (mVar2 == mVar) {
            android.view.ViewGroup viewGroup2 = this.f398904h;
            if (viewGroup2 != null) {
                viewGroup2.setPressed(false);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            if (mVar2 == l94.m.f398912e && (viewGroup = this.f398904h) != null) {
                viewGroup.setPressed(true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
    }
}
