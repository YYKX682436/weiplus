package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f105009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f105010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f105012g;

    public yd(boolean[] zArr, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f105009d = zArr;
        this.f105010e = qeVar;
        this.f105011f = s0Var;
        this.f105012g = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f105009d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_fav", "<FeedFav>");
            sVar.H2("ce_feed_fav", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_fav");
        }
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f105010e;
        boolean d07 = qeVar.f104358f.d0();
        in5.s0 s0Var = this.f105011f;
        if (!d07) {
            qeVar.N(s0Var, null, 0);
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[onClickStar]: " + s0Var.getAdapterPosition() + " feedId:" + pm0.v.u(this.f105012g.getItemId()) + " isSelfScene:" + qeVar.f104358f.d0());
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.q0().r()).intValue() != 1) {
            qeVar.E(s0Var, false);
        }
        d92.s sVar2 = d92.k0.f227486e;
        kotlin.jvm.internal.o.d(view);
        view.announceForAccessibility(sVar2.d(view, true));
        view.setContentDescription(sVar2.d(view, false));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
