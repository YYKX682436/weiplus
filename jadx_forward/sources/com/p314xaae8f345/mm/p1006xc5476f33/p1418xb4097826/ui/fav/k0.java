package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class k0 extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f210716k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f210717l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String title) {
        super("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f210716k = title;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570564b33;
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        if (viewGroup != null) {
            java.lang.String str = this.f210716k;
            viewGroup.setContentDescription(str);
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qqf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f210717l = (android.widget.TextView) findViewById;
            if (str.length() == 0) {
                android.widget.TextView textView = this.f210717l;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                    throw null;
                }
            }
            android.widget.TextView textView2 = this.f210717l;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView2.setText(str);
            android.widget.TextView textView3 = this.f210717l;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView3.setVisibility(0);
            android.widget.TextView textView4 = this.f210717l;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView4.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            android.widget.TextView textView5 = this.f210717l;
            if (textView5 != null) {
                com.p314xaae8f345.mm.ui.fk.c(textView5);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            android.widget.TextView textView = this.f210717l;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            android.widget.TextView textView2 = this.f210717l;
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f210717l;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        android.widget.TextView textView4 = this.f210717l;
        if (textView4 != null) {
            com.p314xaae8f345.mm.ui.fk.c(textView4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
    }
}
