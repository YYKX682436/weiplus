package zl1;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f555136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555137e;

    public p(zl1.t tVar, android.animation.ObjectAnimator objectAnimator) {
        this.f555137e = tVar;
        this.f555136d = objectAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.t tVar = this.f555137e;
        tVar.setVisibility(0);
        zl1.o oVar = new zl1.o(this);
        int i17 = zl1.t.f555147q;
        tVar.a();
        java.util.LinkedList linkedList = tVar.f555157p;
        android.animation.ObjectAnimator objectAnimator = this.f555136d;
        linkedList.add(objectAnimator);
        objectAnimator.addListener(new zl1.a(tVar, oVar, objectAnimator));
        objectAnimator.start();
    }
}
