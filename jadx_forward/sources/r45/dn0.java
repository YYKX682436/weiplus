package r45;

/* loaded from: classes4.dex */
public class dn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f454121d;

    /* renamed from: e, reason: collision with root package name */
    public int f454122e;

    /* renamed from: f, reason: collision with root package name */
    public long f454123f;

    /* renamed from: g, reason: collision with root package name */
    public long f454124g;

    /* renamed from: h, reason: collision with root package name */
    public long f454125h;

    /* renamed from: i, reason: collision with root package name */
    public long f454126i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn0)) {
            return false;
        }
        r45.dn0 dn0Var = (r45.dn0) fVar;
        return n51.f.a(this.f76494x2de60e5e, dn0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f454121d), java.lang.Integer.valueOf(dn0Var.f454121d)) && n51.f.a(java.lang.Integer.valueOf(this.f454122e), java.lang.Integer.valueOf(dn0Var.f454122e)) && n51.f.a(java.lang.Long.valueOf(this.f454123f), java.lang.Long.valueOf(dn0Var.f454123f)) && n51.f.a(java.lang.Long.valueOf(this.f454124g), java.lang.Long.valueOf(dn0Var.f454124g)) && n51.f.a(java.lang.Long.valueOf(this.f454125h), java.lang.Long.valueOf(dn0Var.f454125h)) && n51.f.a(java.lang.Long.valueOf(this.f454126i), java.lang.Long.valueOf(dn0Var.f454126i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f454121d);
            fVar.e(3, this.f454122e);
            fVar.h(4, this.f454123f);
            fVar.h(5, this.f454124g);
            fVar.h(6, this.f454125h);
            fVar.h(7, this.f454126i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f454121d) + b36.f.e(3, this.f454122e) + b36.f.h(4, this.f454123f) + b36.f.h(5, this.f454124g) + b36.f.h(6, this.f454125h) + b36.f.h(7, this.f454126i);
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
        r45.dn0 dn0Var = (r45.dn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    dn0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                dn0Var.f454121d = aVar2.g(intValue);
                return 0;
            case 3:
                dn0Var.f454122e = aVar2.g(intValue);
                return 0;
            case 4:
                dn0Var.f454123f = aVar2.i(intValue);
                return 0;
            case 5:
                dn0Var.f454124g = aVar2.i(intValue);
                return 0;
            case 6:
                dn0Var.f454125h = aVar2.i(intValue);
                return 0;
            case 7:
                dn0Var.f454126i = aVar2.i(intValue);
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
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "OpCode", java.lang.Integer.valueOf(this.f454121d), false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f454122e), false);
            eVar.d(jSONObject, "WhichExtFunctionSwitch", java.lang.Long.valueOf(this.f454123f), false);
            eVar.d(jSONObject, "ExtFunctionSwitchValue", java.lang.Long.valueOf(this.f454124g), false);
            eVar.d(jSONObject, "WhichExtFunctionSwitch2", java.lang.Long.valueOf(this.f454125h), false);
            eVar.d(jSONObject, "ExtFunctionSwitchValue2", java.lang.Long.valueOf(this.f454126i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
