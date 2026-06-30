package sy4;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    public static final sy4.m f495417c = new sy4.m();

    /* renamed from: a, reason: collision with root package name */
    public final uy4.w f495418a = (uy4.w) i95.n0.c(uy4.u.class);

    /* renamed from: b, reason: collision with root package name */
    public final o11.g f495419b;

    public m() {
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423612c = true;
        this.f495419b = fVar.a();
    }

    public java.lang.String a(yy4.a aVar) {
        java.lang.String str;
        uy4.w e17 = e(aVar.f66634x369ad11);
        if (e17 != null) {
            str = e17.ra(aVar.f66634x369ad11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabMgr", "get appName from opener , appid %s, appName %s", aVar.f66634x369ad11, str);
        } else {
            str = "";
        }
        return android.text.TextUtils.isEmpty(str) ? aVar.u0("field_Title") : str;
    }

    public yy4.a b(java.lang.String str) {
        xy4.a c17 = c();
        c17.getClass();
        yy4.a aVar = new yy4.a();
        aVar.f66634x369ad11 = str;
        c17.get(aVar, new java.lang.String[0]);
        return aVar;
    }

    public xy4.a c() {
        sy4.j jVar = (sy4.j) i95.n0.c(sy4.j.class);
        if (jVar.f495412d[0] == null && gm0.j1.a()) {
            synchronized (jVar.f495412d) {
                xy4.a[] aVarArr = jVar.f495412d;
                if (aVarArr[0] == null) {
                    aVarArr[0] = new xy4.a(gm0.j1.u().f354686f);
                }
            }
        }
        return jVar.f495412d[0];
    }

    public java.util.List d() {
        int i17;
        java.util.List y07 = c().y0();
        java.util.Iterator it = ((java.util.ArrayList) y07).iterator();
        while (it.hasNext()) {
            yy4.a aVar = (yy4.a) it.next();
            if (!aVar.z0() || (((i17 = aVar.f66637xda33d239) != 2 && i17 != 1) || "labs1de6f3".equals(aVar.f66634x369ad11))) {
                it.remove();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabMgr", "online lab %s", y07.toString());
        return y07;
    }

    public uy4.w e(java.lang.String str) {
        fs.q g17 = fs.g.g(uy4.w.class, str);
        if (g17 != null) {
            return (uy4.w) g17.get();
        }
        return null;
    }

    public void f(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            yy4.a aVar = (yy4.a) it.next();
            if (!(aVar.f66659x10a0fed7 == 1) && !aVar.w0()) {
                arrayList.add(aVar.f66634x369ad11);
            }
        }
    }
}
