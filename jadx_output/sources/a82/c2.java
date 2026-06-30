package a82;

/* loaded from: classes4.dex */
public final class c2 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.e2 f1981d;

    public c2(a82.e2 e2Var) {
        this.f1981d = e2Var;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        a82.e2 e2Var = this.f1981d;
        ((a82.d2) e2Var.f1988d).onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mm.modelbase.u0 u0Var = e2Var.f1989e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, e2Var);
        }
    }
}
