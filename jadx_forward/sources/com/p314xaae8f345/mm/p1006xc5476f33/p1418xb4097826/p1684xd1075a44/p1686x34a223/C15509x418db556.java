package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/pref/FinderLocationPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference */
/* loaded from: classes8.dex */
public final class C15509x418db556 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public boolean M;
    public boolean N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;

    public C15509x418db556(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = "";
        this.Q = "";
        this.R = "";
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }

    public final void M() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.P, "unshow")) {
            if (!(this.P.length() == 0)) {
                java.lang.String l17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().l(this.P);
                java.lang.String m17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().m(this.P, this.Q);
                java.lang.String f17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().f(this.P, this.Q, this.R);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                    L(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(m17) + ' ' + f17);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                        return;
                    }
                    L(l17);
                    return;
                } else {
                    L(l17 + ' ' + m17);
                    return;
                }
            }
        }
        L(this.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f4f));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.t(view);
        E(8);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.nh8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById).setVisibility(this.M ? 0 : 8);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.in7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2).setVisibility(this.N ? 0 : 8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View u17 = super.u(parent);
        android.view.View findViewById = u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        viewGroup.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.b28, viewGroup);
        this.L = u17;
        return u17;
    }

    public C15509x418db556(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = "";
        this.Q = "";
        this.R = "";
    }

    public C15509x418db556(android.content.Context context) {
        super(context);
        this.P = "";
        this.Q = "";
        this.R = "";
    }
}
