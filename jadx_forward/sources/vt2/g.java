package vt2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f521489a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f521490b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f521491c;

    /* renamed from: d, reason: collision with root package name */
    public vt2.j f521492d;

    /* renamed from: e, reason: collision with root package name */
    public r45.i56 f521493e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1632xc90c42a8.C14970x1f1c0f9e f521494f;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$feedChangeListener$1] */
    public g(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f521489a = activity;
        this.f521490b = "FinderLiveShoppingManagerPresenter";
        this.f521491c = new java.util.LinkedList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f521494f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5509x49d528d>(a0Var) { // from class: com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$feedChangeListener$1
            {
                this.f39173x3fe91575 = -1676225923;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5509x49d528d c5509x49d528d) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5509x49d528d event = c5509x49d528d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                vt2.g gVar = vt2.g.this;
                java.lang.String str = gVar.f521490b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMiniWindowEvent change isLive:");
                am.mc mcVar = event.f135840g;
                sb6.append(mcVar.f88868a);
                sb6.append(",isAnchor:");
                sb6.append(mcVar.f88869b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (mcVar.f88868a != 1 || mcVar.f88869b != 1) {
                    return false;
                }
                gVar.b(3);
                gVar.f521489a.finish();
                return false;
            }
        };
    }

    public final void a(java.util.List allList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allList, "allList");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1.f197186a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allList, 10));
        java.util.Iterator it = allList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.y46) it.next()).mo14344x5f01b1f6());
        }
        q1Var.b(intent, "KEY_PRODUCTLIST", new java.util.ArrayList(arrayList));
        intent.putExtra("KEY_DELETE", z17);
        this.f521489a.setResult(-1, intent);
    }

    public final void b(int i17) {
        jz5.f0 f0Var;
        xt2.z3 z3Var;
        tt2.i iVar;
        vt2.j jVar = this.f521492d;
        java.lang.String str = this.f521490b;
        if (jVar == null || (z3Var = jVar.f521499c) == null || (iVar = z3Var.f538683q) == null) {
            f0Var = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "userBack source:" + i17 + ",productIdList:" + iVar.J());
            if (((java.util.ArrayList) iVar.J()).isEmpty()) {
                a(iVar.f503468i, true);
            } else {
                a(iVar.J(), false);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "userBack source:" + i17 + " editAdapter is null!");
        }
    }
}
