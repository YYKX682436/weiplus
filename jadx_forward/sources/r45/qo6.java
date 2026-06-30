package r45;

/* loaded from: classes2.dex */
public class qo6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465683d;

    /* renamed from: e, reason: collision with root package name */
    public int f465684e;

    /* renamed from: f, reason: collision with root package name */
    public int f465685f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f465686g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qo6)) {
            return false;
        }
        r45.qo6 qo6Var = (r45.qo6) fVar;
        return n51.f.a(this.f76492x92037252, qo6Var.f76492x92037252) && n51.f.a(this.f465683d, qo6Var.f465683d) && n51.f.a(java.lang.Integer.valueOf(this.f465684e), java.lang.Integer.valueOf(qo6Var.f465684e)) && n51.f.a(java.lang.Integer.valueOf(this.f465685f), java.lang.Integer.valueOf(qo6Var.f465685f)) && n51.f.a(java.lang.Boolean.valueOf(this.f465686g), java.lang.Boolean.valueOf(qo6Var.f465686g));
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
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465683d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f465684e);
            fVar.e(4, this.f465685f);
            fVar.a(5, this.f465686g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465683d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f465684e) + b36.f.e(4, this.f465685f) + b36.f.a(5, this.f465686g);
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
        r45.qo6 qo6Var = (r45.qo6) objArr[1];
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
                qo6Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qo6Var.f465683d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            qo6Var.f465684e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            qo6Var.f465685f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qo6Var.f465686g = aVar2.c(intValue);
        return 0;
    }
}
