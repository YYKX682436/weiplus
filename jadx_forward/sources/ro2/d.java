package ro2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f479568e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.animation.AnimatorSet animatorSet) {
        this.f479567d = qeVar;
        this.f479568e = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479567d;
        android.animation.AnimatorSet animatorSet = this.f479568e;
        qeVar.f185899q = animatorSet;
        animatorSet.addListener(new ro2.c(qeVar, qeVar));
        animatorSet.start();
    }
}
