package gi;

/* loaded from: classes12.dex */
public class z0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi.w0 f353764a;

    public z0(gi.w0 w0Var) {
        this.f353764a = w0Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (wh.m.w(context)) {
            return rh.c3.f476872o;
        }
        long h17 = wh.m.h(context);
        if (h17 == -1) {
            return rh.c3.f476872o;
        }
        long f17 = pj.i.f(h17, 3000L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.MMCompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + h17 + "/" + f17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        gi.w0 w0Var = this.f353764a;
        long[] longArray = w0Var.f476860i.getLongArray("extra_batt_curr_list");
        if (longArray != null) {
            for (long j17 : longArray) {
                arrayList.add(java.lang.Long.valueOf(j17));
            }
        }
        if (arrayList.size() >= 10) {
            arrayList.remove(0);
        }
        arrayList.add(java.lang.Long.valueOf(f17));
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i17 = 0; i17 < size; i17++) {
            jArr[i17] = ((java.lang.Long) arrayList.get(i17)).longValue();
        }
        w0Var.f476860i.putLongArray("extra_batt_curr_list", jArr);
        return java.lang.Long.valueOf(f17);
    }
}
