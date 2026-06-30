package km4;

/* loaded from: classes11.dex */
public final class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f390824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390825f;

    public j(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f390823d = lVar;
        this.f390824e = c0Var;
        this.f390825f = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364 enumC24972xf15f2364 = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3;
        yz5.l lVar = this.f390823d;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f390824e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f390825f;
        km4.l.c(lVar, c0Var, h0Var, enumC24972xf15f2364);
        km4.l.d(h0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingAdHelper", "openAD user cancel");
        km4.l.f390829a.a(14, null);
    }
}
