package r45;

/* loaded from: classes9.dex */
public class dw4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.c50 f454310d;

    /* renamed from: e, reason: collision with root package name */
    public int f454311e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f454312f;

    /* renamed from: g, reason: collision with root package name */
    public int f454313g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454314h;

    /* renamed from: i, reason: collision with root package name */
    public int f454315i;

    /* renamed from: m, reason: collision with root package name */
    public long f454316m;

    /* renamed from: n, reason: collision with root package name */
    public long f454317n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dw4)) {
            return false;
        }
        r45.dw4 dw4Var = (r45.dw4) fVar;
        return n51.f.a(this.f454310d, dw4Var.f454310d) && n51.f.a(java.lang.Integer.valueOf(this.f454311e), java.lang.Integer.valueOf(dw4Var.f454311e)) && n51.f.a(this.f454312f, dw4Var.f454312f) && n51.f.a(java.lang.Integer.valueOf(this.f454313g), java.lang.Integer.valueOf(dw4Var.f454313g)) && n51.f.a(this.f454314h, dw4Var.f454314h) && n51.f.a(java.lang.Integer.valueOf(this.f454315i), java.lang.Integer.valueOf(dw4Var.f454315i)) && n51.f.a(java.lang.Long.valueOf(this.f454316m), java.lang.Long.valueOf(dw4Var.f454316m)) && n51.f.a(java.lang.Long.valueOf(this.f454317n), java.lang.Long.valueOf(dw4Var.f454317n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.c50 c50Var = this.f454310d;
            if (c50Var != null) {
                fVar.i(1, c50Var.mo75928xcd1e8d8());
                this.f454310d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f454311e);
            r45.cu5 cu5Var = this.f454312f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f454312f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f454313g);
            java.lang.String str = this.f454314h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f454315i);
            fVar.h(7, this.f454316m);
            fVar.h(9, this.f454317n);
            return 0;
        }
        if (i17 == 1) {
            r45.c50 c50Var2 = this.f454310d;
            int i18 = (c50Var2 != null ? 0 + b36.f.i(1, c50Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f454311e);
            r45.cu5 cu5Var2 = this.f454312f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f454313g);
            java.lang.String str2 = this.f454314h;
            if (str2 != null) {
                e17 += b36.f.j(5, str2);
            }
            return e17 + b36.f.e(6, this.f454315i) + b36.f.h(7, this.f454316m) + b36.f.h(9, this.f454317n);
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
        r45.dw4 dw4Var = (r45.dw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.c50 c50Var3 = new r45.c50();
                    if (bArr != null && bArr.length > 0) {
                        c50Var3.mo11468x92b714fd(bArr);
                    }
                    dw4Var.f454310d = c50Var3;
                }
                return 0;
            case 2:
                dw4Var.f454311e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    dw4Var.f454312f = cu5Var3;
                }
                return 0;
            case 4:
                dw4Var.f454313g = aVar2.g(intValue);
                return 0;
            case 5:
                dw4Var.f454314h = aVar2.k(intValue);
                return 0;
            case 6:
                dw4Var.f454315i = aVar2.g(intValue);
                return 0;
            case 7:
                dw4Var.f454316m = aVar2.i(intValue);
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                dw4Var.f454317n = aVar2.i(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.c50 c50Var = this.f454310d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Oplog", c50Var, false);
            eVar.d(jSONObject, "Selector", java.lang.Integer.valueOf(this.f454311e), false);
            eVar.d(jSONObject, "KeyBuf", this.f454312f, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f454313g), false);
            eVar.d(jSONObject, "DeviceType", this.f454314h, false);
            eVar.d(jSONObject, "SyncMsgDigest", java.lang.Integer.valueOf(this.f454315i), false);
            eVar.d(jSONObject, "prev_download_flag", java.lang.Long.valueOf(this.f454316m), false);
            eVar.d(jSONObject, "SyncFlag", java.lang.Long.valueOf(this.f454317n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
