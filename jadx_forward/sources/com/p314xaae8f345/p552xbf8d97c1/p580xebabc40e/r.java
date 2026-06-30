package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f134502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f134502d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String line = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(line, "line");
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.t.b("PostLog: ".concat(line));
        if (r26.i0.y(line, "Leak Reference:", false) || r26.i0.y(line, "Leak Not Found:", false)) {
            this.f134502d.f391656d = line;
        }
        return jz5.f0.f384359a;
    }
}
