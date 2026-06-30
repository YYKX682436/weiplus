package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7;

/* loaded from: classes7.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 f128781a;

    public p(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r rVar, com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399) {
        this.f128781a = c3896xa9b9c399;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q3
    public boolean a(java.lang.String str) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399 = this.f128781a;
        if (!n3.x0.b(c3896xa9b9c399)) {
            return false;
        }
        if ("[DELETE_EMOTION]".equalsIgnoreCase(str)) {
            c3896xa9b9c399.getClass();
            c3896xa9b9c399.dispatchKeyEvent(new android.view.KeyEvent(0, 67));
            c3896xa9b9c399.dispatchKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            c3896xa9b9c399.append(str);
        }
        return true;
    }
}
