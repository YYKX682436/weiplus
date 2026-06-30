package r45;

/* loaded from: classes7.dex */
public class he extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final r45.he f457609m = new r45.he();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457610d;

    /* renamed from: e, reason: collision with root package name */
    public int f457611e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457612f;

    /* renamed from: g, reason: collision with root package name */
    public int f457613g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457614h;

    /* renamed from: i, reason: collision with root package name */
    public int f457615i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.he mo11468x92b714fd(byte[] bArr) {
        return (r45.he) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he)) {
            return false;
        }
        r45.he heVar = (r45.he) fVar;
        return n51.f.a(this.f457610d, heVar.f457610d) && n51.f.a(java.lang.Integer.valueOf(this.f457611e), java.lang.Integer.valueOf(heVar.f457611e)) && n51.f.a(this.f457612f, heVar.f457612f) && n51.f.a(java.lang.Integer.valueOf(this.f457613g), java.lang.Integer.valueOf(heVar.f457613g)) && n51.f.a(this.f457614h, heVar.f457614h) && n51.f.a(java.lang.Integer.valueOf(this.f457615i), java.lang.Integer.valueOf(heVar.f457615i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457610d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f457611e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457612f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f457613g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f457614h;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.f457615i);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f457610d;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.f457611e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f457612f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.f457613g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f457614h;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.f457615i);
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
                this.f457610d = aVar2.d(intValue);
                return 0;
            case 2:
                this.f457611e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f457612f = aVar2.d(intValue);
                return 0;
            case 4:
                this.f457613g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f457614h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f457615i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457610d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "SessionKey", gVar, false);
            eVar.d(jSONObject, "Uin", java.lang.Integer.valueOf(this.f457611e), false);
            eVar.d(jSONObject, "DeviceID", this.f457612f, false);
            eVar.d(jSONObject, "ClientVersion", java.lang.Integer.valueOf(this.f457613g), false);
            eVar.d(jSONObject, "DeviceType", this.f457614h, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f457615i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
