package bw5;

/* loaded from: classes2.dex */
public class wr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116366d;

    /* renamed from: f, reason: collision with root package name */
    public long f116368f;

    /* renamed from: g, reason: collision with root package name */
    public long f116369g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116367e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116370h = new boolean[6];

    static {
        new bw5.wr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wr mo11468x92b714fd(byte[] bArr) {
        return (bw5.wr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wr)) {
            return false;
        }
        bw5.wr wrVar = (bw5.wr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116366d), java.lang.Long.valueOf(wrVar.f116366d)) && n51.f.a(this.f116367e, wrVar.f116367e) && n51.f.a(java.lang.Long.valueOf(this.f116368f), java.lang.Long.valueOf(wrVar.f116368f)) && n51.f.a(java.lang.Long.valueOf(this.f116369g), java.lang.Long.valueOf(wrVar.f116369g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116367e;
        boolean[] zArr = this.f116370h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116366d);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.h(3, this.f116368f);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116369g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = (zArr[1] ? 0 + b36.f.h(1, this.f116366d) : 0) + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f116368f);
            }
            return zArr[5] ? h17 + b36.f.h(5, this.f116369g) : h17;
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
            this.f116366d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f116368f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f116369g = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.xr xrVar = new bw5.xr();
            if (bArr != null && bArr.length > 0) {
                xrVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(xrVar);
        }
        zArr[2] = true;
        return 0;
    }
}
