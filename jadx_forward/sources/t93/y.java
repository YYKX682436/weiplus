package t93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/y;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiShareFinderShop", "invoke appId:" + str + ",data:" + jSONObject);
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (context = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            context = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3325xe03a0797.p3326xc267989b.l.d(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? v65.m.b((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context) : p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new t93.x(context, jSONObject, this, null), 3, null);
    }
}
