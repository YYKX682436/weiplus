package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView */
/* loaded from: classes.dex */
public class C12492x70346dfe extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f167876d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f167877e;

    public C12492x70346dfe(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569666i2, this);
        this.f167876d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a2a);
        this.f167877e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a2b);
    }

    /* renamed from: getH5Url */
    public java.lang.String m52108x747097ac() {
        return null;
    }

    /* renamed from: getImageView */
    public android.widget.ImageView m52109xcb16a3ea() {
        return this.f167876d;
    }

    /* renamed from: getPath */
    public java.lang.String m52110xfb83cc9b() {
        return null;
    }

    /* renamed from: getType */
    public int m52111xfb85f7b0() {
        return 0;
    }

    /* renamed from: getUsername */
    public java.lang.String m52112x6c03c64c() {
        return null;
    }

    /* renamed from: setImageDrawable */
    public void m52113x706225d7(android.graphics.drawable.Drawable drawable) {
        this.f167876d.setImageDrawable(drawable);
    }

    /* renamed from: setImageResource */
    public void m52114x8d516947(int i17) {
        this.f167876d.setImageResource(i17);
    }

    /* renamed from: setTextViewText */
    public void m52115xce85d341(java.lang.String str) {
        this.f167877e.setText(str);
    }

    /* renamed from: setTextViewTextColor */
    public void m52116xfdf54ca2(int i17) {
        this.f167877e.setTextColor(i17);
    }

    public C12492x70346dfe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
