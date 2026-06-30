package bw5;

/* loaded from: classes2.dex */
public class sn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f114598d;

    /* renamed from: e, reason: collision with root package name */
    public long f114599e;

    /* renamed from: f, reason: collision with root package name */
    public long f114600f;

    /* renamed from: g, reason: collision with root package name */
    public long f114601g;

    /* renamed from: h, reason: collision with root package name */
    public int f114602h;

    /* renamed from: i, reason: collision with root package name */
    public int f114603i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f114604m = new boolean[7];

    static {
        new bw5.sn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sn mo11468x92b714fd(byte[] bArr) {
        return (bw5.sn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sn)) {
            return false;
        }
        bw5.sn snVar = (bw5.sn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f114598d), java.lang.Long.valueOf(snVar.f114598d)) && n51.f.a(java.lang.Long.valueOf(this.f114599e), java.lang.Long.valueOf(snVar.f114599e)) && n51.f.a(java.lang.Long.valueOf(this.f114600f), java.lang.Long.valueOf(snVar.f114600f)) && n51.f.a(java.lang.Long.valueOf(this.f114601g), java.lang.Long.valueOf(snVar.f114601g)) && n51.f.a(java.lang.Integer.valueOf(this.f114602h), java.lang.Integer.valueOf(snVar.f114602h)) && n51.f.a(java.lang.Integer.valueOf(this.f114603i), java.lang.Integer.valueOf(snVar.f114603i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114604m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f114598d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f114599e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f114600f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f114601g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f114602h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114603i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f114598d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f114599e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f114600f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f114601g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f114602h);
            }
            return zArr[6] ? h17 + b36.f.e(6, this.f114603i) : h17;
        }
        if (i17 == 2) {
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
                this.f114598d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114599e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114600f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114601g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114602h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114603i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
