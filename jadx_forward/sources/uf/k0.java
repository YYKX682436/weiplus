package uf;

/* loaded from: classes7.dex */
public final class k0 implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf.m f508572e;

    public k0(uf.o0 o0Var, uf.m mVar) {
        this.f508571d = o0Var;
        this.f508572e = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r56.a
    /* renamed from: call */
    public final void mo740x2e7a5e() {
        uf.o0 o0Var = this.f508571d;
        o0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleBroadcast: ");
        uf.m mVar = this.f508572e;
        sb6.append(mVar.f508575a.name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", sb6.toString());
        int ordinal = mVar.f508575a.ordinal();
        x91.j jVar = x91.j.Stopped;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = o0Var.f508599i;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = o0Var.f508598h;
        uf.j jVar2 = o0Var.f508592b;
        uf.c1 c1Var = o0Var.f508595e;
        java.lang.Object obj = mVar.f508576b;
        switch (ordinal) {
            case 5:
                c1Var.c().f534184e.f534196a = x91.j.Playing;
                uf.u0 u0Var = new uf.u0(c1Var);
                java.util.Iterator it = c1Var.f508517c.iterator();
                while (it.hasNext()) {
                    u0Var.mo146xb9724478(it.next());
                }
                java.util.Iterator it6 = c1Var.f508518d.iterator();
                while (it6.hasNext()) {
                    u0Var.mo146xb9724478(it6.next());
                }
                yz5.a aVar = c1Var.f508519e;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                if (b4Var2.e()) {
                    o0Var.f508597g = false;
                    b4Var2.c(5000L, 5000L);
                }
                if (uf.d2.f508549d == ((uf.o1) o0Var.f508591a).f508607f) {
                    b4Var.c(1000L, 1000L);
                }
                jVar2.f();
                jVar2.g(true);
                yz5.a aVar2 = o0Var.f508602l;
                if (aVar2 != null) {
                    ((uf.b0) aVar2).mo152xb9724478();
                }
                o0Var.f508602l = null;
                uf.a aVar3 = o0Var.f508601k;
                int i17 = aVar3 == null ? -1 : uf.o.f508590a[aVar3.ordinal()];
                if (i17 == 1) {
                    uf.l lVar = o0Var.f508593c;
                    x91.c cVar = c1Var.c().f534180a;
                    java.lang.String str = cVar != null ? cVar.f534173h : null;
                    java.lang.String str2 = str == null ? "" : str;
                    x91.c cVar2 = c1Var.c().f534180a;
                    uf.l.b(lVar, aVar3, 0, str2, "", true, 2, null);
                } else if (i17 == 2 || i17 == 3) {
                    uf.l.b(o0Var.f508593c, aVar3, 0, null, null, true, 14, null);
                }
                o0Var.f508601k = null;
                return;
            case 6:
                c1Var.c().f534184e.f534196a = x91.j.Paused;
                jVar2.mo167945xb01dfb57();
                return;
            case 7:
                c1Var.c().f534184e.f534196a = jVar;
                jVar2.b();
                return;
            case 8:
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Receive Action : Volume = ");
                sb7.append(obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", sb7.toString());
                return;
            case 9:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Receive Action : Mute = ");
                sb8.append(obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", sb8.toString());
                return;
            case 10:
            default:
                return;
            case 11:
                if (c1Var.c().f534184e.f534196a == jVar) {
                    return;
                }
                uf.a aVar4 = obj instanceof uf.a ? (uf.a) obj : null;
                int i18 = aVar4 == null ? -1 : uf.o.f508590a[aVar4.ordinal()];
                if (i18 == 1) {
                    uf.l lVar2 = o0Var.f508593c;
                    x91.c cVar3 = c1Var.c().f534180a;
                    java.lang.Object obj2 = cVar3 != null ? cVar3.f534173h : null;
                    java.lang.String str3 = obj2 == null ? "" : obj2;
                    x91.c cVar4 = c1Var.c().f534180a;
                    uf.l.b(lVar2, aVar4, 0, str3, "", false, 2, null);
                } else if (i18 == 2 || i18 == 3) {
                    uf.l.b(o0Var.f508593c, aVar4, 0, null, null, false, 14, null);
                }
                jVar2.g(false);
                jVar2.a();
                o0Var.f();
                b4Var.d();
                b4Var2.d();
                uf.t0 t0Var = new uf.t0(c1Var);
                java.util.Iterator it7 = c1Var.f508517c.iterator();
                while (it7.hasNext()) {
                    t0Var.mo146xb9724478(it7.next());
                }
                java.util.Iterator it8 = c1Var.f508518d.iterator();
                while (it8.hasNext()) {
                    t0Var.mo146xb9724478(it8.next());
                }
                yz5.a aVar5 = c1Var.f508519e;
                if (aVar5 != null) {
                    aVar5.mo152xb9724478();
                }
                c1Var.c().f534184e.f534196a = jVar;
                return;
        }
    }
}
