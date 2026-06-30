package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class d9 extends ze.m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l5 {
    static {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a9 a9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a9();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(a9Var);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40963x40b15f2e(a9Var);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(a9Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(android.content.Context context) {
        super(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6) context : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(context), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public void E() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f165759m);
        linkedList.addAll(((java.util.HashMap) this.f165760n).values());
        java.util.Iterator it = linkedList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "traverseAll(...)");
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            ze.n nVar = (ze.n) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f1.a(this, nVar) && nVar.J0() && !nVar.L0() && !nVar.S) {
                java.lang.Class[] EXCLUDE_PERSISTENT_RUNTIME_CLASS = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.D;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EXCLUDE_PERSISTENT_RUNTIME_CLASS, "EXCLUDE_PERSISTENT_RUNTIME_CLASS");
                if (!kz5.z.G(EXCLUDE_PERSISTENT_RUNTIME_CLASS, nVar.getClass())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
                    android.view.ViewParent parent = o6Var.f156343s.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(o6Var.f156343s);
                    }
                    p(nVar);
                    o6Var.g3(false);
                    o6Var.o3(o6Var.u0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s8.Stash);
                    if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() && !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8() && !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8()) {
                        z17 = false;
                    }
                    if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        o6Var.K2();
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v1.c(o6Var);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchPause tid[%d], mDestroyed[%b]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(this.f165755f));
        this.f165754e = false;
        this.f165755f = true;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(this.f165759m);
        linkedList2.addAll(((java.util.HashMap) this.f165760n).values());
        u();
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it6.next();
            c11510xdd90c2f2.f156350x1 = false;
            r(c11510xdd90c2f2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "performDestroy done");
    }

    public void G(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f165759m);
        linkedList.addAll(((java.util.HashMap) this.f165760n).values());
        java.util.Iterator it = linkedList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "traverseAll(...)");
        while (it.hasNext()) {
            ze.n nVar = (ze.n) it.next();
            nVar.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b9(nVar, str, jSONObject));
        }
    }

    public void H(l81.b1 bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        java.lang.String str = bundle.f398545a;
        bundle.f398545a = str != null ? r26.n0.u0(str).toString() : null;
        java.lang.String str2 = bundle.f398547b;
        java.lang.String obj = str2 != null ? r26.n0.u0(str2).toString() : null;
        bundle.f398547b = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5 g5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a;
        if (g5Var.d(obj)) {
            bundle.f398549c = 1;
        }
        if (g5Var.e()) {
            bundle.f398549c = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc g17 = g5Var.g(bundle);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092(getContext(), g17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c9(g17, this)).H(true).I();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l5
    /* renamed from: getView */
    public android.view.View mo50154xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public android.content.Context h() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6) context).getBaseContext());
    }

    @Override // android.view.View
    public java.lang.String toString() {
        android.content.Context a17 = q75.a.a(getContext());
        if (a17 == null) {
            a17 = getContext();
        }
        return "AppBrandRuntimeWidgetImpl@" + hashCode() + '(' + a17 + ')';
    }
}
