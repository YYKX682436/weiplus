package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2 */
/* loaded from: classes2.dex */
public final class C14659xa3330825 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter f204190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14659xa3330825(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter likedTimelinePresenter) {
        super(0);
        this.f204190d = likedTimelinePresenter;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View f294968x;
        android.view.View f294968x2;
        android.view.View f294968x3;
        android.widget.TextView textView;
        android.view.View f294968x4;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter likedTimelinePresenter = this.f204190d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter.f204185p;
        if (likedTimelineViewCallback != null && (f294968x4 = likedTimelineViewCallback.a().getF294968x()) != null && (textView2 = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelineViewCallback likedTimelineViewCallback2 = likedTimelinePresenter.f204185p;
        if (likedTimelineViewCallback2 != null && (f294968x3 = likedTimelineViewCallback2.a().getF294968x()) != null && (textView = (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelineViewCallback likedTimelineViewCallback3 = likedTimelinePresenter.f204185p;
        android.view.View view = null;
        android.widget.TextView textView3 = (likedTimelineViewCallback3 == null || (f294968x2 = likedTimelineViewCallback3.a().getF294968x()) == null) ? null : (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelineViewCallback likedTimelineViewCallback4 = likedTimelinePresenter.f204185p;
        if (likedTimelineViewCallback4 != null && (f294968x = likedTimelineViewCallback4.a().getF294968x()) != null) {
            view = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ilg);
        }
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
