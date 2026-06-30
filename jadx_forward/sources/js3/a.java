package js3;

/* loaded from: classes5.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelMailMsgTask", "delete mail msg %s", c10756x2a5d7b2d.m46222x9616526c());
        java.lang.String[] split = c10756x2a5d7b2d.m46222x9616526c().split(";");
        if (split.length == 2) {
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[0]);
            java.lang.String str = split[1];
            if (E1 != 0) {
                pt0.f0.P7(str, E1);
            }
        }
    }
}
