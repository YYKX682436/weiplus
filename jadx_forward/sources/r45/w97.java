package r45;

/* loaded from: classes8.dex */
public class w97 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f470526e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470527f;

    /* renamed from: g, reason: collision with root package name */
    public int f470528g;

    /* renamed from: h, reason: collision with root package name */
    public long f470529h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470530i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e64 f470531m;

    /* renamed from: o, reason: collision with root package name */
    public r45.j30 f470533o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470525d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f470532n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w97)) {
            return false;
        }
        r45.w97 w97Var = (r45.w97) fVar;
        return n51.f.a(this.f470525d, w97Var.f470525d) && n51.f.a(java.lang.Integer.valueOf(this.f470526e), java.lang.Integer.valueOf(w97Var.f470526e)) && n51.f.a(this.f470527f, w97Var.f470527f) && n51.f.a(java.lang.Integer.valueOf(this.f470528g), java.lang.Integer.valueOf(w97Var.f470528g)) && n51.f.a(java.lang.Long.valueOf(this.f470529h), java.lang.Long.valueOf(w97Var.f470529h)) && n51.f.a(this.f470530i, w97Var.f470530i) && n51.f.a(this.f470531m, w97Var.f470531m) && n51.f.a(this.f470532n, w97Var.f470532n) && n51.f.a(this.f470533o, w97Var.f470533o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470532n;
        java.util.LinkedList linkedList2 = this.f470525d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            fVar.e(2, this.f470526e);
            java.lang.String str = this.f470527f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f470528g);
            fVar.h(5, this.f470529h);
            java.lang.String str2 = this.f470530i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.e64 e64Var = this.f470531m;
            if (e64Var != null) {
                fVar.i(7, e64Var.mo75928xcd1e8d8());
                this.f470531m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 8, linkedList);
            r45.j30 j30Var = this.f470533o;
            if (j30Var != null) {
                fVar.i(9, j30Var.mo75928xcd1e8d8());
                this.f470533o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList2) + 0 + b36.f.e(2, this.f470526e);
            java.lang.String str3 = this.f470527f;
            if (str3 != null) {
                g17 += b36.f.j(3, str3);
            }
            int e17 = g17 + b36.f.e(4, this.f470528g) + b36.f.h(5, this.f470529h);
            java.lang.String str4 = this.f470530i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            r45.e64 e64Var2 = this.f470531m;
            if (e64Var2 != null) {
                e17 += b36.f.i(7, e64Var2.mo75928xcd1e8d8());
            }
            int g18 = e17 + b36.f.g(8, 8, linkedList);
            r45.j30 j30Var2 = this.f470533o;
            return j30Var2 != null ? g18 + b36.f.i(9, j30Var2.mo75928xcd1e8d8()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.w97 w97Var = (r45.w97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w97Var.f470525d.add(aVar2.k(intValue));
                return 0;
            case 2:
                w97Var.f470526e = aVar2.g(intValue);
                return 0;
            case 3:
                w97Var.f470527f = aVar2.k(intValue);
                return 0;
            case 4:
                w97Var.f470528g = aVar2.g(intValue);
                return 0;
            case 5:
                w97Var.f470529h = aVar2.i(intValue);
                return 0;
            case 6:
                w97Var.f470530i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr2);
                    }
                    w97Var.f470531m = e64Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr3 != null && bArr3.length > 0) {
                        x50Var.mo11468x92b714fd(bArr3);
                    }
                    w97Var.f470532n.add(x50Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr4 != null && bArr4.length > 0) {
                        j30Var3.mo11468x92b714fd(bArr4);
                    }
                    w97Var.f470533o = j30Var3;
                }
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
            java.util.LinkedList linkedList = this.f470525d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ConfigKeys", linkedList, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f470526e), false);
            eVar.d(jSONObject, "Language", this.f470527f, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f470528g), false);
            eVar.d(jSONObject, "BusinessType", java.lang.Long.valueOf(this.f470529h), false);
            eVar.d(jSONObject, "NetType", this.f470530i, false);
            eVar.d(jSONObject, "Location", this.f470531m, false);
            eVar.d(jSONObject, "ExtParams", this.f470532n, false);
            eVar.d(jSONObject, "ChildMode", this.f470533o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
