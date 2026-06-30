package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.DialNumberButton */
/* loaded from: classes9.dex */
public class C16123x25cf8f8b extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f224052d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224053e;

    public C16123x25cf8f8b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570240a45, this);
        this.f224052d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cye);
        this.f224053e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cyf);
        if (fp.h.c(16)) {
            this.f224052d.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            this.f224053e.setTypeface(android.graphics.Typeface.create("sans-serif-normal", 0));
        }
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* renamed from: getNumberText */
    public java.lang.String m65167xd6e0800c() {
        return this.f224052d.getText().toString();
    }

    /* renamed from: getOtherText */
    public java.lang.String m65168x8b71a1a7() {
        return this.f224053e.getText().toString();
    }

    /* renamed from: setInTalkUIMode */
    public void m65169x93d35e8a(boolean z17) {
        if (z17) {
            if ("#".equals(this.f224052d.getText()) || "*".equals(this.f224052d.getText())) {
                this.f224052d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560416jt));
            } else {
                this.f224052d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560418jv));
            }
            this.f224053e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560416jt));
            setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562887r7));
            return;
        }
        if ("#".equals(this.f224052d.getText()) || "*".equals(this.f224052d.getText())) {
            this.f224052d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560416jt));
        } else {
            this.f224052d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560417ju));
        }
        this.f224053e.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560416jt));
        setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562888r8));
    }
}
