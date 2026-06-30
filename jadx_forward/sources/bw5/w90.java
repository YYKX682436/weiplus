package bw5;

/* loaded from: classes2.dex */
public class w90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116150d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116151e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116152f;

    /* renamed from: h, reason: collision with root package name */
    public int f116154h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f116153g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116155i = new boolean[6];

    static {
        new bw5.w90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.w90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w90)) {
            return false;
        }
        bw5.w90 w90Var = (bw5.w90) fVar;
        return n51.f.a(this.f116150d, w90Var.f116150d) && n51.f.a(this.f116151e, w90Var.f116151e) && n51.f.a(this.f116152f, w90Var.f116152f) && n51.f.a(this.f116153g, w90Var.f116153g) && n51.f.a(java.lang.Integer.valueOf(this.f116154h), java.lang.Integer.valueOf(w90Var.f116154h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116153g;
        int i18 = 0;
        boolean[] zArr = this.f116155i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116150d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f116151e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f116152f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f116154h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f116150d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f116151e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f116152f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList);
            return zArr[5] ? g17 + b36.f.e(5, this.f116154h) : g17;
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
            this.f116150d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116151e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116152f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            linkedList.add(aVar2.k(intValue));
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116154h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
