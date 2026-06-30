package r45;

/* loaded from: classes9.dex */
public class rm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.il f466546d;

    /* renamed from: e, reason: collision with root package name */
    public int f466547e;

    /* renamed from: f, reason: collision with root package name */
    public long f466548f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466549g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rm5)) {
            return false;
        }
        r45.rm5 rm5Var = (r45.rm5) fVar;
        return n51.f.a(this.f466546d, rm5Var.f466546d) && n51.f.a(java.lang.Integer.valueOf(this.f466547e), java.lang.Integer.valueOf(rm5Var.f466547e)) && n51.f.a(java.lang.Long.valueOf(this.f466548f), java.lang.Long.valueOf(rm5Var.f466548f)) && n51.f.a(this.f466549g, rm5Var.f466549g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.il ilVar = this.f466546d;
            if (ilVar != null) {
                fVar.i(1, ilVar.mo75928xcd1e8d8());
                this.f466546d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466547e);
            fVar.h(3, this.f466548f);
            java.lang.String str = this.f466549g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.il ilVar2 = this.f466546d;
            int i18 = (ilVar2 != null ? 0 + b36.f.i(1, ilVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466547e) + b36.f.h(3, this.f466548f);
            java.lang.String str2 = this.f466549g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.rm5 rm5Var = (r45.rm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rm5Var.f466547e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                rm5Var.f466548f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rm5Var.f466549g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.il ilVar3 = new r45.il();
            if (bArr != null && bArr.length > 0) {
                ilVar3.mo11468x92b714fd(bArr);
            }
            rm5Var.f466546d = ilVar3;
        }
        return 0;
    }
}
