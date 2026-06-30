package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class o extends com.tencent.mm.plugin.appbrand.widget.input.f4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f91573d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.inputmethod.BaseInputConnection f91574e;

    public o(java.lang.String str, android.view.inputmethod.BaseInputConnection baseInputConnection) {
        super(null);
        this.f91573d = str;
        this.f91574e = baseInputConnection;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.v4
    public java.lang.String a() {
        android.text.Editable editable;
        android.view.inputmethod.BaseInputConnection baseInputConnection = this.f91574e;
        if (baseInputConnection == null || (editable = baseInputConnection.getEditable()) == null) {
            return null;
        }
        return editable.toString();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.v4
    public java.lang.String getInputType() {
        return this.f91573d;
    }
}
