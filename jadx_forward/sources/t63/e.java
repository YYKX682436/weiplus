package t63;

@j95.b
/* loaded from: classes5.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public x63.j f497538d = null;

    /* renamed from: e, reason: collision with root package name */
    public y63.c f497539e = null;

    /* renamed from: f, reason: collision with root package name */
    public x63.p f497540f = null;

    public x63.p Ai() {
        gm0.j1.b().c();
        if (this.f497540f == null) {
            this.f497540f = new x63.p();
        }
        return this.f497540f;
    }

    public y63.c Bi() {
        gm0.j1.b().c();
        if (this.f497539e == null) {
            gm0.j1.i();
            this.f497539e = new y63.c(gm0.j1.u().f354686f);
        }
        return this.f497539e;
    }

    public void Di(java.lang.String str, java.lang.String str2, y63.a aVar, y63.a aVar2, y63.a aVar3, boolean z17) {
        java.lang.Object obj;
        if (aVar2 == null) {
            return;
        }
        ot0.q qVar = new ot0.q();
        qVar.f430187f = str;
        qVar.f430199i = 53;
        qVar.f430254v2 = new android.util.Pair(aVar2.f66138x4b6e619a, x63.g.a(str, aVar2, false));
        if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).rj(qVar.f430199i, str2)) {
            l15.c cVar = new l15.c();
            cVar.m126728xdc93280d(ot0.q.u(qVar, null, null));
            qu.c cVar2 = new qu.c(str2, cVar, null);
            cVar2.f448248q = aVar2;
            cVar2.f448249r = z17;
            cVar2.f448250s = 1;
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new qu.b(cVar2));
            return;
        }
        ((ez.w0) ot0.j1.a()).getClass();
        android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", str2, "", null);
        if (z17 && I.first != null && I.second != null) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().a(((java.lang.Long) I.second).longValue(), aVar2, aVar3, true, 1);
        } else if (!z17) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().i(aVar2, aVar3, 1);
        }
        if (I.first != null && (obj = I.second) != null) {
            x63.g.L(((java.lang.Long) obj).longValue(), c01.z1.r(), aVar, str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.PluginGroupSolitaire", "sendGroupSolitatire() content ret:%s", I);
    }

    public x63.j wi() {
        gm0.j1.b().c();
        if (this.f497538d == null) {
            this.f497538d = new x63.j();
        }
        return this.f497538d;
    }
}
