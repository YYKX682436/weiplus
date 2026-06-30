package zk3;

/* loaded from: classes8.dex */
public class a extends pk3.h {
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(activityC0065xcd7aa112);
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 1;
    }

    @Override // pk3.b
    public boolean Mb(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2) {
        return (c16601x7ed0e40c2 != null && android.text.TextUtils.equals(c16601x7ed0e40c2.f66791xc8a07680, c16601x7ed0e40c.f66791xc8a07680) && c16601x7ed0e40c.f66793x2262335f == c16601x7ed0e40c2.f66793x2262335f) ? false : true;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, r45.fr4 fr4Var, java.lang.Object obj) {
        t04.a aVar;
        r45.n8 n8Var = new r45.n8();
        try {
            n8Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandMultiTaskUIC", e17, "onMultiTaskItemClick exception:%s", e17.getMessage());
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) obj;
            if (android.text.TextUtils.equals(c16601x7ed0e40c.f66791xc8a07680, c16601x7ed0e40c2.f66791xc8a07680) && c16601x7ed0e40c.f66793x2262335f == c16601x7ed0e40c2.f66793x2262335f) {
                zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(m158354x19263085());
                if (Ai != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).h7(true);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMultiTaskUIC", "not find IMultiTaskUIC");
                    return;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMultiTaskUIC", "extra instanceof MultiTaskInfo fail.");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11561xd7b6a6e5 c11561xd7b6a6e5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11561xd7b6a6e5();
        r45.w60 w60Var = new r45.w60();
        c11561xd7b6a6e5.f156491d = w60Var;
        w60Var.set(3, bm5.f1.a());
        c11561xd7b6a6e5.f156491d.set(0, fr4Var);
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            ((md0.e) eVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (context instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8) {
                aVar = (t04.a) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(t04.a.class);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).wi(view.getContext(), 5);
                if (kr4Var instanceof r45.kr4) {
                    c11561xd7b6a6e5.f156491d.set(1, kr4Var.m75945x2fec8307(0));
                }
            }
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = n8Var.m75945x2fec8307(1);
        b1Var.f398547b = n8Var.m75945x2fec8307(0);
        b1Var.f398549c = n8Var.m75939xb282bd08(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiTaskUIC", "onMultiTaskItemClick username:%s,appid:%s,versionType:%d", n8Var.m75945x2fec8307(1), n8Var.m75945x2fec8307(0), java.lang.Integer.valueOf(n8Var.m75939xb282bd08(2)));
        b1Var.O = c11561xd7b6a6e5;
        b1Var.f398565k = 1187;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f76421x9d4bf30f, b1Var);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }

    @Override // pk3.b
    public void p9(o75.c cVar) {
    }

    public a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        super(componentCallbacksC1101xa17d4670);
    }
}
