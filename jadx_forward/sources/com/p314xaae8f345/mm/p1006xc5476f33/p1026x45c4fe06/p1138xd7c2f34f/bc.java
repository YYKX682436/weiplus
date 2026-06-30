package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class bc implements k91.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb f166062a;

    public bc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.yb ybVar) {
        this.f166062a = vbVar;
    }

    @Override // k91.g5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11810xcb772e0b c11810xcb772e0b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar = this.f166062a;
        k91.g5 g5Var = vbVar.G;
        if (g5Var != null) {
            g5Var.a();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(vbVar.f166821q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x5.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vbVar.f166815h, "beforeSync: sync contact[username(%s) appId(%s)], process preload cgi, is open = [%b]", vbVar.f166816i, vbVar.f166817m, java.lang.Boolean.TRUE);
            af.d dVar = af.d.f85977a;
            ug1.c cVar = new ug1.c();
            java.lang.String id6 = vbVar.D;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            if (((af.c) af.d.f85978b.put(id6, cVar)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandParallelTasksManager", "add duplicate collection id = [%s]", id6);
            }
            af.c b17 = dVar.b(vbVar.D, true);
            java.util.Objects.requireNonNull(b17);
            java.lang.String str = vbVar.f166816i;
            int i17 = vbVar.f166821q;
            int i18 = vbVar.f166823s;
            b17.a(new ug1.h(str, i17, i18, vbVar.f166824t, vbVar.f166825u, vbVar.f166826v, vbVar.f166817m, (i18 != 1162 || (c11810xcb772e0b = vbVar.H) == null) ? null : c11810xcb772e0b.f158850g, vbVar.I, vbVar.f166827w, vbVar.D, vbVar.f166814J));
            b17.a(new ug1.g(vbVar.f166824t, vbVar.f166816i, vbVar.f166817m, vbVar.D));
            ug1.b.a(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(vbVar.f166817m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35216xc99d8c7c);
        }
    }
}
