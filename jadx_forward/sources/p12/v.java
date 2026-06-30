package p12;

/* loaded from: classes10.dex */
public final class v implements o12.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p12.w f432586a;

    public v(p12.w wVar) {
        this.f432586a = wVar;
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoRenderViewController", "onSlidingStarted, startTime: " + i17 + ", endTime: " + i18);
        kk4.b player = this.f432586a.f432590j.getPlayer();
        if (player != null) {
            kk4.b.i(player, false, false, 3, null);
        }
    }

    public void b(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoRenderViewController", "onSlidingStopped, startTime: " + i17 + ", endTime: " + i18);
        android.util.Range range = new android.util.Range(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        p12.w wVar = this.f432586a;
        wVar.getClass();
        wVar.f432559e = range;
        kk4.b player = wVar.f432590j.getPlayer();
        if (player != null) {
            ((kk4.v) player).H(i17, i18);
        }
        kk4.b player2 = wVar.f432590j.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).O();
        }
    }

    public void c(int i17, int i18, o12.g0 dragSide) {
        kk4.b player;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragSide, "dragSide");
        o12.g0 g0Var = o12.g0.f423684f;
        p12.w wVar = this.f432586a;
        if (dragSide == g0Var) {
            kk4.b player2 = wVar.f432590j.getPlayer();
            if (player2 != null) {
                kk4.b.f(player2, i18, true, null, 4, null);
                return;
            }
            return;
        }
        if (dragSide != o12.g0.f423683e || (player = wVar.f432590j.getPlayer()) == null) {
            return;
        }
        kk4.b.f(player, i17, true, null, 4, null);
    }
}
