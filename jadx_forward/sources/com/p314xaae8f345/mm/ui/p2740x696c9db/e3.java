package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes5.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f291904a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f291905b = new java.util.ArrayList();

    public e3(java.lang.Object obj) {
        this.f291904a = obj;
    }

    public final void a(java.lang.Object obj) {
        java.util.Iterator it = this.f291905b.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.d3) it.next()).mo81114xb9724478(obj);
        }
    }

    public final void b(com.p314xaae8f345.mm.ui.p2740x696c9db.d3 lambda) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lambda, "lambda");
        java.lang.Object obj = this.f291904a;
        if (obj != null) {
            lambda.mo81114xb9724478(obj);
        } else {
            ((java.util.ArrayList) this.f291905b).add(lambda);
        }
    }
}
