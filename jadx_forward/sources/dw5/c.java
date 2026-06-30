package dw5;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final dw5.c f325847g = new dw5.c();

    /* renamed from: d, reason: collision with root package name */
    public dw5.b f325848d;

    /* renamed from: e, reason: collision with root package name */
    public int f325849e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f325850f = new boolean[3];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.c)) {
            return false;
        }
        dw5.c cVar = (dw5.c) fVar;
        return n51.f.a(this.f325848d, cVar.f325848d) && n51.f.a(java.lang.Integer.valueOf(this.f325849e), java.lang.Integer.valueOf(cVar.f325849e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f325850f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            dw5.b bVar = this.f325848d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f325846d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f325849e);
            }
            return 0;
        }
        if (i17 == 1) {
            dw5.b bVar2 = this.f325848d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f325846d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f325849e) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f325848d = g17 != 1 ? g17 != 2 ? null : dw5.b.TYPE_SERVER_ASSIGN : dw5.b.TYPE_LASTED_MSG;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f325849e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (dw5.c) super.mo11468x92b714fd(bArr);
    }
}
