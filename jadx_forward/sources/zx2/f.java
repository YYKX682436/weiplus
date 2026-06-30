package zx2;

/* loaded from: classes2.dex */
public final class f implements zx2.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zx2.h f558569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 f558570b;

    public f(zx2.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79) {
        this.f558569a = hVar;
        this.f558570b = c15436x4c00d79;
    }

    @Override // zx2.o
    public void a(zx2.u uVar) {
        if (uVar != null) {
            zx2.h hVar = this.f558569a;
            zx2.z e76 = hVar.e7();
            android.content.Context context = this.f558570b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.Object obj = uVar.f558614a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            e76.a(context, (zx2.i) obj);
            java.lang.Object obj2 = uVar.f558614a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            android.view.View view = uVar.f558619f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((zx2.i) obj2).d(true, (android.view.ViewGroup) view);
            java.lang.Object obj3 = uVar.f558614a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            int indexOf = hVar.f7().indexOf((zx2.i) obj3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
            if (indexOf == -1) {
                indexOf = 0;
            }
            hVar.u7(indexOf);
        }
    }

    @Override // zx2.o
    public void b(zx2.u uVar) {
        if (uVar == null || !(uVar.f558614a instanceof zx2.i)) {
            return;
        }
        zx2.z e76 = this.f558569a.e7();
        android.content.Context context = this.f558570b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object obj = uVar.f558614a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        e76.b(context, (zx2.i) obj);
        java.lang.Object obj2 = uVar.f558614a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        android.view.View view = uVar.f558619f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((zx2.i) obj2).d(false, (android.view.ViewGroup) view);
    }

    @Override // zx2.o
    public void c(zx2.u uVar) {
    }
}
