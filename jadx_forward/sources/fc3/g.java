package fc3;

/* loaded from: classes9.dex */
public final class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.h f342574d;

    public g(fc3.h hVar) {
        this.f342574d = hVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        fc3.h hVar = this.f342574d;
        if (hVar.f342580e.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyWordCloudTextHelper", "textCloud is empty, something is wrong");
            return true;
        }
        java.util.List list = hVar.f342580e;
        c06.d dVar = c06.e.f119249d;
        java.lang.String str = (java.lang.String) list.get(dVar.d(list.size()));
        android.graphics.PointF center = hVar.f342578c.f342613e;
        int b17 = i65.a.b(hVar.f342576a, 72);
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(center, "center");
        double j17 = dVar.j(0.0d, 200.0d);
        if (j17 > 10.0d) {
            j17 += 160;
        }
        double radians = java.lang.Math.toRadians(j17);
        double d17 = b17;
        hVar.f342578c.c(new fc3.k(str, new android.graphics.PointF((float) (center.x + (java.lang.Math.cos(radians) * d17)), (float) (center.y + (d17 * java.lang.Math.sin(radians)))), 12.0f, 0.0f));
        return true;
    }
}
