package dr4;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f324268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dr4.c0 c0Var, yz5.l lVar) {
        super(0);
        this.f324268d = c0Var;
        this.f324269e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar;
        int i17;
        dr4.c0 c0Var = this.f324268d;
        if ((c0Var.f324134d != null || c0Var.f324140j) && (lVar = this.f324269e) != null) {
            lVar.mo146xb9724478(c0Var);
        }
        dr4.c0 c0Var2 = this.f324268d;
        c0Var2.f324140j = true;
        c0Var2.f324142l = this.f324269e;
        rs0.h n17 = rs0.g.n(rs0.i.f480829a, null, null, c0Var2.f324131a, c0Var2.f324132b, null, 16, null);
        c0Var2.f324134d = n17;
        pq4.c l17 = gq4.v.Bi().l("CAMERA");
        if (l17 != null) {
            l17.f439216d = n17;
        }
        int i18 = c0Var2.f324131a;
        int i19 = c0Var2.f324132b;
        c0Var2.f324135e = new dr4.q1(i18, i19, i18, i19, 2, 1);
        if (c0Var2.f324147q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", "render YT face-beauty algorithm");
            i17 = 2;
        } else {
            i17 = 0;
        }
        c0Var2.f324148r = i17;
        c0Var2.b(new dr4.x(c0Var2));
        is0.c cVar = new is0.c(false, 14L);
        c0Var2.f324139i = cVar;
        int i27 = c0Var2.f324131a;
        int i28 = c0Var2.f324132b;
        cVar.f375933m = i27;
        cVar.f375934n = i28;
        dr4.q1 q1Var = c0Var2.f324135e;
        if (q1Var != null) {
            q1Var.x(cVar);
        }
        c0Var2.f324136f = new android.graphics.SurfaceTexture(cVar.f375928e);
        c0Var2.f324137g = new android.view.Surface(c0Var2.f324136f);
        android.graphics.SurfaceTexture surfaceTexture = c0Var2.f324136f;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new dr4.s(c0Var2));
        }
        ((ku5.t0) ku5.t0.f394148d).B(new dr4.t(c0Var2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", "init create PboSurfaceRender, width:" + c0Var2.f324131a + ", height:" + c0Var2.f324132b);
        this.f324268d.f324141k = false;
        return jz5.f0.f384359a;
    }
}
