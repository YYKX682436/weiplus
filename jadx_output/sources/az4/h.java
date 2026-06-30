package az4;

/* loaded from: classes15.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final az4.h f16179c = new az4.h();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f16180a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f16181b;

    public h() {
        java.lang.String[] split;
        this.f16181b = "";
        this.f16181b = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WELAB_REDPOINT_STRING, null);
        com.tencent.mars.xlog.Log.i("WeLabRedPointMgr", "load red tag " + this.f16181b);
        if (android.text.TextUtils.isEmpty(this.f16181b)) {
            return;
        }
        for (java.lang.String str : this.f16181b.split("&")) {
            if (!android.text.TextUtils.isEmpty(str) && (split = str.split("=")) != null && split.length == 2) {
                this.f16180a.put(split[0], java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0)));
            }
        }
    }

    public boolean a(yy4.a aVar) {
        if (aVar.field_RedPoint == 1) {
            return ((aVar.w0() || aVar.field_Switch == 3) || b(aVar.field_LabsAppId)) ? false : true;
        }
        return false;
    }

    public boolean b(java.lang.String str) {
        java.util.Map map = this.f16180a;
        return ((java.util.HashMap) map).containsKey(str) && ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue() == 1;
    }

    public final void c() {
        boolean z17;
        java.util.List d17 = sy4.m.f413884c.d();
        ((java.util.ArrayList) d17).isEmpty();
        java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = true;
                break;
            }
            yy4.a aVar = (yy4.a) it.next();
            if (aVar != null && f16179c.a(aVar)) {
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
