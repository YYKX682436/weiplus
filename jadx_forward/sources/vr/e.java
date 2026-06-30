package vr;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f520930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f520931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f520932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vr.g gVar, android.content.Context context, yz5.l lVar) {
        super(1);
        this.f520930d = gVar;
        this.f520931e = context;
        this.f520932f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity;
        int intValue = ((java.lang.Number) obj).intValue();
        vr.g gVar = this.f520930d;
        int ceil = (int) java.lang.Math.ceil(intValue * vr.g.a(gVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizEmoticonContext", "h5 input panel height: " + intValue + ", panelHeight:" + ceil + ", webview density: " + vr.g.a(gVar));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, ceil);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = -ceil;
        android.content.Context context = this.f520931e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context context2 = context;
        while (true) {
            if (!(context2 instanceof android.content.ContextWrapper)) {
                activity = null;
                break;
            }
            if (context2 instanceof android.app.Activity) {
                activity = (android.app.Activity) context2;
                break;
            }
            context2 = ((android.content.ContextWrapper) context2).getBaseContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getBaseContext(...)");
        }
        yz5.l lVar = this.f520932f;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizEmoticonContext", "context isn't Activity, " + context);
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = gVar.f520938c;
            activity.addContentView(abstractC19636xc6b37291, layoutParams);
            abstractC19636xc6b37291.animate().translationY(-ceil).withStartAction(new vr.d(gVar)).setDuration(300L).start();
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
