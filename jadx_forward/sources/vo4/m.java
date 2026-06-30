package vo4;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.p f520195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vo4.p pVar) {
        super(0);
        this.f520195d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        int i19;
        int i27;
        vo4.p pVar = this.f520195d;
        android.view.Surface surface = pVar.f520223d;
        rs0.g gVar = rs0.i.f480829a;
        int i28 = pVar.f520221b;
        int i29 = pVar.f520220a;
        if (surface == null) {
            i18 = 18;
            i19 = i28;
            i17 = i29;
        } else {
            i17 = 0;
            i18 = 30;
            i19 = 0;
        }
        pVar.f520198e = rs0.g.n(gVar, surface, null, i17, i19, null, i18, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", "initGL succ");
        is0.c b17 = is0.b.b(true, 9L);
        int i37 = pVar.f520201h;
        if (i37 <= 0 || (i27 = pVar.f520202i) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", "[OpenGL] init productionTexObj, width:" + i29 + ", height:" + i28);
            is0.c.b(b17, pVar.f520220a, pVar.f520221b, 0, null, 0, 0, 60, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", "[OpenGL] init productionTexObj, width:" + i37 + ", height:" + i27);
            is0.c.b(b17, pVar.f520201h, pVar.f520202i, 0, null, 0, 0, 60, null);
        }
        pVar.f520222c = b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpenGL] init egl environment after, surface: ");
        sb6.append(pVar.f520223d);
        sb6.append(", eglEnv: ");
        rs0.h hVar = pVar.f520198e;
        sb6.append(hVar != null ? hVar.f480827c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", sb6.toString());
        return jz5.f0.f384359a;
    }
}
