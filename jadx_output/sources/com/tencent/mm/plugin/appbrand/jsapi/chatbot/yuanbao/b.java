package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b f80289d = new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String D = lp0.b.D();
        kotlin.jvm.internal.o.d(D);
        if (!r26.i0.n(D, "/", false)) {
            D = D.concat("/");
        }
        java.lang.String str = D + "wxacache/";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }
}
