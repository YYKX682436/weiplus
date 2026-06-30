package er4;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final er4.e f337605h = new er4.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f337606d;

    /* renamed from: f, reason: collision with root package name */
    public er4.f f337608f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f337607e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f337609g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.e)) {
            return false;
        }
        er4.e eVar = (er4.e) fVar;
        return n51.f.a(this.f337606d, eVar.f337606d) && n51.f.a(this.f337607e, eVar.f337607e) && n51.f.a(this.f337608f, eVar.f337608f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f337607e;
        boolean[] zArr = this.f337609g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f337606d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            er4.f fVar2 = this.f337608f;
            if (fVar2 != null && zArr[3]) {
                fVar.e(3, fVar2.f337614d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f337606d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList);
            er4.f fVar3 = this.f337608f;
            return (fVar3 == null || !zArr[3]) ? g17 : g17 + b36.f.e(3, fVar3.f337614d);
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
            this.f337606d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g18 = aVar2.g(intValue);
        this.f337608f = g18 != 0 ? g18 != 1 ? g18 != 2 ? null : er4.f.BANNER_STATUS_WAIT : er4.f.BANNER_STATUS_ENTER : er4.f.BANNER_STATUS_EXIT;
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.e) super.mo11468x92b714fd(bArr);
    }
}
