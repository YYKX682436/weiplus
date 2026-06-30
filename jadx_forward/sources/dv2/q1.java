package dv2;

/* loaded from: classes2.dex */
public final class q1 extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f325465l;

    /* renamed from: m, reason: collision with root package name */
    public final int f325466m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f325467n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f325468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dv2.s1 f325469p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(dv2.s1 s1Var, java.lang.String title, int i17) {
        super("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f325469p = s1Var;
        this.f325465l = title;
        this.f325466m = i17;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f325467n = viewGroup;
        if (viewGroup != null) {
            java.lang.String str = this.f325465l;
            viewGroup.setContentDescription(str);
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qqf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            this.f325468o = textView;
            textView.setText(str);
            android.widget.TextView textView2 = this.f325468o;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f325468o;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            android.widget.TextView textView4 = this.f325468o;
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
        if (!z17) {
            android.widget.TextView textView = this.f325468o;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            android.widget.TextView textView2 = this.f325468o;
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.c(textView2);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f325469p.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        activity.getIntent().putExtra("KEY_MIX_SEARCH_CUR_TAB", this.f325466m);
        android.widget.TextView textView3 = this.f325468o;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        android.widget.TextView textView4 = this.f325468o;
        if (textView4 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        android.view.View view = this.f325467n;
        return view == null ? this.f558585j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        android.view.View view = this.f325467n;
        return view == null ? this.f558585j : view;
    }
}
