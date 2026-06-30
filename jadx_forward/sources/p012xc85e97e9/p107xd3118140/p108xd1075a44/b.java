package p012xc85e97e9.p107xd3118140.p108xd1075a44;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f93883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 f93884e;

    public b(p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960, android.view.View view) {
        this.f93884e = c1168xfe0c8960;
        this.f93883d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f93883d;
        android.view.ViewParent parent = view.getParent();
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93884e;
        if (parent == c1168xfe0c8960) {
            view.setLayerType(0, null);
            c1168xfe0c8960.getClass();
            android.graphics.Paint paint = ((p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams()).f93879d;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.v0.i(view, paint);
        }
        c1168xfe0c8960.f93874y.remove(this);
    }
}
