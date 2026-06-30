package db5;

/* loaded from: classes11.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s6 f310000e;

    public p6(db5.s6 s6Var, android.view.View view) {
        this.f310000e = s6Var;
        this.f309999d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f310000e.f310039d.C.h(((android.widget.TextView) this.f309999d).getText().toString());
    }
}
