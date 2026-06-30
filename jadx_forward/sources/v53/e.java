package v53;

/* loaded from: classes4.dex */
public class e extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public v53.a f514867d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f514868e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof v53.e)) {
            return false;
        }
        v53.e eVar = (v53.e) fVar;
        return n51.f.a(this.f76492x92037252, eVar.f76492x92037252) && n51.f.a(this.f514867d, eVar.f514867d) && n51.f.a(java.lang.Boolean.valueOf(this.f514868e), java.lang.Boolean.valueOf(eVar.f514868e));
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
            v53.a aVar = this.f514867d;
            if (aVar != null) {
                fVar.i(2, aVar.mo75928xcd1e8d8());
                this.f514867d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f514868e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            v53.a aVar2 = this.f514867d;
            if (aVar2 != null) {
                i18 += b36.f.i(2, aVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(3, this.f514868e);
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
        v53.e eVar = (v53.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                eVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            eVar.f514868e = aVar4.c(intValue);
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
            eVar.f514867d = aVar5;
        }
        return 0;
    }
}
