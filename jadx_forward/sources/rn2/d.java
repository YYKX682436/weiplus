package rn2;

/* loaded from: classes3.dex */
public final class d implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.a94 f479219a;

    public d(r45.a94 a94Var) {
        this.f479219a = a94Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryCreateConfig", "setLiveLotterySetting fail!");
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        g92.b bVar = g92.b.f351302e;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        m92.c cVar = new m92.c(xy2.c.e(context));
        r45.kz0 kz0Var = cVar.f68702x723e3d5f;
        r45.a94 a94Var = this.f479219a;
        if (kz0Var != null) {
            kz0Var.set(4, a94Var);
        }
        bVar.C(cVar, m92.j.f406534s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateConfig", "setLiveLotterySetting success:" + a94Var.f451390d + ", " + a94Var.f451391e + '!');
    }
}
