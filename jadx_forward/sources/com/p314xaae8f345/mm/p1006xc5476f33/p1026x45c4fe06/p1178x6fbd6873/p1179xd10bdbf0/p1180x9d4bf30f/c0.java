package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class c0 extends ik1.a {
    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int hashCode = activity.hashCode();
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0.f169112g;
        synchronized (sparseArray) {
            sparseArray.remove(hashCode);
        }
    }
}
