package bw5;

/* loaded from: classes2.dex */
public class z8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117384d;

    /* renamed from: f, reason: collision with root package name */
    public long f117386f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f117385e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f117387g = new boolean[4];

    static {
        new bw5.z8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z8 mo11468x92b714fd(byte[] bArr) {
        return (bw5.z8) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z8)) {
            return false;
        }
        bw5.z8 z8Var = (bw5.z8) fVar;
        return n51.f.a(this.f117384d, z8Var.f117384d) && n51.f.a(this.f117385e, z8Var.f117385e) && n51.f.a(java.lang.Long.valueOf(this.f117386f), java.lang.Long.valueOf(z8Var.f117386f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117385e;
        boolean[] zArr = this.f117387g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117384d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.h(3, this.f117386f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f117384d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            return zArr[3] ? g17 + b36.f.h(3, this.f117386f) : g17;
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
            this.f117384d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f117386f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.y8 y8Var = new bw5.y8();
            if (bArr != null && bArr.length > 0) {
                y8Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(y8Var);
        }
        zArr[2] = true;
        return 0;
    }
}
