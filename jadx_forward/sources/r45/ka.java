package r45;

/* loaded from: classes11.dex */
public class ka extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ma f460056d;

    /* renamed from: e, reason: collision with root package name */
    public r45.la f460057e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460058f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka)) {
            return false;
        }
        r45.ka kaVar = (r45.ka) fVar;
        return n51.f.a(this.f460056d, kaVar.f460056d) && n51.f.a(this.f460057e, kaVar.f460057e) && n51.f.a(this.f460058f, kaVar.f460058f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ma maVar = this.f460056d;
            if (maVar != null) {
                fVar.i(1, maVar.mo75928xcd1e8d8());
                this.f460056d.mo75956x3d5d1f78(fVar);
            }
            r45.la laVar = this.f460057e;
            if (laVar != null) {
                fVar.i(2, laVar.mo75928xcd1e8d8());
                this.f460057e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f460058f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ma maVar2 = this.f460056d;
            int i18 = maVar2 != null ? 0 + b36.f.i(1, maVar2.mo75928xcd1e8d8()) : 0;
            r45.la laVar2 = this.f460057e;
            if (laVar2 != null) {
                i18 += b36.f.i(2, laVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f460058f;
            return gVar2 != null ? i18 + b36.f.b(3, gVar2) : i18;
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
        r45.ka kaVar = (r45.ka) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ma maVar3 = new r45.ma();
                if (bArr != null && bArr.length > 0) {
                    maVar3.mo11468x92b714fd(bArr);
                }
                kaVar.f460056d = maVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            kaVar.f460058f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.la laVar3 = new r45.la();
            if (bArr2 != null && bArr2.length > 0) {
                laVar3.mo11468x92b714fd(bArr2);
            }
            kaVar.f460057e = laVar3;
        }
        return 0;
    }
}
