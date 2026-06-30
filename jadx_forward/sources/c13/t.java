package c13;

/* loaded from: classes11.dex */
public final class t implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c13.t f119454d = new c13.t();

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "physicalOrientationObserver, " + num);
        c13.b0 b0Var = c13.b0.f119393d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "onPhysicalOrientationChanged: " + intValue);
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89485x98b40f0(intValue, new c13.c("onPhysicalOrientationChanged: " + intValue + ", callback"));
        }
    }
}
