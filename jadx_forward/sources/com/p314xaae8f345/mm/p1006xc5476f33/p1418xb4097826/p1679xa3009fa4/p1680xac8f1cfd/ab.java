package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class ab implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 f215295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f215296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f215297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f215298g;

    public ab(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, int i17) {
        this.f215295d = c15449xa84711;
        this.f215296e = f0Var;
        this.f215297f = f0Var2;
        this.f215298g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f215296e.f391649d;
        int i18 = this.f215297f.f391649d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711 = this.f215295d;
        if (c15449xa84711.f215086y) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xa xaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xa(i18, i17, this.f215298g, c15449xa84711.m80379x76847179());
        xaVar.f93582a = i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = c15449xa84711.A;
        if (c1161x57298f5d != null) {
            c1161x57298f5d.m8099x6305639d(xaVar);
        }
        c15449xa84711.f215086y = true;
    }
}
