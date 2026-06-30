package zd3;

/* loaded from: classes7.dex */
public final class m extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "reportEventForTPPlayer";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt(dm.i4.f66865x76d1ec5a);
        java.lang.String optString = data.optString("type");
        java.lang.String optString2 = data.optString("reportInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface", "reportEventForTPPlayer invoke data: " + data);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "video")) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478(ve3.u.f517643i, optInt, optString, optString2, null, 16, null), xd3.e.class, new zd3.l(this));
            return;
        }
        java.lang.String str = "type error: " + optString + ", only support video";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface", "reportEventForTPPlayer " + str);
        s().mo146xb9724478(j(lc3.x.f399470d, str));
    }
}
