package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f290807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f290808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290809f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, long j17) {
        super(1);
        this.f290807d = f0Var;
        this.f290808e = f0Var2;
        this.f290809f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String toUserName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        return "{\"msg_type\": " + this.f290807d.f391649d + "; \"inner_msg_type\": " + this.f290808e.f391649d + "; \"send_time\": " + this.f290809f + "; \"toUserid\": " + toUserName + '}';
    }
}
