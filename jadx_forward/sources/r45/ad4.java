package r45;

/* loaded from: classes8.dex */
public class ad4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f451475d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f451476e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.bd4 f451477f;

    /* renamed from: g, reason: collision with root package name */
    public int f451478g;

    /* renamed from: h, reason: collision with root package name */
    public int f451479h;

    /* renamed from: i, reason: collision with root package name */
    public long f451480i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451481m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ad4)) {
            return false;
        }
        r45.ad4 ad4Var = (r45.ad4) fVar;
        return n51.f.a(this.f451475d, ad4Var.f451475d) && n51.f.a(this.f451476e, ad4Var.f451476e) && n51.f.a(this.f451477f, ad4Var.f451477f) && n51.f.a(java.lang.Integer.valueOf(this.f451478g), java.lang.Integer.valueOf(ad4Var.f451478g)) && n51.f.a(java.lang.Integer.valueOf(this.f451479h), java.lang.Integer.valueOf(ad4Var.f451479h)) && n51.f.a(java.lang.Long.valueOf(this.f451480i), java.lang.Long.valueOf(ad4Var.f451480i)) && n51.f.a(this.f451481m, ad4Var.f451481m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451476e;
        java.util.LinkedList linkedList2 = this.f451475d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            r45.bd4 bd4Var = this.f451477f;
            if (bd4Var != null) {
                fVar.i(3, bd4Var.mo75928xcd1e8d8());
                this.f451477f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f451478g);
            fVar.e(5, this.f451479h);
            fVar.h(6, this.f451480i);
            java.lang.String str = this.f451481m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            r45.bd4 bd4Var2 = this.f451477f;
            if (bd4Var2 != null) {
                g17 += b36.f.i(3, bd4Var2.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(4, this.f451478g) + b36.f.e(5, this.f451479h) + b36.f.h(6, this.f451480i);
            java.lang.String str2 = this.f451481m;
            return str2 != null ? e17 + b36.f.j(7, str2) : e17;
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
        r45.ad4 ad4Var = (r45.ad4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.bd4 bd4Var3 = new r45.bd4();
                    if (bArr2 != null && bArr2.length > 0) {
                        bd4Var3.mo11468x92b714fd(bArr2);
                    }
                    ad4Var.f451475d.add(bd4Var3);
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.bd4 bd4Var4 = new r45.bd4();
                    if (bArr3 != null && bArr3.length > 0) {
                        bd4Var4.mo11468x92b714fd(bArr3);
                    }
                    ad4Var.f451476e.add(bd4Var4);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.bd4 bd4Var5 = new r45.bd4();
                    if (bArr4 != null && bArr4.length > 0) {
                        bd4Var5.mo11468x92b714fd(bArr4);
                    }
                    ad4Var.f451477f = bd4Var5;
                }
                return 0;
            case 4:
                ad4Var.f451478g = aVar2.g(intValue);
                return 0;
            case 5:
                ad4Var.f451479h = aVar2.g(intValue);
                return 0;
            case 6:
                ad4Var.f451480i = aVar2.i(intValue);
                return 0;
            case 7:
                ad4Var.f451481m = aVar2.k(intValue);
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
            java.util.LinkedList linkedList = this.f451475d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "startPart", linkedList, false);
            eVar.d(jSONObject, "showPart", this.f451476e, false);
            eVar.d(jSONObject, "endPart", this.f451477f, false);
            eVar.d(jSONObject, "hasRealTitle", java.lang.Integer.valueOf(this.f451478g), false);
            eVar.d(jSONObject, "foldSolitaireCount", java.lang.Integer.valueOf(this.f451479h), false);
            eVar.d(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.f451480i), false);
            eVar.d(jSONObject, "key", this.f451481m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
