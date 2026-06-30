package ul4;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f510146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jm4.h0 f510147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f510148f;

    public h(ul4.i iVar, jm4.h0 h0Var, byte[] bArr) {
        this.f510146d = iVar;
        this.f510147e = h0Var;
        this.f510148f = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f25.l0 l0Var;
        f25.l0 l0Var2;
        ul4.i iVar = this.f510146d;
        jm4.h0 h0Var = this.f510147e;
        byte[] bArr = this.f510148f;
        iVar.getClass();
        if (h0Var != jm4.h0.f381921e) {
            if (h0Var == jm4.h0.f381922f) {
                if (iVar.f510155m) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingAudioFocusController", "abandonFocus failed for requestFocusManual " + iVar.f510152g.f340637a);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "abandonFocus  taskId " + iVar.f510151f + ", " + iVar.f510152g.f340637a);
                f25.m0 m0Var = iVar.f510153h;
                if (m0Var != null) {
                    ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
                    iVar.f510153h = null;
                    return;
                }
                return;
            }
            return;
        }
        f25.e Vd = ((f25.n0) i95.n0.c(f25.n0.class)).Vd();
        if (Vd.f340625a) {
            f25.m0 m0Var2 = Vd.f340626b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((m0Var2 == null || (l0Var2 = ((g25.e) m0Var2).f349512b) == null) ? null : l0Var2.getClass(), iVar.f510152g.getClass())) {
                f25.m0 m0Var3 = Vd.f340626b;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((m0Var3 == null || (l0Var = ((g25.e) m0Var3).f349512b) == null) ? null : l0Var.f340637a, iVar.f510152g.f340637a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "current focus scene is same as request scene, skip");
                    pm0.v.X(new ul4.a(iVar, 0, bArr));
                    return;
                }
            }
        }
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "requestFocus fail, isAnchorLiving");
            iVar.d(null, true);
            pm0.v.X(new ul4.a(iVar, -1, bArr));
            return;
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(iVar.f510152g, iVar);
        g25.e eVar = (g25.e) m96;
        if (eVar.f349513c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "requestFocus success taskId " + iVar.f510151f + ", " + iVar.f510152g.f340637a + ", currentLockFocusScene: " + eVar.f349514d);
            pm0.v.X(new ul4.a(iVar, 0, bArr));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", "requestFocus fail taskId " + iVar.f510151f);
            iVar.d(m96, false);
            pm0.v.X(new ul4.a(iVar, -1, bArr));
        }
        iVar.f510153h = m96;
    }
}
