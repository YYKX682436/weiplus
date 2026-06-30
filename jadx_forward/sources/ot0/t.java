package ot0;

/* loaded from: classes12.dex */
public class t extends dm.o0 {
    public static final l75.e0 E = dm.o0.m125354x3593deb(ot0.t.class);

    static {
        if (z65.c.a()) {
            boolean z17 = false;
            int i17 = 0;
            for (java.lang.reflect.Field field : ot0.q.class.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers()) && !field.getName().equals("_hellAccFlag_")) {
                    i17++;
                }
            }
            if (i17 > 215) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMessage", "AppMessage.Content should not add new field!!! (%d) is over the limit(%d)!!!", java.lang.Integer.valueOf(i17), 215);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessage", "AppMessage.Content nonStaticFieldCount: %d", java.lang.Integer.valueOf(i17));
                z17 = true;
            }
            iz5.a.g(null, z17);
        }
    }

    @Override // dm.o0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return E;
    }
}
