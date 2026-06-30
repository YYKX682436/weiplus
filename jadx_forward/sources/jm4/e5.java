package jm4;

/* loaded from: classes2.dex */
public final class e5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final jm4.e5 f381914a = new jm4.e5();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        bw5.i80 i80Var;
        qk.t9 t9Var;
        byte[] bArr;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null || (t9Var = (qk.t9) fVar.f152151d) == null || (bArr = t9Var.f445871d) == null) {
            i80Var = null;
        } else {
            i80Var = new bw5.i80();
            i80Var.mo11468x92b714fd(bArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("did like item:");
        sb6.append(i80Var != null ? i80Var.f110033g[4] ? i80Var.f110032f : "" : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", sb6.toString());
        return jz5.f0.f384359a;
    }
}
