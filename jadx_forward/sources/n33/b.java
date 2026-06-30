package n33;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f416014d;

    /* renamed from: e, reason: collision with root package name */
    public long f416015e;

    /* renamed from: f, reason: collision with root package name */
    public d02.g f416016f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n33.b)) {
            return false;
        }
        n33.b bVar = (n33.b) fVar;
        return n51.f.a(this.f76492x92037252, bVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f416014d), java.lang.Integer.valueOf(bVar.f416014d)) && n51.f.a(java.lang.Long.valueOf(this.f416015e), java.lang.Long.valueOf(bVar.f416015e)) && n51.f.a(this.f416016f, bVar.f416016f);
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
            fVar.e(2, this.f416014d);
            fVar.h(3, this.f416015e);
            d02.g gVar = this.f416016f;
            if (gVar != null) {
                fVar.i(4, gVar.mo75928xcd1e8d8());
                this.f416016f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f416014d) + b36.f.h(3, this.f416015e);
            d02.g gVar2 = this.f416016f;
            return gVar2 != null ? i18 + b36.f.i(4, gVar2.mo75928xcd1e8d8()) : i18;
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
        n33.b bVar = (n33.b) objArr[1];
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
                bVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bVar.f416014d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f416015e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            d02.g gVar3 = new d02.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar3.mo11468x92b714fd(bArr2);
            }
            bVar.f416016f = gVar3;
        }
        return 0;
    }
}
