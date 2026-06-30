package r45;

/* loaded from: classes2.dex */
public class yu3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yj6 f472904d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472905e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472906f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yu3)) {
            return false;
        }
        r45.yu3 yu3Var = (r45.yu3) fVar;
        return n51.f.a(this.f76492x92037252, yu3Var.f76492x92037252) && n51.f.a(this.f472904d, yu3Var.f472904d) && n51.f.a(this.f472905e, yu3Var.f472905e) && n51.f.a(this.f472906f, yu3Var.f472906f);
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
            r45.yj6 yj6Var = this.f472904d;
            if (yj6Var != null) {
                fVar.i(2, yj6Var.mo75928xcd1e8d8());
                this.f472904d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472905e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f472906f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.yj6 yj6Var2 = this.f472904d;
            if (yj6Var2 != null) {
                i18 += b36.f.i(2, yj6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f472905e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f472906f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.yu3 yu3Var = (r45.yu3) objArr[1];
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
                yu3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                yu3Var.f472905e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            yu3Var.f472906f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.yj6 yj6Var3 = new r45.yj6();
            if (bArr2 != null && bArr2.length > 0) {
                yj6Var3.mo11468x92b714fd(bArr2);
            }
            yu3Var.f472904d = yj6Var3;
        }
        return 0;
    }
}
