package bw5;

/* loaded from: classes2.dex */
public class us extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.mv f115574d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115576f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f115575e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115577g = new boolean[4];

    static {
        new bw5.us();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.us mo11468x92b714fd(byte[] bArr) {
        return (bw5.us) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.us)) {
            return false;
        }
        bw5.us usVar = (bw5.us) fVar;
        return n51.f.a(this.f115574d, usVar.f115574d) && n51.f.a(this.f115575e, usVar.f115575e) && n51.f.a(this.f115576f, usVar.f115576f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.us();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115575e;
        boolean[] zArr = this.f115577g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.mv mvVar = this.f115574d;
            if (mvVar != null && zArr[1]) {
                fVar.i(1, mvVar.mo75928xcd1e8d8());
                this.f115574d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115576f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.mv mvVar2 = this.f115574d;
            if (mvVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, mvVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115576f;
            return (gVar2 == null || !zArr[3]) ? g17 : g17 + b36.f.b(3, gVar2);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.mv mvVar3 = new bw5.mv();
                if (bArr != null && bArr.length > 0) {
                    mvVar3.mo11468x92b714fd(bArr);
                }
                this.f115574d = mvVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f115576f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mv mvVar4 = new bw5.mv();
            if (bArr2 != null && bArr2.length > 0) {
                mvVar4.mo11468x92b714fd(bArr2);
            }
            linkedList.add(mvVar4);
        }
        zArr[2] = true;
        return 0;
    }
}
