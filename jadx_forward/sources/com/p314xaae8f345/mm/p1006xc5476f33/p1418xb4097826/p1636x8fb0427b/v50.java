package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes4.dex */
public final class v50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v50 f209705d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v50();

    public v50() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.mm.uitool.UITool");
            java.lang.Object obj3 = cls.getDeclaredField("INSTANCE").get(cls);
            if (intValue > 0) {
                cls.getDeclaredMethod("setEnabled", java.lang.Integer.TYPE).invoke(obj3, java.lang.Integer.valueOf(intValue));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.UIToolCommon", "enable UIToolCommon", new java.lang.Object[0]);
                zl5.b.f555620b = true;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, java.lang.Integer.valueOf(intValue));
            } else {
                cls.getDeclaredMethod("setDisabled", new java.lang.Class[0]).invoke(obj3, new java.lang.Object[0]);
                zl5.b.f555620b = false;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC, 0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderConfig", e17, "fail to enable uitool", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
