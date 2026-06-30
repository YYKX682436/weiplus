package ws0;

/* loaded from: classes10.dex */
public final class b {
    public static final void a(android.hardware.camera2.CaptureRequest.Builder builder, xs0.a aVar, boolean z17, java.lang.Object value) {
        android.hardware.camera2.CaptureRequest.Key key;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (aVar == null) {
            return;
        }
        java.lang.Object obj = aVar.f537820c;
        java.lang.Object obj2 = null;
        if (obj instanceof java.lang.Integer) {
            java.lang.String str = aVar.f537823f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            key = xs0.c.a(str, java.lang.Integer.TYPE);
        } else if (obj instanceof java.lang.Boolean) {
            java.lang.String str2 = aVar.f537823f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            key = xs0.c.a(str2, java.lang.Boolean.TYPE);
        } else if (obj instanceof java.lang.String) {
            java.lang.String str3 = aVar.f537823f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            key = xs0.c.a(str3, java.lang.String.class);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WCCameraEffectHelper", "getVendorTagCaptureKeyByCreator: with unknow type value = " + aVar.f537820c + " key = " + aVar.f537823f);
            key = null;
        }
        java.lang.Object obj3 = aVar.f537822e;
        if (obj3 instanceof android.util.Range) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
            obj2 = ((android.util.Range) obj3).getLower();
        } else if (obj3 instanceof java.util.ArrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj3;
            java.lang.Object obj4 = arrayList.get(0);
            if (obj4 instanceof java.lang.Integer) {
                java.lang.Object obj5 = arrayList.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                obj2 = (java.lang.Integer) obj5;
            } else if (obj4 instanceof java.lang.Boolean) {
                java.lang.Object obj6 = arrayList.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                obj2 = (java.lang.Boolean) obj6;
            } else if (obj4 instanceof java.lang.String) {
                java.lang.Object obj7 = arrayList.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj7, "null cannot be cast to non-null type kotlin.String");
                obj2 = (java.lang.String) obj7;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCCameraEffectHelper", aVar.f537821d + " has been set value is " + z17);
        if (value instanceof java.lang.Integer) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.Int>");
            if (!z17) {
                value = obj2;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.Int");
            builder.set(key, (java.lang.Integer) value);
            return;
        }
        if (value instanceof java.lang.Boolean) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.Boolean>");
            builder.set(key, java.lang.Boolean.valueOf(z17));
        } else {
            if (!(value instanceof java.lang.String)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCCameraEffectHelper", "error set config");
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<kotlin.String>");
            if (!z17) {
                value = obj2;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
            builder.set(key, (java.lang.String) value);
        }
    }
}
