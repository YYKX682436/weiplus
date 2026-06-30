package bw5;

/* loaded from: classes2.dex */
public class uo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115539e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ui f115540f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115541g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115542h = new boolean[5];

    static {
        new bw5.uo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uo mo11468x92b714fd(byte[] bArr) {
        return (bw5.uo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uo)) {
            return false;
        }
        bw5.uo uoVar = (bw5.uo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115538d), java.lang.Integer.valueOf(uoVar.f115538d)) && n51.f.a(this.f115539e, uoVar.f115539e) && n51.f.a(this.f115540f, uoVar.f115540f) && n51.f.a(this.f115541g, uoVar.f115541g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.uo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115542h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115538d);
            }
            java.lang.String str = this.f115539e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.ui uiVar = this.f115540f;
            if (uiVar != null && zArr[3]) {
                fVar.i(3, uiVar.mo75928xcd1e8d8());
                this.f115540f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f115541g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115538d) : 0;
            java.lang.String str3 = this.f115539e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.ui uiVar2 = this.f115540f;
            if (uiVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, uiVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f115541g;
            return (str4 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str4);
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
        if (intValue == 1) {
            this.f115538d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115539e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f115541g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ui uiVar3 = new bw5.ui();
            if (bArr != null && bArr.length > 0) {
                uiVar3.mo11468x92b714fd(bArr);
            }
            this.f115540f = uiVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
