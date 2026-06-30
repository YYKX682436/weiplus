package bw5;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f116823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116824e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116825f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116826g = new boolean[4];

    static {
        new bw5.y();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y mo11468x92b714fd(byte[] bArr) {
        return (bw5.y) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y)) {
            return false;
        }
        bw5.y yVar = (bw5.y) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f116823d), java.lang.Boolean.valueOf(yVar.f116823d)) && n51.f.a(this.f116824e, yVar.f116824e) && n51.f.a(this.f116825f, yVar.f116825f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116826g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f116823d);
            }
            java.lang.String str = this.f116824e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f116825f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f116823d) : 0;
            java.lang.String str3 = this.f116824e;
            if (str3 != null && zArr[2]) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f116825f;
            return (str4 == null || !zArr[3]) ? a17 : a17 + b36.f.j(3, str4);
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
            this.f116823d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116824e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f116825f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
