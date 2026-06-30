package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class v1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 f230967a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var) {
        this.f230967a = a2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g
    public void a(boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightVideoEditor", "Not Supported init SegmentSeekBar failed.");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u1(this));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230967a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = a2Var.f230798a;
        if (c16538x58704dc4 != null) {
            a2Var.f230800c = c16538x58704dc4.m66912x37a7fa50();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared success %d", java.lang.Integer.valueOf(a2Var.f230800c));
            try {
                if (a2Var.f230805h != null) {
                    a2Var.f230801d = java.lang.Math.round(a2Var.f230800c * a2Var.f230798a.c());
                    a2Var.f230802e = java.lang.Math.round(a2Var.f230800c * a2Var.f230798a.b());
                    if (a2Var.f230802e <= 0) {
                        int i17 = a2Var.f230800c;
                        int i18 = a2Var.f230816s.f152728h;
                        if (i17 <= (i18 * 1000) + 500) {
                            a2Var.f230802e = i17;
                        } else {
                            a2Var.f230802e = i18 * 1000;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared, start: %s, end: %s, duration: %s", java.lang.Integer.valueOf(a2Var.f230801d), java.lang.Integer.valueOf(a2Var.f230802e), java.lang.Integer.valueOf(a2Var.f230800c));
                }
                a2Var.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.y1(a2Var), true);
                a2Var.f230804g = b4Var;
                b4Var.c(20L, 20L);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
