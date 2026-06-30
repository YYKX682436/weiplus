package bw5;

/* loaded from: classes2.dex */
public class vl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115924d;

    /* renamed from: e, reason: collision with root package name */
    public int f115925e;

    /* renamed from: f, reason: collision with root package name */
    public int f115926f;

    /* renamed from: g, reason: collision with root package name */
    public int f115927g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f115928h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f115929i = new boolean[6];

    static {
        new bw5.vl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vl mo11468x92b714fd(byte[] bArr) {
        return (bw5.vl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vl)) {
            return false;
        }
        bw5.vl vlVar = (bw5.vl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115924d), java.lang.Integer.valueOf(vlVar.f115924d)) && n51.f.a(java.lang.Integer.valueOf(this.f115925e), java.lang.Integer.valueOf(vlVar.f115925e)) && n51.f.a(java.lang.Integer.valueOf(this.f115926f), java.lang.Integer.valueOf(vlVar.f115926f)) && n51.f.a(java.lang.Integer.valueOf(this.f115927g), java.lang.Integer.valueOf(vlVar.f115927g)) && n51.f.a(this.f115928h, vlVar.f115928h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115928h;
        boolean[] zArr = this.f115929i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115924d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115925e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115926f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115927g);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115924d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f115925e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f115926f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f115927g);
            }
            return e17 + b36.f.g(5, 8, linkedList);
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
            this.f115924d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115925e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115926f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f115927g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.qi0 qi0Var = new bw5.qi0();
            if (bArr != null && bArr.length > 0) {
                qi0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(qi0Var);
        }
        zArr[5] = true;
        return 0;
    }
}
