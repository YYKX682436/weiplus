package s92;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final s92.c f486525a = new s92.c();

    public final boolean a(java.lang.Long l17, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC;
        java.lang.String obj = c17.m(u3Var, "").toString();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            try {
                byte[] c18 = ot5.e.c(obj);
                android.os.Parcel obtain = android.os.Parcel.obtain();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
                obtain.unmarshall(c18, 0, c18.length);
                obtain.setDataPosition(0);
                android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
                if (intent.hasExtra("key_topic_id")) {
                    if (i17 != 9) {
                        return true;
                    }
                    long longExtra = intent.getLongExtra("key_topic_id", 0L);
                    if (l17 != null && longExtra == l17.longValue()) {
                        return true;
                    }
                    gm0.j1.u().c().x(u3Var, "");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "goDraft() " + e17);
            }
        }
        return false;
    }
}
