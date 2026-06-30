package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 f159308d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3) {
        this.f159308d = c11848x16ccb2c3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = this.f159308d;
        int i17 = c11848x16ccb2c3.f159120d;
        int width = c11848x16ccb2c3.getWidth();
        if (width <= 0) {
            width = i65.a.b(c11848x16ccb2c3.getContext(), 200);
        }
        c11848x16ccb2c3.setX(i17 - width);
        c11848x16ccb2c3.setY((int) (i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * 120.0f));
    }
}
