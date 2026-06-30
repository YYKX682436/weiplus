package qd1;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f443205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.w f443206e;

    public q(qd1.w wVar, android.view.View view) {
        this.f443206e = wVar;
        this.f443205d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f443205d.announceForAccessibility(this.f443206e.f443218i);
    }
}
