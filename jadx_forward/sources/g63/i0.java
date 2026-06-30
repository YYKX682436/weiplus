package g63;

/* loaded from: classes.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 f350658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 activityC16045xfe36c025) {
        super(0);
        this.f350658d = activityC16045xfe36c025;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16047x8b5fe36e c16047x8b5fe36e = this.f350658d.f223526i;
        if (c16047x8b5fe36e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingCoverView");
            throw null;
        }
        android.view.View view = c16047x8b5fe36e.f223529d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = c16047x8b5fe36e.f223530e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
