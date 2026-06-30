package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hf extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f103582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103583g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(android.view.View view, in5.s0 s0Var, so2.h1 h1Var, com.tencent.mm.plugin.finder.convert.zf zfVar) {
        super(2);
        this.f103580d = view;
        this.f103581e = s0Var;
        this.f103582f = h1Var;
        this.f103583g = zfVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view;
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.nw1 liveInfo = this.f103582f.getFeedObject().getLiveInfo();
            if ((liveInfo != null ? liveInfo.getInteger(2) : 2) == 1 && !this.f103583g.V1(this.f103582f) && (view = this.f103580d) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView = (android.widget.ImageView) this.f103581e.p(com.tencent.mm.R.id.eqi);
            if (imageView != null) {
                imageView.animate().cancel();
                imageView.setVisibility(0);
            }
        } else {
            android.view.View view2 = this.f103580d;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) this.f103581e.p(com.tencent.mm.R.id.eqi);
            if (imageView2 != null && imageView2.getVisibility() != 8) {
                java.lang.Object tag = imageView2.getTag();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!kotlin.jvm.internal.o.b(tag, bool)) {
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3477k).getValue()).r()).intValue() == 1) {
                        imageView2.setAlpha(0.0f);
                    } else {
                        imageView2.setAlpha(1.0f);
                        imageView2.animate().cancel();
                        imageView2.setTag(bool);
                        imageView2.animate().setStartDelay(300L).setDuration(300L).alpha(0.0f).setListener(new com.tencent.mm.plugin.finder.convert.gf(imageView2)).start();
                    }
                }
            }
            android.widget.ImageView imageView3 = (android.widget.ImageView) this.f103581e.p(com.tencent.mm.R.id.o77);
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f103583g;
        android.content.Context context = this.f103581e.o().getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.view.Window window = activity != null ? activity.getWindow() : null;
        r45.nw1 liveInfo2 = this.f103582f.getFeedObject().getLiveInfo();
        boolean z17 = zfVar.C1;
        cm2.a aVar = cm2.a.f43328a;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToLockScreenRecord window:");
            sb6.append(window != null ? window.hashCode() : 0);
            sb6.append(",liveInfo:");
            sb6.append(aVar.y(liveInfo2));
            sb6.append(", have lock!");
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        } else {
            zfVar.C1 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.P4).getValue()).r()).intValue() == 1 && ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(liveInfo2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryToLockScreenRecord:");
            sb7.append(zfVar.C1);
            sb7.append(",window:");
            sb7.append(window != null ? window.hashCode() : 0);
            sb7.append(",liveInfo:");
            sb7.append(aVar.y(liveInfo2));
            sb7.append('!');
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb7.toString());
            if (zfVar.C1 && window != null) {
                window.setFlags(8192, 8192);
            }
        }
        return jz5.f0.f302826a;
    }
}
