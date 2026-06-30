package sd;

/* loaded from: classes8.dex */
public class u0 extends sd.k implements sd.a {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f488187h;

    /* renamed from: i, reason: collision with root package name */
    public final sd.o0 f488188i;

    /* renamed from: m, reason: collision with root package name */
    public me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab f488189m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Bundle f488190n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f488191o;

    public u0(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar);
        this.f488191o = null;
        sd.s0 s0Var = new sd.s0(this);
        this.f488190n = bundle == null ? new android.os.Bundle() : bundle;
        this.f488188i = o0Var;
        sd.x xVar2 = this.f488145f;
        if (o0Var == null) {
            sd.w wVar = ((sd.u) xVar2).f488186a;
            java.lang.Integer num = wVar.f488200h;
            wVar.f488200h = null;
            sd.o0 a17 = sd.q0.a(wVar.f488194b, num);
            o0Var = (a17 == null || !a17.f488164g.equals(wVar.c())) ? null : a17;
        }
        o0Var = o0Var == null ? new sd.o0(this.f488143d, ((sd.u) xVar2).f488186a.c()) : o0Var;
        this.f488188i = o0Var;
        o0Var.g((java.util.LinkedList) ((sd.u) this.f488145f).f488186a.f488197e.f488132a.clone(), this);
        o0Var.f488165h = s0Var;
        android.view.View k17 = k();
        me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab = new me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab(this.f488143d, null);
        this.f488189m = c29141x858f5ab;
        c29141x858f5ab.m147203xe272883f(0);
        this.f488189m.addView(k17);
        this.f488189m.m147196x590ab8fc(k17);
        this.f488189m.c(new sd.r0(this, new boolean[]{false}));
        this.f488187h = this.f488189m;
    }

    @Override // sd.k
    public void a() {
        f();
        this.f488144e.a(sd.b0.class);
        sd.o0 o0Var = this.f488188i;
        android.view.ViewParent parent = o0Var.f488166i.mo32262xfb86a31b().getParent();
        if (parent instanceof android.view.ViewGroup) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageWebCore", "removeSelfFromParent");
            ((android.view.ViewGroup) parent).removeView(o0Var.f488166i.mo32262xfb86a31b());
        }
        i();
    }

    @Override // sd.k
    public void b(java.lang.String str, android.os.Bundle bundle) {
        this.f488188i.j(str);
    }

    @Override // sd.k
    public boolean c() {
        sd.o0 o0Var = this.f488188i;
        if (!(o0Var.f488166i.mo32258xed1a21df() && o0Var.f488174t)) {
            return false;
        }
        o0Var.f488166i.mo32263xb5fed1ef();
        return true;
    }

    @Override // sd.a
    /* renamed from: getRuntime */
    public sd.l0 mo64556x9a3f0ba2() {
        return this.f488188i;
    }

    public void i() {
        this.f488188i.a();
    }

    public java.lang.String j() {
        return "";
    }

    public android.view.View k() {
        return this.f488188i.f488166i.mo32262xfb86a31b();
    }
}
