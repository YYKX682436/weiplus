package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public class z1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f273636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 f273637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030, android.view.View view, int i17) {
        super(view);
        this.f273637e = c19642xb279030;
        if (i17 != 1 || c19642xb279030.f271325o.booleanValue()) {
            this.f273636d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9m);
            int i18 = c19642xb279030.f271328r;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i18, com.p314xaae8f345.mm.ui.zk.e(c19642xb279030.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + i18);
            layoutParams.rightMargin = c19642xb279030.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
            view.setLayoutParams(layoutParams);
            view.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.u1(this, c19642xb279030));
            return;
        }
        c19642xb279030.f271333w = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567599k14);
        c19642xb279030.j();
        c19642xb279030.f271330t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view.findViewById(com.p314xaae8f345.mm.R.id.f567598k13);
        c19642xb279030.f271331u = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.m7g);
        ck5.f b17 = ck5.f.b(c19642xb279030.f271330t);
        b17.f124094f = 0;
        b17.f124093e = 100;
        b17.d(null);
        c19642xb279030.f271330t.addTextChangedListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.v1(this, c19642xb279030));
        c19642xb279030.f271330t.setOnKeyListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.w1(this, c19642xb279030));
        try {
            c19642xb279030.f271330t.clearFocus();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiSeclectContactView", "clearFocus exception:%s", e17);
        }
        c19642xb279030.f271330t.setOnFocusChangeListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.x1(this, c19642xb279030));
        c19642xb279030.f271330t.post(new com.p314xaae8f345.mm.p2470x93e71c27.ui.y1(this, c19642xb279030));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19642xb279030.f271332v)) {
            return;
        }
        c19642xb279030.f271330t.setHint(c19642xb279030.f271332v);
    }
}
