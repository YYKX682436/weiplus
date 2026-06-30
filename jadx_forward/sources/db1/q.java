package db1;

/* loaded from: classes9.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db1.u f309403d;

    public q(db1.u uVar) {
        this.f309403d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db1.u uVar = this.f309403d;
        uVar.f309412i.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, uVar.f309409f));
    }
}
