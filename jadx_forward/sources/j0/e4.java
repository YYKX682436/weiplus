package j0;

/* loaded from: classes14.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final j0.c5 f377805a;

    /* renamed from: b, reason: collision with root package name */
    public final k0.y0 f377806b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.e0 f377807c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f377808d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f377809e;

    /* renamed from: f, reason: collision with root package name */
    public final k0.i1 f377810f;

    /* renamed from: g, reason: collision with root package name */
    public final g2.v f377811g;

    /* renamed from: h, reason: collision with root package name */
    public final j0.h5 f377812h;

    /* renamed from: i, reason: collision with root package name */
    public final j0.a2 f377813i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f377814j;

    public e4(j0.c5 state, k0.y0 selectionManager, g2.e0 e0Var, boolean z17, boolean z18, k0.i1 preparedSelectionState, g2.v vVar, j0.h5 h5Var, j0.a2 a2Var, yz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        g2.v offsetMapping;
        g2.e0 value = (i17 & 4) != 0 ? new g2.e0((java.lang.String) null, 0L, (a2.m1) null, 7, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null) : e0Var;
        boolean z19 = (i17 & 8) != 0 ? true : z17;
        boolean z27 = (i17 & 16) != 0 ? false : z18;
        if ((i17 & 64) != 0) {
            int i18 = g2.v.f349282a;
            offsetMapping = g2.u.f349281a;
        } else {
            offsetMapping = vVar;
        }
        j0.h5 h5Var2 = (i17 & 128) != 0 ? null : h5Var;
        j0.a2 keyMapping = (i17 & 256) != 0 ? j0.f2.f377819a : a2Var;
        yz5.l onValueChange = (i17 & 512) != 0 ? j0.w3.f378160d : lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectionManager, "selectionManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preparedSelectionState, "preparedSelectionState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetMapping, "offsetMapping");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyMapping, "keyMapping");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onValueChange, "onValueChange");
        this.f377805a = state;
        this.f377806b = selectionManager;
        this.f377807c = value;
        this.f377808d = z19;
        this.f377809e = z27;
        this.f377810f = preparedSelectionState;
        this.f377811g = offsetMapping;
        this.f377812h = h5Var2;
        this.f377813i = keyMapping;
        this.f377814j = onValueChange;
    }

    public final void a(java.util.List list) {
        g2.e eVar = this.f377805a.f377768c;
        java.util.List V0 = kz5.n0.V0(list);
        ((java.util.ArrayList) V0).add(0, new g2.h());
        this.f377814j.mo146xb9724478(eVar.a(V0));
    }
}
