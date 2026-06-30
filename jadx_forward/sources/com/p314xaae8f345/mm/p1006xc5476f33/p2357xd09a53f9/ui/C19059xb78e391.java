package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui;

/* renamed from: com.tencent.mm.plugin.wallet.ui.WalletItemView */
/* loaded from: classes3.dex */
public class C19059xb78e391 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f260663d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260664e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260665f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f260666g;

    public C19059xb78e391(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270118h, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f260665f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            this.f260666g = context.getString(resourceId2);
        }
        int i18 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6x, (android.view.ViewGroup) this, true);
        this.f260663d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f260664e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nsf);
        android.widget.TextView textView = this.f260663d;
        if (textView != null) {
            textView.setText(this.f260665f);
        }
        android.widget.TextView textView2 = this.f260664e;
        if (textView2 != null) {
            textView2.setText(this.f260666g);
            this.f260664e.setLines(i18);
        }
    }

    /* renamed from: getData */
    public java.lang.Object m73853xfb7e5820() {
        return null;
    }

    /* renamed from: getType */
    public int m73854xfb85f7b0() {
        return 0;
    }

    /* renamed from: setSummary */
    public void m73856x428530e4(java.lang.String str) {
        this.f260666g = str;
        this.f260664e.setText(str);
    }

    /* renamed from: setTitle */
    public void m73857x53bfe316(java.lang.String str) {
        this.f260665f = str;
        this.f260663d.setText(str);
    }

    /* renamed from: setSummary */
    public void m73855x428530e4(android.text.Spanned spanned) {
        java.lang.String obj = spanned.toString();
        this.f260666g = obj;
        this.f260664e.setText(obj);
    }

    public C19059xb78e391(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
