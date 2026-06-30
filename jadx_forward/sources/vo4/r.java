package vo4;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f520205a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 f520206b;

    /* renamed from: c, reason: collision with root package name */
    public p05.l4 f520207c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f520208d = true;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f520209e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final vo4.s f520210f = new vo4.s();

    /* renamed from: g, reason: collision with root package name */
    public long f520211g = 33;

    /* renamed from: h, reason: collision with root package name */
    public long f520212h = 16;

    /* renamed from: i, reason: collision with root package name */
    public long f520213i = 33;

    /* renamed from: j, reason: collision with root package name */
    public int f520214j;

    /* renamed from: k, reason: collision with root package name */
    public int f520215k;

    public r(boolean z17) {
        this.f520205a = z17;
    }

    public final void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i17, long j17) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        java.lang.Object obj;
        android.opengl.GLES20.glViewport(0, 0, this.f520214j, this.f520215k);
        rs0.i.f480829a.g();
        java.util.ArrayList<vo4.b> arrayList3 = this.f520209e;
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((vo4.b) it.next()).f520147m = false;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0) it6.next();
            java.util.Iterator it7 = arrayList3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it7.next();
                vo4.b bVar = (vo4.b) obj;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f520138d.f257243c, p0Var.f257243c) && bVar.f520138d.f257241a >= p0Var.f257241a) {
                    break;
                }
            }
            vo4.b bVar2 = (vo4.b) obj;
            if (bVar2 != null) {
                if (!bVar2.f520149o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "drawImpl prepare material player: " + j17 + ", " + p0Var.f257241a + ", " + p0Var.f257243c);
                    bVar2.c();
                }
                boolean z19 = bVar2.f520148n;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var2 = bVar2.f520138d;
                if (!z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "drawImpl play material player: " + j17 + ", " + p0Var.f257241a + ", " + p0Var.f257243c);
                    bVar2.d(j17 - p0Var2.f257241a);
                }
                bVar2.f520147m = true;
                bVar2.b(j17 - p0Var2.f257241a, true);
            }
            this.f520213i = p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 ? this.f520211g : this.f520212h;
        }
        p05.l4 l4Var = this.f520207c;
        if (l4Var != null) {
            z17 = true;
            str = "MicroMsg.VLogScriptReader";
            rh0.d0.c(l4Var, 0, i17, j17, 0, false, false, false, 120, null);
        } else {
            z17 = true;
            str = "MicroMsg.VLogScriptReader";
        }
        for (vo4.b bVar3 : arrayList3) {
            if (!bVar3.f520147m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var3 = bVar3.f520138d;
                if (arrayList2 != null) {
                    if (!arrayList2.isEmpty()) {
                        java.util.Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0) it8.next()).f257243c, p0Var3.f257243c)) {
                                z18 = z17;
                                break;
                            }
                        }
                    }
                    z18 = false;
                    if (!z18) {
                    }
                }
                if (j17 - p0Var3.f257242b > 0 && bVar3.f520148n) {
                    bVar3.f();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stop player " + p0Var3.f257243c + ", pts:" + j17 + ", endTime:" + p0Var3.f257242b);
                }
            }
        }
    }

    public final void b(int i17, int i18) {
        this.f520214j = i17;
        this.f520215k = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "set target size:[" + this.f520214j + ", " + this.f520215k + ']');
        p05.l4 l4Var = new p05.l4(0, false, false, false, false, false, null, null, false, 511, null);
        this.f520207c = l4Var;
        l4Var.J(this.f520214j, this.f520215k);
        vo4.s sVar = this.f520210f;
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptTexCache", "init cache, cacheTexsNum:2");
        for (int i19 = 0; i19 < 2; i19++) {
            sVar.f520216a[i19] = is0.b.b(false, 11L);
            sVar.f520217b[i19] = is0.b.b(true, 11L);
        }
    }

    public final void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetAllPlayers size:");
        java.util.ArrayList<vo4.b> arrayList = this.f520209e;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", sb6.toString());
        for (vo4.b bVar : arrayList) {
            bVar.f();
            if (z17) {
                bVar.e();
            }
        }
    }
}
