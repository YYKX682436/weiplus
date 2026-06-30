package al5;

/* loaded from: classes15.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.SwipeBackLayout f5881d;

    public d3(com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout) {
        this.f5881d = swipeBackLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.ui.widget.SwipeBackLayout.f211425J;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f5881d;
        android.content.Context context = swipeBackLayout.getContext();
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SwipeBackLayout", "Reset translucent status failed");
        } else if (swipeBackLayout.f211439t) {
            swipeBackLayout.setNeedRequestActivityTranslucent(true);
            swipeBackLayout.d(false);
            db5.f.b((android.app.Activity) context);
            com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "Reset translucent status");
        }
    }
}
