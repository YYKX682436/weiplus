package r45;

/* loaded from: classes4.dex */
public class ui0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f468927d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468928e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468929f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ui0)) {
            return false;
        }
        r45.ui0 ui0Var = (r45.ui0) fVar;
        return n51.f.a(this.f76492x92037252, ui0Var.f76492x92037252) && n51.f.a(java.lang.Boolean.valueOf(this.f468927d), java.lang.Boolean.valueOf(ui0Var.f468927d)) && n51.f.a(this.f468928e, ui0Var.f468928e) && n51.f.a(this.f468929f, ui0Var.f468929f);
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
            fVar.a(2, this.f468927d);
            java.lang.String str = this.f468928e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f468929f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f468927d);
            java.lang.String str3 = this.f468928e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f468929f;
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
        r45.ui0 ui0Var = (r45.ui0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ui0Var.f468927d = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 3) {
                ui0Var.f468928e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ui0Var.f468929f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            ui0Var.f76492x92037252 = ieVar3;
        }
        return 0;
    }
}
