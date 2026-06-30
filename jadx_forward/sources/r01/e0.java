package r01;

/* loaded from: classes9.dex */
public class e0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f449583d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final r01.c0 f449584e = new r01.c0(null);

    /* renamed from: f, reason: collision with root package name */
    public boolean f449585f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f449586g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f449587h = new java.util.LinkedList();

    public void a(r01.d0 d0Var) {
        synchronized (this.f449583d) {
            if (!this.f449587h.contains(d0Var)) {
                java.util.Iterator it = this.f449587h.iterator();
                while (it.hasNext()) {
                    r01.d0 d0Var2 = (r01.d0) it.next();
                    if (d0Var != null && d0Var2 != null) {
                        java.lang.String b17 = d0Var.b();
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (b17 == null) {
                            b17 = "";
                        }
                        java.lang.String b18 = d0Var2.b();
                        if (b18 == null) {
                            b18 = "";
                        }
                        if (b17.equals(b18)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizKFService", "the same callbacker %s, return", d0Var.b());
                            return;
                        }
                    }
                }
                this.f449587h.add(d0Var);
            }
        }
    }

    public final void b(java.util.LinkedList linkedList) {
        synchronized (this.f449583d) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f449587h);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                r01.d0 d0Var = (r01.d0) arrayList.get(i17);
                if (d0Var != null) {
                    d0Var.a(linkedList);
                }
            }
        }
    }

    public void c(java.lang.String str, java.lang.String str2, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizKFService", "doKFGetDefaultList error args, %s, %s", str, str2);
            return;
        }
        java.util.Set set = this.f449586g;
        if (((java.util.HashSet) set).contains(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizKFService", "doKFGetInfoList: same is running, %s", str2);
            return;
        }
        ((java.util.HashSet) set).add(str2);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(i17));
        r01.m3 m3Var = new r01.m3(str, linkedList, linkedList2);
        m3Var.f449694g = str2;
        gm0.j1.n().f354821b.g(m3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizKFService", "doKFGetInfoList %s, %s, %d, kfType: %d", str, str2, java.lang.Integer.valueOf(this.f449587h.size()), java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0217  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r20, int r21, java.lang.String r22, com.p314xaae8f345.mm.p944x882e457a.m1 r23) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.e0.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
