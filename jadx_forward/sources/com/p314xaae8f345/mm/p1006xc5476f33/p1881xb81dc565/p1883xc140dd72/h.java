package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 f231127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c f231128e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        this.f231128e = cVar;
        this.f231127d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = this.f231128e;
        if (cVar.f231047a != null) {
            com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a a17 = cVar.a(this.f231127d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = cVar.f231047a;
            v0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "onMemberChange: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.b(a17));
            if (v0Var.x() && v0Var.c0(a17)) {
                java.util.Iterator it = v0Var.f231710t.f153144i.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    int i18 = ((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) it.next()).f153147f;
                    if (i18 == 10 || i18 == 1) {
                        i17++;
                    }
                }
                boolean z17 = i17 > 1;
                sj3.e4 e4Var = sj3.e4.Inviting;
                if (!z17) {
                    if (v0Var.f231709s == e4Var) {
                        v0Var.f(false, true);
                        return;
                    } else {
                        v0Var.f(false, false);
                        return;
                    }
                }
                java.util.List list = a17.f153144i;
                if (list != null) {
                    zj3.g.f554835a.c(list);
                }
                int i19 = a17.f153144i.size() > 2 ? 1 : 0;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2.f231670b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
                M.putInt("mmkv_multitalk_member_list", i19);
                sj3.e4 e4Var2 = v0Var.f231709s;
                sj3.e4 e4Var3 = sj3.e4.Talking;
                if (e4Var2 != e4Var3 && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.f(a17)) {
                    v0Var.D(e4Var3);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar = v0Var.C;
                if (zVar != null) {
                    sj3.e4 e4Var4 = v0Var.f231709s;
                    if (e4Var4 == sj3.e4.Starting || e4Var4 == e4Var3 || e4Var4 == e4Var) {
                        zVar.x5();
                    }
                }
                if (v0Var.f231709s == e4Var) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar = v0Var.S;
                    hVar.getClass();
                    hVar.f231819x = a17;
                    android.view.View view = hVar.f382769e;
                    if (view != null) {
                        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.g(hVar));
                    }
                }
                java.lang.String r17 = c01.z1.r();
                zj3.g gVar = zj3.g.f554835a;
                zj3.g.f554843i = zj3.j.c(r17);
            }
        }
    }
}
