package aa3;

/* loaded from: classes7.dex */
public final class a implements aa3.c {
    @Override // aa3.c
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "onKeyboardStateChanged");
    }

    @Override // aa3.c
    public void b() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", qc1.v.NAME);
    }

    @Override // aa3.c
    public android.view.View getView() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "getView");
        return null;
    }

    @Override // aa3.c
    public void hideKeyboard() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", qc1.e.NAME);
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "updateInputConnection");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "isRealHeightSettled");
        return false;
    }

    @Override // aa3.c
    public void setXMode(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.DummyExtendKeyboard", "setXMode");
    }
}
