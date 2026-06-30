package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.RichTextImageView */
/* loaded from: classes5.dex */
public class C17993xe8dbdc57 extends android.widget.LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f248148m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f248149d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f248150e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f248151f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f248152g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f248153h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248154i;

    public C17993xe8dbdc57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248153h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("iniViews", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.view.View inflate = android.view.View.inflate((android.app.Activity) context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ctc, this);
        this.f248150e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m4o);
        this.f248149d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odj);
        this.f248151f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564988aw5);
        this.f248152g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h9t);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("iniViews", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    /* renamed from: getImageView */
    public android.widget.ImageView m70685xcb16a3ea() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageView", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.ImageView imageView = this.f248152g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageView", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        return imageView;
    }

    /* renamed from: getTitle */
    public android.widget.TextView m70686x7531c8a2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.TextView textView = this.f248149d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        return textView;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.f248153h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            return;
        }
        if (this.f248154i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            return;
        }
        this.f248150e.getHeight();
        this.f248150e.getLineHeight();
        int height = this.f248150e.getHeight() / this.f248150e.getLineHeight();
        int lineCount = this.f248150e.getLineCount();
        android.graphics.Rect rect = new android.graphics.Rect();
        int i28 = 0;
        int i29 = 0;
        while (i28 < height) {
            try {
                this.f248150e.getLineBounds(i28, rect);
                i29 += rect.height();
                if (i29 > this.f248150e.getHeight()) {
                    break;
                } else {
                    i28++;
                }
            } catch (java.lang.IndexOutOfBoundsException unused) {
            }
        }
        if (lineCount >= i28 && this.f248153h) {
            if (i28 < 1) {
                i28 = 1;
            }
            int lineVisibleEnd = this.f248150e.getLayout().getLineVisibleEnd(i28 - 1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bottomH:");
            sb6.append(this.f248151f.getHeight());
            sb6.append("length");
            java.lang.String str = this.f248154i;
            sb6.append(str.substring(lineVisibleEnd, str.length()).length());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("test", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("test", "bottomH:" + this.f248151f.getHeight());
            if (this.f248151f.getText().length() > 0) {
                this.f248151f.setVisibility(0);
                this.f248153h = false;
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g8(this, lineVisibleEnd));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("test", "bottom:" + i27 + "   mesH:" + this.f248151f.getMeasuredHeight());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    /* renamed from: setImage */
    public void m70687x53266a19(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f248152g.setImageResource(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    /* renamed from: setText */
    public void m70689x765074af(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f248153h = true;
        if (str == null) {
            str = "";
        }
        this.f248154i = str;
        this.f248150e.setText(str);
        requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    /* renamed from: setTitle */
    public void m70690x53bfe316(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f248149d.setText(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    /* renamed from: setImage */
    public void m70688x53266a19(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f248152g.setImageBitmap(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }
}
