package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f173106d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.inputmethod.BaseInputConnection f173107e;

    public o(java.lang.String str, android.view.inputmethod.BaseInputConnection baseInputConnection) {
        super(null);
        this.f173106d = str;
        this.f173107e = baseInputConnection;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4
    public java.lang.String a() {
        android.text.Editable editable;
        android.view.inputmethod.BaseInputConnection baseInputConnection = this.f173107e;
        if (baseInputConnection == null || (editable = baseInputConnection.getEditable()) == null) {
            return null;
        }
        return editable.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4
    /* renamed from: getInputType */
    public java.lang.String mo53490x652bd76e() {
        return this.f173106d;
    }
}
