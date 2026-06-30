package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class ad implements ni1.j, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f167945a;

    /* renamed from: b, reason: collision with root package name */
    public final pi1.e f167946b;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page) {
        pi1.e aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        if (page.mo50261xee5260a9().mo51615x8408480b() == null) {
            aVar = (pi1.e) java.lang.reflect.Proxy.newProxyInstance(pi1.e.class.getClassLoader(), new java.lang.Class[]{pi1.e.class}, new pi1.c());
        } else {
            ((ne.a) page.b(ne.a.class)).getClass();
            aVar = new pi1.a(page);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aVar, "createHelper(...)");
        this.f167945a = page;
        this.f167946b = aVar;
    }

    @Override // ni1.j
    public void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            this.f167946b.a();
            return;
        }
        android.view.View mo51310xc2a54588 = this.f167945a.mo51310xc2a54588();
        if (mo51310xc2a54588 != null) {
            mo51310xc2a54588.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.xc(this));
        }
    }

    @Override // ni1.c
    public void b() {
        pi1.e eVar = this.f167946b;
        eVar.c();
        pi1.a aVar = eVar instanceof pi1.a ? (pi1.a) eVar : null;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f167945a;
            xi1.g mo50261xee5260a9 = v5Var.mo50261xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
            aVar.e(mo50261xee5260a9.mo51620x1ab1e3d4(), v5Var.mo50352x76847179().getResources().getConfiguration().orientation);
        }
    }

    @Override // ni1.c
    public void c() {
        this.f167946b.b();
    }

    @Override // ni1.j
    public void d() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            this.f167946b.d();
            return;
        }
        android.view.View mo51310xc2a54588 = this.f167945a.mo51310xc2a54588();
        if (mo51310xc2a54588 != null) {
            mo51310xc2a54588.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.zc(this));
        }
    }

    @Override // ni1.j
    public boolean e() {
        return this.f167946b.mo127344xb7d72d0e() == pi1.d.HIDDEN;
    }

    @Override // ni1.c
    /* renamed from: onConfigurationChanged */
    public void mo14690x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        pi1.e eVar = this.f167946b;
        pi1.a aVar = eVar instanceof pi1.a ? (pi1.a) eVar : null;
        if (aVar != null) {
            this.f167945a.P0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.yc(aVar, this, newConfig));
        }
    }

    @Override // ni1.c
    /* renamed from: onDestroy */
    public void mo14691xac79a11b() {
    }
}
