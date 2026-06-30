package r45;

/* loaded from: classes8.dex */
public class vk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f469857d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k40 f469858e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vk5)) {
            return false;
        }
        r45.vk5 vk5Var = (r45.vk5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f469857d), java.lang.Long.valueOf(vk5Var.f469857d)) && n51.f.a(this.f469858e, vk5Var.f469858e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f469857d);
            r45.k40 k40Var = this.f469858e;
            if (k40Var != null) {
                fVar.i(2, k40Var.mo75928xcd1e8d8());
                this.f469858e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f469857d) + 0;
            r45.k40 k40Var2 = this.f469858e;
            return k40Var2 != null ? h17 + b36.f.i(2, k40Var2.mo75928xcd1e8d8()) : h17;
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
        r45.vk5 vk5Var = (r45.vk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vk5Var.f469857d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.k40 k40Var3 = new r45.k40();
            if (bArr != null && bArr.length > 0) {
                k40Var3.mo11468x92b714fd(bArr);
            }
            vk5Var.f469858e = k40Var3;
        }
        return 0;
    }
}
