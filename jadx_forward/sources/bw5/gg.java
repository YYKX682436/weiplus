package bw5;

/* loaded from: classes2.dex */
public class gg extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f109367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109368e;

    /* renamed from: f, reason: collision with root package name */
    public float f109369f;

    /* renamed from: g, reason: collision with root package name */
    public float f109370g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109371h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109372i = new boolean[7];

    static {
        new bw5.gg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gg)) {
            return false;
        }
        bw5.gg ggVar = (bw5.gg) fVar;
        return n51.f.a(this.f76494x2de60e5e, ggVar.f76494x2de60e5e) && n51.f.a(this.f109367d, ggVar.f109367d) && n51.f.a(this.f109368e, ggVar.f109368e) && n51.f.a(java.lang.Float.valueOf(this.f109369f), java.lang.Float.valueOf(ggVar.f109369f)) && n51.f.a(java.lang.Float.valueOf(this.f109370g), java.lang.Float.valueOf(ggVar.f109370g)) && n51.f.a(this.f109371h, ggVar.f109371h);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f109372i[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109372i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            bw5.sc scVar = this.f109367d;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.mo75928xcd1e8d8());
                this.f109367d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f109368e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.d(4, this.f109369f);
            }
            if (zArr[5]) {
                fVar.d(5, this.f109370g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109371h;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            bw5.sc scVar2 = this.f109367d;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f109368e;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f109369f);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f109370g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109371h;
            return (gVar2 == null || !zArr[6]) ? i18 : i18 + b36.f.b(6, gVar2);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f109367d = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f109368e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109369f = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109370g = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109371h = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.gg) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f109372i[1] = true;
        return this;
    }
}
