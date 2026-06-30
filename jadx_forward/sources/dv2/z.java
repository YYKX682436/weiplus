package dv2;

/* loaded from: classes2.dex */
public final class z extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f325515l;

    /* renamed from: m, reason: collision with root package name */
    public final int f325516m;

    /* renamed from: n, reason: collision with root package name */
    public final int f325517n;

    /* renamed from: o, reason: collision with root package name */
    public final int f325518o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f325519p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f325520q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f325521r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f325522s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dv2.b0 f325523t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dv2.b0 b0Var, java.lang.String title, int i17, int i18, int i19, java.lang.String contentDescription) {
        super("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentDescription, "contentDescription");
        this.f325523t = b0Var;
        this.f325515l = title;
        this.f325516m = i17;
        this.f325517n = i18;
        this.f325518o = i19;
        this.f325519p = contentDescription;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f325520q = viewGroup;
        java.lang.String str = this.f325519p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f558583h = str;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nvj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f325521r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
            android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qqf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            this.f325522s = (android.widget.TextView) findViewById2;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f325521r;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleIcon");
                throw null;
            }
            c22699x3dcdb352.s(this.f325516m, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            java.lang.String str2 = this.f325515l;
            if (str2.length() == 0) {
                android.widget.TextView textView = this.f325522s;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                    throw null;
                }
                textView.setVisibility(8);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f325521r;
                if (c22699x3dcdb3522 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleIcon");
                    throw null;
                }
                c22699x3dcdb3522.setVisibility(0);
            } else {
                android.widget.TextView textView2 = this.f325522s;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                    throw null;
                }
                textView2.setText(str2);
                android.widget.TextView textView3 = this.f325522s;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                    throw null;
                }
                textView3.setVisibility(0);
                android.widget.TextView textView4 = this.f325522s;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                    throw null;
                }
                textView4.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                android.widget.TextView textView5 = this.f325522s;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.fk.c(textView5);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f325521r;
                if (c22699x3dcdb3523 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleIcon");
                    throw null;
                }
                c22699x3dcdb3523.setVisibility(8);
            }
            if (!this.f325523t.m80381x45f41879()) {
                return;
            }
            android.widget.TextView textView6 = this.f325522s;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView6.setTextSize(0, viewGroup.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb));
            viewGroup.setPadding(viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = viewGroup.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.an6);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d0q);
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f325521r;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleIcon");
                throw null;
            }
            c22699x3dcdb352.s(this.f325516m, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            android.widget.TextView textView = this.f325522s;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            android.widget.TextView textView2 = this.f325522s;
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.c(textView2);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
                throw null;
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f325523t.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        activity.getIntent().putExtra("KEY_MIX_SEARCH_MIX_SUB_TAB", this.f325518o);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f325521r;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleIcon");
            throw null;
        }
        c22699x3dcdb3522.s(this.f325517n, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        android.widget.TextView textView3 = this.f325522s;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        android.widget.TextView textView4 = this.f325522s;
        if (textView4 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        if (!(!this.f325523t.m80381x45f41879())) {
            return null;
        }
        android.view.View view = this.f325520q;
        return view == null ? this.f558585j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        if (!(!this.f325523t.m80381x45f41879())) {
            return null;
        }
        android.view.View view = this.f325520q;
        return view == null ? this.f558585j : view;
    }
}
