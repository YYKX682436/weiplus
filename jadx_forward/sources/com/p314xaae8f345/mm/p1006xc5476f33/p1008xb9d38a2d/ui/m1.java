package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.TextView f155558a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f155559b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f155560c;

    /* renamed from: d, reason: collision with root package name */
    public du5.c f155561d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f155562e;

    /* renamed from: g, reason: collision with root package name */
    public wd0.c1 f155564g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f155563f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f155565h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f155566i = 3;

    public static wd0.e1 a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var, int i17, java.lang.String str) {
        m1Var.getClass();
        wd0.e1 e1Var = new wd0.e1();
        e1Var.f526236a = i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        e1Var.f526237b = str;
        e1Var.f526239d = "";
        return e1Var;
    }

    public void b(android.content.Context context, boolean z17) {
        if (!z17) {
            if (this.f155565h) {
                this.f155562e.q(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p2o));
                return;
            }
            this.f155559b.setVisibility(8);
            this.f155558a.setVisibility(0);
            this.f155560c.m82040x7541828(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
            return;
        }
        if (this.f155565h) {
            this.f155562e.q(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozq));
            this.f155562e.r(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
        } else {
            this.f155559b.setVisibility(0);
            this.f155558a.setVisibility(8);
            this.f155560c.m82040x7541828(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        }
    }
}
