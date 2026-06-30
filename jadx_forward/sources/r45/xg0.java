package r45;

/* loaded from: classes2.dex */
public class xg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f471592d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471593e;

    /* renamed from: f, reason: collision with root package name */
    public int f471594f;

    /* renamed from: g, reason: collision with root package name */
    public int f471595g;

    /* renamed from: h, reason: collision with root package name */
    public int f471596h;

    /* renamed from: i, reason: collision with root package name */
    public int f471597i;

    /* renamed from: m, reason: collision with root package name */
    public int f471598m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f471599n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f471600o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f471601p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f471602q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xg0)) {
            return false;
        }
        r45.xg0 xg0Var = (r45.xg0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f471592d), java.lang.Boolean.valueOf(xg0Var.f471592d)) && n51.f.a(java.lang.Boolean.valueOf(this.f471593e), java.lang.Boolean.valueOf(xg0Var.f471593e)) && n51.f.a(java.lang.Integer.valueOf(this.f471594f), java.lang.Integer.valueOf(xg0Var.f471594f)) && n51.f.a(java.lang.Integer.valueOf(this.f471595g), java.lang.Integer.valueOf(xg0Var.f471595g)) && n51.f.a(java.lang.Integer.valueOf(this.f471596h), java.lang.Integer.valueOf(xg0Var.f471596h)) && n51.f.a(java.lang.Integer.valueOf(this.f471597i), java.lang.Integer.valueOf(xg0Var.f471597i)) && n51.f.a(java.lang.Integer.valueOf(this.f471598m), java.lang.Integer.valueOf(xg0Var.f471598m)) && n51.f.a(java.lang.Boolean.valueOf(this.f471599n), java.lang.Boolean.valueOf(xg0Var.f471599n)) && n51.f.a(java.lang.Boolean.valueOf(this.f471600o), java.lang.Boolean.valueOf(xg0Var.f471600o)) && n51.f.a(java.lang.Boolean.valueOf(this.f471601p), java.lang.Boolean.valueOf(xg0Var.f471601p)) && n51.f.a(java.lang.Boolean.valueOf(this.f471602q), java.lang.Boolean.valueOf(xg0Var.f471602q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f471592d);
            fVar.a(2, this.f471593e);
            fVar.e(3, this.f471594f);
            fVar.e(4, this.f471595g);
            fVar.e(5, this.f471596h);
            fVar.e(6, this.f471597i);
            fVar.e(7, this.f471598m);
            fVar.a(8, this.f471599n);
            fVar.a(9, this.f471600o);
            fVar.a(10, this.f471601p);
            fVar.a(11, this.f471602q);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f471592d) + 0 + b36.f.a(2, this.f471593e) + b36.f.e(3, this.f471594f) + b36.f.e(4, this.f471595g) + b36.f.e(5, this.f471596h) + b36.f.e(6, this.f471597i) + b36.f.e(7, this.f471598m) + b36.f.a(8, this.f471599n) + b36.f.a(9, this.f471600o) + b36.f.a(10, this.f471601p) + b36.f.a(11, this.f471602q);
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
        r45.xg0 xg0Var = (r45.xg0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xg0Var.f471592d = aVar2.c(intValue);
                return 0;
            case 2:
                xg0Var.f471593e = aVar2.c(intValue);
                return 0;
            case 3:
                xg0Var.f471594f = aVar2.g(intValue);
                return 0;
            case 4:
                xg0Var.f471595g = aVar2.g(intValue);
                return 0;
            case 5:
                xg0Var.f471596h = aVar2.g(intValue);
                return 0;
            case 6:
                xg0Var.f471597i = aVar2.g(intValue);
                return 0;
            case 7:
                xg0Var.f471598m = aVar2.g(intValue);
                return 0;
            case 8:
                xg0Var.f471599n = aVar2.c(intValue);
                return 0;
            case 9:
                xg0Var.f471600o = aVar2.c(intValue);
                return 0;
            case 10:
                xg0Var.f471601p = aVar2.c(intValue);
                return 0;
            case 11:
                xg0Var.f471602q = aVar2.c(intValue);
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
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f471592d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "NeedPreloadFold", valueOf, false);
            eVar.d(jSONObject, "NeedPreload", java.lang.Boolean.valueOf(this.f471593e), false);
            eVar.d(jSONObject, "PreloadTopNum", java.lang.Integer.valueOf(this.f471594f), false);
            eVar.d(jSONObject, "PreloadInterval", java.lang.Integer.valueOf(this.f471595g), false);
            eVar.d(jSONObject, "PreloadSyncGap", java.lang.Integer.valueOf(this.f471596h), false);
            eVar.d(jSONObject, "PreloadPicGap", java.lang.Integer.valueOf(this.f471597i), false);
            eVar.d(jSONObject, "PreloadPicLimit", java.lang.Integer.valueOf(this.f471598m), false);
            eVar.d(jSONObject, "NeedPreloadAtForeground", java.lang.Boolean.valueOf(this.f471599n), false);
            eVar.d(jSONObject, "NeedPreloadAtChatList", java.lang.Boolean.valueOf(this.f471600o), false);
            eVar.d(jSONObject, "NeedPreloadAtAppMsgExpose", java.lang.Boolean.valueOf(this.f471601p), false);
            eVar.d(jSONObject, "NeedCheckTabAtForegroundPreload", java.lang.Boolean.valueOf(this.f471602q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
