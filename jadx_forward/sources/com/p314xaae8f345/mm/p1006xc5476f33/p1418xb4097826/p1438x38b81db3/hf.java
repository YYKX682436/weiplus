package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class hf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f185115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f185116g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(android.view.View view, in5.s0 s0Var, so2.h1 h1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar) {
        super(2);
        this.f185113d = view;
        this.f185114e = s0Var;
        this.f185115f = h1Var;
        this.f185116g = zfVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view;
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.nw1 m59258xd0557130 = this.f185115f.getFeedObject().m59258xd0557130();
            if ((m59258xd0557130 != null ? m59258xd0557130.m75939xb282bd08(2) : 2) == 1 && !this.f185116g.V1(this.f185115f) && (view = this.f185113d) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView = (android.widget.ImageView) this.f185114e.p(com.p314xaae8f345.mm.R.id.eqi);
            if (imageView != null) {
                imageView.animate().cancel();
                imageView.setVisibility(0);
            }
        } else {
            android.view.View view2 = this.f185113d;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$convertMedia$1$1", "invoke", "(ZLcom/tencent/mm/plugin/finder/video/FinderVideoLayout$PlayInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) this.f185114e.p(com.p314xaae8f345.mm.R.id.eqi);
            if (imageView2 != null && imageView2.getVisibility() != 8) {
                java.lang.Object tag = imageView2.getTag();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85010k).mo141623x754a37bb()).r()).intValue() == 1) {
                        imageView2.setAlpha(0.0f);
                    } else {
                        imageView2.setAlpha(1.0f);
                        imageView2.animate().cancel();
                        imageView2.setTag(bool);
                        imageView2.animate().setStartDelay(300L).setDuration(300L).alpha(0.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gf(imageView2)).start();
                    }
                }
            }
            android.widget.ImageView imageView3 = (android.widget.ImageView) this.f185114e.p(com.p314xaae8f345.mm.R.id.o77);
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f185116g;
        android.content.Context context = this.f185114e.o().getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.view.Window window = activity != null ? activity.getWindow() : null;
        r45.nw1 m59258xd05571302 = this.f185115f.getFeedObject().m59258xd0557130();
        boolean z17 = zfVar.C1;
        cm2.a aVar = cm2.a.f124861a;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToLockScreenRecord window:");
            sb6.append(window != null ? window.hashCode() : 0);
            sb6.append(",liveInfo:");
            sb6.append(aVar.y(m59258xd05571302));
            sb6.append(", have lock!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        } else {
            zfVar.C1 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.P4).mo141623x754a37bb()).r()).intValue() == 1 && ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(m59258xd05571302);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryToLockScreenRecord:");
            sb7.append(zfVar.C1);
            sb7.append(",window:");
            sb7.append(window != null ? window.hashCode() : 0);
            sb7.append(",liveInfo:");
            sb7.append(aVar.y(m59258xd05571302));
            sb7.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb7.toString());
            if (zfVar.C1 && window != null) {
                window.setFlags(8192, 8192);
            }
        }
        return jz5.f0.f384359a;
    }
}
