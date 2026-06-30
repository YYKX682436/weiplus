package bw5;

/* loaded from: classes8.dex */
public class dv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.dv f108157i = new bw5.dv();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108158d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108159e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108160f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f108161g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108162h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dv)) {
            return false;
        }
        bw5.dv dvVar = (bw5.dv) fVar;
        return n51.f.a(this.f108158d, dvVar.f108158d) && n51.f.a(this.f108159e, dvVar.f108159e) && n51.f.a(this.f108160f, dvVar.f108160f) && n51.f.a(this.f108161g, dvVar.f108161g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108161g;
        java.util.LinkedList linkedList2 = this.f108160f;
        boolean[] zArr = this.f108162h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108158d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108159e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f108158d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f108159e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(3, 1, linkedList2) + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            this.f108158d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108159e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(aVar2.k(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.dv) super.mo11468x92b714fd(bArr);
    }
}
