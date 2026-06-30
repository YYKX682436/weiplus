package gx0;

/* loaded from: classes5.dex */
public final class l0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u0 f358182d;

    public l0(gx0.u0 u0Var) {
        this.f358182d = u0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        gx0.u0 u0Var = this.f358182d;
        if (u0Var.Z7().m132411xc00617a4()) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb l76 = u0Var.a8().l7();
        jz5.g gVar = u0Var.f513139u;
        if (l76 == null || (c3971x241f78 = l76.f130065a) == null) {
            ((du0.o) ((jz5.n) gVar).mo141623x754a37bb()).U6(false);
        } else {
            du0.o.o7((du0.o) ((jz5.n) gVar).mo141623x754a37bb(), c3971x241f78, false, false, 4, null);
        }
    }
}
