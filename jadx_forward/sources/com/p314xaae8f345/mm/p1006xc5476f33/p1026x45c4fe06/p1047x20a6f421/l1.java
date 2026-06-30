package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class l1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f159314d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 f159315e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3) {
        this.f159315e = c11848x16ccb2c3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f159314d + 1;
        this.f159314d = i17;
        if (i17 < 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = this.f159315e;
        c11848x16ccb2c3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        c11848x16ccb2c3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.k1(this));
    }
}
