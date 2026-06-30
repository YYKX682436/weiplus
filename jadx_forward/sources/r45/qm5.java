package r45;

/* loaded from: classes9.dex */
public class qm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rm5 f465628d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rm5 f465629e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f465630f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qm5)) {
            return false;
        }
        r45.qm5 qm5Var = (r45.qm5) fVar;
        return n51.f.a(this.f465628d, qm5Var.f465628d) && n51.f.a(this.f465629e, qm5Var.f465629e) && n51.f.a(this.f465630f, qm5Var.f465630f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465630f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rm5 rm5Var = this.f465628d;
            if (rm5Var != null) {
                fVar.i(1, rm5Var.mo75928xcd1e8d8());
                this.f465628d.mo75956x3d5d1f78(fVar);
            }
            r45.rm5 rm5Var2 = this.f465629e;
            if (rm5Var2 != null) {
                fVar.i(2, rm5Var2.mo75928xcd1e8d8());
                this.f465629e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.rm5 rm5Var3 = this.f465628d;
            int i18 = rm5Var3 != null ? 0 + b36.f.i(1, rm5Var3.mo75928xcd1e8d8()) : 0;
            r45.rm5 rm5Var4 = this.f465629e;
            if (rm5Var4 != null) {
                i18 += b36.f.i(2, rm5Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.qm5 qm5Var = (r45.qm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.rm5 rm5Var5 = new r45.rm5();
                if (bArr2 != null && bArr2.length > 0) {
                    rm5Var5.mo11468x92b714fd(bArr2);
                }
                qm5Var.f465628d = rm5Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.rm5 rm5Var6 = new r45.rm5();
                if (bArr3 != null && bArr3.length > 0) {
                    rm5Var6.mo11468x92b714fd(bArr3);
                }
                qm5Var.f465629e = rm5Var6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.pm5 pm5Var = new r45.pm5();
            if (bArr4 != null && bArr4.length > 0) {
                pm5Var.mo11468x92b714fd(bArr4);
            }
            qm5Var.f465630f.add(pm5Var);
        }
        return 0;
    }
}
