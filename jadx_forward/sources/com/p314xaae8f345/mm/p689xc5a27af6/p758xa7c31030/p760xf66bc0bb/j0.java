package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f149233a = new java.util.LinkedHashMap();

    public final void a(java.lang.String jobTag, yz5.l configure) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jobTag, "jobTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configure, "configure");
        if (this.f149233a.containsKey(jobTag)) {
            throw new java.lang.IllegalArgumentException("config conflict with [" + jobTag + ']');
        }
        java.util.Map map = this.f149233a;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 i0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0(jobTag);
        configure.mo146xb9724478(i0Var);
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z zVar = i0Var.f149226b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
        if (!(zVar.f149261c != null)) {
            zVar.a(24L);
        }
        map.put(jobTag, i0Var);
    }
}
