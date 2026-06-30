package rg0;

/* loaded from: classes8.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg0.z f476733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rg0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476733d = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rg0.x(this.f476733d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rg0.x xVar = (rg0.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        float f17;
        java.lang.String str;
        java.lang.reflect.Method method;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qg0.e0 e0Var = (qg0.e0) i95.n0.c(qg0.e0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ((pg0.l3) e0Var).getClass();
        jSONObject.put("HonorRootFlag", (int) v75.c.f515486a.a());
        jz5.g gVar = v75.j.f515499a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.j.f515499a).mo141623x754a37bb();
        if (cls != null) {
            try {
                java.lang.reflect.Method method2 = cls.getMethod("getDetectResult", new java.lang.Class[0]);
                if (method2 == null) {
                    f17 = -5.0f;
                } else {
                    java.lang.Object invoke = method2.invoke(((jz5.n) v75.j.f515500b).mo141623x754a37bb(), new java.lang.Object[0]);
                    if (invoke != null) {
                        java.lang.Class<?> cls2 = invoke.getClass();
                        java.lang.reflect.Method method3 = cls2.getMethod("getErrorCode", new java.lang.Class[0]);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method3 != null ? method3.invoke(invoke, new java.lang.Object[0]) : null, 0)) {
                            java.lang.reflect.Method method4 = cls2.getMethod("getResult", new java.lang.Class[0]);
                            java.lang.Object invoke2 = method4 != null ? method4.invoke(invoke, new java.lang.Object[0]) : null;
                            java.lang.Float f18 = invoke2 instanceof java.lang.Float ? (java.lang.Float) invoke2 : null;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Honor.RiskDetect", "risk app result:" + f18);
                            f17 = f18 != null ? f18.floatValue() : -4.0f;
                        }
                    }
                    f17 = -3.0f;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.RiskDetect", th6, "getRiskAppResult", new java.lang.Object[0]);
                f17 = -2.0f;
            }
        } else {
            f17 = -1.0f;
        }
        jSONObject.put("HonorRiskAppFlag", (int) f17);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            v75.g gVar2 = v75.g.f515492a;
            java.lang.Class cls3 = (java.lang.Class) ((jz5.n) v75.g.f515494c).mo141623x754a37bb();
            if (cls3 != null) {
                try {
                    if (gVar2.a() == 0 && (method = cls3.getMethod("getDetectResult", new java.lang.Class[0])) != null) {
                        str = gVar2.b(method.invoke(v75.g.f515493b, new java.lang.Object[0]));
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.FraudAppDetect", th7, "getFraudAppResult", new java.lang.Object[0]);
                }
            }
            str = "error";
        } else {
            str = "os version not support";
        }
        jSONObject.put("HonorFraudAppInfo", new org.json.JSONObject(str));
        rg0.z zVar = this.f476733d;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        zVar.f476736d = jSONObject2;
        return jz5.f0.f384359a;
    }
}
