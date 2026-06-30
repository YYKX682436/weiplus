package y41;

/* loaded from: classes11.dex */
public final class a implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (strArr != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//im", strArr[0]) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("clearContact", strArr[1])) {
            ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
            k41.o0 o0Var = k41.o0.f385564a;
            k41.r0 Di = ((i41.l) i95.n0.c(i41.l.class)).Di();
            if (Di != null) {
                Di.f385573d.mo70514xb06685ab("OpenIMKefuContact", "", new java.lang.String[0]);
            }
            ((lt0.f) k41.o0.f385565b.f385539a).mo143584x5a5b64d();
            ((lt0.f) k41.o0.f385566c).mo143584x5a5b64d();
            return true;
        }
        if (strArr == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//im", strArr[0]) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("testCard", strArr[1])) {
            if (strArr == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//im", strArr[0]) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("confirm", strArr[1])) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 3);
            k41.h1 h1Var = k41.h1.f385540d;
            k41.h1 h1Var2 = k41.h1.f385540d;
            return true;
        }
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[2], 0) == 1 ? 1 : 0;
        l41.b2 b2Var = (l41.b2) yVar;
        b2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuService", "testNameCard %s", str);
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.u1(str);
            f9Var.j1(i17 ^ 1);
            f9Var.r1(i17 != 0 ? 3 : 2);
            f9Var.m124850x7650bebc(67);
            f9Var.e1(c01.w9.p());
            f9Var.d1("<msg username=\"25984993900277866@kefu.openim\" nickname=\"测试用客服\" sex=\"1\" bigheadimgurl=\"https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png\" smallheadimgurl=\"https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png\" openimappid=\"3552365301\" openimdesc=\"腾讯\" openimdescicon=\"https://wwcdn.weixin.qq.com/node/wework/images/uncert21.png\" ticket=\"test_ticket\" />");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuService", "testNameCard xml: %s", f9Var.j());
            if (i17 != 0) {
                c01.w9.x(f9Var);
            } else {
                b2Var.Ri(str, f9Var.j());
            }
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = "25984993900277866@kefu.openim";
            r0Var.f152063b = 3;
            r0Var.f152067f = 1;
            r0Var.f152066e = "https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png";
            r0Var.f152065d = "https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png";
            r0Var.f152070i = -1;
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        }
        return true;
    }
}
