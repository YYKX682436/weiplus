package r45;

/* loaded from: classes11.dex */
public class ad extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f451465d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f451466e;

    /* renamed from: f, reason: collision with root package name */
    public int f451467f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451468g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451469h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451470i;

    static {
        new r45.ad();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ad)) {
            return false;
        }
        r45.ad adVar = (r45.ad) fVar;
        return n51.f.a(this.f451465d, adVar.f451465d) && n51.f.a(java.lang.Integer.valueOf(this.f451466e), java.lang.Integer.valueOf(adVar.f451466e)) && n51.f.a(java.lang.Integer.valueOf(this.f451467f), java.lang.Integer.valueOf(adVar.f451467f)) && n51.f.a(this.f451468g, adVar.f451468g) && n51.f.a(this.f451469h, adVar.f451469h) && n51.f.a(this.f451470i, adVar.f451470i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ad();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f451465d);
            fVar.e(2, this.f451466e);
            fVar.e(3, this.f451467f);
            java.lang.String str = this.f451468g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f451469h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f451470i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f451465d) + 0 + b36.f.e(2, this.f451466e) + b36.f.e(3, this.f451467f);
            java.lang.String str4 = this.f451468g;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f451469h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f451470i;
            return str6 != null ? g17 + b36.f.j(6, str6) : g17;
        }
        if (i17 == 2) {
            this.f451465d.clear();
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
                this.f451465d.add(aVar2.k(intValue));
                return 0;
            case 2:
                this.f451466e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f451467f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f451468g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f451469h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f451470i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ad) super.mo11468x92b714fd(bArr);
    }
}
