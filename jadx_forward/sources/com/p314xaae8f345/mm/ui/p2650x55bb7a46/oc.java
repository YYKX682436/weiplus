package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes14.dex */
public final class oc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc f283606a;

    public oc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc pcVar) {
        this.f283606a = pcVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null && num.intValue() == 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.pc pcVar = this.f283606a;
        if (num != null && -17 == num.intValue()) {
            db5.t7.g(pcVar.getContext(), pcVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf6));
        } else {
            db5.t7.g(pcVar.getContext(), pcVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibr));
        }
        if (pcVar.f283626f == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().h();
        }
    }
}
