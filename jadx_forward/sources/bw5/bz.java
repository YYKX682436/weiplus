package bw5;

/* loaded from: classes2.dex */
public class bz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107394d;

    /* renamed from: e, reason: collision with root package name */
    public int f107395e;

    /* renamed from: f, reason: collision with root package name */
    public long f107396f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f107397g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107398h = new boolean[5];

    static {
        new bw5.bz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bz mo11468x92b714fd(byte[] bArr) {
        return (bw5.bz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bz)) {
            return false;
        }
        bw5.bz bzVar = (bw5.bz) fVar;
        return n51.f.a(this.f107394d, bzVar.f107394d) && n51.f.a(java.lang.Integer.valueOf(this.f107395e), java.lang.Integer.valueOf(bzVar.f107395e)) && n51.f.a(java.lang.Long.valueOf(this.f107396f), java.lang.Long.valueOf(bzVar.f107396f)) && n51.f.a(this.f107397g, bzVar.f107397g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107397g;
        boolean[] zArr = this.f107398h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107394d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107395e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f107396f);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f107394d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f107395e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f107396f);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
            this.f107394d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107395e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107396f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.az azVar = new bw5.az();
            if (bArr != null && bArr.length > 0) {
                azVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(azVar);
        }
        zArr[4] = true;
        return 0;
    }
}
