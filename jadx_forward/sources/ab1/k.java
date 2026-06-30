package ab1;

/* loaded from: classes.dex */
public final class k implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f84261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84263f;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f84261d = c0Var;
        this.f84262e = aVar;
        this.f84263f = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        if (!this.f84261d.f391645d) {
            this.f84262e.mo152xb9724478();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g.b((android.app.Dialog) this.f84263f.f391656d);
    }
}
