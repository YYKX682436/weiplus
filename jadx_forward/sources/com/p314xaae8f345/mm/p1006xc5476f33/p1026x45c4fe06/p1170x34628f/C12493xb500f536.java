package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandActionSingleHeaderView */
/* loaded from: classes.dex */
public class C12493xb500f536 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f167878d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f167879e;

    public C12493xb500f536(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569667i3, this);
        this.f167878d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a2g);
        this.f167879e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a2h);
    }

    /* renamed from: getImageView */
    public android.widget.ImageView m52117xcb16a3ea() {
        return this.f167878d;
    }

    /* renamed from: setImageDrawable */
    public void m52118x706225d7(android.graphics.drawable.Drawable drawable) {
        this.f167878d.setImageDrawable(drawable);
    }

    /* renamed from: setImageResource */
    public void m52119x8d516947(int i17) {
        this.f167878d.setImageResource(i17);
    }

    /* renamed from: setTextViewText */
    public void m52120xce85d341(java.lang.String str) {
        this.f167879e.setText(str);
    }

    /* renamed from: setTextViewTextColor */
    public void m52121xfdf54ca2(int i17) {
        this.f167879e.setTextColor(i17);
    }

    public C12493xb500f536(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
