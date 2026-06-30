package rp1;

/* loaded from: classes14.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f479928d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0) {
        this.f479928d = c12929x567537a0;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479928d;
        c12929x567537a0.f175074m2 = true;
        android.os.Vibrator vibrator = c12929x567537a0.f175067i;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) c12929x567537a0.f175079p).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).e();
        }
    }
}
