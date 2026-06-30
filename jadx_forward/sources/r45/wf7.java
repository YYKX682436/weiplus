package r45;

/* loaded from: classes4.dex */
public class wf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.yf7 f470673d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xf7 f470674e;

    /* renamed from: f, reason: collision with root package name */
    public int f470675f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wf7)) {
            return false;
        }
        r45.wf7 wf7Var = (r45.wf7) fVar;
        return n51.f.a(this.f470673d, wf7Var.f470673d) && n51.f.a(this.f470674e, wf7Var.f470674e) && n51.f.a(java.lang.Integer.valueOf(this.f470675f), java.lang.Integer.valueOf(wf7Var.f470675f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.yf7 yf7Var = this.f470673d;
            if (yf7Var != null) {
                fVar.i(1, yf7Var.mo75928xcd1e8d8());
                this.f470673d.mo75956x3d5d1f78(fVar);
            }
            r45.xf7 xf7Var = this.f470674e;
            if (xf7Var != null) {
                fVar.i(2, xf7Var.mo75928xcd1e8d8());
                this.f470674e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f470675f);
            return 0;
        }
        if (i17 == 1) {
            r45.yf7 yf7Var2 = this.f470673d;
            int i18 = yf7Var2 != null ? 0 + b36.f.i(1, yf7Var2.mo75928xcd1e8d8()) : 0;
            r45.xf7 xf7Var2 = this.f470674e;
            if (xf7Var2 != null) {
                i18 += b36.f.i(2, xf7Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f470675f);
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
        r45.wf7 wf7Var = (r45.wf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.yf7 yf7Var3 = new r45.yf7();
                if (bArr != null && bArr.length > 0) {
                    yf7Var3.mo11468x92b714fd(bArr);
                }
                wf7Var.f470673d = yf7Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            wf7Var.f470675f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.xf7 xf7Var3 = new r45.xf7();
            if (bArr2 != null && bArr2.length > 0) {
                xf7Var3.mo11468x92b714fd(bArr2);
            }
            wf7Var.f470674e = xf7Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.yf7 yf7Var = this.f470673d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "plugin_info", yf7Var, false);
            eVar.d(jSONObject, "scope_item", this.f470674e, false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f470675f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
