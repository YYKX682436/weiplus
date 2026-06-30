package r45;

/* loaded from: classes11.dex */
public class tj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f468041d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gl f468042e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vm f468043f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tj6)) {
            return false;
        }
        r45.tj6 tj6Var = (r45.tj6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f468041d), java.lang.Boolean.valueOf(tj6Var.f468041d)) && n51.f.a(this.f468042e, tj6Var.f468042e) && n51.f.a(this.f468043f, tj6Var.f468043f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f468041d);
            r45.gl glVar = this.f468042e;
            if (glVar != null) {
                fVar.i(2, glVar.mo75928xcd1e8d8());
                this.f468042e.mo75956x3d5d1f78(fVar);
            }
            r45.vm vmVar = this.f468043f;
            if (vmVar != null) {
                fVar.i(3, vmVar.mo75928xcd1e8d8());
                this.f468043f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f468041d) + 0;
            r45.gl glVar2 = this.f468042e;
            if (glVar2 != null) {
                a17 += b36.f.i(2, glVar2.mo75928xcd1e8d8());
            }
            r45.vm vmVar2 = this.f468043f;
            return vmVar2 != null ? a17 + b36.f.i(3, vmVar2.mo75928xcd1e8d8()) : a17;
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
        r45.tj6 tj6Var = (r45.tj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tj6Var.f468041d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.gl glVar3 = new r45.gl();
                if (bArr != null && bArr.length > 0) {
                    glVar3.mo11468x92b714fd(bArr);
                }
                tj6Var.f468042e = glVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.vm vmVar3 = new r45.vm();
            if (bArr2 != null && bArr2.length > 0) {
                vmVar3.mo11468x92b714fd(bArr2);
            }
            tj6Var.f468043f = vmVar3;
        }
        return 0;
    }
}
