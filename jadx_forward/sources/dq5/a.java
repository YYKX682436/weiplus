package dq5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dq5.a f323904a = new dq5.a();

    public final boolean a(int i17, byte[] content, byte[] key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        byte[] b17 = kk.a.f389997a.b(content, key);
        if (b17 != null) {
            return b(i17, b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.F2FTransportHelper", "sendEncrypted: encrypt failed");
        return false;
    }

    public final boolean b(int i17, byte[] content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        r45.j87 j87Var = new r45.j87();
        j87Var.f459186d = i17;
        j87Var.f459187e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(content, 0, content.length);
        i95.m c17 = i95.n0.c(gz.l.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        byte[] mo14344x5f01b1f6 = j87Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.h(mo14344x5f01b1f6);
    }
}
