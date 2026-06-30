package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f52969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f52969d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String line = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(line, "line");
        com.tencent.matrix.resource.t.b("PostLog: ".concat(line));
        if (r26.i0.y(line, "Leak Reference:", false) || r26.i0.y(line, "Leak Not Found:", false)) {
            this.f52969d.f310123d = line;
        }
        return jz5.f0.f302826a;
    }
}
