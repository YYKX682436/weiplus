package yt3;

/* loaded from: classes10.dex */
public final class m extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f547064f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f547065g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f547066h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.is f547067i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup parent, ju3.d0 status, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 inputPanel) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPanel, "inputPanel");
        this.f547064f = parent;
        this.f547065g = inputPanel;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.d7p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f547066h = imageView;
        this.f547067i = new r45.is();
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79922xc8543845, -1));
        imageView.setOnClickListener(this);
        inputPanel.m68219x12a54e63(com.p314xaae8f345.mm.R.C30861xcebc809e.b47);
        inputPanel.m68223x466a35c6(new yt3.k(status));
        inputPanel.m68226x7cfada14(new yt3.l(this, status));
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(parent.getContext());
        float f17 = b17.y;
        float f18 = b17.x;
        float f19 = f17 / f18;
        float f27 = f17 / 2.18f;
        float f28 = (f18 - f27) / 2;
        if (f19 <= 1.78f) {
            inputPanel.d(f27, f28);
        } else {
            if (f19 >= 2.18f) {
                return;
            }
            inputPanel.d(f27, f28);
        }
    }

    public final void A(java.lang.Integer num, java.lang.Integer num2) {
        android.view.View confirm = this.f547065g.getConfirm();
        if (num != null && num.intValue() != 0) {
            confirm.setBackgroundResource(num.intValue());
        }
        if (num2 == null || num2.intValue() == 0 || !(confirm instanceof android.widget.TextView)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) confirm;
        textView.setTextColor(b3.l.m9702x7444d5ad(textView.getContext(), num2.intValue()));
    }

    public final void B(byte[] transResult, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f547065g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transResult, "transResult");
        try {
            r45.is isVar = new r45.is();
            try {
                isVar.mo11468x92b714fd(transResult);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                isVar = null;
            }
            if (isVar != null) {
                r45.is isVar2 = this.f547067i;
                isVar2.f458834h = isVar.f458834h;
                isVar2.f458830d = isVar.f458830d;
                isVar2.f458831e = isVar.f458831e;
                isVar2.f458832f = isVar.f458832f;
                c17042xf8121282.mode = 2;
                c17042xf8121282.m68225x76500a7f(true);
                c17042xf8121282.m68228x4e3c4b39(str);
                c17042xf8121282.e(isVar.f458830d.i(), i17, i18);
            }
        } catch (java.io.IOException e18) {
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditAddTextPlugin", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f547065g;
        if (!(c17042xf8121282.getVisibility() == 0)) {
            return false;
        }
        c17042xf8121282.c();
        c17042xf8121282.m68225x76500a7f(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f547065g;
        c17042xf8121282.mode = 0;
        c17042xf8121282.m68225x76500a7f(true);
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282.N;
        c17042xf8121282.e("", com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282.P, 0);
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_CLICK_TEXT_COUNT_INT", 0, 2, null);
        iVar.b(5);
        iVar.d(8);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547066h.setVisibility(i17);
    }

    public final void z(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f547065g;
        c17042xf8121282.mode = 0;
        c17042xf8121282.m68225x76500a7f(true);
        c17042xf8121282.m68228x4e3c4b39(str);
        c17042xf8121282.e(charSequence, i17, i18);
    }
}
