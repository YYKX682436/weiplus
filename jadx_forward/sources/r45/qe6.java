package r45;

/* loaded from: classes4.dex */
public class qe6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465449d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f465450e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f465451f;

    /* renamed from: g, reason: collision with root package name */
    public int f465452g;

    /* renamed from: h, reason: collision with root package name */
    public int f465453h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe6)) {
            return false;
        }
        r45.qe6 qe6Var = (r45.qe6) fVar;
        return n51.f.a(this.f76492x92037252, qe6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465449d), java.lang.Integer.valueOf(qe6Var.f465449d)) && n51.f.a(this.f465450e, qe6Var.f465450e) && n51.f.a(java.lang.Long.valueOf(this.f465451f), java.lang.Long.valueOf(qe6Var.f465451f)) && n51.f.a(java.lang.Integer.valueOf(this.f465452g), java.lang.Integer.valueOf(qe6Var.f465452g)) && n51.f.a(java.lang.Integer.valueOf(this.f465453h), java.lang.Integer.valueOf(qe6Var.f465453h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465450e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465449d);
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f465451f);
            fVar.e(5, this.f465452g);
            fVar.e(6, this.f465453h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465449d) + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f465451f) + b36.f.e(5, this.f465452g) + b36.f.e(6, this.f465453h);
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
        r45.qe6 qe6Var = (r45.qe6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    qe6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                qe6Var.f465449d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.df6 df6Var = new r45.df6();
                    if (bArr3 != null && bArr3.length > 0) {
                        df6Var.mo11468x92b714fd(bArr3);
                    }
                    qe6Var.f465450e.add(df6Var);
                }
                return 0;
            case 4:
                qe6Var.f465451f = aVar2.i(intValue);
                return 0;
            case 5:
                qe6Var.f465452g = aVar2.g(intValue);
                return 0;
            case 6:
                qe6Var.f465453h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
