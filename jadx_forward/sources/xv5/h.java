package xv5;

/* loaded from: classes11.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final xv5.h f539014m = new xv5.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f539015d;

    /* renamed from: e, reason: collision with root package name */
    public xv5.f f539016e;

    /* renamed from: f, reason: collision with root package name */
    public xv5.c f539017f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f539018g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f539019h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.ArrayMap f539020i = new android.util.ArrayMap();

    public xv5.f b() {
        return m176056x6e095e9(2) ? this.f539016e : new xv5.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.h)) {
            return false;
        }
        xv5.h hVar = (xv5.h) fVar;
        return n51.f.a(this.f539015d, hVar.f539015d) && n51.f.a(this.f539016e, hVar.f539016e) && n51.f.a(this.f539017f, hVar.f539017f) && n51.f.a(this.f539018g, hVar.f539018g) && n51.f.a(this.f539019h, hVar.f539019h);
    }

    /* renamed from: hasFieldNumber */
    public boolean m176056x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f539020i.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new xv5.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f539015d != null && m176056x6e095e9(1)) {
                fVar.j(1, this.f539015d);
            }
            if (this.f539016e != null && m176056x6e095e9(2)) {
                fVar.i(2, this.f539016e.mo75928xcd1e8d8());
                this.f539016e.mo75956x3d5d1f78(fVar);
            }
            if (this.f539017f != null && m176056x6e095e9(3)) {
                fVar.i(3, this.f539017f.mo75928xcd1e8d8());
                this.f539017f.mo75956x3d5d1f78(fVar);
            }
            if (this.f539018g != null && m176056x6e095e9(100)) {
                fVar.b(100, this.f539018g);
            }
            if (this.f539019h != null && m176056x6e095e9(101)) {
                fVar.b(101, this.f539019h);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f539015d != null && m176056x6e095e9(1)) {
                i18 = 0 + b36.f.j(1, this.f539015d);
            }
            if (this.f539016e != null && m176056x6e095e9(2)) {
                i18 += b36.f.i(2, this.f539016e.mo75928xcd1e8d8());
            }
            if (this.f539017f != null && m176056x6e095e9(3)) {
                i18 += b36.f.i(3, this.f539017f.mo75928xcd1e8d8());
            }
            if (this.f539018g != null && m176056x6e095e9(100)) {
                i18 += b36.f.b(100, this.f539018g);
            }
            return (this.f539019h == null || !m176056x6e095e9(101)) ? i18 : i18 + b36.f.b(101, this.f539019h);
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
        android.util.ArrayMap arrayMap = this.f539020i;
        if (intValue == 1) {
            this.f539015d = aVar2.k(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                xv5.f fVar2 = new xv5.f();
                if (bArr != null && bArr.length > 0) {
                    fVar2.mo11468x92b714fd(bArr);
                }
                this.f539016e = fVar2;
            }
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 100) {
                this.f539018g = aVar2.d(intValue);
                arrayMap.put(100, java.lang.Boolean.TRUE);
                return 0;
            }
            if (intValue != 101) {
                return -1;
            }
            this.f539019h = aVar2.d(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            xv5.c cVar = new xv5.c();
            if (bArr2 != null && bArr2.length > 0) {
                cVar.mo11468x92b714fd(bArr2);
            }
            this.f539017f = cVar;
        }
        arrayMap.put(3, java.lang.Boolean.TRUE);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (xv5.h) super.mo11468x92b714fd(bArr);
    }
}
