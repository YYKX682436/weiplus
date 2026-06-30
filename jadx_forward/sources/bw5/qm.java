package bw5;

/* loaded from: classes2.dex */
public class qm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113715d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113716e;

    /* renamed from: f, reason: collision with root package name */
    public int f113717f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113718g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113719h = new boolean[5];

    static {
        new bw5.qm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qm mo11468x92b714fd(byte[] bArr) {
        return (bw5.qm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qm)) {
            return false;
        }
        bw5.qm qmVar = (bw5.qm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113715d), java.lang.Integer.valueOf(qmVar.f113715d)) && n51.f.a(this.f113716e, qmVar.f113716e) && n51.f.a(java.lang.Integer.valueOf(this.f113717f), java.lang.Integer.valueOf(qmVar.f113717f)) && n51.f.a(this.f113718g, qmVar.f113718g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113719h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113715d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113716e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113717f);
            }
            java.lang.String str = this.f113718g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113715d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113716e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113717f);
            }
            java.lang.String str2 = this.f113718g;
            return (str2 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str2);
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
        if (intValue == 1) {
            this.f113715d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113716e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113717f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f113718g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
