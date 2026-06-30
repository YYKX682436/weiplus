package dl4;

/* loaded from: classes11.dex */
public final class h implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl4.j f316938d;

    public h(dl4.j jVar) {
        this.f316938d = jVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) obj;
        int ordinal = n1Var.f152636a.ordinal();
        dl4.j jVar = this.f316938d;
        if (ordinal == 3) {
            dl4.g gVar = jVar.f316951a;
            if (gVar != null) {
                ((rk4.j3) gVar).a(n1Var.f152638c, "upload fail, ret:" + n1Var.f152638c + ", sceneResult:" + n1Var.f152641f);
            }
        } else if (ordinal != 4) {
            rk4.k5.c("upload action:" + n1Var.f152636a + ", ret:" + n1Var.f152638c, jVar.f316952b);
        } else {
            dn.h hVar = n1Var.f152641f;
            java.lang.String str = hVar != null ? hVar.f69524x419c440e : null;
            if (str != null) {
                rk4.k5.e("upload success, ret:" + n1Var.f152638c + " url:" + str, jVar.f316952b);
                dl4.g gVar2 = jVar.f316951a;
                if (gVar2 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((rk4.j3) gVar2).f478282a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25195x977068c5(0L, null, str, 2, null))));
                }
            } else {
                dl4.g gVar3 = jVar.f316951a;
                if (gVar3 != null) {
                    ((rk4.j3) gVar3).a(-1, "fileUrl is null");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
