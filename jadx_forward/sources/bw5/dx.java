package bw5;

/* loaded from: classes2.dex */
public class dx extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f108169d;

    /* renamed from: e, reason: collision with root package name */
    public long f108170e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108171f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f108172g = new boolean[4];

    static {
        new bw5.dx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dx mo11468x92b714fd(byte[] bArr) {
        return (bw5.dx) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dx)) {
            return false;
        }
        bw5.dx dxVar = (bw5.dx) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108169d), java.lang.Long.valueOf(dxVar.f108169d)) && n51.f.a(java.lang.Long.valueOf(this.f108170e), java.lang.Long.valueOf(dxVar.f108170e)) && n51.f.a(this.f108171f, dxVar.f108171f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108171f;
        boolean[] zArr = this.f108172g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f108169d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f108170e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f108169d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f108170e);
            }
            return h17 + b36.f.g(3, 8, linkedList);
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
            this.f108169d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108170e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ex exVar = new bw5.ex();
            if (bArr != null && bArr.length > 0) {
                exVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(exVar);
        }
        zArr[3] = true;
        return 0;
    }
}
