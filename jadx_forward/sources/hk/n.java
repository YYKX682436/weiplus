package hk;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final hk.n f363216a = new hk.n();

    /* renamed from: b, reason: collision with root package name */
    public static hk.b f363217b;

    public final java.util.List a(java.lang.String bizName, java.lang.String slotId) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotId, "slotId");
        hk.b b17 = b();
        if (b17 != null) {
            java.lang.String concat = "select * from AdvertisePushDBInfo where message_slotid=".concat(slotId);
            arrayList = new java.util.ArrayList();
            android.database.Cursor m145256x1d3f4980 = b17.m145256x1d3f4980(concat, new java.lang.String[0]);
            while (m145256x1d3f4980.moveToNext()) {
                hk.a aVar = new hk.a();
                aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                arrayList.add(aVar);
            }
            m145256x1d3f4980.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdvertisePushDBInfoStorage", "getSpecificSlotMsg:" + arrayList);
        } else {
            arrayList = new java.util.ArrayList();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27060, bizName, 1, slotId, java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public final hk.b b() {
        if (f363217b == null && gm0.j1.a()) {
            synchronized (this) {
                if (f363217b == null) {
                    f363217b = f363216a.c();
                }
            }
        }
        return f363217b;
    }

    public final hk.b c() {
        java.lang.String str = gm0.j1.u().h() + "AdvertisePushMsg.db";
        d95.b0 b0Var = new d95.b0();
        if (b0Var.S(str, kz5.c1.i(new jz5.l(1254747469, hk.m.f363215a)), true, true)) {
            return new hk.b(b0Var);
        }
        throw new android.database.sqlite.SQLiteException("AdvertisePushMsg db init failed");
    }
}
