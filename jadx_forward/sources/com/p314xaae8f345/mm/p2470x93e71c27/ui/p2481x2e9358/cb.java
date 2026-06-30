package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class cb implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f271782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.eb f271783b;

    public cb(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.eb ebVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var) {
        this.f271783b = ebVar;
        this.f271782a = u1Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.eb ebVar = this.f271783b;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = ebVar.f271835d;
        ibVar.R = i17;
        ibVar.f271941i.setText((java.lang.CharSequence) ibVar.S.get(i17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar2 = ebVar.f271835d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = ibVar2.f271936d;
        if (abstractC19655xeb0f7722 != null) {
            abstractC19655xeb0f7722.m75385x16568cca(((java.lang.Integer) ibVar2.T.get(ibVar2.R)).intValue());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f271782a.f293531c;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        ebVar.f271835d.l(2);
    }
}
