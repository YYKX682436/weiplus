package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f99673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.u1 f99675f;

    public t1(com.tencent.mm.plugin.exdevice.ui.u1 u1Var, int i17, int i18) {
        this.f99675f = u1Var;
        this.f99673d = i17;
        this.f99674e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f99674e;
        com.tencent.mm.plugin.exdevice.ui.u1 u1Var = this.f99675f;
        int i18 = this.f99673d;
        if (i18 == 0 && (i17 == 0 || i17 == 4)) {
            u1Var.f99687a.U6(2);
            return;
        }
        if (i17 != 4) {
            u1Var.f99687a.U6(4);
        } else if (i18 == 90000) {
            u1Var.f99687a.U6(3);
        } else {
            u1Var.f99687a.U6(5);
        }
    }
}
