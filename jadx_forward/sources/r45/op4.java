package r45;

/* loaded from: classes2.dex */
public class op4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463959e;

    /* renamed from: f, reason: collision with root package name */
    public long f463960f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op4)) {
            return false;
        }
        r45.op4 op4Var = (r45.op4) fVar;
        return n51.f.a(this.f76492x92037252, op4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463958d), java.lang.Integer.valueOf(op4Var.f463958d)) && n51.f.a(this.f463959e, op4Var.f463959e) && n51.f.a(java.lang.Long.valueOf(this.f463960f), java.lang.Long.valueOf(op4Var.f463960f));
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
            fVar.e(2, this.f463958d);
            java.lang.String str = this.f463959e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f463960f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463958d);
            java.lang.String str2 = this.f463959e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.h(4, this.f463960f);
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
        r45.op4 op4Var = (r45.op4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                op4Var.f463958d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                op4Var.f463959e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            op4Var.f463960f = aVar2.i(intValue);
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
            op4Var.f76492x92037252 = ieVar3;
        }
        return 0;
    }
}
