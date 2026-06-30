package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductItemView */
/* loaded from: classes3.dex */
public class C16813x9c3c4993 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f234732d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f234733e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234734f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f234735g;

    public C16813x9c3c4993(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270115e, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f234734f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            this.f234735g = context.getString(resourceId2);
        }
        int i18 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cad, (android.view.ViewGroup) this, true);
        this.f234732d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f234733e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nsf);
        this.f234732d.setText(this.f234734f);
        this.f234733e.setText(this.f234735g);
        this.f234733e.setLines(i18);
    }

    /* renamed from: getData */
    public java.lang.Object m67599xfb7e5820() {
        return null;
    }

    /* renamed from: getType */
    public int m67600xfb85f7b0() {
        return 0;
    }

    /* renamed from: setSummary */
    public void m67602x428530e4(java.lang.String str) {
        this.f234735g = str;
        this.f234733e.setText(str);
    }

    /* renamed from: setTitle */
    public void m67603x53bfe316(java.lang.String str) {
        this.f234734f = str;
        this.f234732d.setText(str);
    }

    /* renamed from: setSummary */
    public void m67601x428530e4(android.text.Spanned spanned) {
        java.lang.String obj = spanned.toString();
        this.f234735g = obj;
        this.f234733e.setText(obj);
    }

    public C16813x9c3c4993(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
