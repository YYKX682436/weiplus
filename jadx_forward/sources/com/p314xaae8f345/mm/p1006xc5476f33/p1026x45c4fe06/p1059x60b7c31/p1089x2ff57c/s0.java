package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class s0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f162655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f162657c;

    public s0(boolean[] zArr, int i17, android.webkit.ValueCallback valueCallback) {
        this.f162655a = zArr;
        this.f162656b = i17;
        this.f162657c = valueCallback;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        this.f162655a[this.f162656b] = false;
        android.webkit.ValueCallback valueCallback = this.f162657c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        this.f162655a[this.f162656b] = true;
        android.webkit.ValueCallback valueCallback = this.f162657c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
