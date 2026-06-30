package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class g implements java.util.concurrent.Executor {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p376xac25df1c.e f127799a;

    private g(com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar) {
        this.f127799a = eVar;
    }

    public static java.util.concurrent.Executor a(com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar) {
        return new com.p314xaae8f345.p373xbe494963.p376xac25df1c.g(eVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f127799a.f127795h.a(runnable);
    }
}
