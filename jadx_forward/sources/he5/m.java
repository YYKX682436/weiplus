package he5;

/* loaded from: classes9.dex */
public class m implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f362482a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362485d;

    /* renamed from: e, reason: collision with root package name */
    public final hd5.n f362486e;

    /* renamed from: f, reason: collision with root package name */
    public final he5.l f362487f;

    /* renamed from: g, reason: collision with root package name */
    public long f362488g;

    public m(java.lang.String str, int i17, int i18, hd5.n nVar, he5.l lVar) {
        this.f362483b = str;
        this.f362484c = i17;
        this.f362485d = i18;
        this.f362486e = nVar;
        this.f362487f = lVar;
    }

    @Override // he5.t
    public int a() {
        return this.f362485d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [he5.m] */
    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        ?? arrayList = new java.util.ArrayList();
        e(arrayList);
        hd5.n nVar = hd5.n.ACTION_POSITION;
        he5.l lVar = this.f362487f;
        int i17 = this.f362484c;
        boolean z17 = false;
        hd5.n nVar2 = this.f362486e;
        if (nVar2 != nVar && nVar2 != hd5.n.ACTION_UPDATE) {
            if (i17 < 2 || arrayList.size() < i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "check if need load more data, but list is null or less than expect, except count: %d, actual count: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            } else {
                z17 = ((ke5.v) lVar).a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(0), (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "need load more data: %b", java.lang.Boolean.valueOf(z17));
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "contain flex data, load more");
            arrayList.clear();
            mo133462x5a5ddf8();
            com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
            java.lang.String str = this.f362483b;
            this.f362482a = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M4(str, java.lang.Math.min(i17 + 8, this.f362485d), x4Var.m0(str));
            e(arrayList);
            int i18 = 7;
            while (i18 > 0) {
                int i19 = i18 - 1;
                if (!((ke5.v) lVar).a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i18), (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i19))) {
                    break;
                } else {
                    i18 = i19;
                }
            }
            arrayList = arrayList.subList(i18, arrayList.size());
        }
        list.addAll(arrayList);
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        java.lang.String str = this.f362483b;
        this.f362488g = x4Var.m0(str);
        xg3.m0 u17 = c01.d9.b().u();
        this.f362482a = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).M4(str, this.f362484c, this.f362488g);
        oVar.mo133232x338af3();
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        this.f362482a.close();
    }

    @Override // he5.t
    public long d() {
        return this.f362488g;
    }

    public final void e(java.util.List list) {
        try {
            this.f362482a.moveToFirst();
            while (!this.f362482a.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(this.f362482a);
                list.add(f9Var);
                this.f362482a.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", e17, "", new java.lang.Object[0]);
        }
    }
}
