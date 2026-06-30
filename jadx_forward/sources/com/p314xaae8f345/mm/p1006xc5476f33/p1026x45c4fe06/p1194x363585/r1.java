package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f170712a = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context] */
    public static final void a(android.app.Activity activity, yz5.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12603x3a33acc3 c12603x3a33acc3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12603x3a33acc3(task.hashCode());
        f170712a.put(java.lang.Integer.valueOf(task.hashCode()), task);
        android.app.Activity activity2 = activity;
        if (activity == null) {
            activity2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(activity2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12603x3a33acc3, null, null);
    }
}
