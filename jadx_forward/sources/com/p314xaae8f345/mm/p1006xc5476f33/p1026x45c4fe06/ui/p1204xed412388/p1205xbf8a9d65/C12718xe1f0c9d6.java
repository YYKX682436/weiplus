package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "bk1/d", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage */
/* loaded from: classes4.dex */
public final class C12718xe1f0c9d6 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

    /* renamed from: e, reason: collision with root package name */
    public static final bk1.d f171461e = new bk1.d(null);

    /* renamed from: d, reason: collision with root package name */
    public bk1.a f171462d;

    public C12718xe1f0c9d6() {
        super(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569607g5;
    }

    public final bk1.y l0(bk1.y yVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Iterator it = yVar.f102893b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("scope.userLocationBackground", ((r45.xf7) obj2).f471589d)) {
                break;
            }
        }
        r45.xf7 xf7Var = (r45.xf7) obj2;
        if (xf7Var == null) {
            return yVar;
        }
        java.util.List list = yVar.f102893b;
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("scope.userLocation", ((r45.xf7) next).f471589d)) {
                obj = next;
                break;
            }
        }
        if (!(obj != null)) {
            return yVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterDuplicateBackgroundScope, both background and backgroundLocation are authorized for ");
        k91.v5 v5Var = yVar.f102892a;
        sb6.append(v5Var.f68924xdec927b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.remove(xf7Var);
        return new bk1.y(v5Var, arrayList, yVar.f102894c);
    }

    public final java.util.List m0(bk1.f0 f0Var) {
        java.util.List list = f0Var.f102835b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l0((bk1.y) it.next()));
        }
        return arrayList;
    }

    public final void n0(bk1.a aVar) {
        if (this.f171462d == aVar) {
            return;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "showActionbarDefault");
            mo78695xbf7c1df6("");
            ak1.f.b(this);
            ak1.f.e(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "showActionbarWithTitle");
            mo78694xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572193a46);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = ak1.f.a(this);
            if (a17 != null) {
                a17.m78599xdf056fb4();
            }
            ak1.f.e(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        }
        this.f171462d = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        mo78682x9c8c0d33(new bk1.e(this));
        n0(bk1.a.f102817d);
        ak1.f.f(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.cgs);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = mo26077x4ff8c0f0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) mo26077x4ff8c0f0 : null;
        if (c12808x5de4409f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyManagePage", "initContentArea, authInfoContentArea is null");
            mo78641xb4098c93();
            return;
        }
        int f17 = i65.a.f(ak1.f.d(this), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        c12808x5de4409f.setPadding(f17, 0, f17, 0);
        android.view.View inflate = m7449xacd3518b().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569606g4, (android.view.ViewGroup) c12808x5de4409f, false);
        android.view.ViewGroup viewGroup = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyManagePage", "initContentArea, headerView is null");
            mo78641xb4098c93();
            return;
        }
        viewGroup.post(new bk1.g(viewGroup, this, c12808x5de4409f));
        c12808x5de4409f.m53684x77114253(viewGroup);
        ak1.a aVar = new ak1.a(c12808x5de4409f, com.p314xaae8f345.mm.R.C30867xcad56011.f572191a44);
        c12808x5de4409f.m53682x626a4c3f(aVar.f87096d);
        c12808x5de4409f.m1(false);
        zk1.m.f554947l.a(c12808x5de4409f, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        bk1.w wVar = new bk1.w();
        c12808x5de4409f.mo7960x6cab2c8d(wVar);
        c12808x5de4409f.m53687xa1aeda28(new bk1.h(wVar, this));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        c12808x5de4409f.m53683x6891e372(new bk1.j(aVar, this, h0Var, wVar));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(ak1.f.d(this), null, null, true, false, null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = ak1.f.a(this);
        if (a17 != null) {
            a17.mo46316x322b85(new bk1.k(Q));
        }
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(this), null, null, new bk1.l(Q, viewGroup, aVar, h0Var, wVar, this, c12808x5de4409f, null), 3, null);
    }
}
