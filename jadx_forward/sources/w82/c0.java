package w82;

/* loaded from: classes11.dex */
public class c0 implements w82.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de f525363d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de) {
        this.f525363d = c13620xa33772de;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = this.f525363d;
        c13620xa33772de.c(c13620xa33772de.f183083e.m79118xdb574fcd());
        ((java.util.LinkedList) c13620xa33772de.f183085g).remove(str);
        c13620xa33772de.b();
        w82.e0 e0Var = c13620xa33772de.f183087i;
        if (e0Var == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) e0Var).a(c13620xa33772de.f183084f, c13620xa33772de.f183086h, c13620xa33772de.f183085g, true);
    }

    @Override // db5.t6
    public void c() {
        w82.e0 e0Var = this.f525363d.f183087i;
        if (e0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5 j5Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) e0Var;
        j5Var.getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.N;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = j5Var.f182732a;
        if (activityC13570xd6b9f257.a7()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.Y6(activityC13570xd6b9f257);
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de.f183081m;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = this.f525363d;
        c13620xa33772de.c(str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) c13620xa33772de.f183087i).a(c13620xa33772de.f183084f, c13620xa33772de.f183086h, c13620xa33772de.f183085g, false);
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        this.f525363d.f183083e.p(str);
        a(str);
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = this.f525363d;
        c13620xa33772de.c(c13620xa33772de.f183083e.m79118xdb574fcd());
        c13620xa33772de.b();
        w82.e0 e0Var = c13620xa33772de.f183087i;
        if (e0Var == null) {
            return;
        }
        java.util.List list = c13620xa33772de.f183084f;
        java.util.List list2 = c13620xa33772de.f183086h;
        java.util.List list3 = c13620xa33772de.f183085g;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5 j5Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = j5Var.f182732a;
        activityC13570xd6b9f257.f181935p.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i5(j5Var, list2, list3, list));
        if (str != null) {
            activityC13570xd6b9f257.H = str;
            activityC13570xd6b9f257.F.f515606g = v82.b.a();
            activityC13570xd6b9f257.F.f515610k = java.lang.System.currentTimeMillis();
        } else {
            activityC13570xd6b9f257.H = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13570xd6b9f257.f181933n;
        if (cVar != null) {
            java.lang.String str2 = activityC13570xd6b9f257.H;
            if (str2 != null) {
                cVar.H = str2;
            } else {
                cVar.H = "";
            }
        }
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
