package ib1;

/* loaded from: classes7.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69905x366c91de = 1059;

    /* renamed from: NAME */
    public static final java.lang.String f69906x24728b = "isBluetoothDevicePaired";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        if (lVar == null) {
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, data is null", new java.lang.Object[0]);
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        if (!jSONObject.has("deviceId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, do not have key: deviceId", new java.lang.Object[0]);
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, deviceId: " + optString, new java.lang.Object[0]);
        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, deviceId is illegal", new java.lang.Object[0]);
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar.a(i17, u(str, jSONObject4));
            return;
        }
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        java.lang.Object obj = null;
        android.bluetooth.BluetoothDevice bluetoothDevice = null;
        if (d17 == null || !d17.isEnabled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, bluetoothAdapter is null or disabled", new java.lang.Object[0]);
            java.lang.String str5 = android.text.TextUtils.isEmpty("fail:not available") ? null : "fail:not available";
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 1500102);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, u(str5, jSONObject5));
            return;
        }
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = d17.getBondedDevices();
        if (bondedDevices != null) {
            java.util.Iterator<T> it = bondedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, ((android.bluetooth.BluetoothDevice) next).getAddress())) {
                    obj = next;
                    break;
                }
            }
            bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
        }
        boolean z17 = bluetoothDevice != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiIsBluetoothDevicePaired", "invoke, isPaired: " + z17, new java.lang.Object[0]);
        java.util.Map l17 = kz5.c1.l(new jz5.l("isPaired", java.lang.Boolean.valueOf(z17)));
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        l17.put("errno", 0);
        lVar.a(i17, t("ok", l17));
    }
}
