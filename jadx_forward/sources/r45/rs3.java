package r45;

/* loaded from: classes7.dex */
public class rs3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc7 f466705d;

    /* renamed from: e, reason: collision with root package name */
    public r45.z50 f466706e;

    /* renamed from: f, reason: collision with root package name */
    public int f466707f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rs3)) {
            return false;
        }
        r45.rs3 rs3Var = (r45.rs3) fVar;
        return n51.f.a(this.f76492x92037252, rs3Var.f76492x92037252) && n51.f.a(this.f466705d, rs3Var.f466705d) && n51.f.a(this.f466706e, rs3Var.f466706e) && n51.f.a(java.lang.Integer.valueOf(this.f466707f), java.lang.Integer.valueOf(rs3Var.f466707f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.bc7 bc7Var = this.f466705d;
            if (bc7Var != null) {
                fVar.i(2, bc7Var.mo75928xcd1e8d8());
                this.f466705d.mo75956x3d5d1f78(fVar);
            }
            r45.z50 z50Var = this.f466706e;
            if (z50Var != null) {
                fVar.i(3, z50Var.mo75928xcd1e8d8());
                this.f466706e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f466707f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.bc7 bc7Var2 = this.f466705d;
            if (bc7Var2 != null) {
                i18 += b36.f.i(2, bc7Var2.mo75928xcd1e8d8());
            }
            r45.z50 z50Var2 = this.f466706e;
            if (z50Var2 != null) {
                i18 += b36.f.i(3, z50Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(4, this.f466707f);
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
        r45.rs3 rs3Var = (r45.rs3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                rs3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.bc7 bc7Var3 = new r45.bc7();
                if (bArr2 != null && bArr2.length > 0) {
                    bc7Var3.mo11468x92b714fd(bArr2);
                }
                rs3Var.f466705d = bc7Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            rs3Var.f466707f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.z50 z50Var3 = new r45.z50();
            if (bArr3 != null && bArr3.length > 0) {
                z50Var3.mo11468x92b714fd(bArr3);
            }
            rs3Var.f466706e = z50Var3;
        }
        return 0;
    }
}
