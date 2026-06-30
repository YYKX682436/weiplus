package z35;

/* loaded from: classes10.dex */
public final class t implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 f551576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f551577e;

    public t(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240, android.content.Context context) {
        this.f551576d = c19717xb0837240;
        this.f551577e = context;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240 = this.f551576d;
        z35.u heroSeekBarChangeListener = c19717xb0837240.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            lo2.c0 c0Var = (lo2.c0) heroSeekBarChangeListener;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f = c0Var.f401641a;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb08372402 = activityC14485xd3a2499f.f202938w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19717xb08372402);
                int i18 = (int) (((i17 * c19717xb08372402.f272661g) / 2500) / 1000);
                lo2.u uVar = activityC14485xd3a2499f.E;
                uVar.f401703d = i18;
                if (android.os.SystemClock.uptimeMillis() - uVar.f401704e > 100) {
                    uVar.run();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f2 = uVar.f401705f;
                    activityC14485xd3a2499f2.D.mo50300x3fa464aa(uVar);
                    activityC14485xd3a2499f2.D.mo50297x7c4d7ca2(uVar, 100L);
                }
            }
        }
        if (z17) {
            c19717xb0837240.f272662h = i17;
            c19717xb0837240.f272666o = c19717xb0837240.f272661g * i17;
            c19717xb0837240.h(i17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.TextView m75639x418325a0;
        android.widget.TextView m75641x43215548;
        android.widget.SeekBar m75640xa19403eb;
        android.widget.SeekBar m75640xa19403eb2;
        android.widget.SeekBar m75640xa19403eb3;
        this.f551576d.f272667p = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240 = this.f551576d;
        c19717xb0837240.f272663i = true;
        wu5.c cVar = c19717xb0837240.f272670s;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f551576d.m75642xa589f587(com.p314xaae8f345.mm.R.C30861xcebc809e.d1i);
        m75639x418325a0 = this.f551576d.m75639x418325a0();
        m75639x418325a0.setVisibility(0);
        m75641x43215548 = this.f551576d.m75641x43215548();
        m75641x43215548.setVisibility(0);
        m75640xa19403eb = this.f551576d.m75640xa19403eb();
        m75640xa19403eb.setPressed(true);
        m75640xa19403eb2 = this.f551576d.m75640xa19403eb();
        m75640xa19403eb2.setProgressDrawable(i65.a.i(this.f551577e, com.p314xaae8f345.mm.R.C30861xcebc809e.d1i));
        m75640xa19403eb3 = this.f551576d.m75640xa19403eb();
        m75640xa19403eb3.setThumb(i65.a.i(this.f551577e, com.p314xaae8f345.mm.R.C30861xcebc809e.d1l));
        z35.u heroSeekBarChangeListener = this.f551576d.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            int i17 = this.f551576d.f272662h;
            ((lo2.c0) heroSeekBarChangeListener).f401642b.mo58788x65825f6();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        this.f551576d.f272667p = false;
        z35.u heroSeekBarChangeListener = this.f551576d.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            int i17 = this.f551576d.f272662h;
            lo2.c0 c0Var = (lo2.c0) heroSeekBarChangeListener;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var.f401641a.f202938w);
            c0Var.f401642b.a(((i17 * r2.f272661g) / 2500) / 1000.0d, true);
        }
        wu5.c cVar = this.f551576d.f272670s;
        if (cVar != null) {
            cVar.cancel(false);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240 = this.f551576d;
        ku5.u0 u0Var = ku5.t0.f394148d;
        z35.s sVar = new z35.s(this.f551576d, this.f551577e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        c19717xb0837240.f272670s = t0Var.z(sVar, 3000L, false);
    }
}
