package lt3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final lt3.e f402742a = new lt3.e();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f402743b = new android.util.SparseArray();

    public final void a(int i17, java.lang.String taskId, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.BgMixManager", "notifyFinish, taskId:" + taskId + ", success:" + z17 + ", model:" + c16991x15ced046);
        ((ku5.t0) ku5.t0.f394148d).h(new lt3.a(i17, taskId, z17, c16991x15ced046), "BgMixManager_notifyFinish");
    }

    public final void b(int i17, java.lang.String taskId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.BgMixManager", "notifyInit, taskId:".concat(taskId));
        ((ku5.t0) ku5.t0.f394148d).h(new lt3.b(i17, taskId), "BgMixManager_notifyInit");
    }

    public final void c(int i17, lt3.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.util.SparseArray sparseArray = f402743b;
        java.util.Set set = (java.util.Set) sparseArray.get(i17);
        if (set != null) {
            set.remove(callback);
        }
        boolean z17 = false;
        if (set != null && set.isEmpty()) {
            z17 = true;
        }
        if (z17) {
            sparseArray.remove(i17);
        }
    }
}
