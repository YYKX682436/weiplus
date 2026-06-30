package r45;

/* loaded from: classes2.dex */
public class jd3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f459252d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f459253e;

    /* renamed from: f, reason: collision with root package name */
    public int f459254f;

    /* renamed from: g, reason: collision with root package name */
    public int f459255g;

    /* renamed from: h, reason: collision with root package name */
    public long f459256h;

    /* renamed from: i, reason: collision with root package name */
    public int f459257i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jd3)) {
            return false;
        }
        r45.jd3 jd3Var = (r45.jd3) fVar;
        return n51.f.a(this.f76492x92037252, jd3Var.f76492x92037252) && n51.f.a(this.f459252d, jd3Var.f459252d) && n51.f.a(java.lang.Integer.valueOf(this.f459253e), java.lang.Integer.valueOf(jd3Var.f459253e)) && n51.f.a(java.lang.Integer.valueOf(this.f459254f), java.lang.Integer.valueOf(jd3Var.f459254f)) && n51.f.a(java.lang.Integer.valueOf(this.f459255g), java.lang.Integer.valueOf(jd3Var.f459255g)) && n51.f.a(java.lang.Long.valueOf(this.f459256h), java.lang.Long.valueOf(jd3Var.f459256h)) && n51.f.a(java.lang.Integer.valueOf(this.f459257i), java.lang.Integer.valueOf(jd3Var.f459257i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459252d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f459253e);
            fVar.e(4, this.f459254f);
            fVar.e(5, this.f459255g);
            fVar.h(6, this.f459256h);
            fVar.e(7, this.f459257i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f459253e) + b36.f.e(4, this.f459254f) + b36.f.e(5, this.f459255g) + b36.f.h(6, this.f459256h) + b36.f.e(7, this.f459257i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.jd3 jd3Var = (r45.jd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    jd3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fn fnVar = new r45.fn();
                    if (bArr3 != null && bArr3.length > 0) {
                        fnVar.mo11468x92b714fd(bArr3);
                    }
                    jd3Var.f459252d.add(fnVar);
                }
                return 0;
            case 3:
                jd3Var.f459253e = aVar2.g(intValue);
                return 0;
            case 4:
                jd3Var.f459254f = aVar2.g(intValue);
                return 0;
            case 5:
                jd3Var.f459255g = aVar2.g(intValue);
                return 0;
            case 6:
                jd3Var.f459256h = aVar2.i(intValue);
                return 0;
            case 7:
                jd3Var.f459257i = aVar2.g(intValue);
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
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "Items", this.f459252d, false);
            eVar.d(jSONObject, "ContinueFlag", java.lang.Integer.valueOf(this.f459253e), false);
            eVar.d(jSONObject, "Total", java.lang.Integer.valueOf(this.f459254f), false);
            eVar.d(jSONObject, "UpdateFlag", java.lang.Integer.valueOf(this.f459255g), false);
            eVar.d(jSONObject, "Version", java.lang.Long.valueOf(this.f459256h), false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f459257i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
