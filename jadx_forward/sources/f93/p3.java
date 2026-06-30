package f93;

/* loaded from: classes11.dex */
public class p3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f341957a;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384, java.lang.Runnable runnable) {
        this.f341957a = runnable;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "showTextToast, has shown tip");
        java.lang.Runnable runnable = this.f341957a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
