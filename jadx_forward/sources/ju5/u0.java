package ju5;

/* loaded from: classes15.dex */
public class u0 extends ju5.d {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f383689c = null;

    /* renamed from: d, reason: collision with root package name */
    public final int f383690d;

    /* renamed from: e, reason: collision with root package name */
    public final iu5.e f383691e;

    /* renamed from: f, reason: collision with root package name */
    public final iu5.e f383692f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f383693g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f383694h;

    public u0(int i17, iu5.e eVar, iu5.e eVar2, boolean z17, boolean z18) {
        this.f383690d = -1;
        this.f383691e = null;
        this.f383692f = null;
        this.f383693g = false;
        this.f383694h = false;
        this.f383690d = i17;
        this.f383691e = eVar;
        this.f383693g = z17;
        this.f383694h = z18;
        this.f383692f = eVar2;
    }

    @Override // ju5.f
    public void c() {
        if (wt5.a.j() || !this.f383694h) {
            i();
        } else {
            zt5.h.a("Soter.TaskPrepareAuthKey", "soter: ask not found, but required to generate it. start generate", new java.lang.Object[0]);
            cu5.b.d(new ju5.r0(this), false, this.f383692f);
        }
    }

    @Override // ju5.f
    public boolean d() {
        return true;
    }

    @Override // ju5.f
    public void f() {
        zt5.h.f("Soter.TaskPrepareAuthKey", "soter: cancelled prepare authkey: %s", this.f383689c);
        wt5.a.s(this.f383689c, false);
    }

    @Override // ju5.f
    public boolean g() {
        boolean l17;
        if (!fu5.d.b().d()) {
            zt5.h.f("Soter.TaskPrepareAuthKey", "soter: not initialized yet", new java.lang.Object[0]);
            b(new eu5.c(1008));
            return true;
        }
        if (!fu5.d.b().e()) {
            zt5.h.f("Soter.TaskPrepareAuthKey", "soter: not support soter", new java.lang.Object[0]);
            b(new eu5.c(2));
            return true;
        }
        android.util.SparseArray a17 = fu5.d.b().a();
        int i17 = this.f383690d;
        java.lang.String str = (java.lang.String) a17.get(i17, "");
        this.f383689c = str;
        if (zt5.l.b(str)) {
            zt5.h.f("Soter.TaskPrepareAuthKey", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new java.lang.Object[0]);
            b(new eu5.c(1009, java.lang.String.format("auth scene %d not initialized in map", java.lang.Integer.valueOf(i17))));
            return true;
        }
        boolean j17 = wt5.a.j();
        if (!j17 && wt5.a.i(this.f383689c)) {
            zt5.h.f("Soter.TaskPrepareAuthKey", "soter: no ask but has auth key. delete the auth key as well", new java.lang.Object[0]);
            wt5.a.s(this.f383689c, false);
        }
        if (!j17 && !this.f383694h) {
            zt5.h.f("Soter.TaskPrepareAuthKey", "soter: has not generate app secure key yet and not require to generate it", new java.lang.Object[0]);
            b(new eu5.c(3));
            return true;
        }
        if (wt5.a.i(this.f383689c)) {
            java.lang.String str2 = this.f383689c;
            au5.b bVar = wt5.a.f531070c;
            if (bVar == null) {
                zt5.h.b("Soter.SoterCore", "soter: isAuthKeyValid IMPL is null, not support soter", new java.lang.Object[0]);
                l17 = false;
            } else {
                l17 = bVar.l(str2, true);
            }
            if (!l17) {
                zt5.h.f("Soter.TaskPrepareAuthKey", "soter: already has auth key but not valid. delete it already and re-generate", new java.lang.Object[0]);
                return false;
            }
        }
        if (!wt5.a.i(this.f383689c) || this.f383693g) {
            if (this.f383691e == null) {
                zt5.h.f("Soter.TaskPrepareAuthKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload AuthKey validation from server! Please make sure you upload it later", new java.lang.Object[0]);
            }
            return false;
        }
        zt5.h.c("Soter.TaskPrepareAuthKey", "soter: already has key. do not need generate again", new java.lang.Object[0]);
        b(new eu5.c(0, wt5.a.e(this.f383689c)));
        return true;
    }

    public final void i() {
        h(this.f383689c, 1);
        ju5.o.a().c(new hu5.b(new hu5.c(2, this.f383689c, false, this.f383693g, new ju5.s0(this), null)));
    }
}
