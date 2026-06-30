package r45;

/* loaded from: classes8.dex */
public class ki5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.vk5 f460256d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sk5 f460257e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ki5)) {
            return false;
        }
        r45.ki5 ki5Var = (r45.ki5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ki5Var.f76494x2de60e5e) && n51.f.a(this.f460256d, ki5Var.f460256d) && n51.f.a(this.f460257e, ki5Var.f460257e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.vk5 vk5Var = this.f460256d;
            if (vk5Var != null) {
                fVar.i(2, vk5Var.mo75928xcd1e8d8());
                this.f460256d.mo75956x3d5d1f78(fVar);
            }
            r45.sk5 sk5Var = this.f460257e;
            if (sk5Var != null) {
                fVar.i(3, sk5Var.mo75928xcd1e8d8());
                this.f460257e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.vk5 vk5Var2 = this.f460256d;
            if (vk5Var2 != null) {
                i18 += b36.f.i(2, vk5Var2.mo75928xcd1e8d8());
            }
            r45.sk5 sk5Var2 = this.f460257e;
            return sk5Var2 != null ? i18 + b36.f.i(3, sk5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.ki5 ki5Var = (r45.ki5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                ki5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.vk5 vk5Var3 = new r45.vk5();
                if (bArr2 != null && bArr2.length > 0) {
                    vk5Var3.mo11468x92b714fd(bArr2);
                }
                ki5Var.f460256d = vk5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.sk5 sk5Var3 = new r45.sk5();
            if (bArr3 != null && bArr3.length > 0) {
                sk5Var3.mo11468x92b714fd(bArr3);
            }
            ki5Var.f460257e = sk5Var3;
        }
        return 0;
    }
}
