package dv2;

/* loaded from: classes2.dex */
public final class r0 extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f325471l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f325472m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f325473n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(dv2.t0 t0Var, java.lang.String title, int i17) {
        super("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f325471l = title;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f325472m = viewGroup;
        if (viewGroup != null) {
            java.lang.String str = this.f325471l;
            viewGroup.setContentDescription(str);
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qqf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            this.f325473n = textView;
            textView.setText(str);
            android.widget.TextView textView2 = this.f325473n;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f325473n;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            android.widget.TextView textView4 = this.f325473n;
            if (textView4 != null) {
                com.p314xaae8f345.mm.ui.fk.c(textView4);
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
            android.widget.TextView textView = this.f325473n;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            android.widget.TextView textView2 = this.f325473n;
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f325473n;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        android.widget.TextView textView4 = this.f325473n;
        if (textView4 != null) {
            com.p314xaae8f345.mm.ui.fk.c(textView4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        android.view.View view = this.f325472m;
        return view == null ? this.f558585j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        android.view.View view = this.f325472m;
        return view == null ? this.f558585j : view;
    }
}
