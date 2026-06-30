package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView */
/* loaded from: classes3.dex */
public class C13475x54dd56d1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f180857d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f180858e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f180859f;

    /* renamed from: g, reason: collision with root package name */
    public android.text.TextPaint f180860g;

    /* renamed from: h, reason: collision with root package name */
    public int f180861h;

    public C13475x54dd56d1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180861h = 0;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_9, (android.view.ViewGroup) this, true);
        this.f180860g = new android.text.TextPaint(1);
        this.f180857d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obf);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9n);
        this.f180858e = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.j5(this, context));
        this.f180857d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.k5(this, context));
        try {
            try {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561290ee);
                this.f180861h = dimensionPixelSize;
                if (dimensionPixelSize > 0) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExdeviceRankChampionInfoView", e17, "", new java.lang.Object[0]);
                if (this.f180861h > 0) {
                    return;
                }
            }
            this.f180861h = 128;
        } catch (java.lang.Throwable th6) {
            if (this.f180861h <= 0) {
                this.f180861h = 128;
            }
            throw th6;
        }
    }

    public void a(java.lang.String str) {
        this.f180859f = str;
        if (this.f180857d != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f180857d.setVisibility(8);
                this.f180857d.setText("");
            } else {
                this.f180857d.setVisibility(0);
                android.content.Context context = getContext();
                java.lang.String str2 = this.f180859f;
                int i17 = this.f180861h;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = getContext();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(str2);
                ((ke0.e) xVar).getClass();
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2k, android.text.TextUtils.ellipsize(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, e17), this.f180860g, i17, android.text.TextUtils.TruncateAt.END));
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context3 = getContext();
                ((ke0.e) xVar2).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context3, string);
                android.widget.TextView textView = this.f180857d;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context4 = getContext();
                float textSize = this.f180857d.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context4, string, textSize));
            }
        }
        if (this.f180858e != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f180858e.setVisibility(4);
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f180858e, str);
            this.f180858e.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        this.f180857d.setAlpha(f17);
        this.f180858e.setAlpha(f17);
    }
}
