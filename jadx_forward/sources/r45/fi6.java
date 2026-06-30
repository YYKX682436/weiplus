package r45;

/* loaded from: classes4.dex */
public class fi6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f455920d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455921e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455922f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h40 f455923g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fi6)) {
            return false;
        }
        r45.fi6 fi6Var = (r45.fi6) fVar;
        return n51.f.a(this.f455920d, fi6Var.f455920d) && n51.f.a(this.f455921e, fi6Var.f455921e) && n51.f.a(this.f455922f, fi6Var.f455922f) && n51.f.a(this.f455923g, fi6Var.f455923g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f455920d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455921e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f455922f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.h40 h40Var = this.f455923g;
            if (h40Var != null) {
                fVar.i(4, h40Var.mo75928xcd1e8d8());
                this.f455923g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f455920d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455921e;
            if (gVar2 != null) {
                g17 += b36.f.b(2, gVar2);
            }
            java.lang.String str2 = this.f455922f;
            if (str2 != null) {
                g17 += b36.f.j(3, str2);
            }
            r45.h40 h40Var2 = this.f455923g;
            return h40Var2 != null ? g17 + b36.f.i(4, h40Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455920d.clear();
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
        r45.fi6 fi6Var = (r45.fi6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.di6 di6Var = new r45.di6();
                if (bArr2 != null && bArr2.length > 0) {
                    di6Var.mo11468x92b714fd(bArr2);
                }
                fi6Var.f455920d.add(di6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            fi6Var.f455921e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            fi6Var.f455922f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.h40 h40Var3 = new r45.h40();
            if (bArr3 != null && bArr3.length > 0) {
                h40Var3.mo11468x92b714fd(bArr3);
            }
            fi6Var.f455923g = h40Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f455920d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Items", linkedList, false);
            eVar.d(jSONObject, "DebugInfo", this.f455921e, false);
            eVar.d(jSONObject, "ExtInfo", this.f455922f, false);
            eVar.d(jSONObject, "ClientCtrlInfo", this.f455923g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
