package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.uj f104398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.uj ujVar) {
        super(0);
        this.f104397d = s0Var;
        this.f104398e = ujVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f104397d.f293121e;
        final com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity != null) {
            final com.tencent.mm.plugin.finder.convert.uj ujVar = this.f104398e;
            ujVar.o(mMFragmentActivity);
            td2.c cVar = new td2.c() { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedProductConvert$bindLifeCycle$1
                @Override // td2.c
                public void onCreate(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }

                @Override // td2.c
                public void onDestroy(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                    com.tencent.mm.plugin.finder.convert.uj ujVar2 = com.tencent.mm.plugin.finder.convert.uj.this;
                    com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
                    ujVar2.o(mMFragmentActivity2);
                    com.tencent.mars.xlog.Log.i(ujVar2.f104709e, "auto life remove " + mMFragmentActivity2);
                }

                @Override // td2.c
                public void onPause(androidx.lifecycle.y var1) {
                    android.view.ViewGroup viewGroup;
                    kotlin.jvm.internal.o.g(var1, "var1");
                    com.tencent.mm.plugin.finder.convert.uj ujVar2 = com.tencent.mm.plugin.finder.convert.uj.this;
                    com.tencent.mars.xlog.Log.i(ujVar2.f104709e, "onPause life " + mMFragmentActivity);
                    in5.s0 s0Var = ujVar2.f104710f;
                    java.lang.Object childAt = (s0Var == null || (viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484355ta0)) == null) ? null : viewGroup.getChildAt(0);
                    k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
                    if (hVar != null) {
                        hVar.onPause();
                    }
                }

                @Override // td2.c
                public void onResume(androidx.lifecycle.y var1) {
                    android.view.ViewGroup viewGroup;
                    kotlin.jvm.internal.o.g(var1, "var1");
                    com.tencent.mm.plugin.finder.convert.uj ujVar2 = com.tencent.mm.plugin.finder.convert.uj.this;
                    com.tencent.mars.xlog.Log.i(ujVar2.f104709e, "onResume life " + mMFragmentActivity);
                    in5.s0 s0Var = ujVar2.f104710f;
                    java.lang.Object childAt = (s0Var == null || (viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484355ta0)) == null) ? null : viewGroup.getChildAt(0);
                    k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
                    if (hVar != null) {
                        hVar.onResume();
                    }
                }

                @Override // td2.c
                public void onStart(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }

                @Override // td2.c
                public void onStop(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }
            };
            ujVar.f104713i = cVar;
            mMFragmentActivity.mo133getLifecycle().a(cVar);
        }
        return jz5.f0.f302826a;
    }
}
