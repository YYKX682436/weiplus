package com.tencent.matrix.hook.junwind;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0018\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002%&J\t\u0010\u0003\u001a\u00020\u0002H\u0087 J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0087 J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0087 J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0002H\u0087 J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0087 J\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0087 J\u0011\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0087 J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0087 J\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0087 J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0087 J\u0011\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0087 J\u0019\u0010\u001a\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0087 J\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\b\u001a\u00020\u0002H\u0087 J\u001b\u0010\u001e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0087 J\t\u0010\u001f\u001a\u00020\u0002H\u0087 J\u0011\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0087 J\t\u0010\"\u001a\u00020\u0002H\u0087 J\u0019\u0010#\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0087 J\t\u0010$\u001a\u00020\u0002H\u0087 ¨\u0006'"}, d2 = {"Lcom/tencent/matrix/hook/junwind/PthreadHackJni;", "", "", "nativeLoadThreadListLock", "", "lock", "Ljz5/f0;", "nativeLockThreadList", "tid", "", "nativeGetPthreadHandle", "", "Lcom/tencent/matrix/hook/junwind/PthreadHackJni$PthreadInfo;", "nativeListPthread", "nativeGetPthreadInfo", "pthreadHandle", "policy", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, "nativeSetPthreadPriority", "nativeGetTidSchedPolicy", "nativeGetTidSchedPriority", "nativeGetSchedPriorityMin", "nativeGetSchedPriorityMax", "nativeSetTidSchedPolicy", "nativeGetTidNice", "nice", "nativeSetTidNice", "", "nativeGetTidAffinity", "cpuCores", "nativeSetTidAffinity", "nativeGetErrno", "error", "nativeSetErrno", "nativeGetCpuCore", "nativeTestCreateThreadWithAttr", "nativeTestGetThreadTid", "PthreadInfo", "zh/e", "matrix-hooks_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class PthreadHackJni {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.matrix.hook.junwind.PthreadHackJni f52654c = new com.tencent.matrix.hook.junwind.PthreadHackJni();

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f52652a = jz5.h.b(zh.f.f472846d);

    /* renamed from: b, reason: collision with root package name */
    public static int f52653b = -1;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/matrix/hook/junwind/PthreadHackJni$PthreadInfo;", "", "", "pthread", "J", "", "policy", "I", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, "<init>", "(JII)V", "Companion", "com/tencent/matrix/hook/junwind/a", "matrix-hooks_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class PthreadInfo {
        public static final com.tencent.matrix.hook.junwind.a Companion = new com.tencent.matrix.hook.junwind.a(null);
        public static final int SCHED_BATCH = 3;
        public static final int SCHED_DEADLINE = 6;
        public static final int SCHED_FIFO = 1;
        public static final int SCHED_IDLE = 5;
        public static final int SCHED_NORMAL = 0;
        public static final int SCHED_RR = 2;
        public int policy;
        public int priority;
        public long pthread;

        public PthreadInfo(long j17, int i17, int i18) {
            this.pthread = j17;
            this.policy = i17;
            this.priority = i18;
        }
    }

    public static final boolean[] b(int i17) {
        f52654c.a();
        return nativeGetTidAffinity(i17);
    }

    public static final jz5.l c(int i17) {
        f52654c.a();
        return new jz5.l(java.lang.Integer.valueOf(nativeGetTidSchedPolicy(i17)), java.lang.Integer.valueOf(nativeGetTidSchedPriority(i17)));
    }

    public static final boolean d() {
        boolean z17 = com.tencent.matrix.hook.junwind.JUnwindJni.f52645a;
        return com.tencent.matrix.hook.junwind.JUnwindJni.f52645a && f52653b == 0;
    }

    public static final void e(boolean z17) {
        f52654c.a();
        jz5.g gVar = f52652a;
        if (z17) {
            java.lang.Boolean bool = (java.lang.Boolean) ((java.lang.ThreadLocal) ((jz5.n) gVar).getValue()).get();
            if (bool != null) {
                bool.booleanValue();
            }
            ((java.lang.ThreadLocal) ((jz5.n) gVar).getValue()).set(java.lang.Boolean.TRUE);
        } else {
            ((java.lang.ThreadLocal) ((jz5.n) gVar).getValue()).set(java.lang.Boolean.FALSE);
        }
        nativeLockThreadList(z17);
    }

    public static final int f(int i17, boolean[] zArr) {
        f52654c.a();
        return nativeSetTidAffinity(i17, zArr);
    }

    public static final native int nativeGetCpuCore();

    public static final native int nativeGetErrno();

    public static final native long nativeGetPthreadHandle(int tid);

    public static final native com.tencent.matrix.hook.junwind.PthreadHackJni.PthreadInfo nativeGetPthreadInfo(int tid);

    public static final native int nativeGetSchedPriorityMax(int policy);

    public static final native int nativeGetSchedPriorityMin(int policy);

    public static final native boolean[] nativeGetTidAffinity(int tid);

    public static final native int nativeGetTidNice(int tid);

    public static final native int nativeGetTidSchedPolicy(int tid);

    public static final native int nativeGetTidSchedPriority(int tid);

    public static final native java.util.Map<java.lang.Integer, com.tencent.matrix.hook.junwind.PthreadHackJni.PthreadInfo> nativeListPthread();

    public static final native int nativeLoadThreadListLock();

    public static final native void nativeLockThreadList(boolean z17);

    public static final native int nativeSetErrno(int error);

    public static final native int nativeSetPthreadPriority(long pthreadHandle, int policy, int priority);

    public static final native int nativeSetTidAffinity(int tid, boolean[] cpuCores);

    public static final native int nativeSetTidNice(int tid, int nice);

    public static final native int nativeSetTidSchedPolicy(int tid, int policy, int priority);

    public static final native int nativeTestCreateThreadWithAttr(int policy, int priority);

    public static final native int nativeTestGetThreadTid();

    public final void a() {
        if (!d()) {
            throw new java.lang.RuntimeException("Check #isSupported() before calling!");
        }
    }
}
