package v53;

/* loaded from: classes4.dex */
public class p extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public v53.a f514891d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f514892e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof v53.p)) {
            return false;
        }
        v53.p pVar = (v53.p) fVar;
        return n51.f.a(this.f76494x2de60e5e, pVar.f76494x2de60e5e) && n51.f.a(this.f514891d, pVar.f514891d) && n51.f.a(java.lang.Boolean.valueOf(this.f514892e), java.lang.Boolean.valueOf(pVar.f514892e));
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
            v53.a aVar = this.f514891d;
            if (aVar != null) {
                fVar.i(2, aVar.mo75928xcd1e8d8());
                this.f514891d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f514892e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            v53.a aVar2 = this.f514891d;
            if (aVar2 != null) {
                i18 += b36.f.i(2, aVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(3, this.f514892e);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        v53.p pVar = (v53.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                pVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            pVar.f514892e = aVar4.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar4.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            v53.a aVar5 = new v53.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar5.mo11468x92b714fd(bArr2);
            }
            pVar.f514891d = aVar5;
        }
        return 0;
    }
}
