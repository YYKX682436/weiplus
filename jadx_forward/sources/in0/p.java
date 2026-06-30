package in0;

/* loaded from: classes3.dex */
public final class p implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in0.q f374301a;

    public p(in0.q qVar) {
        this.f374301a = qVar;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced
    public int a(int i17, java.lang.String message, tq5.g type) {
        java.lang.Object obj;
        boolean z17;
        java.lang.Object obj2;
        float f17;
        float f18;
        float f19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "weVisionJsonCallback-cb type=" + type + " sourceId=" + i17 + " message=" + message);
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        in0.q qVar = this.f374301a;
        java.util.Iterator it = ((p05.j0) qVar.V1).f432090e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.o) obj).f384374d).longValue() == ((long) i17)) {
                break;
            }
        }
        if (obj != null) {
            try {
                cl0.g gVar = new cl0.g(message);
                cl0.e jSONArray = gVar.getJSONArray("actived");
                if (jSONArray.mo15056xbe0e3ae6() > 0) {
                    java.lang.Object obj3 = jSONArray.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    z17 = ((java.lang.Boolean) obj3).booleanValue();
                } else {
                    z17 = false;
                }
                if (z17) {
                    p05.p0 p0Var = qVar.V1;
                    int optInt = gVar.optInt(dm.i4.f66865x76d1ec5a);
                    java.util.Iterator it6 = ((p05.j0) p0Var).f432090e.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (((java.lang.Number) ((jz5.o) obj2).f384374d).longValue() == ((long) optInt)) {
                            break;
                        }
                    }
                    jz5.o oVar = (jz5.o) obj2;
                    java.lang.String valueOf = java.lang.String.valueOf(oVar != null ? ((java.lang.Number) oVar.f384375e).intValue() : 0);
                    cl0.e jSONArray2 = gVar.getJSONArray("transX");
                    float f27 = 0.0f;
                    if (jSONArray2.mo15056xbe0e3ae6() > 0) {
                        java.lang.Object obj4 = jSONArray2.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Double");
                        f17 = (float) ((java.lang.Double) obj4).doubleValue();
                    } else {
                        f17 = 0.0f;
                    }
                    cl0.e jSONArray3 = gVar.getJSONArray("transY");
                    if (jSONArray3.mo15056xbe0e3ae6() > 0) {
                        java.lang.Object obj5 = jSONArray3.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Double");
                        f18 = (float) ((java.lang.Double) obj5).doubleValue();
                    } else {
                        f18 = 0.0f;
                    }
                    cl0.e jSONArray4 = gVar.getJSONArray("rotation");
                    if (jSONArray4.mo15056xbe0e3ae6() > 0) {
                        java.lang.Object obj6 = jSONArray4.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type kotlin.Double");
                        f19 = (float) ((java.lang.Double) obj6).doubleValue();
                    } else {
                        f19 = 0.0f;
                    }
                    cl0.e jSONArray5 = gVar.getJSONArray("scale");
                    if (jSONArray5.mo15056xbe0e3ae6() > 0) {
                        java.lang.Object obj7 = jSONArray5.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj7, "null cannot be cast to non-null type kotlin.Double");
                        f27 = (float) ((java.lang.Double) obj7).doubleValue();
                    }
                    yz5.s sVar = qVar.Y1;
                    if (sVar != null) {
                        java.lang.Object v17 = sVar.v(valueOf, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27));
                        in0.a aVar = (in0.a) (((in0.a) v17).f374264a ? v17 : null);
                        if (aVar != null) {
                            com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T = qVar.T();
                            byte[] bytes = in0.q.S0(qVar, aVar.f374265b, aVar.f374266c, aVar.f374267d, aVar.f374268e, aVar.f374269f, aVar.f374270g, aVar.f374271h, aVar.f374272i, aVar.f374273j, aVar.f374274k).getBytes(r26.c.f450398a);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                            T.mo30315x1a3ef952(bytes, 1);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCoreAnchor", e17.toString());
            }
        } else if (((p05.l0) qVar.W1).d(i17)) {
            try {
                long optLong = new cl0.g(message).optLong(dm.i4.f66865x76d1ec5a);
                if (optLong > 0) {
                    qVar.f502304r.l(new in0.o(qVar, i17, optLong));
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCoreAnchor", e18.toString());
            }
        }
        return 0;
    }
}
