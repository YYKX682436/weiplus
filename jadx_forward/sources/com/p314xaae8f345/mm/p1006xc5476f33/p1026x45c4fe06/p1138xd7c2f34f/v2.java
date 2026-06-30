package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class v2 implements java.util.concurrent.Callable, wu5.d {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u2 f166779h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u2(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f166780i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166781d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f166782e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 f166783f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.Future f166784g;

    public v2(java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f166781d = str;
        this.f166782e = z17;
        this.f166783f = c11813xf952a195;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            c01.i8[] g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.g(this.f166782e, this.f166783f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getAppBrandDataTransfer(...)");
            for (c01.i8 i8Var : g17) {
                if (i8Var.b(o45.wf.f424562g)) {
                    i8Var.c(o45.wf.f424562g);
                }
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.Map map = f166780i;
            if (map instanceof java.util.concurrent.ConcurrentHashMap) {
                java.lang.String str = this.f166781d;
                java.util.concurrent.Future future = this.f166784g;
                if (future == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("attachedFuture");
                    throw null;
                }
                ((java.util.concurrent.ConcurrentHashMap) map).remove(str, future);
            } else {
                synchronized (map) {
                    java.lang.Object obj = ((java.util.concurrent.ConcurrentHashMap) map).get(this.f166781d);
                    java.util.concurrent.Future future2 = this.f166784g;
                    if (future2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("attachedFuture");
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, future2)) {
                        ((java.util.concurrent.ConcurrentHashMap) map).remove(this.f166781d);
                    }
                }
            }
            return bool;
        } catch (java.lang.Throwable th6) {
            java.util.Map map2 = f166780i;
            if (map2 instanceof java.util.concurrent.ConcurrentHashMap) {
                java.lang.String str2 = this.f166781d;
                java.util.concurrent.Future future3 = this.f166784g;
                if (future3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("attachedFuture");
                    throw null;
                }
                ((java.util.concurrent.ConcurrentHashMap) map2).remove(str2, future3);
            } else {
                synchronized (map2) {
                    java.lang.Object obj2 = ((java.util.concurrent.ConcurrentHashMap) map2).get(this.f166781d);
                    java.util.concurrent.Future future4 = this.f166784g;
                    if (future4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("attachedFuture");
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, future4)) {
                        ((java.util.concurrent.ConcurrentHashMap) map2).remove(this.f166781d);
                    }
                }
            }
            throw th6;
        }
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(future, "null cannot be cast to non-null type java.util.concurrent.Future<kotlin.Boolean>");
        this.f166784g = future;
    }
}
