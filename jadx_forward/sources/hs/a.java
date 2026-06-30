package hs;

/* loaded from: classes9.dex */
public final class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public bw5.g9 f366040b = new bw5.g9();

    @Override // ot0.h
    public ot0.h a() {
        hs.a aVar = new hs.a();
        aVar.f366040b = this.f366040b;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        bw5.g9 shareObject = this.f366040b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        boolean[] zArr = shareObject.R;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        try {
            sb7.append("<finderShopWindowShare>");
            sb7.append("<finderUsername>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.m11973x93d5ac12()));
            sb7.append("</finderUsername>");
            sb7.append("<avatar>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.b()));
            sb7.append("</avatar>");
            sb7.append("<nickname>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.m11974x8010e5e4()));
            sb7.append("</nickname>");
            sb7.append("<commodityInStockCount>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[4] ? shareObject.f109278g : ""));
            sb7.append("</commodityInStockCount>");
            sb7.append("<appId>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[5] ? shareObject.f109279h : ""));
            sb7.append("</appId>");
            sb7.append("<path>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[6] ? shareObject.f109280i : ""));
            sb7.append("</path>");
            sb7.append("<appUsername>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[7] ? shareObject.f109281m : ""));
            sb7.append("</appUsername>");
            sb7.append("<query>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.f()));
            sb7.append("</query>");
            sb7.append("<liteAppId>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[9] ? shareObject.f109283o : ""));
            sb7.append("</liteAppId>");
            sb7.append("<liteAppPath>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[10] ? shareObject.f109284p : ""));
            sb7.append("</liteAppPath>");
            sb7.append("<liteAppQuery>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[11] ? shareObject.f109285q : ""));
            sb7.append("</liteAppQuery>");
            sb7.append("<platformTagURL>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[12] ? shareObject.f109286r : ""));
            sb7.append("</platformTagURL>");
            sb7.append("<saleWording>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.i()));
            sb7.append("</saleWording>");
            sb7.append("<lastGMsgID>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[16] ? shareObject.f109289u : ""));
            sb7.append("</lastGMsgID>");
            sb7.append("<profileTypeWording>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.e()));
            sb7.append("</profileTypeWording>");
            sb7.append("<saleWordingExtra>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.j()));
            sb7.append("</saleWordingExtra>");
            sb7.append("<isWxShop>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.d()));
            sb7.append("</isWxShop>");
            sb7.append("<platformIconUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[20] ? shareObject.f109293y : ""));
            sb7.append("</platformIconUrl>");
            sb7.append("<brandIconUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[21] ? shareObject.f109294z : ""));
            sb7.append("</brandIconUrl>");
            sb7.append("<description>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.m11972x730bcac6()));
            sb7.append("</description>");
            sb7.append("<backgroundUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.c()));
            sb7.append("</backgroundUrl>");
            sb7.append("<darkModePlatformIconUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[24] ? shareObject.C : ""));
            sb7.append("</darkModePlatformIconUrl>");
            sb7.append("<rIconUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[25] ? shareObject.D : ""));
            sb7.append("</rIconUrl>");
            sb7.append("<rIconUrlDarkMode>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[26] ? shareObject.E : ""));
            sb7.append("</rIconUrlDarkMode>");
            sb7.append("<rWords>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(shareObject.g()));
            sb7.append("</rWords>");
            sb7.append("<topShopIconUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[28] ? shareObject.G : ""));
            sb7.append("</topShopIconUrl>");
            sb7.append("<topShopIconUrlDarkMode>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[29] ? shareObject.H : ""));
            sb7.append("</topShopIconUrlDarkMode>");
            sb7.append("<simplifyTopShopIconUrl>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[30] ? shareObject.I : ""));
            sb7.append("</simplifyTopShopIconUrl>");
            sb7.append("<simplifyTopShopIconUrlDarkmode>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[31] ? shareObject.f109274J : ""));
            sb7.append("</simplifyTopShopIconUrlDarkmode>");
            sb7.append("<topShopIconWidth>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.String.valueOf(shareObject.K)));
            sb7.append("</topShopIconWidth>");
            sb7.append("<topShopIconHeight>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.String.valueOf(shareObject.L)));
            sb7.append("</topShopIconHeight>");
            sb7.append("<simplifyTopShopIconWidth>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.String.valueOf(shareObject.M)));
            sb7.append("</simplifyTopShopIconWidth>");
            sb7.append("<simplifyTopShopIconHeight>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.String.valueOf(shareObject.N)));
            sb7.append("</simplifyTopShopIconHeight>");
            sb7.append("<profileMainWording>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[36] ? shareObject.P : ""));
            sb7.append("</profileMainWording>");
            sb7.append("<profileSubWording>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(zArr[37] ? shareObject.Q : ""));
            sb7.append("</profileSubWording>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shareObject.f109288t, "getProductImageURLList(...)");
            if (!r3.isEmpty()) {
                sb7.append("<productImageURLList>");
                java.util.Iterator it = shareObject.f109288t.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    sb7.append("<productImageURL>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str2));
                    sb7.append("</productImageURL>");
                }
                sb7.append("</productImageURLList>");
            }
            sb7.append("</finderShopWindowShare>");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsMsgContentUtil", "make content error! %s", e17.getMessage());
        }
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        sb6.append(sb8);
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f366040b = b00.e0.f98195a.a(".msg.appmsg", values);
    }

    public final bw5.g9 f() {
        return this.f366040b;
    }
}
