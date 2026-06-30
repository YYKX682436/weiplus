package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class s3 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 f230951a;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 t3Var) {
        this.f230951a = t3Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 t3Var = this.f230951a;
        try {
            t3Var.f230961e.f.set(t3Var.f230960d, java.lang.Integer.valueOf(t3Var.f230959c[i17]));
            t3Var.f230961e.e.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightSettingsUI", e17, "", new java.lang.Object[0]);
        }
    }
}
