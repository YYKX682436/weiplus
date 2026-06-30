package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class qf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f211270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f211271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f211272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, long j17, long j18, r45.mb4 mb4Var) {
        super(0);
        this.f211269d = activityC15059x3e98c949;
        this.f211270e = j17;
        this.f211271f = j18;
        this.f211272g = mb4Var;
    }

    public static final int a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        android.widget.SeekBar seekBar = activityC15059x3e98c949.F;
        if (seekBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        int width = seekBar.getWidth();
        android.widget.SeekBar seekBar2 = activityC15059x3e98c949.F;
        if (seekBar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        int paddingLeft = width - seekBar2.getPaddingLeft();
        android.widget.SeekBar seekBar3 = activityC15059x3e98c949.F;
        if (seekBar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        int paddingRight = paddingLeft - seekBar3.getPaddingRight();
        if (paddingRight < 1) {
            return 1;
        }
        return paddingRight;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rm5.k kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211269d;
        android.widget.SeekBar seekBar = activityC15059x3e98c949.F;
        if (seekBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        seekBar.setEnabled(true);
        android.view.View view = activityC15059x3e98c949.G;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectBtn");
            throw null;
        }
        view.setEnabled(true);
        android.view.View view2 = activityC15059x3e98c949.N;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
            throw null;
        }
        view2.setEnabled(true);
        r45.mb4 mb4Var = this.f211272g;
        long j17 = this.f211271f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pf pfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pf(activityC15059x3e98c949, mb4Var, j17);
        android.widget.SeekBar seekBar2 = activityC15059x3e98c949.F;
        if (seekBar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        seekBar2.setOnSeekBarChangeListener(pfVar);
        activityC15059x3e98c949.f210206d2 = android.view.ViewConfiguration.get(activityC15059x3e98c949).getScaledTouchSlop();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        android.widget.SeekBar seekBar3 = activityC15059x3e98c949.F;
        if (seekBar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        seekBar3.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.lf(e0Var, activityC15059x3e98c949, this.f211271f, pfVar));
        cw2.aa i76 = activityC15059x3e98c949.i7();
        if (i76 != null) {
            i76.mo122852xc9fc1b13(0L);
        }
        long j18 = this.f211270e;
        if (j18 > 0) {
            if (activityC15059x3e98c949.F == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            long max = (r0.getMax() * j18) / j17;
            android.widget.SeekBar seekBar4 = activityC15059x3e98c949.F;
            if (seekBar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
                throw null;
            }
            seekBar4.setProgress((int) max);
        }
        if (!hc2.l0.c(mb4Var) && (kVar = activityC15059x3e98c949.U) != null) {
            kVar.a(kz5.b0.c(0L), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.mf(activityC15059x3e98c949, mb4Var));
        }
        return jz5.f0.f384359a;
    }
}
