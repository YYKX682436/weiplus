package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.MMWakerLock */
/* loaded from: classes12.dex */
public class C4549xd1736fd9 extends com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579 {
    private static final java.lang.String TAG = "MicroMsg.MMWakerLock";

    /* renamed from: lastChecktime */
    private static long f19234xacdc89df = 0;

    /* renamed from: sReentrantGuard */
    private static boolean f19235x6cb96beb = true;

    /* renamed from: shouldLock */
    private static java.lang.Boolean f19236xee973d7e;

    /* renamed from: _hellAccFlag_ */
    private byte f19237x7f11beae;

    /* renamed from: autoUnlockCallback */
    private com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.IAutoUnlockCallback f19238x38c86b38;

    /* renamed from: context */
    private android.content.Context f19239x38b735af;

    /* renamed from: mCreatePosStackLine */
    private java.lang.String f19240xfe56e511;

    /* renamed from: mHandler */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f19241xc7640a1d;

    /* renamed from: mReleaser */
    private java.lang.Runnable f19242x42180d8;

    /* renamed from: wakeLock */
    private android.os.PowerManager.WakeLock f19243x113258ef;

    /* renamed from: com.tencent.mars.comm.MMWakerLock$IAutoUnlockCallback */
    /* loaded from: classes12.dex */
    public interface IAutoUnlockCallback {
        /* renamed from: autoUnlockCallback */
        void mo40018x38c86b38();
    }

    public C4549xd1736fd9(android.content.Context context, java.lang.String str, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.IAutoUnlockCallback iAutoUnlockCallback) {
        this(context, str);
        this.f19238x38c86b38 = iAutoUnlockCallback;
    }

    /* renamed from: getCallerStack */
    private java.lang.String m40007x41eb087() {
        for (java.lang.StackTraceElement stackTraceElement : new java.lang.Throwable().getStackTrace()) {
            if (!stackTraceElement.getClassName().contains(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.class.getName())) {
                return stackTraceElement.toString();
            }
        }
        return "<native>";
    }

    /* renamed from: setReentrantGuard */
    public static void m40008x170199a(boolean z17) {
        f19235x6cb96beb = z17;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579
    /* renamed from: finalize */
    public void mo40009xd764dc1e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finalize unlock [%d,%d] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f19243x113258ef.hashCode()), this.f19240xfe56e511);
        mo40017xcdd95364();
        super.mo40009xd764dc1e();
    }

    /* renamed from: getCreatePosStackLine */
    public java.lang.String m40010x1263ebba() {
        return this.f19240xfe56e511;
    }

    /* renamed from: innerWakeLockHashCode */
    public int m40011x165a30a0() {
        return this.f19243x113258ef.hashCode();
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579
    /* renamed from: isLocking */
    public boolean mo40012xf1a1864d() {
        try {
            boolean isHeld = this.f19243x113258ef.isHeld();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "check is held [%d,%d] :%b caller:[%s] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f19243x113258ef.hashCode()), java.lang.Boolean.valueOf(isHeld), m40007x41eb087(), m40010x1263ebba());
            return isHeld;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", "");
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579
    /* renamed from: lock */
    public void mo40014x32c52b(long j17) {
        m40015x32c52b(j17, m40007x41eb087());
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579
    /* renamed from: unLock */
    public void mo40017xcdd95364() {
        if (this.f19243x113258ef.isHeld()) {
            this.f19241xc7640a1d.mo50300x3fa464aa(this.f19242x42180d8);
            synchronized (al0.h.f87262c) {
                al0.d dVar = (al0.d) al0.h.f87260a.get(hashCode());
                if (dVar != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = al0.h.f87261b;
                    if (dVar.f87242a) {
                        dVar.f87242a = false;
                        n3Var.mo50300x3fa464aa(dVar.f87243b);
                    }
                    java.util.Iterator it = ((java.util.HashMap) dVar.f87244c).values().iterator();
                    while (it.hasNext()) {
                        al0.g.a(((al0.c) it.next()).f87240a, false);
                    }
                    ((java.util.HashMap) dVar.f87244c).clear();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "unlock [%d,%d] caller:[%s] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f19243x113258ef.hashCode()), m40007x41eb087(), m40010x1263ebba());
            try {
                android.os.PowerManager.WakeLock wakeLock = this.f19243x113258ef;
                yj0.a.c(wakeLock, "com/tencent/mars/comm/MMWakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock.release();
                yj0.a.f(wakeLock, "com/tencent/mars/comm/MMWakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", "");
            }
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579
    /* renamed from: lock */
    public void mo40013x32c52b() {
        m40016x32c52b(m40007x41eb087());
    }

    public C4549xd1736fd9(android.content.Context context, java.lang.String str) {
        this(context, str, 1);
    }

    /* renamed from: lock */
    public void m40016x32c52b(java.lang.String str) {
        m40015x32c52b(-1L, str);
    }

    public C4549xd1736fd9(android.content.Context context, java.lang.String str, int i17) {
        super(context);
        this.f19240xfe56e511 = null;
        this.f19243x113258ef = null;
        this.f19241xc7640a1d = null;
        this.f19238x38c86b38 = null;
        this.f19242x42180d8 = new java.lang.Runnable() { // from class: com.tencent.mars.comm.MMWakerLock.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.f19243x113258ef.isHeld()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.TAG, "unlock by timeout handler! [%d,%d] @[%s]", java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.hashCode()), java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.f19243x113258ef.hashCode()), com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.f19240xfe56e511);
                    com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.mo40017xcdd95364();
                    if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.f19238x38c86b38 != null) {
                        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.this.f19238x38c86b38.mo40018x38c86b38();
                    }
                }
            }
        };
        this.f19240xfe56e511 = m40007x41eb087();
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(i17, str);
        this.f19243x113258ef = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        this.f19241xc7640a1d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(context.getMainLooper());
        this.f19239x38b735af = context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "init [%d,%d] @[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f19243x113258ef.hashCode()), this.f19240xfe56e511);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* renamed from: lock */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m40015x32c52b(long r23, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.m40015x32c52b(long, java.lang.String):void");
    }
}
