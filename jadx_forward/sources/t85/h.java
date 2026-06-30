package t85;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final t85.h f498004d = new t85.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String[] D = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(path)).D();
        if (D != null) {
            if (!(D.length == 0)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(D.length);
                for (java.lang.String str : D) {
                    t85.f fVar = new t85.f();
                    java.lang.String str2 = path + str + '/';
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                    fVar.f498001d = str2;
                    java.lang.String jsonFile = fVar.f498001d + "config.json";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonFile, "jsonFile");
                    try {
                        fVar.a(new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(jsonFile)));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseJsonObject", e17, "", new java.lang.Object[0]);
                    }
                    arrayList.add(fVar);
                }
                return arrayList;
            }
        }
        return kz5.p0.f395529d;
    }
}
