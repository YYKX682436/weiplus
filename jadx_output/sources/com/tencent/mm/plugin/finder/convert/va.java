package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class va extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(in5.s0 s0Var) {
        super(0);
        this.f104775d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f104775d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((fd2.j) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(fd2.j.class)) != null) {
            ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i).getFeedTipsStatus().f477475a.f477443c = true;
            com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "onFeedTouchEvent happen");
        }
        return jz5.f0.f302826a;
    }
}
