package r45;

/* loaded from: classes2.dex */
public class hq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.h80 f457916d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gq f457917e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hq)) {
            return false;
        }
        r45.hq hqVar = (r45.hq) fVar;
        return n51.f.a(this.f457916d, hqVar.f457916d) && n51.f.a(this.f457917e, hqVar.f457917e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.h80 h80Var = this.f457916d;
            if (h80Var != null) {
                fVar.i(1, h80Var.mo75928xcd1e8d8());
                this.f457916d.mo75956x3d5d1f78(fVar);
            }
            r45.gq gqVar = this.f457917e;
            if (gqVar != null) {
                fVar.i(2, gqVar.mo75928xcd1e8d8());
                this.f457917e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.h80 h80Var2 = this.f457916d;
            int i18 = h80Var2 != null ? 0 + b36.f.i(1, h80Var2.mo75928xcd1e8d8()) : 0;
            r45.gq gqVar2 = this.f457917e;
            return gqVar2 != null ? i18 + b36.f.i(2, gqVar2.mo75928xcd1e8d8()) : i18;
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
        r45.hq hqVar = (r45.hq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.h80 h80Var3 = new r45.h80();
                if (bArr != null && bArr.length > 0) {
                    h80Var3.mo11468x92b714fd(bArr);
                }
                hqVar.f457916d = h80Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.gq gqVar3 = new r45.gq();
            if (bArr2 != null && bArr2.length > 0) {
                gqVar3.mo11468x92b714fd(bArr2);
            }
            hqVar.f457917e = gqVar3;
        }
        return 0;
    }
}
