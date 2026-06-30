package gy4;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f359144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gy4.u uVar) {
        super(0);
        this.f359144d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String uuid;
        java.lang.String str;
        mw4.n nVar = new mw4.n();
        gy4.u uVar = this.f359144d;
        gy4.d U6 = uVar.U6();
        if (U6 != null) {
            uuid = U6.f359125g;
            if (uuid == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                throw null;
            }
        } else {
            uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        }
        java.lang.String str2 = uuid;
        gy4.d U62 = uVar.U6();
        if (U62 != null) {
            str = U62.f359124f;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("host");
                throw null;
            }
        } else {
            str = "";
        }
        mw4.n.c(nVar, str2, "https://".concat(str), null, null, 12, null);
        nVar.b("/chat-provider/get-chat-records", uVar.f359163i);
        nVar.b("/chat-provider/get-file-cdn-infos", uVar.f359164m);
        nVar.b("/chat-provider/get-file-data", uVar.f359165n);
        return nVar.a();
    }
}
