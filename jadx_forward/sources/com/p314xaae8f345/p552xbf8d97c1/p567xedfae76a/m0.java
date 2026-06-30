package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class m0 implements java.util.concurrent.RejectedExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h0 f134236a;

    public m0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h0 h0Var) {
        this.f134236a = h0Var;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(java.lang.Runnable r17, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "r");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h0 h0Var = this.f134236a;
        h0Var.getClass();
        for (java.util.Map.Entry entry : com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134317e.entrySet()) {
            if (!(((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0) entry.getValue()).f134232a.length() == 0)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0) entry.getValue()).f134233b;
                if (currentTimeMillis > java.util.concurrent.TimeUnit.SECONDS.toMillis(30L)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Dispatcher Thread Not Responding:\n");
                    java.lang.StackTraceElement[] stackTrace = ((java.lang.Thread) entry.getKey()).getStackTrace();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "it.key.stackTrace");
                    for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                        sb6.append("\tat " + stackTraceElement + '\n');
                    }
                    java.lang.String sb7 = sb6.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
                    yz5.q qVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a.f134306e;
                    java.lang.String name = ((java.lang.Thread) entry.getKey()).getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "it.key.name");
                    qVar.mo147xb9724478(name, sb7, java.lang.Long.valueOf(currentTimeMillis));
                }
            }
        }
        h0Var.f134231d.offer(r17);
    }
}
