package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class xd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f211554f;

    public xd(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, android.graphics.Bitmap bitmap) {
        this.f211552d = i17;
        this.f211553e = activityC15059x3e98c949;
        this.f211554f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211553e;
        if (this.f211552d != activityC15059x3e98c949.W1) {
            return;
        }
        android.widget.SeekBar seekBar = activityC15059x3e98c949.F;
        if (seekBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        seekBar.setVisibility(0);
        boolean z17 = activityC15059x3e98c949.Q1;
        android.graphics.Bitmap bitmap = this.f211554f;
        if (!z17) {
            android.widget.SeekBar seekBar2 = activityC15059x3e98c949.F;
            if (seekBar2 != null) {
                seekBar2.setProgressDrawable(new android.graphics.drawable.BitmapDrawable(activityC15059x3e98c949.getResources(), bitmap));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
        }
        android.widget.SeekBar seekBar3 = activityC15059x3e98c949.F;
        if (seekBar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        seekBar3.setProgressDrawable(new android.graphics.drawable.BitmapDrawable(activityC15059x3e98c949.getResources(), bitmap));
        activityC15059x3e98c949.Q1 = false;
    }
}
