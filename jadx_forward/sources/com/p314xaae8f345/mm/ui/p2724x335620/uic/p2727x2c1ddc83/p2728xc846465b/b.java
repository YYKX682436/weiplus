package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f290798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, long j17) {
        super(1);
        this.f290797d = i17;
        this.f290798e = f0Var;
        this.f290799f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String toUserName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        return "{\"msg_type\": " + this.f290797d + "; \"inner_msg_type\": " + this.f290798e.f391649d + "; \"send_time\": " + this.f290799f + "; \"toUserid\": " + toUserName + '}';
    }
}
