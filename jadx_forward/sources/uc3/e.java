package uc3;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 f507904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f507905b;

    public e(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 commonBinding, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonBinding, "commonBinding");
        this.f507904a = commonBinding;
        this.f507905b = i17;
    }

    @Override // com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d
    /* renamed from: createRuntime */
    public void mo43186xe258f33c(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d
    /* renamed from: destroyRuntime */
    public void mo43188x2c3bba7e() {
    }

    @Override // com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d
    /* renamed from: invokeCallbackHandler */
    public void mo43190x44c4dbad(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = this.f507904a;
        int i18 = this.f507905b;
        if (i18 > 0) {
            c5128x72a3f151.m43165x37ccb431(i18, uc3.a.f507893d, false);
        } else {
            c5128x72a3f151.m43164xf9d5210e(new uc3.b(this, i17, str, str2), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d
    /* renamed from: setJsExceptionCallback */
    public void mo43192xf5827fa9(android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d
    /* renamed from: subscribeHandler */
    public void mo43193xc5c86aa0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = this.f507904a;
        int i18 = this.f507905b;
        if (i18 > 0) {
            c5128x72a3f151.m43165x37ccb431(i18, uc3.c.f507898d, false);
        } else {
            c5128x72a3f151.m43164xf9d5210e(new uc3.d(this, str, str2, i17, str3), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d
    /* renamed from: createRuntime */
    public void mo43187xe258f33c(long j17, long j18, java.lang.String str, boolean z17) {
    }
}
