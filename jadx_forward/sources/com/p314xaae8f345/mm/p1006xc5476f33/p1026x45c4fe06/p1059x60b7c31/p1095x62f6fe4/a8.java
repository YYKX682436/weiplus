package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class a8 implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c8 f163233d;

    public a8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c8 c8Var) {
        this.f163233d = c8Var;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c8 c8Var = this.f163233d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c8Var.f163280g, "onAudioFocusChange, focusChange: " + i17);
        if (i17 == -3 || i17 == -2) {
            c8Var.d();
        } else if (i17 == -1) {
            c8Var.f();
        } else {
            if (i17 != 1) {
                return;
            }
            c8Var.e();
        }
    }
}
