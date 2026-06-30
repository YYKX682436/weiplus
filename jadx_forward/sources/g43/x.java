package g43;

/* loaded from: classes5.dex */
public final class x extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.i0 f350327d = new p012xc85e97e9.p093xedfae76a.i0();

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f350328e = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350329f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f350330g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f350331h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f350332i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f350333m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f350334n;

    public x() {
        jz5.i iVar = jz5.i.f384364f;
        this.f350331h = jz5.h.a(iVar, g43.w.f350326d);
        this.f350332i = new java.util.ArrayList();
        this.f350333m = jz5.h.a(iVar, g43.p.f350307d);
        this.f350334n = jz5.h.a(iVar, new g43.n(this));
    }

    public static final void N6(g43.x xVar, w33.e eVar, boolean z17) {
        xVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6k);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(new w33.c(null, new w33.e(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18, string, ""), false, 601, 5, null));
        }
        if (eVar != null) {
            arrayList.add(new w33.c(null, eVar, false, 602, 5, null));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        xVar.f350327d.mo7808x76db6cb1(w33.b.a(xVar.O6(), arrayList, null, null, null, 14, null));
    }

    public final w33.b O6() {
        w33.b bVar = (w33.b) this.f350327d.mo3195x754a37bb();
        if (bVar != null) {
            return bVar;
        }
        kz5.p0 p0Var = kz5.p0.f395529d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new w33.b(p0Var, new jz5.l(bool, p0Var), new jz5.l(bool, p0Var), new jz5.l(bool, p0Var));
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        java.lang.String str = this.f350329f;
        if (str != null) {
            g43.m mVar = g43.m.f350299d;
            mVar.c().remove(str);
            mVar.b().remove(str);
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameChatRoom.ChatroomMemberViewModel", "onCleared");
        super.mo528x82b764cd();
    }
}
