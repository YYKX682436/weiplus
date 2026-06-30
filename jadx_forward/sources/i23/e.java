package i23;

/* loaded from: classes12.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final qv4.j f369612d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f369613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        su4.s0 s0Var = (su4.s0) i95.n0.c(su4.s0.class);
        i23.a aVar = new i23.a(activity, this);
        ((iv4.e) s0Var).getClass();
        this.f369612d = new qv4.j(aVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        qv4.j jVar = this.f369612d;
        jVar.c();
        mo144222x4ff8c0f0(jVar.f383768a.n()).post(new i23.c(this));
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(m158354x19263085(), new i23.d(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        qv4.j jVar = this.f369612d;
        if (jVar.f383768a.mo134670x74219ae7()) {
            return;
        }
        if (jVar.f448515g) {
            jVar.f448515g = false;
            return;
        }
        if (!jVar.f().f448553n) {
            rv4.h hVar = jVar.f().f448544e;
            if (hVar != null) {
                hVar.l(false);
            }
            jVar.f().k();
        }
        jVar.f().f448553n = false;
    }
}
