package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f223182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.w0 f223183e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.w0 w0Var, android.database.Cursor cursor) {
        this.f223183e = w0Var;
        this.f223182d = cursor;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.w0 w0Var = this.f223183e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.b1 b1Var = w0Var.f223185d.f223069d2;
        android.database.Cursor cursor = this.f223182d;
        b1Var.x(cursor);
        w0Var.f223185d.f223069d2.m8146xced61ae5();
        if ((cursor == null || cursor.getCount() == 0) && (sVar = w0Var.f223185d.f223072g2) != null) {
            sVar.a();
        }
    }
}
