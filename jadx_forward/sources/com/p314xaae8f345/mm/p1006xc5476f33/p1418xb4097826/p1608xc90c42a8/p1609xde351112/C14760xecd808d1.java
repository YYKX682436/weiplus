package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$showImageStatus$1 */
/* loaded from: classes.dex */
final class C14760xecd808d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f204472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f204473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204475g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14760xecd808d1(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        super(0);
        this.f204472d = z17;
        this.f204473e = viewGroup;
        this.f204474f = view;
        this.f204475g = view2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f204472d;
        android.view.ViewGroup viewGroup = this.f204473e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f204474f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f204475g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$showImageStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
