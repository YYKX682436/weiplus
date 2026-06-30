package js3;

/* loaded from: classes.dex */
public class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("kv_report_key");
        int i18 = bundle.getInt("kv_report_value");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportKVTask", "report key %d, value %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
