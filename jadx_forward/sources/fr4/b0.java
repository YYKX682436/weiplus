package fr4;

/* loaded from: classes11.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f347336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f347338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347339d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, android.content.Context context, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str) {
        this.f347336a = sVar;
        this.f347337b = context;
        this.f347338c = abstractViewOnAttachStateChangeListenerC21400xb429b010;
        this.f347339d = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("changeW1wPersonalMsgIdentityAction", str)) {
            return true;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f347336a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            android.content.Context context = this.f347337b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f347338c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractViewOnAttachStateChangeListenerC21400xb429b010);
            fr4.r.b(sVar, j17, (org.json.JSONObject) obj, i17, context, abstractViewOnAttachStateChangeListenerC21400xb429b010, this.f347339d);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "Failed to handle identity change action", e17);
            return true;
        }
    }
}
