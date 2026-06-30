package js3;

/* loaded from: classes.dex */
public class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        long j17 = bundle.getLong("msgid", 0L);
        java.lang.String string = bundle.getString("talker", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetMailMsgTask", "get mail msg %d", java.lang.Long.valueOf(j17));
        rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(j17 != 0 ? pt0.f0.Li(string, j17).j() : ""));
    }
}
