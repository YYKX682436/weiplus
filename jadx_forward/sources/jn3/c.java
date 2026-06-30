package jn3;

/* loaded from: classes8.dex */
public final class c implements zy2.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn3.g f382311a;

    public c(jn3.g gVar) {
        this.f382311a = gVar;
    }

    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f470020e;
        jn3.g gVar = this.f382311a;
        if (i17 >= 100001 && i17 < 199999) {
            java.util.LinkedList<r45.f03> show_infos = ctrInfo.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            for (r45.f03 f03Var : show_infos) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
                jbVar.t0(ctrInfo);
                j75.f Ai = gVar.f381800d.Ai();
                if (Ai != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f03Var);
                    Ai.B3(new sa0.h(jbVar, f03Var));
                }
            }
            return false;
        }
        if (i17 < 300000 || i17 >= 399999) {
            return false;
        }
        java.util.LinkedList<r45.f03> show_infos2 = ctrInfo.f470022g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos2, "show_infos");
        for (r45.f03 f03Var2 : show_infos2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
            jbVar2.t0(ctrInfo);
            j75.f Ai2 = gVar.f381800d.Ai();
            if (Ai2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f03Var2);
                Ai2.B3(new sa0.h(jbVar2, f03Var2));
            }
        }
        return false;
    }
}
