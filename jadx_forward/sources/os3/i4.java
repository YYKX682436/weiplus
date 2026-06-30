package os3;

/* loaded from: classes.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429642d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429642d = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429642d;
        android.content.Intent launchIntentForPackage = viewOnCreateContextMenuListenerC16941x4db497e1.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("curPageId", 2);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String string = viewOnCreateContextMenuListenerC16941x4db497e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.azq);
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(viewOnCreateContextMenuListenerC16941x4db497e1, launchIntentForPackage, string, null, null);
    }
}
