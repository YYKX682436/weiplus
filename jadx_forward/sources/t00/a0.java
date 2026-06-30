package t00;

/* loaded from: classes8.dex */
public final class a0 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t00.y f495795a = new t00.y(null);

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495878z;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean Vi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Vi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetEcsSectionDataActionHandler", "handleAction: " + data + ",switchOn:" + Vi);
        if (!Vi) {
            callback.a();
            return;
        }
        x02.h Bi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Bi();
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionDataActionHandler", "orderAndCardCgiMgr is null");
            callback.a();
            return;
        }
        bw5.z7 a17 = f495795a.a(data);
        if (a17 == null || a17.f117379f.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqScene:$");
            sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f117378e) : null);
            sb6.append(" section list isEmpty");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionDataActionHandler", sb6.toString());
            callback.a();
            return;
        }
        t00.z zVar = new t00.z(callback, c01.id.c(), a17);
        byte[] mo14344x5f01b1f6 = a17.mo14344x5f01b1f6();
        x02.d dVar = new x02.d();
        dVar.f532511e = zVar;
        long m105978x2737f10 = ((x02.i) Bi).m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3384xf5161200.C30567x21b1f1a0.m169974x21b446b2(m105978x2737f10, mo14344x5f01b1f6, dVar);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
