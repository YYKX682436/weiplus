package t00;

/* loaded from: classes9.dex */
public abstract class b implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f495798a;

    public b(java.lang.Class classZ) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classZ, "classZ");
        this.f495798a = classZ;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonCgiEcsActionHandler", "handleAction params is null");
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = null;
        try {
            if (this instanceof t00.h) {
                java.lang.String optString = jSONObject != null ? jSONObject.optString("mmModel") : null;
                try {
                    java.lang.reflect.Constructor declaredConstructor = this.f495798a.getDeclaredConstructor(new java.lang.Class[0]);
                    declaredConstructor.setAccessible(true);
                    fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) declaredConstructor.newInstance(new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
                if (fVar != null) {
                    fVar.mo11468x92b714fd(android.util.Base64.decode(optString, 2));
                }
            } else {
                fVar = h(context, optJSONObject, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonCgiEcsActionHandler", "handleAction error:" + e17);
        }
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonCgiEcsActionHandler", "handleAction model is null");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("error", "MicroMsg.CommonCgiEcsActionHandler params error. model is null");
            callback.d(jSONObject2);
            return;
        }
        t00.h hVar = (t00.h) this;
        bw5.ef0 ef0Var = (bw5.ef0) fVar;
        java.lang.String b17 = ef0Var.b();
        if (!(b17 == null || b17.length() == 0)) {
            z20.e eVar = z20.e.f551076e;
            z20.b bVar = new z20.b();
            bVar.f551070a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f113532d = "commonCgi";
            q9Var.f113546u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f551071b = q9Var;
            bVar.c("Native_reqStart");
            bVar.f(ef0Var.b());
            bVar.a();
        }
        int i18 = y02.h.f540139d;
        y02.g gVar = (y02.g) p3380x6a61f93.p3387xf51c6630.C30628x21b46ffe.m170379x21b0d463();
        if (gVar != null) {
            t00.g gVar2 = new t00.g(hVar, ef0Var, callback);
            byte[] mo14344x5f01b1f6 = ef0Var.mo14344x5f01b1f6();
            y02.o1 o1Var = new y02.o1();
            o1Var.f540157m = gVar2;
            long m105978x2737f10 = ((y02.h) gVar).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3387xf51c6630.C30628x21b46ffe.m170381x21b9783c(m105978x2737f10, mo14344x5f01b1f6, o1Var);
        }
    }

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.f h(android.content.Context context, org.json.JSONObject jSONObject, c00.q3 q3Var);
}
