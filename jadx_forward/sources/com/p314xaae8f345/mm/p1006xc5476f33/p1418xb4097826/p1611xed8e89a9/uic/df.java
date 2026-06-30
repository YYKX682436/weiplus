package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class df implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f205162e;

    public df(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff) {
        this.f205161d = c14900x9bf524dd;
        this.f205162e = c2718xca2902ff;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        if (iVar == null || !(iVar.f425311a instanceof zx2.i)) {
            return;
        }
        zx2.z e76 = this.f205161d.e7();
        android.content.Context context = this.f205162e.getContext();
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205161d;
            zx2.z e76 = c14900x9bf524dd.e7();
            android.content.Context context = this.f205162e.getContext();
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
            int indexOf = c14900x9bf524dd.f7().indexOf((zx2.i) obj3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
            if (indexOf != -1) {
                c14900x9bf524dd.u7(indexOf);
            }
        }
    }
}
