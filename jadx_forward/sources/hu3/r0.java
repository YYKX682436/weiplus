package hu3;

/* loaded from: classes5.dex */
public final class r0 implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hu3.s0 f366724a;

    public r0(hu3.s0 s0Var) {
        this.f366724a = s0Var;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f366724a.f366728b, "onRecError state is in " + i17);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        yz5.p pVar;
        if (bArr == null || i17 <= 0 || (pVar = this.f366724a.f366730d) == null) {
            return;
        }
        pVar.mo149xb9724478(bArr, java.lang.Integer.valueOf(i17));
    }
}
