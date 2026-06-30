package fr4;

/* loaded from: classes5.dex */
public final class c0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f347340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f347343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f347346g;

    public c0(fr4.g0 g0Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f347340a = g0Var;
        this.f347341b = str;
        this.f347342c = str2;
        this.f347343d = abstractViewOnAttachStateChangeListenerC21400xb429b010;
        this.f347344e = str3;
        this.f347345f = str4;
        this.f347346g = z17;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "W1w identity change liteapp failed");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "W1w identity change liteapp opened successfully");
        fr4.g0 g0Var = this.f347340a;
        vu4.d dVar = vu4.d.f521833p;
        java.lang.String str = this.f347341b;
        java.lang.String str2 = this.f347342c;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f347343d;
        java.lang.String m78394x7e63ed49 = abstractViewOnAttachStateChangeListenerC21400xb429b010 != null ? abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_session_id") : null;
        java.lang.String m78394x7e63ed492 = abstractViewOnAttachStateChangeListenerC21400xb429b010 != null ? abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_ext_info") : null;
        this.f347340a.getClass();
        g0Var.cj(dVar, str, str2, m78394x7e63ed49, m78394x7e63ed492, mr4.a.c(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f), vu4.e.f521840f, mr4.a.a("message_input:message_input"), this.f347344e, this.f347345f, this.f347346g ? vu4.g.f521857f : vu4.g.f521856e);
    }
}
