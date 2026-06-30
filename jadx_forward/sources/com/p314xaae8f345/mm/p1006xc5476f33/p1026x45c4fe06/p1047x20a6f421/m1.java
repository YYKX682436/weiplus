package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 f159335d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3) {
        this.f159335d = c11848x16ccb2c3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = this.f159335d;
        if (c11848x16ccb2c3.getY() + c11848x16ccb2c3.getHeight() > c11848x16ccb2c3.f159121e) {
            c11848x16ccb2c3.setY(r2 - c11848x16ccb2c3.getHeight());
        }
    }
}
