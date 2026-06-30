package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f91081d;

    public d1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f1 f1Var) {
        this.f91081d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewParent parent = this.f91081d.f91112g.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
