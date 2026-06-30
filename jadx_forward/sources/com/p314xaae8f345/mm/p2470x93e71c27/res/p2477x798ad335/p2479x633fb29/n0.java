package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes12.dex */
public class n0 extends dm.v9 {
    public static final l75.e0 U1 = dm.v9.m125567x3593deb(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0.class);

    @Override // dm.v9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return U1;
    }

    /* renamed from: toString */
    public java.lang.String m75320x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ResDownloaderRecord {");
        try {
            for (java.lang.reflect.Field field : com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0.class.getSuperclass().getDeclaredFields()) {
                if (field.getName().startsWith(l75.f0.f72761x324e3197)) {
                    field.setAccessible(true);
                    java.lang.Object obj = field.get(this);
                    sb6.append(field.getName().replaceFirst(l75.f0.f72761x324e3197, ""));
                    sb6.append(" = ");
                    sb6.append(obj);
                    sb6.append(", ");
                }
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderRecord", e17, "", new java.lang.Object[0]);
        }
        try {
            java.lang.reflect.Field field2 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0.class.getSuperclass().getSuperclass().getField("systemRowid");
            field2.setAccessible(true);
            sb6.append("systemRowid = ");
            sb6.append(field2.get(this));
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderRecord", e18, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderRecord", e19, "", new java.lang.Object[0]);
        }
        sb6.append(" }");
        return sb6.toString();
    }
}
