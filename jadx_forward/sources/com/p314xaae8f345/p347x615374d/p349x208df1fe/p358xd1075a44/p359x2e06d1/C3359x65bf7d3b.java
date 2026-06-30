package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl */
/* loaded from: classes9.dex */
public class C3359x65bf7d3b implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004 {

    /* renamed from: context */
    private java.lang.ref.WeakReference<android.content.Context> f13266x38b735af;

    /* renamed from: secureViews */
    private java.util.ArrayList<java.lang.Integer> f13267x53e36137 = new java.util.ArrayList<>();

    public C3359x65bf7d3b(android.content.Context context) {
        this.f13266x38b735af = new java.lang.ref.WeakReference<>(context);
    }

    /* renamed from: addSecureView */
    public boolean m27155x5ebd363d(int i17) {
        return this.f13267x53e36137.add(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3416x710a1004
    /* renamed from: currentPlatform */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3591x7397cc93 mo25887xf60f010c() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3591x7397cc93.ANDROID;
    }

    /* renamed from: getContext */
    public android.content.Context m27156x76847179() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.f13266x38b735af;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getSecureViews */
    public java.util.ArrayList<java.lang.Integer> m27157x2db9a801() {
        return this.f13267x53e36137;
    }

    /* renamed from: removeSecureView */
    public boolean m27158x9b3e7660(java.lang.Integer num) {
        if (num == null || this.f13267x53e36137.size() <= 0) {
            return false;
        }
        return this.f13267x53e36137.remove(num);
    }

    /* renamed from: setContext */
    public void m27159xe9f5beed(android.content.Context context) {
        this.f13266x38b735af = new java.lang.ref.WeakReference<>(context);
    }
}
