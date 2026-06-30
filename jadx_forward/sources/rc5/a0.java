package rc5;

/* loaded from: classes.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf f475680d;

    public a0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf c21808xf12b2fdf) {
        this.f475680d = c21808xf12b2fdf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf c21808xf12b2fdf = this.f475680d;
        c21808xf12b2fdf.m158359x1e885992().setClass(c21808xf12b2fdf.m80379x76847179(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        android.app.Activity m80379x76847179 = c21808xf12b2fdf.m80379x76847179();
        android.content.Intent m158359x1e885992 = c21808xf12b2fdf.m158359x1e885992();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m158359x1e885992);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m80379x76847179, arrayList.toArray(), "com/tencent/mm/ui/chatting/half/NotificationHalfScreenChattingUIC$getMenuItemClickListener$1$onRealClick$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m80379x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m80379x76847179, "com/tencent/mm/ui/chatting/half/NotificationHalfScreenChattingUIC$getMenuItemClickListener$1$onRealClick$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
