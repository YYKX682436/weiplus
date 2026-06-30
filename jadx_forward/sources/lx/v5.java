package lx;

/* loaded from: classes7.dex */
public final class v5 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c {
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c.Companion.m85665x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c.Companion.m85665x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23252xa541db3c
    /* renamed from: transfer */
    public void mo85663x4c58b7eb(com.p314xaae8f345.p2845xc516c4b6.biz.C23257x9f55f2b1 request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2();
        c12965xc9712d2.f175446d = 2;
        c12965xc9712d2.f175448f = request.m85690x7520e49e();
        c12965xc9712d2.f175447e = request.m85686x747097ac();
        r45.y24 y24Var = new r45.y24();
        y24Var.f472258d = request.m85685x13e365a0();
        java.lang.String m85688x7f05232a = request.m85688x7f05232a();
        if (m85688x7f05232a == null) {
            m85688x7f05232a = "";
        }
        y24Var.f472259e = m85688x7f05232a;
        y24Var.f472262h = (int) request.m85687x24dcf3d7();
        java.util.Map<java.lang.String, java.lang.String> m85689xa2f9b8fe = request.m85689xa2f9b8fe();
        if (m85689xa2f9b8fe != null) {
            for (java.lang.String str : m85689xa2f9b8fe.keySet()) {
                if (str != null) {
                    java.lang.String str2 = m85689xa2f9b8fe.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.util.LinkedList linkedList = c12965xc9712d2.f175450h.f472261g;
                    r45.cw3 cw3Var = new r45.cw3();
                    cw3Var.f453393d = str;
                    cw3Var.f453394e = str2;
                    linkedList.push(cw3Var);
                }
            }
        }
        c12965xc9712d2.f175450h = y24Var;
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(c12965xc9712d2, new lx.u5(callback));
    }
}
