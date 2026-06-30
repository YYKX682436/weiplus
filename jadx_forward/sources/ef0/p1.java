package ef0;

/* loaded from: classes2.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f333829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f333830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Context context) {
        super(0);
        this.f333829d = componentCallbacksC1101xa17d4670;
        this.f333830e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f333829d;
        boolean z17 = componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010;
        android.content.Context context = this.f333830e;
        if (z17) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) componentCallbacksC1101xa17d4670;
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78646xc2a54588();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyw), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572132zl), abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), new ef0.n1(context), null);
        } else if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyw), activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572132zl), activity, new ef0.o1(context), null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingAddToPlayListFeatureService", "showSuccessTips invalid context");
        }
        return jz5.f0.f384359a;
    }
}
