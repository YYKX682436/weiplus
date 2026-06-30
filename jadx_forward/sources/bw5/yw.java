package bw5;

/* loaded from: classes2.dex */
public class yw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f117250d;

    /* renamed from: e, reason: collision with root package name */
    public int f117251e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117252f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f117253g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f117254h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f117255i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f117256m = new boolean[7];

    static {
        new bw5.yw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yw mo11468x92b714fd(byte[] bArr) {
        return (bw5.yw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yw)) {
            return false;
        }
        bw5.yw ywVar = (bw5.yw) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f117250d), java.lang.Long.valueOf(ywVar.f117250d)) && n51.f.a(java.lang.Integer.valueOf(this.f117251e), java.lang.Integer.valueOf(ywVar.f117251e)) && n51.f.a(this.f117252f, ywVar.f117252f) && n51.f.a(this.f117253g, ywVar.f117253g) && n51.f.a(this.f117254h, ywVar.f117254h) && n51.f.a(this.f117255i, ywVar.f117255i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117255i;
        java.util.LinkedList linkedList2 = this.f117254h;
        java.util.LinkedList linkedList3 = this.f117253g;
        boolean[] zArr = this.f117256m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f117250d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117251e);
            }
            java.lang.String str = this.f117252f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList3);
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f117250d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f117251e);
            }
            java.lang.String str2 = this.f117252f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.g(4, 1, linkedList3) + b36.f.g(5, 8, linkedList2) + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
        switch (intValue) {
            case 1:
                this.f117250d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117251e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117252f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList3.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.iw iwVar = new bw5.iw();
                    if (bArr != null && bArr.length > 0) {
                        iwVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(iwVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
