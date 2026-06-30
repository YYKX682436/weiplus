package i53;

/* loaded from: classes.dex */
public class t1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f370269d;

    public t1(i53.a2 a2Var) {
        this.f370269d = a2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        i53.a2 a2Var = this.f370269d;
        a2Var.f370038p.dismiss();
        a2Var.c();
        android.view.View view = a2Var.f370031f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }
}
