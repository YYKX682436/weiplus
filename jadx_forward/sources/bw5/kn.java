package bw5;

/* loaded from: classes2.dex */
public class kn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public long f110971e;

    /* renamed from: f, reason: collision with root package name */
    public int f110972f;

    /* renamed from: g, reason: collision with root package name */
    public long f110973g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110970d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110974h = new boolean[5];

    static {
        new bw5.kn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kn mo11468x92b714fd(byte[] bArr) {
        return (bw5.kn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kn)) {
            return false;
        }
        bw5.kn knVar = (bw5.kn) fVar;
        return n51.f.a(this.f110970d, knVar.f110970d) && n51.f.a(java.lang.Long.valueOf(this.f110971e), java.lang.Long.valueOf(knVar.f110971e)) && n51.f.a(java.lang.Integer.valueOf(this.f110972f), java.lang.Integer.valueOf(knVar.f110972f)) && n51.f.a(java.lang.Long.valueOf(this.f110973g), java.lang.Long.valueOf(knVar.f110973g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110970d;
        boolean[] zArr = this.f110974h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.h(2, this.f110971e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110972f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f110973g);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.h(2, this.f110971e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f110972f);
            }
            return zArr[4] ? g17 + b36.f.h(4, this.f110973g) : g17;
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
                this.f110971e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f110972f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f110973g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.jn jnVar = new bw5.jn();
            if (bArr != null && bArr.length > 0) {
                jnVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(jnVar);
        }
        zArr[1] = true;
        return 0;
    }
}
