package iu1;

/* loaded from: classes9.dex */
public final class r1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public int f376477d;

    /* renamed from: e, reason: collision with root package name */
    public int f376478e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f376479f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f376480g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f376481h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 f376482i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f376483m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f376484n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.view.View itemView, int i17) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        if (i17 == 0) {
            android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.bag);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f376480g = (android.widget.TextView) findViewById;
            return;
        }
        if (i17 == 1) {
            android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.byp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            this.f376479f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById2;
            android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.byr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            this.f376480g = (android.widget.TextView) findViewById3;
            com.p314xaae8f345.mm.ui.bk.r0(l().getPaint(), 0.8f);
            android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.byo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            this.f376481h = (android.widget.TextView) findViewById4;
            k().m75397xc185581c(true);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.byr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            this.f376480g = (android.widget.TextView) findViewById5;
            com.p314xaae8f345.mm.ui.bk.r0(l().getPaint(), 0.8f);
            android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.byo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
            this.f376481h = (android.widget.TextView) findViewById6;
            return;
        }
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cno);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f376479f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cnq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f376480g = (android.widget.TextView) findViewById8;
        com.p314xaae8f345.mm.ui.bk.r0(l().getPaint(), 0.8f);
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cnn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f376481h = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cnl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f376482i = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cnm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f376484n = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cnp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f376483m = (android.widget.LinearLayout) findViewById12;
        k().m75397xc185581c(true);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = this.f376482i;
        if (c13081x70323a5 != null) {
            return c13081x70323a5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgIv");
        throw null;
    }

    public final android.widget.TextView j() {
        android.widget.TextView textView = this.f376481h;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 k() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f376479f;
        if (c19659x677e0913 != null) {
            return c19659x677e0913;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("logoIv");
        throw null;
    }

    public final android.widget.TextView l() {
        android.widget.TextView textView = this.f376480g;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
        throw null;
    }
}
