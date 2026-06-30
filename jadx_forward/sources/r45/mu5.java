package r45;

/* loaded from: classes8.dex */
public class mu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f462370d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vk4 f462371e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mu5)) {
            return false;
        }
        r45.mu5 mu5Var = (r45.mu5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f462370d), java.lang.Boolean.valueOf(mu5Var.f462370d)) && n51.f.a(this.f462371e, mu5Var.f462371e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f462370d);
            r45.vk4 vk4Var = this.f462371e;
            if (vk4Var != null) {
                fVar.i(2, vk4Var.mo75928xcd1e8d8());
                this.f462371e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f462370d) + 0;
            r45.vk4 vk4Var2 = this.f462371e;
            return vk4Var2 != null ? a17 + b36.f.i(2, vk4Var2.mo75928xcd1e8d8()) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.mu5 mu5Var = (r45.mu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mu5Var.f462370d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.vk4 vk4Var3 = new r45.vk4();
            if (bArr != null && bArr.length > 0) {
                vk4Var3.mo11468x92b714fd(bArr);
            }
            mu5Var.f462371e = vk4Var3;
        }
        return 0;
    }
}
