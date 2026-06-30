package bw5;

/* loaded from: classes2.dex */
public class vc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115815f;

    /* renamed from: g, reason: collision with root package name */
    public int f115816g;

    /* renamed from: h, reason: collision with root package name */
    public int f115817h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.uc f115818i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f115819m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f115820n = new boolean[8];

    static {
        new bw5.vc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vc mo11468x92b714fd(byte[] bArr) {
        return (bw5.vc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vc)) {
            return false;
        }
        bw5.vc vcVar = (bw5.vc) fVar;
        return n51.f.a(this.f115813d, vcVar.f115813d) && n51.f.a(this.f115814e, vcVar.f115814e) && n51.f.a(this.f115815f, vcVar.f115815f) && n51.f.a(java.lang.Integer.valueOf(this.f115816g), java.lang.Integer.valueOf(vcVar.f115816g)) && n51.f.a(java.lang.Integer.valueOf(this.f115817h), java.lang.Integer.valueOf(vcVar.f115817h)) && n51.f.a(this.f115818i, vcVar.f115818i) && n51.f.a(this.f115819m, vcVar.f115819m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115820n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115813d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115814e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f115815f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115816g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115817h);
            }
            bw5.uc ucVar = this.f115818i;
            if (ucVar != null && zArr[6]) {
                fVar.i(6, ucVar.mo75928xcd1e8d8());
                this.f115818i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f115819m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f115813d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f115814e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f115815f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f115816g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f115817h);
            }
            bw5.uc ucVar2 = this.f115818i;
            if (ucVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, ucVar2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f115819m;
            return (str8 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str8);
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
                this.f115813d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115814e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115815f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115816g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115817h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.uc ucVar3 = new bw5.uc();
                    if (bArr != null && bArr.length > 0) {
                        ucVar3.mo11468x92b714fd(bArr);
                    }
                    this.f115818i = ucVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f115819m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
