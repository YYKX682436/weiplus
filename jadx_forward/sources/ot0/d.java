package ot0;

/* loaded from: classes9.dex */
public class d extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f429971b;

    /* renamed from: c, reason: collision with root package name */
    public int f429972c = 0;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.d();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar.f430199i == 2001) {
            qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f429971b;
            if (c21053xdbf1e5f4 == null) {
                c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            }
            int i19 = this.f429972c;
            ((pg0.s3) h0Var).getClass();
            gb3.q.a(sb6, c21053xdbf1e5f4, i19);
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f430199i == 2001) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.emoji.md5");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c21053xdbf1e5f4.f68671x4b6e68b9 = str;
            c21053xdbf1e5f4.f68689x2262335f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.type"), 0);
            c21053xdbf1e5f4.f68690x2a070e41 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.width"), 0);
            c21053xdbf1e5f4.f68664xfd0bc00c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.height"), 0);
            c21053xdbf1e5f4.f68679x22618426 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.len"), 0);
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.emoji.aeskey");
            if (str2 == null) {
                str2 = "";
            }
            c21053xdbf1e5f4.f68642xf11e6e15 = str2;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.emoji.cdnurl");
            if (str3 == null) {
                str3 = "";
            }
            c21053xdbf1e5f4.f68654xf47770e7 = str3;
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.emoji.encrypturl");
            if (str4 == null) {
                str4 = "";
            }
            c21053xdbf1e5f4.f68659x5efe714f = str4;
            java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.emoji.externurl");
            if (str5 == null) {
                str5 = "";
            }
            c21053xdbf1e5f4.f68661x765114aa = str5;
            java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.emoji.externmd5");
            if (str6 == null) {
                str6 = "";
            }
            c21053xdbf1e5f4.f68660x7650f4b9 = str6;
            java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.emoji.productid");
            if (str7 == null) {
                str7 = "";
            }
            c21053xdbf1e5f4.f68663x861009b5 = str7;
            java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.emoji.designerid");
            if (str8 == null) {
                str8 = "";
            }
            c21053xdbf1e5f4.f68657xb76d85ab = str8;
            java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.emoji.attachedtext");
            c21053xdbf1e5f4.f68646xa8f07416 = str9 != null ? str9 : "";
            c21053xdbf1e5f4.f68685x2261e7f9 = 1;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            c21053xdbf1e5f4.f68682x29d3a50c = 8;
            this.f429971b = c21053xdbf1e5f4;
            this.f429972c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.emoji.localreceivestatus"), 0);
            if (map.get(".msg.appmsg.emoji.localreceivestatus") == null && map.get(".msg.appmsg.wcpayinfo.receivestatus") != null) {
                this.f429972c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wcpayinfo.receivestatus"), 0);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(c21053xdbf1e5f4.f68671x4b6e68b9) == null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(this.f429971b);
            }
        }
    }
}
