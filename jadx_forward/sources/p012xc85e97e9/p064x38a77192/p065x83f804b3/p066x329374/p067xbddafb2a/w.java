package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class w implements p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.t {

    /* renamed from: a, reason: collision with root package name */
    public final int f91963a;

    /* renamed from: b, reason: collision with root package name */
    public final long f91964b;

    /* renamed from: c, reason: collision with root package name */
    public s1.g2 f91965c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91966d;

    public w(int i17, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f91963a = i17;
        this.f91964b = j17;
    }

    @Override // p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.t
    /* renamed from: cancel */
    public void mo7002xae7a2e7a() {
        if (this.f91966d) {
            return;
        }
        this.f91966d = true;
        s1.g2 g2Var = this.f91965c;
        if (g2Var != null) {
            s1.o0 o0Var = (s1.o0) g2Var;
            s1.q0 q0Var = o0Var.f483581a;
            q0Var.b();
            u1.w wVar = (u1.w) q0Var.f483601h.remove(o0Var.f483582b);
            if (wVar != null) {
                if (!(q0Var.f483604k > 0)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                u1.w wVar2 = q0Var.f483594a;
                int indexOf = ((o0.f) wVar2.o()).indexOf(wVar);
                int i17 = ((o0.f) wVar2.o()).f423377d.f423385f;
                int i18 = q0Var.f483604k;
                if (!(indexOf >= i17 - i18)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                q0Var.f483603j++;
                q0Var.f483604k = i18 - 1;
                int i19 = (((o0.f) wVar2.o()).f423377d.f423385f - q0Var.f483604k) - q0Var.f483603j;
                wVar2.f505226q = true;
                wVar2.B(indexOf, i19, 1);
                wVar2.f505226q = false;
                q0Var.a(i19);
            }
        }
        this.f91965c = null;
    }
}
