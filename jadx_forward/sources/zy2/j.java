package zy2;

/* loaded from: classes9.dex */
public final class j extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.un2 f558959b = new r45.un2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.j jVar = new zy2.j();
        jVar.f558959b = this.f558959b;
        return jVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        r45.un2 un2Var = this.f558959b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (un2Var != null) {
            try {
                sb7.append("<finderOrder>");
                sb7.append("<appID>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(6)));
                sb7.append("</appID>");
                sb7.append("<orderID>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(0)));
                sb7.append("</orderID>");
                sb7.append("<path>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(7)));
                sb7.append("</path>");
                sb7.append("<priceWording>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(3)));
                sb7.append("</priceWording>");
                sb7.append("<stateWording>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(4)));
                sb7.append("</stateWording>");
                sb7.append("<productImageURL>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(5)));
                sb7.append("</productImageURL>");
                sb7.append("<products>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(1)));
                sb7.append("</products>");
                sb7.append("<productsCount>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.Integer.toString(un2Var.m75939xb282bd08(2))));
                sb7.append("</productsCount>");
                sb7.append("<orderType>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.Integer.toString(un2Var.m75939xb282bd08(8))));
                sb7.append("</orderType>");
                sb7.append("<newPriceWording>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(9)));
                sb7.append("</newPriceWording>");
                sb7.append("<newStateWording>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(un2Var.m75945x2fec8307(10)));
                sb7.append("</newStateWording>");
                sb7.append("<useNewWording>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.Integer.toString(un2Var.m75939xb282bd08(11))));
                sb7.append("</useNewWording>");
                sb7.append("</finderOrder>");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        sb6.append(sb7.toString());
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        r45.un2 un2Var = new r45.un2();
        try {
            if (!values.isEmpty()) {
                java.lang.String str = (java.lang.String) values.get(".msg.appmsg.finderOrder.productImageURL");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                un2Var.set(5, str);
                java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.finderOrder.appID");
                if (str3 == null) {
                    str3 = "";
                }
                un2Var.set(6, str3);
                java.lang.String str4 = (java.lang.String) values.get(".msg.appmsg.finderOrder.path");
                if (str4 == null) {
                    str4 = "";
                }
                un2Var.set(7, str4);
                java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.finderOrder.products");
                if (str5 == null) {
                    str5 = "";
                }
                un2Var.set(1, str5);
                java.lang.String str6 = (java.lang.String) values.get(".msg.appmsg.finderOrder.orderID");
                if (str6 == null) {
                    str6 = "";
                }
                un2Var.set(0, str6);
                java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.finderOrder.stateWording");
                if (str7 == null) {
                    str7 = "";
                }
                un2Var.set(4, str7);
                java.lang.String str8 = (java.lang.String) values.get(".msg.appmsg.finderOrder.priceWording");
                if (str8 == null) {
                    str8 = "";
                }
                un2Var.set(3, str8);
                un2Var.set(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".msg.appmsg.finderOrder.productsCount"), 0)));
                un2Var.set(8, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".msg.appmsg.finderOrder.orderType"), 0)));
                java.lang.String str9 = (java.lang.String) values.get(".msg.appmsg.finderOrder.newPriceWording");
                if (str9 == null) {
                    str9 = "";
                }
                un2Var.set(9, str9);
                java.lang.String str10 = (java.lang.String) values.get(".msg.appmsg.finderOrder.newStateWording");
                if (str10 != null) {
                    str2 = str10;
                }
                un2Var.set(10, str2);
                un2Var.set(11, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) values.get(".msg.appmsg.finderOrder.useNewWording"), 0)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
        }
        this.f558959b = un2Var;
    }

    public final r45.un2 f() {
        return this.f558959b;
    }
}
