package bw5;

/* loaded from: classes4.dex */
public class zv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117720d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f117722f;

    /* renamed from: g, reason: collision with root package name */
    public long f117723g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117724h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117725i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f117721e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f117726m = new boolean[7];

    static {
        new bw5.zv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zv)) {
            return false;
        }
        bw5.zv zvVar = (bw5.zv) fVar;
        return n51.f.a(this.f117720d, zvVar.f117720d) && n51.f.a(this.f117721e, zvVar.f117721e) && n51.f.a(this.f117722f, zvVar.f117722f) && n51.f.a(java.lang.Long.valueOf(this.f117723g), java.lang.Long.valueOf(zvVar.f117723g)) && n51.f.a(this.f117724h, zvVar.f117724h) && n51.f.a(this.f117725i, zvVar.f117725i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117721e;
        int i18 = 0;
        boolean[] zArr = this.f117726m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117720d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.x7 x7Var = this.f117722f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.mo75928xcd1e8d8());
                this.f117722f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f117723g);
            }
            java.lang.String str2 = this.f117724h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f117725i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f117720d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.x7 x7Var2 = this.f117722f;
            if (x7Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, x7Var2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                g17 += b36.f.h(4, this.f117723g);
            }
            java.lang.String str5 = this.f117724h;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f117725i;
            return (str6 == null || !zArr[6]) ? g17 : g17 + b36.f.j(6, str6);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f117720d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.yv yvVar = new bw5.yv();
                    if (bArr != null && bArr.length > 0) {
                        yvVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(yvVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f117722f = x7Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f117723g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117724h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117725i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.zv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f117720d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "background_color", str, false);
            eVar.d(jSONObject, ya.b.f77483x2837e24a, this.f117721e, false);
            eVar.d(jSONObject, "jump_info", this.f117722f, false);
            eVar.d(jSONObject, "top_guide_bar_id", java.lang.Long.valueOf(this.f117723g), false);
            eVar.d(jSONObject, "extra_report_json", this.f117724h, false);
            eVar.d(jSONObject, "bar_background_color", this.f117725i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
