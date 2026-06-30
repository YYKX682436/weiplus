package fn4;

/* loaded from: classes15.dex */
public class q0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.r0 f346131d;

    public q0(fn4.r0 r0Var, fn4.l0 l0Var) {
        this.f346131d = r0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar == null || gVar.f69500x8ab84c59 <= 0) {
            return 0;
        }
        fn4.r0 r0Var = this.f346131d;
        if (!r0Var.f346135c.containsKey(str)) {
            return 0;
        }
        r45.yn6 yn6Var = (r45.yn6) r0Var.f346135c.get(str);
        long j17 = gVar.f69496x83ec3dd;
        yn6Var.f472777e = j17;
        yn6Var.f472778f = r0Var.a(j17, gVar.f69500x8ab84c59);
        yn6Var.f472779g = gVar.f69500x8ab84c59;
        r0Var.f346135c.put(str, yn6Var);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
