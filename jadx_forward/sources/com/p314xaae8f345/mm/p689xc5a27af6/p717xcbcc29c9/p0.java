package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class p0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f147051d;

    public p0(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var) {
        this.f147051d = b1Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAudioFocusChange onPause canDuck=");
        sb6.append(z17);
        sb6.append(" state=");
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f147051d;
        sb6.append(b1Var.f146886p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", sb6.toString());
        b1Var.f146893w.set(false);
        oy.k kVar = b1Var.f146886p;
        oy.k kVar2 = oy.k.f431358f;
        if (kVar != kVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onPause skipped, state=" + b1Var.f146886p);
            return;
        }
        if (kVar != kVar2 && kVar != oy.k.f431357e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "pause ignored, state=" + b1Var.f146886p);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "pause state=" + b1Var.f146886p);
        if (b1Var.f146887q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "pause failed, messagePlaybackContext is null");
            return;
        }
        b1Var.wj(oy.k.f431359g, true);
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = b1Var.f146891u;
        if (c10511xc2ae2c6e != null) {
            v65.i.c(c10511xc2ae2c6e, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f0(b1Var, null), 1, null);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = b1Var.f146896z;
        if (iVar != null) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.g gVar = iVar.f146989a;
            long j17 = currentTimeMillis - gVar.f146965c;
            gVar.getClass();
            gVar.f146963a.put("hear_has_pause", 2);
            ((cy1.a) iVar.a()).Ej("chat_hear_msg_pause", kz5.c1.m(gVar.f146963a, kz5.c1.k(new jz5.l("hear_msg_duration_ms", java.lang.Integer.valueOf((int) j17)), new jz5.l("hear_msg_cnt", java.lang.Integer.valueOf(gVar.f146964b.size())), new jz5.l("selected_msg_list", kz5.n0.g0(gVar.f146964b, "#", null, null, 0, null, null, 62, null)))), 33488);
        }
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAudioFocusChange onResume state=");
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f147051d;
        sb6.append(b1Var.f146886p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", sb6.toString());
        if (b1Var.f146886p != oy.k.f431359g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onResume skipped, state=" + b1Var.f146886p);
        } else {
            b1Var.f146893w.set(true);
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = b1Var.f146891u;
            if (c10511xc2ae2c6e != null) {
                v65.i.b(c10511xc2ae2c6e, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.o0(b1Var, null), 1, null);
            }
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onStop");
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f147051d;
        b1Var.f146893w.set(false);
        b1Var.tj();
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = b1Var.f146896z;
        if (iVar != null) {
            iVar.b(3);
        }
    }
}
