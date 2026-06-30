package jb1;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, java.lang.String deviceID, java.lang.String serverID, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceID, "deviceID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverID, "serverID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.BlePeripheralPublishEventFuns", "jOnBLEPeripheralConnectionStateChanged: connected = " + z17 + ", deviceID = " + deviceID + ", serverID = " + serverID);
        try {
            jb1.u uVar = new jb1.u();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("deviceId", deviceID);
            jSONObject.put("serverId", serverID);
            jSONObject.put("connected", z17);
            uVar.r(jSONObject.toString());
            uVar.p(component);
            uVar.m();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.BlePeripheralPublishEventFuns", "BlePeripheralPublishEventFuns fail", e17);
        }
    }
}
