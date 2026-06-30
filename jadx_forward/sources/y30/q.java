package y30;

@j95.b
/* loaded from: classes9.dex */
public class q extends i95.w implements z30.u {

    /* renamed from: d, reason: collision with root package name */
    public int f540675d = -1;

    public boolean wi() {
        if (this.f540675d == -1) {
            int i17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2555x33aff2.C20592x4c4a092e()) == 1 ? 1 : 0;
            this.f540675d = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiLogicService", "enableFlutterWeNote init =%d", java.lang.Integer.valueOf(i17));
        }
        return this.f540675d == 1;
    }
}
