package mq1;

@j95.b
/* loaded from: classes10.dex */
public class w0 extends i95.w implements mq1.g0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f412229d;

    public static void wi() {
        if (f412229d) {
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.i.f243949a) {
            fp.d0.o("xffmpeg");
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.i.f243949a = true;
        }
        lg0.q.a();
        fp.d0.o("wechatsight_v7a");
        fp.d0.o("wechatpack");
        f412229d = true;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        int a17 = wo.r.a() >> 12;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightInitTask", "load wechatsight_v7a, core number[%d]", java.lang.Integer.valueOf(a17));
        if (a17 >= 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243939a = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243940b = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c = 544000;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243939a = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243940b = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c = 640000;
        }
    }
}
