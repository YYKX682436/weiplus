package bw5;

/* loaded from: classes2.dex */
public class pw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f113389e;

    /* renamed from: f, reason: collision with root package name */
    public int f113390f;

    /* renamed from: g, reason: collision with root package name */
    public int f113391g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f113388d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113392h = new boolean[5];

    static {
        new bw5.pw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pw mo11468x92b714fd(byte[] bArr) {
        return (bw5.pw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pw)) {
            return false;
        }
        bw5.pw pwVar = (bw5.pw) fVar;
        return n51.f.a(this.f113388d, pwVar.f113388d) && n51.f.a(java.lang.Integer.valueOf(this.f113389e), java.lang.Integer.valueOf(pwVar.f113389e)) && n51.f.a(java.lang.Integer.valueOf(this.f113390f), java.lang.Integer.valueOf(pwVar.f113390f)) && n51.f.a(java.lang.Integer.valueOf(this.f113391g), java.lang.Integer.valueOf(pwVar.f113391g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113388d;
        boolean[] zArr = this.f113392h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f113389e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113390f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113391g);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f113389e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f113390f);
            }
            return zArr[4] ? g17 + b36.f.e(4, this.f113391g) : g17;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f113389e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f113390f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f113391g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ow owVar = new bw5.ow();
            if (bArr != null && bArr.length > 0) {
                owVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(owVar);
        }
        zArr[1] = true;
        return 0;
    }
}
