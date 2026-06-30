package bw5;

/* loaded from: classes2.dex */
public class ax extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106977d;

    /* renamed from: e, reason: collision with root package name */
    public long f106978e;

    /* renamed from: f, reason: collision with root package name */
    public long f106979f;

    /* renamed from: g, reason: collision with root package name */
    public long f106980g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f106981h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f106982i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f106983m = new boolean[7];

    static {
        new bw5.ax();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ax mo11468x92b714fd(byte[] bArr) {
        return (bw5.ax) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ax)) {
            return false;
        }
        bw5.ax axVar = (bw5.ax) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106977d), java.lang.Integer.valueOf(axVar.f106977d)) && n51.f.a(java.lang.Long.valueOf(this.f106978e), java.lang.Long.valueOf(axVar.f106978e)) && n51.f.a(java.lang.Long.valueOf(this.f106979f), java.lang.Long.valueOf(axVar.f106979f)) && n51.f.a(java.lang.Long.valueOf(this.f106980g), java.lang.Long.valueOf(axVar.f106980g)) && n51.f.a(this.f106981h, axVar.f106981h) && n51.f.a(this.f106982i, axVar.f106982i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ax();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106982i;
        java.util.LinkedList linkedList2 = this.f106981h;
        boolean[] zArr = this.f106983m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106977d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f106978e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f106979f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f106980g);
            }
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f106977d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f106978e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f106979f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f106980g);
            }
            return e17 + b36.f.g(5, 8, linkedList2) + b36.f.g(6, 8, linkedList);
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
        switch (intValue) {
            case 1:
                this.f106977d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f106978e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106979f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106980g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dx dxVar = new bw5.dx();
                    if (bArr != null && bArr.length > 0) {
                        dxVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(dxVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.cx cxVar = new bw5.cx();
                    if (bArr2 != null && bArr2.length > 0) {
                        cxVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(cxVar);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
