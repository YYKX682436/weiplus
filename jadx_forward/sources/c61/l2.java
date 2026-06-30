package c61;

/* loaded from: classes5.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c61.l2 f120644d = new c61.l2();

    public l2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean isEmpty;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.R = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoOrientationUIC", "checkSysAllowRotate: systemEnableLandscape = " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.R);
        yp.f fVar = yp.f.f545911a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bb2.x2 x2Var = new bb2.x2(context);
        synchronized (yp.f.f545913c) {
            isEmpty = fVar.a(0).isEmpty();
        }
        if (isEmpty) {
            d75.b.g(new yp.d(x2Var));
        }
        return jz5.f0.f384359a;
    }
}
