package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* renamed from: com.tencent.mm.plugin.nearby.ui.CleanLocationHeaderView */
/* loaded from: classes3.dex */
public class C16721x4d034a70 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f233613d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f233614e;

    public C16721x4d034a70(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c5z, this);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k5z);
        this.f233613d = textView;
        textView.setSingleLine(false);
        this.f233614e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k5f);
        this.f233613d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b8t);
        this.f233614e.setImageResource(com.p314xaae8f345.mm.R.raw.f80833x97e1704a);
    }

    public C16721x4d034a70(android.content.Context context) {
        super(context);
        a(context);
    }
}
