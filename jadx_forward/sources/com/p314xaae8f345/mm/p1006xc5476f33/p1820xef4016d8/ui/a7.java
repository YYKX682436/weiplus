package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class a7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i6 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f228228f;

    public a7(android.content.Context context) {
        super(context);
        this.f228228f = null;
        this.f228228f = context;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z6 z6Var;
        if (view == null) {
            view = this.f228551e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bur, viewGroup, false);
            z6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z6(this);
            z6Var.f229298a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j3b);
            z6Var.f229301d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j3_);
            z6Var.f229299b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j3a);
            z6Var.f229300c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j39);
            view.setTag(z6Var);
        } else {
            z6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z6) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 item = getItem(i17);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f227044v);
        android.content.Context context = this.f228228f;
        if (K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(context, z6Var.f229298a, item.f227034i);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = item.f227034i + item.f227044v;
            float textSize = z6Var.f229298a.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = item.f227034i;
            float textSize2 = z6Var.f229298a.getTextSize();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7("#FA9D3B", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x6(this)), j18.length(), j17.length(), 18);
            z6Var.f229298a.setText(spannableStringBuilder);
        }
        z6Var.f229299b.setText(item.f227035m);
        z6Var.f229300c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjc, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(item.f227036n / 100.0d)));
        z6Var.f229300c.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.y6(this, z6Var), 20L);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnt, java.lang.Long.valueOf(item.f227038p), java.lang.Long.valueOf(item.f227037o));
        if (item.f227039q == 5) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnu) + " " + string;
        }
        z6Var.f229301d.setText(string);
        return view;
    }
}
