package bw5;

/* loaded from: classes7.dex */
public class wd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116196e;

    /* renamed from: f, reason: collision with root package name */
    public long f116197f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116198g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116199h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116195d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116200i = new boolean[6];

    static {
        new bw5.wd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wd0)) {
            return false;
        }
        bw5.wd0 wd0Var = (bw5.wd0) fVar;
        return n51.f.a(this.f116195d, wd0Var.f116195d) && n51.f.a(this.f116196e, wd0Var.f116196e) && n51.f.a(java.lang.Long.valueOf(this.f116197f), java.lang.Long.valueOf(wd0Var.f116197f)) && n51.f.a(this.f116198g, wd0Var.f116198g) && n51.f.a(this.f116199h, wd0Var.f116199h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116195d;
        boolean[] zArr = this.f116200i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f116196e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f116197f);
            }
            java.lang.String str2 = this.f116198g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116199h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str3 = this.f116196e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f116197f);
            }
            java.lang.String str4 = this.f116198g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116199h;
            return (gVar2 == null || !zArr[5]) ? g17 : g17 + b36.f.b(5, gVar2);
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.vd0 vd0Var = new bw5.vd0();
                if (bArr != null && bArr.length > 0) {
                    vd0Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(vd0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116196e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116197f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116198g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116199h = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }
}
