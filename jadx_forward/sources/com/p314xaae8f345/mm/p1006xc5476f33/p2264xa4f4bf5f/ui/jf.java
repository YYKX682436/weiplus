package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f255549a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f255550b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f255551c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255552d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ff f255553e;

    public jf(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f255549a = tab;
        this.f255550b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.hf(this));
        this.f255551c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.gf(this));
        this.f255552d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.Cif(this));
        tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0g);
        tab.f425311a = this;
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f255550b).mo141623x754a37bb();
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }

    public final void b(int i17) {
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f255550b).mo141623x754a37bb();
        if (textView != null) {
            android.view.View view = this.f255549a.f425316f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(i17));
        }
    }
}
