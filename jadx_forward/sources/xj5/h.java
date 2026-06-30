package xj5;

/* loaded from: classes9.dex */
public final class h extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final r45.i67 f536438u;

    public h(r45.i67 record, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f536438u = record;
    }

    @Override // xj5.a
    public int c() {
        return 9;
    }

    @Override // xj5.a
    public boolean d(xj5.a aVar) {
        xj5.h other = (xj5.h) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536438u.f458302d, other.f536438u.f458302d);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        java.lang.String msg_svrId = this.f536438u.f458302d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_svrId, "msg_svrId");
        return java.lang.Long.parseLong(msg_svrId);
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f536419h;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.h other = (xj5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }
}
