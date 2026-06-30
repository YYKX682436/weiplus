package di4;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final di4.i f314315a = new di4.i();

    /* renamed from: b, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.j0 f314316b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f314317c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f314318d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f314319e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f314320f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f314321g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f314322h;

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(bool);
        f314316b = j0Var;
        jz5.h.b(di4.f.f314312d);
        jz5.h.b(di4.e.f314311d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "BtnMoreRedDot publish:false kv:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("status.kv_name").i("status.btn_more_red", true));
        if (bool != null) {
            j0Var.mo7808x76db6cb1(bool);
        }
        f314317c = jz5.h.b(di4.d.f314310d);
        f314318d = jz5.h.b(di4.h.f314314d);
        f314319e = jz5.h.b(di4.a.f314308d);
        f314320f = jz5.h.b(di4.g.f314313d);
        f314321g = jz5.h.b(k0.n1.C);
        f314322h = jz5.h.b(di4.c.f314309d);
    }

    public static final boolean a(di4.i iVar, e65.a aVar, java.lang.String str) {
        iVar.getClass();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = false;
        boolean z18 = z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
        int h17 = z18 ? bm5.o1.f104252a.h(aVar) : -1;
        java.lang.String str3 = "repairerConfig";
        if (z18 && h17 == 1) {
            z17 = true;
        } else if (!z18 || h17 != 2) {
            z17 = j62.e.g().l(aVar.k(), false, true, true);
            str3 = "expt";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", str + " enable=" + z17 + ", source=" + str3 + ", useRepairer=" + z18 + ", repairerConfig=" + h17);
        return z17;
    }

    public static final boolean d() {
        f314315a.getClass();
        return ((java.lang.Boolean) f314317c.mo141623x754a37bb()).booleanValue();
    }

    public final boolean c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "DialogRedDot publish:false kv:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("status.kv_name").i("status.dialog_red", true));
        return false;
    }

    public final boolean e() {
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20702xbb9f4969()) == 1 && ai4.b0.f86659d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "isUseCgiOptConfig %b", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "updateDialogRedDot:" + z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("status.kv_name").G("status.dialog_red", z17);
    }

    public final void g(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "updateProfileBtnMoreRedDot:" + z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("status.kv_name").G("status.btn_more_red", z17);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        if (valueOf != null) {
            valueOf.booleanValue();
            f314316b.mo7808x76db6cb1(valueOf);
        }
    }
}
