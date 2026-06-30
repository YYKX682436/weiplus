package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class w70 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 f217843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f217844e;

    public w70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 abstractC15479x2de36860, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff) {
        this.f217843d = abstractC15479x2de36860;
        this.f217844e = c2718xca2902ff;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        if (iVar == null || !(iVar.f425311a instanceof zx2.i)) {
            return;
        }
        zx2.z e76 = this.f217843d.e7();
        android.content.Context context = this.f217844e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object obj = iVar.f425311a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        e76.b(context, (zx2.i) obj);
        java.lang.Object obj2 = iVar.f425311a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        android.view.View view = iVar.f425316f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((zx2.i) obj2).d(false, (android.view.ViewGroup) view);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 abstractC15479x2de36860 = this.f217843d;
            zx2.z e76 = abstractC15479x2de36860.e7();
            android.content.Context context = this.f217844e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.Object obj = iVar.f425311a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            e76.a(context, (zx2.i) obj);
            java.lang.Object obj2 = iVar.f425311a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            android.view.View view = iVar.f425316f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((zx2.i) obj2).d(true, (android.view.ViewGroup) view);
            java.lang.Object obj3 = iVar.f425311a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            int indexOf = abstractC15479x2de36860.f7().indexOf((zx2.i) obj3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
            if (indexOf == -1) {
                indexOf = 0;
            }
            abstractC15479x2de36860.u7(indexOf);
        }
    }
}
