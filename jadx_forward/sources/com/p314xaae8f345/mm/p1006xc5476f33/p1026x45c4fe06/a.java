package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class a implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f156417a;

    public a(android.webkit.ValueCallback valueCallback) {
        this.f156417a = valueCallback;
    }

    @Override // cl.j1
    public final void a(java.lang.String str, cl.k1 k1Var) {
        android.webkit.ValueCallback valueCallback = this.f156417a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
