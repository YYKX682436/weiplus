package r45;

/* loaded from: classes2.dex */
public class wp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470884d;

    /* renamed from: i, reason: collision with root package name */
    public r45.xp5 f470889i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470890m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f470885e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f470886f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f470887g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470888h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f470891n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp)) {
            return false;
        }
        r45.wp wpVar = (r45.wp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470884d), java.lang.Integer.valueOf(wpVar.f470884d)) && n51.f.a(this.f470885e, wpVar.f470885e) && n51.f.a(this.f470886f, wpVar.f470886f) && n51.f.a(this.f470887g, wpVar.f470887g) && n51.f.a(this.f470888h, wpVar.f470888h) && n51.f.a(this.f470889i, wpVar.f470889i) && n51.f.a(this.f470890m, wpVar.f470890m) && n51.f.a(this.f470891n, wpVar.f470891n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470891n;
        java.util.LinkedList linkedList2 = this.f470888h;
        java.util.LinkedList linkedList3 = this.f470887g;
        java.util.LinkedList linkedList4 = this.f470886f;
        java.util.LinkedList linkedList5 = this.f470885e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470884d);
            fVar.g(2, 8, linkedList5);
            fVar.g(3, 8, linkedList4);
            fVar.g(4, 8, linkedList3);
            fVar.g(5, 8, linkedList2);
            r45.xp5 xp5Var = this.f470889i;
            if (xp5Var != null) {
                fVar.i(6, xp5Var.mo75928xcd1e8d8());
                this.f470889i.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470890m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470884d) + 0 + b36.f.g(2, 8, linkedList5) + b36.f.g(3, 8, linkedList4) + b36.f.g(4, 8, linkedList3) + b36.f.g(5, 8, linkedList2);
            r45.xp5 xp5Var2 = this.f470889i;
            if (xp5Var2 != null) {
                e17 += b36.f.i(6, xp5Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470890m;
            if (gVar2 != null) {
                e17 += b36.f.b(7, gVar2);
            }
            return e17 + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        r45.wp wpVar = (r45.wp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wpVar.f470884d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.dm dmVar = new r45.dm();
                    if (bArr2 != null && bArr2.length > 0) {
                        dmVar.mo11468x92b714fd(bArr2);
                    }
                    wpVar.f470885e.add(dmVar);
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.a97 a97Var = new r45.a97();
                    if (bArr3 != null && bArr3.length > 0) {
                        a97Var.mo11468x92b714fd(bArr3);
                    }
                    wpVar.f470886f.add(a97Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.hf0 hf0Var = new r45.hf0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hf0Var.mo11468x92b714fd(bArr4);
                    }
                    wpVar.f470887g.add(hf0Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.cb7 cb7Var = new r45.cb7();
                    if (bArr5 != null && bArr5.length > 0) {
                        cb7Var.mo11468x92b714fd(bArr5);
                    }
                    wpVar.f470888h.add(cb7Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.xp5 xp5Var3 = new r45.xp5();
                    if (bArr6 != null && bArr6.length > 0) {
                        xp5Var3.mo11468x92b714fd(bArr6);
                    }
                    wpVar.f470889i = xp5Var3;
                }
                return 0;
            case 7:
                wpVar.f470890m = aVar2.d(intValue);
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.d55 d55Var = new r45.d55();
                    if (bArr7 != null && bArr7.length > 0) {
                        d55Var.mo11468x92b714fd(bArr7);
                    }
                    wpVar.f470891n.add(d55Var);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f470884d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "BizResults", this.f470885e, false);
            eVar.d(jSONObject, "WeappResults", this.f470886f, false);
            eVar.d(jSONObject, "DocResults", this.f470887g, false);
            eVar.d(jSONObject, "WidgetResults", this.f470888h, false);
            eVar.d(jSONObject, "ReportInfo", this.f470889i, false);
            eVar.d(jSONObject, "DebugInfo", this.f470890m, false);
            eVar.d(jSONObject, "PardusResults", this.f470891n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
