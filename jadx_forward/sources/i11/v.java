package i11;

/* loaded from: classes13.dex */
public class v implements com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.InterfaceC4227xc9310094 {
    public v(i11.u uVar) {
    }

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.InterfaceC4227xc9310094
    /* renamed from: onLog */
    public void mo34986x64f5ce5(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            return;
        }
        if (i17 != 6) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = th6 != null ? th6.getMessage() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SLocationManager", "tag:%s msg:%s th:%s", objArr);
    }
}
