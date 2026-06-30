package u92;

/* loaded from: classes2.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static u92.b a(u92.a aVar, long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 0;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        java.lang.String key = aVar.b(j17, str, str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        by1.d a17 = by1.c.f117886b.a().a(key);
        u92.b bVar = a17 instanceof u92.b ? (u92.b) a17 : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getCache] key:");
        sb6.append(key);
        sb6.append(" cache:");
        sb6.append(bVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetTopicInfoCache", sb6.toString());
        return bVar;
    }

    public final java.lang.String b(long j17, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            str = pm0.v.u(j17);
        }
        java.lang.String str3 = "6277_" + str;
        if (str2 == null || str2.length() == 0) {
            return str3;
        }
        return str3 + '_' + str2;
    }
}
