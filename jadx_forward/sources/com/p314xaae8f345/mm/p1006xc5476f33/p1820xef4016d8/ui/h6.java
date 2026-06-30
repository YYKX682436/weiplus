package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class h6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i6 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f228514f;

    public h6(android.content.Context context) {
        super(context);
        this.f228514f = context;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g6 g6Var;
        if (view == null) {
            view = this.f228551e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bup, viewGroup, false);
            g6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g6(this);
            g6Var.f228461a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j37);
            g6Var.f228462b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j38);
            g6Var.f228463c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567326j31);
            g6Var.f228465e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567327j32);
            g6Var.f228464d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567329j34);
            view.setTag(g6Var);
        } else {
            g6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g6) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 item = getItem(i17);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f227044v);
        android.content.Context context = this.f228514f;
        if (K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(context, g6Var.f228461a, item.f227029d);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = item.f227029d + item.f227044v;
            float textSize = g6Var.f228461a.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = item.f227029d;
            float textSize2 = g6Var.f228461a.getTextSize();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7("#FA9D3B", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f6(this)), j18.length(), j17.length(), 18);
            g6Var.f228461a.setText(spannableStringBuilder);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f227045w)) {
            g6Var.f228465e.setVisibility(8);
        } else {
            g6Var.f228465e.setVisibility(0);
            g6Var.f228465e.setText(item.f227045w);
        }
        g6Var.f228462b.setText(item.f227032g);
        g6Var.f228463c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gna, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(item.f227031f / 100.0d)));
        int i18 = item.f227033h;
        if (i18 == 1) {
            g6Var.f228464d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_h);
            g6Var.f228464d.setVisibility(0);
        } else if (i18 == 2) {
            g6Var.f228464d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c__);
            g6Var.f228464d.setVisibility(0);
        } else if (i18 == 3) {
            g6Var.f228464d.setImageResource(com.p314xaae8f345.mm.R.raw.f80547x71e8fa11);
            g6Var.f228464d.setVisibility(0);
        } else {
            g6Var.f228464d.setVisibility(8);
        }
        return view;
    }
}
