package az4;

/* loaded from: classes15.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final az4.h f97712c = new az4.h();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f97713a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f97714b;

    public h() {
        java.lang.String[] split;
        this.f97714b = "";
        this.f97714b = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WELAB_REDPOINT_STRING, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeLabRedPointMgr", "load red tag " + this.f97714b);
        if (android.text.TextUtils.isEmpty(this.f97714b)) {
            return;
        }
        for (java.lang.String str : this.f97714b.split("&")) {
            if (!android.text.TextUtils.isEmpty(str) && (split = str.split("=")) != null && split.length == 2) {
                this.f97713a.put(split[0], java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0)));
            }
        }
    }

    public boolean a(yy4.a aVar) {
        if (aVar.f66636xf1f8cd44 == 1) {
            return ((aVar.w0() || aVar.f66637xda33d239 == 3) || b(aVar.f66634x369ad11)) ? false : true;
        }
        return false;
    }

    public boolean b(java.lang.String str) {
        java.util.Map map = this.f97713a;
        return ((java.util.HashMap) map).containsKey(str) && ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue() == 1;
    }

    public final void c() {
        boolean z17;
        java.util.List d17 = sy4.m.f495417c.d();
        ((java.util.ArrayList) d17).isEmpty();
        java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = true;
                break;
            }
            yy4.a aVar = (yy4.a) it.next();
            if (aVar != null && f97712c.a(aVar)) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(266267, 266241);
        }
    }
}
