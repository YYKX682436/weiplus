package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.p3210x3857dc.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f296361a;

    public c(android.webkit.ValueCallback valueCallback) {
        this.f296361a = valueCallback;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void a() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
        android.webkit.ValueCallback valueCallback;
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "onGeneralCallback error, param is null");
            return;
        }
        if ("gc_onCustomMenuClick".equals(str)) {
            java.lang.Object obj = hashMap.get("gc_customMenuId");
            if (obj instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) obj).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "onGeneralCallback onCustomMenuClick, id = " + intValue);
                if (intValue == 0 && (valueCallback = this.f296361a) != null) {
                    valueCallback.onReceiveValue("xwebFileReaderMenuEditClick");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void c() {
        android.webkit.ValueCallback valueCallback = this.f296361a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue("xwebFileReaderUserOperated");
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void d(int i17, android.graphics.Bitmap bitmap) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void e(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void f(int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void h(android.view.MotionEvent motionEvent) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void i() {
        android.webkit.ValueCallback valueCallback = this.f296361a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue("xwebFileReaderReachEnd");
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    /* renamed from: onDoubleTap */
    public void mo56908xce1d2af3(android.view.MotionEvent motionEvent) {
    }
}
