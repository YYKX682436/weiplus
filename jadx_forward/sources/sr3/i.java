package sr3;

/* loaded from: classes11.dex */
public final class i implements sr3.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f493391a;

    /* renamed from: b, reason: collision with root package name */
    public final long f493392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f493393c;

    /* renamed from: d, reason: collision with root package name */
    public final sr3.f f493394d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f493395e;

    /* renamed from: f, reason: collision with root package name */
    public sr3.f f493396f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 globalContext, boolean z17, long j17, int i17, sr3.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(globalContext, "globalContext");
        this.f493391a = z17;
        this.f493392b = j17;
        this.f493393c = i17;
        this.f493394d = fVar;
        this.f493395e = new java.lang.ref.WeakReference(globalContext);
    }

    @Override // sr3.g
    public boolean a() {
        return this.f493391a;
    }

    @Override // sr3.g
    public int b() {
        return this.f493393c;
    }

    @Override // sr3.g
    public long c() {
        return this.f493392b;
    }

    @Override // sr3.g
    public sr3.d d(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl wlVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.util.List currentFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentFragments, "currentFragments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : currentFragments) {
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb) {
                arrayList3.add(obj);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb c16902xea1741fb = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb) kz5.n0.Z(arrayList3);
        if (wlVar != null) {
            r45.tj6 tj6Var = wlVar.D;
            boolean z18 = false;
            if (tj6Var != null && tj6Var.f468041d) {
                z18 = true;
            }
            if (z18 && c16902xea1741fb == null) {
                arrayList.add(new sr3.e(h(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 1));
            }
        }
        boolean z19 = !arrayList.isEmpty();
        kz5.q0 q0Var = kz5.q0.f395534d;
        return new sr3.d(arrayList, arrayList2, q0Var, q0Var, z19);
    }

    @Override // sr3.g
    public java.util.List e(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl wlVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        r45.gl glVar;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = false;
        int intExtra = context.getIntent().getIntExtra("biz_profile_tab_type", 0);
        if (intExtra > 1) {
            intExtra = 0;
        }
        if (intExtra == 1) {
            if (((wlVar == null || (glVar = wlVar.f470770h) == null || (linkedList = glVar.f456856d) == null || !linkedList.isEmpty()) ? false : true) && wlVar.f470779t != 1) {
                return arrayList;
            }
        }
        if (wlVar != null) {
            r45.tj6 tj6Var = wlVar.D;
            if (tj6Var != null && tj6Var.f468041d) {
                z18 = true;
            }
            if (z18) {
                arrayList.add(new sr3.e(h(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 1));
            }
        }
        return arrayList;
    }

    @Override // sr3.g
    public sr3.f f(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String string;
        android.content.res.Resources resources;
        java.lang.String string2;
        android.content.res.Resources resources2;
        android.content.res.Resources resources3;
        java.lang.String str;
        java.lang.String str2;
        android.content.res.Resources resources4;
        java.lang.String string3;
        android.content.res.Resources resources5;
        android.content.res.Resources resources6;
        android.content.Context context2 = context == null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) this.f493395e.get() : context;
        sr3.f fVar = this.f493396f;
        if (fVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            return fVar;
        }
        java.lang.String str3 = null;
        if (context2 == null || (resources6 = context2.getResources()) == null || (string = resources6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572626nf3)) == null) {
            string = (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572626nf3);
        }
        if (context2 == null || (resources5 = context2.getResources()) == null || (string2 = resources5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bca)) == null) {
            string2 = (context2 == null || (resources2 = context2.getResources()) == null) ? null : resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bca);
        }
        if (context2 != null && (resources4 = context2.getResources()) != null && (string3 = resources4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcc)) != null) {
            str3 = string3;
        } else if (context2 != null && (resources3 = context2.getResources()) != null) {
            str3 = resources3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcc);
        }
        java.lang.String str4 = string == null ? "" : string;
        java.lang.String str5 = string2 == null ? "" : string2;
        java.lang.String str6 = str3 == null ? "" : str3;
        sr3.f fVar2 = this.f493394d;
        sr3.f fVar3 = new sr3.f(str4, str5, str6, (fVar2 == null || (str2 = fVar2.f493384d) == null) ? "" : str2, (fVar2 == null || (str = fVar2.f493385e) == null) ? "" : str, false, false, false, false, fVar2 != null && fVar2.f493390j);
        this.f493396f = fVar3;
        return fVar3;
    }

    @Override // sr3.g
    public sr3.a g() {
        return sr3.a.f493363f;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb h(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, r45.wl bizProfileResp, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizProfileResp, "bizProfileResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb c16902xea1741fb = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16902xea1741fb(this.f493391a, i17, this);
        c16902xea1741fb.f235946f = new r45.wl();
        c16902xea1741fb.m0().D = bizProfileResp.D;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        c16902xea1741fb.mo7562xe26dab14(bundle);
        c16902xea1741fb.B0(dataFetcher);
        c16902xea1741fb.f235963t = this.f493392b;
        c16902xea1741fb.f235948h = m0Var;
        c16902xea1741fb.f235964u = z17;
        return c16902xea1741fb;
    }
}
