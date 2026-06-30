package c02;

/* loaded from: classes2.dex */
public class a extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f119115d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f119116e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f119117f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f119118g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.a)) {
            return false;
        }
        c02.a aVar = (c02.a) fVar;
        return n51.f.a(this.f76494x2de60e5e, aVar.f76494x2de60e5e) && n51.f.a(this.f119115d, aVar.f119115d) && n51.f.a(java.lang.Boolean.valueOf(this.f119116e), java.lang.Boolean.valueOf(aVar.f119116e)) && n51.f.a(java.lang.Boolean.valueOf(this.f119117f), java.lang.Boolean.valueOf(aVar.f119117f)) && n51.f.a(java.lang.Boolean.valueOf(this.f119118g), java.lang.Boolean.valueOf(aVar.f119118g));
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
            fVar.g(2, 1, this.f119115d);
            fVar.a(3, this.f119116e);
            fVar.a(4, this.f119117f);
            fVar.a(5, this.f119118g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, this.f119115d) + b36.f.a(3, this.f119116e) + b36.f.a(4, this.f119117f) + b36.f.a(5, this.f119118g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f119115d.clear();
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
        c02.a aVar3 = (c02.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                aVar3.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            aVar3.f119115d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            aVar3.f119116e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f119117f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f119118g = aVar2.c(intValue);
        return 0;
    }
}
