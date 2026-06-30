package db5;

/* loaded from: classes11.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f310012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s6 f310013e;

    public q6(db5.s6 s6Var, android.view.View view) {
        this.f310013e = s6Var;
        this.f310012d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f310013e.f310039d.C.f(((android.widget.TextView) this.f310012d).getText().toString());
    }
}
