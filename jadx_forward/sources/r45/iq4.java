package r45;

/* loaded from: classes9.dex */
public class iq4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f458799d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f458800e;

    /* renamed from: f, reason: collision with root package name */
    public long f458801f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iq4)) {
            return false;
        }
        r45.iq4 iq4Var = (r45.iq4) fVar;
        return n51.f.a(this.f458799d, iq4Var.f458799d) && n51.f.a(java.lang.Boolean.valueOf(this.f458800e), java.lang.Boolean.valueOf(iq4Var.f458800e)) && n51.f.a(java.lang.Long.valueOf(this.f458801f), java.lang.Long.valueOf(iq4Var.f458801f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f458799d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.mo75928xcd1e8d8());
                this.f458799d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f458800e);
            fVar.h(3, this.f458801f);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f458799d;
            return (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f458800e) + b36.f.h(3, this.f458801f);
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
        r45.iq4 iq4Var = (r45.iq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                iq4Var.f458800e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            iq4Var.f458801f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.bn6 bn6Var3 = new r45.bn6();
            if (bArr != null && bArr.length > 0) {
                bn6Var3.mo11468x92b714fd(bArr);
            }
            iq4Var.f458799d = bn6Var3;
        }
        return 0;
    }
}
