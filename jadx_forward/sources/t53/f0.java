package t53;

/* loaded from: classes8.dex */
public final class f0 implements u53.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f497283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f497284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f497285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.j f497286e;

    public f0(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, ik1.b0 b0Var, android.content.Context context, t53.j jVar) {
        this.f497282a = str;
        this.f497283b = c0Var;
        this.f497284c = b0Var;
        this.f497285d = context;
        this.f497286e = jVar;
    }

    @Override // u53.w
    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame removeBlackList userName:%s isSuccess:%b, dealWaGameTogether:%b", this.f497282a, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f497283b.f391645d));
        if (z17) {
            this.f497284c.f373357a = java.lang.Boolean.valueOf(!((java.lang.Boolean) r4.f373357a).booleanValue());
        } else {
            dp.a.m125853x26a183b(this.f497285d, com.p314xaae8f345.mm.R.C30867xcad56011.fqi, 0).show();
        }
        t53.j jVar = this.f497286e;
        java.lang.Object value = this.f497284c.f373357a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        boolean booleanValue = ((java.lang.Boolean) value).booleanValue();
        com.p314xaae8f345.mm.ui.oi oiVar = (com.p314xaae8f345.mm.ui.oi) jVar;
        oiVar.getClass();
        oiVar.f291011a.runOnUiThread(new com.p314xaae8f345.mm.ui.ni(oiVar, booleanValue));
    }
}
