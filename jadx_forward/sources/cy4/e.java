package cy4;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f306399a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f306400b;

    /* renamed from: c, reason: collision with root package name */
    public int f306401c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f306402d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f306403e;

    /* renamed from: f, reason: collision with root package name */
    public int f306404f;

    /* renamed from: g, reason: collision with root package name */
    public int f306405g;

    /* renamed from: h, reason: collision with root package name */
    public int f306406h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f306407i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f306408j = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public boolean f306409k = false;

    public e(android.content.Context context) {
        this.f306399a = context;
    }

    public boolean a(boolean z17) {
        if (this.f306400b == null) {
            return false;
        }
        android.content.Context context = this.f306399a;
        if (!(context instanceof android.app.Activity)) {
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (!z17 && (activity == null || activity.isFinishing() || activity.isDestroyed())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFullscreenImpl", "exitFullscreen activity(%s) destroyed", activity);
            return false;
        }
        ((android.view.ViewGroup) activity.getWindow().getDecorView()).setSystemUiVisibility(this.f306404f);
        activity.getWindow().clearFlags(1024);
        if (this.f306407i != null) {
            activity.getWindow().setAttributes(this.f306407i);
        }
        activity.setRequestedOrientation(this.f306406h);
        if (this.f306403e != null) {
            if (this.f306400b.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f306400b.getParent()).removeView(this.f306400b);
            }
            this.f306403e.addView(this.f306400b, this.f306401c, this.f306402d);
            this.f306400b.setBackgroundColor(this.f306405g);
        }
        this.f306400b = null;
        qp1.h0.b();
        java.util.Iterator it = this.f306408j.iterator();
        while (it.hasNext()) {
            ((cy4.f) it.next()).b();
        }
        return true;
    }
}
