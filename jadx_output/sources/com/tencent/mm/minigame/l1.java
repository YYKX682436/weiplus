package com.tencent.mm.minigame;

/* loaded from: classes12.dex */
public class l1 implements com.tencent.shadow.core.common.Logger {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f69105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.m1 f69106b;

    public l1(com.tencent.mm.minigame.m1 m1Var, java.lang.String str) {
        this.f69106b = m1Var;
        this.f69105a = str;
    }

    public final void a(int i17, java.lang.String str, java.lang.Throwable th6) {
        java.lang.String valueOf = java.lang.String.valueOf(this.f69105a);
        if (!com.tencent.mm.minigame.m1.f69110d.get()) {
            synchronized (this.f69106b.f69112b) {
                this.f69106b.f69112b.add(new com.tencent.mm.minigame.k1(i17, valueOf, str, th6));
            }
            return;
        }
        if (i17 == 1) {
            if (th6 == null) {
                com.tencent.mars.xlog.Log.e(valueOf, str);
                return;
            } else {
                com.tencent.mars.xlog.Log.printErrStackTrace(valueOf, th6, str, new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 2) {
            if (th6 == null) {
                com.tencent.mars.xlog.Log.w(valueOf, str);
                return;
            } else {
                com.tencent.mm.sdk.platformtools.Log.h(valueOf, th6, str, new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 3) {
            if (th6 == null) {
                com.tencent.mars.xlog.Log.i(valueOf, str);
                return;
            } else {
                com.tencent.mm.sdk.platformtools.Log.g(valueOf, th6, str, new java.lang.Object[0]);
                return;
            }
        }
        if ((i17 == 4 || i17 == 5) && th6 != null) {
            com.tencent.mm.sdk.platformtools.Log.b(valueOf, th6, str, new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void debug(java.lang.String str) {
        a(4, str, null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void error(java.lang.String str) {
        a(1, str, null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void flush() {
        com.tencent.mars.xlog.Log.appenderFlushSync();
    }

    @Override // com.tencent.shadow.core.common.Logger
    public java.lang.String getName() {
        return this.f69105a;
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void info(java.lang.String str) {
        a(3, str, null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // com.tencent.shadow.core.common.Logger
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // com.tencent.shadow.core.common.Logger
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // com.tencent.shadow.core.common.Logger
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // com.tencent.shadow.core.common.Logger
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void trace(java.lang.String str) {
        a(5, str, null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void warn(java.lang.String str) {
        a(2, str, null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void debug(java.lang.String str, java.lang.Object obj) {
        a(4, java.lang.String.format(str, obj), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void error(java.lang.String str, java.lang.Object obj) {
        a(1, java.lang.String.format(str, obj), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void info(java.lang.String str, java.lang.Object obj) {
        a(3, java.lang.String.format(str, obj), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void trace(java.lang.String str, java.lang.Object obj) {
        a(5, java.lang.String.format(str, obj), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void warn(java.lang.String str, java.lang.Object obj) {
        a(2, java.lang.String.format(str, obj), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(4, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(1, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(3, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(5, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(2, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void debug(java.lang.String str, java.lang.Object... objArr) {
        a(4, java.lang.String.format(str, objArr), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void error(java.lang.String str, java.lang.Object... objArr) {
        a(1, java.lang.String.format(str, objArr), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void info(java.lang.String str, java.lang.Object... objArr) {
        a(3, java.lang.String.format(str, objArr), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void trace(java.lang.String str, java.lang.Object... objArr) {
        a(5, java.lang.String.format(str, objArr), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void warn(java.lang.String str, java.lang.Object... objArr) {
        a(2, java.lang.String.format(str, objArr), null);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void debug(java.lang.String str, java.lang.Throwable th6) {
        a(4, str, th6);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void error(java.lang.String str, java.lang.Throwable th6) {
        a(1, str, th6);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void info(java.lang.String str, java.lang.Throwable th6) {
        a(3, str, th6);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void trace(java.lang.String str, java.lang.Throwable th6) {
        a(5, str, th6);
    }

    @Override // com.tencent.shadow.core.common.Logger
    public void warn(java.lang.String str, java.lang.Throwable th6) {
        a(2, str, th6);
    }
}
