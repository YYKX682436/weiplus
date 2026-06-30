package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes3.dex */
public class ExdeviceRankChampionInfoView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f99324d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f99325e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f99326f;

    /* renamed from: g, reason: collision with root package name */
    public android.text.TextPaint f99327g;

    /* renamed from: h, reason: collision with root package name */
    public int f99328h;

    public ExdeviceRankChampionInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f99328h = 0;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a_9, (android.view.ViewGroup) this, true);
        this.f99327g = new android.text.TextPaint(1);
        this.f99324d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obf);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9n);
        this.f99325e = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.j5(this, context));
        this.f99324d.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.k5(this, context));
        try {
            try {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479757ee);
                this.f99328h = dimensionPixelSize;
                if (dimensionPixelSize > 0) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExdeviceRankChampionInfoView", e17, "", new java.lang.Object[0]);
                if (this.f99328h > 0) {
                    return;
                }
            }
            this.f99328h = 128;
        } catch (java.lang.Throwable th6) {
            if (this.f99328h <= 0) {
                this.f99328h = 128;
            }
            throw th6;
        }
    }

    public void a(java.lang.String str) {
        this.f99326f = str;
        if (this.f99324d != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f99324d.setVisibility(8);
                this.f99324d.setText("");
            } else {
                this.f99324d.setVisibility(0);
                android.content.Context context = getContext();
                java.lang.String str2 = this.f99326f;
                int i17 = this.f99328h;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = getContext();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(str2);
                ((ke0.e) xVar).getClass();
                java.lang.String string = context.getString(com.tencent.mm.R.string.c2k, android.text.TextUtils.ellipsize(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, e17), this.f99327g, i17, android.text.TextUtils.TruncateAt.END));
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context3 = getContext();
                ((ke0.e) xVar2).getClass();
                com.tencent.mm.pluginsdk.ui.span.c0.i(context3, string);
                android.widget.TextView textView = this.f99324d;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context4 = getContext();
                float textSize = this.f99324d.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context4, string, textSize));
            }
        }
        if (this.f99325e != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f99325e.setVisibility(4);
                return;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f99325e, str);
            this.f99325e.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        this.f99324d.setAlpha(f17);
        this.f99325e.setAlpha(f17);
    }
}
