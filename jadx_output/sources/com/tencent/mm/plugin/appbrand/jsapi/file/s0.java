package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class s0 implements com.tencent.mm.plugin.appbrand.utils.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f81122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f81124c;

    public s0(boolean[] zArr, int i17, android.webkit.ValueCallback valueCallback) {
        this.f81122a = zArr;
        this.f81123b = i17;
        this.f81124c = valueCallback;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        this.f81122a[this.f81123b] = false;
        android.webkit.ValueCallback valueCallback = this.f81124c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f81122a[this.f81123b] = true;
        android.webkit.ValueCallback valueCallback = this.f81124c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
