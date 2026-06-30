package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.x0 f178176d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.x0 x0Var) {
        this.f178176d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View currentFocus = this.f178176d.f178195e.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.requestFocusFromTouch();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(currentFocus != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "setVKBVisibility222 postDelayed requestFocusFromTouch[%s]", objArr);
    }
}
