package c02;

/* loaded from: classes2.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f119121d;

    /* renamed from: e, reason: collision with root package name */
    public c02.u f119122e;

    /* renamed from: f, reason: collision with root package name */
    public c02.h f119123f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof c02.c)) {
            return false;
        }
        c02.c cVar = (c02.c) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f119121d), java.lang.Boolean.valueOf(cVar.f119121d)) && n51.f.a(this.f119122e, cVar.f119122e) && n51.f.a(this.f119123f, cVar.f119123f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f119121d);
            c02.u uVar = this.f119122e;
            if (uVar != null) {
                fVar.i(2, uVar.mo75928xcd1e8d8());
                this.f119122e.mo75956x3d5d1f78(fVar);
            }
            c02.h hVar = this.f119123f;
            if (hVar != null) {
                fVar.i(3, hVar.mo75928xcd1e8d8());
                this.f119123f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f119121d) + 0;
            c02.u uVar2 = this.f119122e;
            if (uVar2 != null) {
                a17 += b36.f.i(2, uVar2.mo75928xcd1e8d8());
            }
            c02.h hVar2 = this.f119123f;
            return hVar2 != null ? a17 + b36.f.i(3, hVar2.mo75928xcd1e8d8()) : a17;
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
        c02.c cVar = (c02.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f119121d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                c02.u uVar3 = new c02.u();
                if (bArr != null && bArr.length > 0) {
                    uVar3.mo11468x92b714fd(bArr);
                }
                cVar.f119122e = uVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            c02.h hVar3 = new c02.h();
            if (bArr2 != null && bArr2.length > 0) {
                hVar3.mo11468x92b714fd(bArr2);
            }
            cVar.f119123f = hVar3;
        }
        return 0;
    }
}
