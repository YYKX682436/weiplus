package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ln implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f194950d;

    public ln(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar) {
        this.f194950d = apVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object obj = it.obj;
        android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f194950d.C).get(viewGroup);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preciousGiftBulletOutHandler: container:");
        sb6.append(viewGroup);
        sb6.append(", animator.isRunning:");
        sb6.append(valueAnimator != null ? java.lang.Boolean.valueOf(valueAnimator.isRunning()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return true;
        }
        valueAnimator.start();
        return true;
    }
}
