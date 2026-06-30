package bw5;

/* loaded from: classes2.dex */
public class yq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.cc f117141d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117143f;

    /* renamed from: g, reason: collision with root package name */
    public int f117144g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117145h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f117142e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117146i = new boolean[6];

    static {
        new bw5.yq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yq mo11468x92b714fd(byte[] bArr) {
        return (bw5.yq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yq)) {
            return false;
        }
        bw5.yq yqVar = (bw5.yq) fVar;
        return n51.f.a(this.f117141d, yqVar.f117141d) && n51.f.a(this.f117142e, yqVar.f117142e) && n51.f.a(this.f117143f, yqVar.f117143f) && n51.f.a(java.lang.Integer.valueOf(this.f117144g), java.lang.Integer.valueOf(yqVar.f117144g)) && n51.f.a(this.f117145h, yqVar.f117145h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117142e;
        boolean[] zArr = this.f117146i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.cc ccVar = this.f117141d;
            if (ccVar != null && zArr[1]) {
                fVar.i(1, ccVar.mo75928xcd1e8d8());
                this.f117141d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f117143f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117144g);
            }
            java.lang.String str2 = this.f117145h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.cc ccVar2 = this.f117141d;
            if (ccVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ccVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f117143f;
            if (str3 != null && zArr[3]) {
                g17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f117144g);
            }
            java.lang.String str4 = this.f117145h;
            return (str4 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str4);
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
                bw5.cc ccVar3 = new bw5.cc();
                if (bArr != null && bArr.length > 0) {
                    ccVar3.mo11468x92b714fd(bArr);
                }
                this.f117141d = ccVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f117143f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f117144g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f117145h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.cc ccVar4 = new bw5.cc();
            if (bArr2 != null && bArr2.length > 0) {
                ccVar4.mo11468x92b714fd(bArr2);
            }
            linkedList.add(ccVar4);
        }
        zArr[2] = true;
        return 0;
    }
}
