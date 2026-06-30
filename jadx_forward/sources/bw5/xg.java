package bw5;

/* loaded from: classes2.dex */
public class xg extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116633d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116635f;

    /* renamed from: g, reason: collision with root package name */
    public int f116636g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116634e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116637h = new boolean[5];

    static {
        new bw5.xg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xg mo11468x92b714fd(byte[] bArr) {
        return (bw5.xg) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xg)) {
            return false;
        }
        bw5.xg xgVar = (bw5.xg) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116633d), java.lang.Long.valueOf(xgVar.f116633d)) && n51.f.a(this.f116634e, xgVar.f116634e) && n51.f.a(this.f116635f, xgVar.f116635f) && n51.f.a(java.lang.Integer.valueOf(this.f116636g), java.lang.Integer.valueOf(xgVar.f116636g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116634e;
        boolean[] zArr = this.f116637h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116633d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f116635f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116636g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = (zArr[1] ? 0 + b36.f.h(1, this.f116633d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f116635f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            return zArr[4] ? h17 + b36.f.e(4, this.f116636g) : h17;
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
            this.f116633d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f116635f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f116636g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.xj xjVar = new bw5.xj();
            if (bArr != null && bArr.length > 0) {
                xjVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(xjVar);
        }
        zArr[2] = true;
        return 0;
    }
}
