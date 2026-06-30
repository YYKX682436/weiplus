package lf2;

/* loaded from: classes10.dex */
public final class a extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public lf2.s f399806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(int i17, int i18) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.I2;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("pos", i18);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void a7(int i17) {
        lf2.s sVar = this.f399806m;
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(sVar, null, false, 0, 7, null);
            gk2.e eVar = sVar.H;
            sVar.T = ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427826i).mo144003x754a37bb()).intValue();
            sVar.f0();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = sVar.W;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intonationScoreSwitch");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427827m).mo144003x754a37bb()).booleanValue());
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new lf2.q(sVar));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = sVar.V;
            if (viewOnClickListenerC22631x1cc07cc82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("earSwitch");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427828n).mo144003x754a37bb()).booleanValue());
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new lf2.r(sVar));
            if (!(((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427831q).mo144003x754a37bb()).intValue() == 2)) {
                viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(false);
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427828n).k(java.lang.Boolean.FALSE);
            }
            android.widget.SeekBar seekBar = sVar.X;
            if (seekBar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("voiceVolume");
                throw null;
            }
            seekBar.setProgress(((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427824g).mo144003x754a37bb()).intValue());
            android.widget.SeekBar seekBar2 = sVar.Y;
            if (seekBar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accompanyVolume");
                throw null;
            }
            seekBar2.setProgress(((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427825h).mo144003x754a37bb()).intValue());
            for (lf2.b bVar : sVar.e0()) {
                bVar.f399808b = bVar.f399807a.f427889d == ((om2.m) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427830p).mo144003x754a37bb()).f427889d;
            }
            ((lf2.l) ((jz5.n) sVar.M).mo141623x754a37bb()).m8146xced61ae5();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = sVar.W;
            if (viewOnClickListenerC22631x1cc07cc83 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intonationScoreSwitch");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc83.setEnabled(true);
            om2.s sVar2 = ((om2.g) eVar.a(om2.g.class)).f427841o;
            if (sVar2 != null && !sVar2.f427912b.f427902c) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc84 = sVar.W;
                if (viewOnClickListenerC22631x1cc07cc84 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intonationScoreSwitch");
                    throw null;
                }
                viewOnClickListenerC22631x1cc07cc84.setEnabled(false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc85 = sVar.V;
            if (viewOnClickListenerC22631x1cc07cc85 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("earSwitch");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc85.setEnabled(((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427831q).mo144003x754a37bb()).intValue() == 2);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = sVar.E;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new lf2.f(sVar, null), 3, null);
            }
            int P6 = ((om2.l) eVar.a(om2.l.class)).P6();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("sdk_type", P6);
            if (zl2.r4.f555483a.x1()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.Z1, jSONObject.toString(), null, 4, null);
            } else {
                if (i17 != -1) {
                    jSONObject.put(ya.b.f77502x92235c1b, i17);
                }
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.hj((ml2.r0) c18, ml2.b4.f408796r2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            }
            sVar.K = i17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f399806m = new lf2.s(O6(), getStore().getLiveRoomData(), this);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f399806m = null;
    }
}
