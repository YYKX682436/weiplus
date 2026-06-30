package yd;

/* loaded from: classes7.dex */
public final class d0 extends pf1.q implements pf1.d {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f542469i;

    /* renamed from: m, reason: collision with root package name */
    public final yd.z f542470m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.MutableContextWrapper context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, yd.z provider) {
        super(context, runtime);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f542469i = runtime;
        this.f542470m = provider;
        provider.Pf(context);
        android.view.View mo142289xfb86a31b = provider.mo142289xfb86a31b();
        if (mo142289xfb86a31b != null) {
            addView(mo142289xfb86a31b, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        provider.mo142287x74041feb(new pf1.h(this), "WeixinJSCore");
    }

    @Override // pf1.d
    public boolean a() {
        return false;
    }

    @Override // pf1.d
    /* renamed from: addJavascriptInterface */
    public void mo158319x74041feb(java.lang.Object obj, java.lang.String str) {
        this.f542470m.mo142287x74041feb(obj, str);
    }

    @Override // pf1.q
    /* renamed from: destroy */
    public void mo158326x5cd39ffa() {
        this.f542470m.mo142288x5cd39ffa();
    }

    @Override // pf1.d
    /* renamed from: evaluateJavascript */
    public void mo158321x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f542470m.jf(str);
    }

    /* renamed from: getProvider */
    public final yd.z m176828x40fe4367() {
        return this.f542470m;
    }

    @Override // pf1.q, pf1.c
    /* renamed from: getWebView */
    public pf1.d mo158318x86b9ebe3() {
        return this;
    }

    @Override // pf1.d
    /* renamed from: onHide */
    public void mo158322xc39a57c1() {
    }

    @Override // pf1.d
    /* renamed from: onShow */
    public void mo158323xc39f557c() {
    }
}
