package at2;

/* loaded from: classes3.dex */
public final class v1 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.y1 f13769d;

    public v1(at2.y1 y1Var) {
        this.f13769d = y1Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        at2.y1 y1Var = this.f13769d;
        com.tencent.mars.xlog.Log.i(y1Var.f13780p, "onProgressChanged progress:" + i17 + " fromUser:" + z17);
        if (!z17 || ((ct2.j) y1Var.P0(ct2.j.class)).S6() <= 0) {
            return;
        }
        y1Var.u1(i17 / seekBar.getMax());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        dt2.a0 a0Var;
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        at2.y1 y1Var = this.f13769d;
        com.tencent.mars.xlog.Log.i(y1Var.f13780p, "onStartTrackingTouch");
        y1Var.f13785u = (int) ((seekBar.getProgress() / seekBar.getMax()) * ((ct2.j) y1Var.P0(ct2.j.class)).S6());
        at2.u1 u1Var = (at2.u1) y1Var.X0(at2.u1.class);
        if (u1Var == null || (a0Var = u1Var.f13762q) == null) {
            return;
        }
        a0Var.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopTrackingTouch(android.widget.SeekBar r10) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at2.v1.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
