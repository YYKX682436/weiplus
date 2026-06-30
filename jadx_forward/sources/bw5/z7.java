package bw5;

/* loaded from: classes8.dex */
public class z7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f117377d;

    /* renamed from: e, reason: collision with root package name */
    public int f117378e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117380g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f117379f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117381h = new boolean[5];

    static {
        new bw5.z7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z7)) {
            return false;
        }
        bw5.z7 z7Var = (bw5.z7) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f117377d), java.lang.Long.valueOf(z7Var.f117377d)) && n51.f.a(java.lang.Integer.valueOf(this.f117378e), java.lang.Integer.valueOf(z7Var.f117378e)) && n51.f.a(this.f117379f, z7Var.f117379f) && n51.f.a(this.f117380g, z7Var.f117380g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117379f;
        boolean[] zArr = this.f117381h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f117377d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117378e);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f117380g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f117377d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f117378e);
            }
            int g17 = h17 + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f117380g;
            return (str2 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str2);
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
            this.f117377d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117378e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f117380g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.a8 a8Var = new bw5.a8();
            if (bArr != null && bArr.length > 0) {
                a8Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(a8Var);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.z7) super.mo11468x92b714fd(bArr);
    }
}
