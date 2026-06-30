package sf1;

/* loaded from: classes13.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f488550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488551i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, android.app.Activity activity, java.lang.String str) {
        super(0);
        this.f488546d = h0Var;
        this.f488547e = h0Var2;
        this.f488548f = h0Var3;
        this.f488549g = h0Var4;
        this.f488550h = activity;
        this.f488551i = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wu5.c cVar = (wu5.c) this.f488546d.f391656d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        rf1.c cVar2 = (rf1.c) this.f488547e.f391656d;
        if (cVar2 != null) {
            rf1.d.c(cVar2);
        }
        android.content.BroadcastReceiver broadcastReceiver = (android.content.BroadcastReceiver) this.f488548f.f391656d;
        if (broadcastReceiver != null) {
            this.f488550h.unregisterReceiver(broadcastReceiver);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0) this.f488549g.f391656d;
        if (v0Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f488551i, v0Var);
        return jz5.f0.f384359a;
    }
}
