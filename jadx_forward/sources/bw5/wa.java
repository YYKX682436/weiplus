package bw5;

/* loaded from: classes2.dex */
public class wa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116156d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.od f116157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116158f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.od f116159g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.od f116160h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116161i = new boolean[6];

    static {
        new bw5.wa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wa mo11468x92b714fd(byte[] bArr) {
        return (bw5.wa) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wa)) {
            return false;
        }
        bw5.wa waVar = (bw5.wa) fVar;
        return n51.f.a(this.f116156d, waVar.f116156d) && n51.f.a(this.f116157e, waVar.f116157e) && n51.f.a(this.f116158f, waVar.f116158f) && n51.f.a(this.f116159g, waVar.f116159g) && n51.f.a(this.f116160h, waVar.f116160h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116161i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116156d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.od odVar = this.f116157e;
            if (odVar != null && zArr[2]) {
                fVar.i(2, odVar.mo75928xcd1e8d8());
                this.f116157e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f116158f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.od odVar2 = this.f116159g;
            if (odVar2 != null && zArr[4]) {
                fVar.i(4, odVar2.mo75928xcd1e8d8());
                this.f116159g.mo75956x3d5d1f78(fVar);
            }
            bw5.od odVar3 = this.f116160h;
            if (odVar3 != null && zArr[5]) {
                fVar.i(5, odVar3.mo75928xcd1e8d8());
                this.f116160h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f116156d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.od odVar4 = this.f116157e;
            if (odVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, odVar4.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f116158f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.od odVar5 = this.f116159g;
            if (odVar5 != null && zArr[4]) {
                i18 += b36.f.i(4, odVar5.mo75928xcd1e8d8());
            }
            bw5.od odVar6 = this.f116160h;
            return (odVar6 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, odVar6.mo75928xcd1e8d8());
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
            this.f116156d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.od odVar7 = new bw5.od();
                if (bArr != null && bArr.length > 0) {
                    odVar7.mo11468x92b714fd(bArr);
                }
                this.f116157e = odVar7;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116158f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.od odVar8 = new bw5.od();
                if (bArr2 != null && bArr2.length > 0) {
                    odVar8.mo11468x92b714fd(bArr2);
                }
                this.f116159g = odVar8;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.od odVar9 = new bw5.od();
            if (bArr3 != null && bArr3.length > 0) {
                odVar9.mo11468x92b714fd(bArr3);
            }
            this.f116160h = odVar9;
        }
        zArr[5] = true;
        return 0;
    }
}
