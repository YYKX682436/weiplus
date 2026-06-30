package cw5;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final cw5.c f305864g = new cw5.c();

    /* renamed from: d, reason: collision with root package name */
    public cw5.b f305865d;

    /* renamed from: e, reason: collision with root package name */
    public int f305866e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f305867f = new boolean[3];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.c)) {
            return false;
        }
        cw5.c cVar = (cw5.c) fVar;
        return n51.f.a(this.f305865d, cVar.f305865d) && n51.f.a(java.lang.Integer.valueOf(this.f305866e), java.lang.Integer.valueOf(cVar.f305866e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new cw5.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f305867f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            cw5.b bVar = this.f305865d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f305863d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f305866e);
            }
            return 0;
        }
        if (i17 == 1) {
            cw5.b bVar2 = this.f305865d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f305863d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f305866e) : i18;
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
            this.f305865d = g17 != 1 ? g17 != 2 ? null : cw5.b.BOX_TYPE_SERVER_ASSIGN : cw5.b.BOX_TYPE_LASTED_MSG;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f305866e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (cw5.c) super.mo11468x92b714fd(bArr);
    }
}
