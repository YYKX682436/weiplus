package r45;

/* loaded from: classes2.dex */
public class ag3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451525d;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ag3)) {
            return false;
        }
        r45.ag3 ag3Var = (r45.ag3) fVar;
        return n51.f.a(this.f451525d, ag3Var.f451525d) && n51.f.a(this.f76492x92037252, ag3Var.f76492x92037252);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451525d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(2, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f451525d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.ie ieVar2 = this.f76492x92037252;
            return ieVar2 != null ? j17 + b36.f.i(2, ieVar2.mo75928xcd1e8d8()) : j17;
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
        r45.ag3 ag3Var = (r45.ag3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ag3Var.f451525d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            ag3Var.f76492x92037252 = ieVar3;
        }
        return 0;
    }
}
