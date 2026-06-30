package wl3;

/* loaded from: classes10.dex */
public final class j implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d f528601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f528602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f528603f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.graphics.drawable.Drawable drawable) {
        this.f528601d = c16639xd269873d;
        this.f528602e = h0Var;
        this.f528603f = drawable;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        if (z17) {
            wl3.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d.f232355h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = this.f528601d;
            c16639xd269873d.a(i17);
            if (seekBar == null || c16639xd269873d.f232357e == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "onSeekBarChange " + seekBar.getProgress() + ' ' + seekBar.getMax());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = this.f528601d;
        c16639xd269873d.m67246x26c61fa8(true);
        c16639xd269873d.a(seekBar != null ? seekBar.getProgress() : 0);
        wl3.h hVar = c16639xd269873d.f232357e;
        if (hVar != null) {
            lm3.z zVar = (lm3.z) hVar;
            lm3.b0 b0Var = zVar.f401057a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.class)).Q6();
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(b0Var.f401003e, 7, r45.bt4.class);
            if (bt4Var != null) {
                bt4Var.f452576n = 1;
            }
            zVar.f401058b.f3639x46306858.removeCallbacks(b0Var.f401005g);
        }
        if (seekBar == null) {
            return;
        }
        seekBar.setThumb((android.graphics.drawable.Drawable) this.f528602e.f391656d);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = this.f528601d;
        c16639xd269873d.m67246x26c61fa8(false);
        if (seekBar != null) {
            wl3.h hVar = c16639xd269873d.f232357e;
            if (hVar != null) {
                int progress = seekBar.getProgress();
                int max = seekBar.getMax();
                lm3.z zVar = (lm3.z) hVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "onSeekEnd, seekPosition:" + progress + ", max:" + max);
                b21.m.h(progress);
                float mo67219x51e8b0a = ((float) kl3.t.g().a().mo67219x51e8b0a()) * (((float) progress) / ((float) max));
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = zVar.f401058b;
                android.view.KeyEvent.Callback findViewById = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k0o);
                pk4.c cVar = findViewById instanceof pk4.c ? (pk4.c) findViewById : null;
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).d(a06.d.c(mo67219x51e8b0a));
                }
                b21.m.g();
                k3Var.f3639x46306858.postDelayed(zVar.f401057a.f401005g, 3000L);
            }
            seekBar.setThumb(this.f528603f);
        }
    }
}
