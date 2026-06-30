package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f106519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f106520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106521i;

    public cz(com.tencent.mm.plugin.finder.feed.pz pzVar, int i17, int i18, int i19, int i27, java.lang.String str) {
        this.f106516d = pzVar;
        this.f106517e = i17;
        this.f106518f = i18;
        this.f106519g = i19;
        this.f106520h = i27;
        this.f106521i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106516d;
        com.tencent.mars.xlog.Log.i(pzVar.U, "notifyChanged,msgNotifyData");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar.f108756h;
        if (finderHomeTabFragment != null) {
            int i17 = this.f106517e;
            so2.t tVar = pzVar.f108763p0;
            tVar.f410598d = i17;
            tVar.f410600f = this.f106518f;
            tVar.f410601g = this.f106519g;
            tVar.f410599e = this.f106520h;
            java.lang.String str = this.f106521i;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            tVar.f410602h = str;
            ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
        }
    }
}
