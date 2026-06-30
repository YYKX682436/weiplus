package com.tencent.mm.plugin.finder.convert;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindLifeCycle$2", "Ltd2/c;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedPlaceHolderConvert$bindLifeCycle$2 implements td2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f102835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f102836e;

    public FinderFeedPlaceHolderConvert$bindLifeCycle$2(com.tencent.mm.plugin.finder.convert.oj ojVar, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        this.f102835d = ojVar;
        this.f102836e = mMFragmentActivity;
    }

    @Override // td2.c
    public void onCreate(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }

    @Override // td2.c
    public void onDestroy(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f102835d;
        com.tencent.mm.plugin.finder.view.ka kaVar = ojVar.F;
        if (kaVar != null) {
            com.tencent.mm.ui.MMActivity activity = ojVar.f104184f.getF122643d();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.remove(kaVar);
        }
        ojVar.A();
        td2.c cVar = ojVar.E;
        if (cVar != null) {
            java.lang.String str = ojVar.f104186h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto life remove ");
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f102836e;
            sb6.append(mMFragmentActivity);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            mMFragmentActivity.mo133getLifecycle().c(cVar);
            ojVar.E = null;
        }
    }

    @Override // td2.c
    public void onPause(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f102835d;
        com.tencent.mars.xlog.Log.i(ojVar.f104186h, "onPause life " + this.f102836e);
        cw2.da daVar = ojVar.C;
        if (daVar != null) {
            daVar.pause();
        }
    }

    @Override // td2.c
    public void onResume(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f102835d;
        com.tencent.mars.xlog.Log.i(ojVar.f104186h, "onResume life " + this.f102836e);
        ojVar.s("onActivityResume");
    }

    @Override // td2.c
    public void onStart(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }

    @Override // td2.c
    public void onStop(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }
}
