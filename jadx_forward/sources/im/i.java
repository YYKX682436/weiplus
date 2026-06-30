package im;

/* loaded from: classes12.dex */
public final class i extends im.g {
    @Override // im.g
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6303x2a97adbd struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        jz5.g gVar = im.m.f373692d;
        jz5.o oVar = (jz5.o) ((java.util.HashMap) ((jz5.n) im.m.f373692d).mo141623x754a37bb()).get(java.lang.Long.valueOf(msg.m124847x74d37ac6()));
        if (oVar != null) {
            struct.f136615i = ((java.lang.Number) oVar.f384375e).intValue();
            struct.f136616j = struct.b("ErrMsg", "errType:" + ((java.lang.Number) oVar.f384374d).intValue() + " errMsg:" + ((java.lang.String) oVar.f384376f), true);
        }
        w11.a0 a0Var = w11.a0.f523499a;
        jz5.o oVar2 = (jz5.o) ((java.util.LinkedHashMap) w11.a0.f523500b).get(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(msg.m124847x74d37ac6(), msg.Q0()));
        if (oVar2 != null) {
            struct.f136615i = ((java.lang.Number) oVar2.f384375e).intValue();
            struct.f136616j = struct.b("ErrMsg", "errType:" + ((java.lang.Number) oVar2.f384374d).intValue() + " errMsg:" + ((java.lang.String) oVar2.f384376f), true);
        }
    }

    @Override // im.g
    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return msg.mo78013xfb85f7b0() == 1;
    }
}
