package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class p0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65518d;

    public p0(com.tencent.mm.feature.chatrecordstts.b1 b1Var) {
        this.f65518d = b1Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAudioFocusChange onPause canDuck=");
        sb6.append(z17);
        sb6.append(" state=");
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65518d;
        sb6.append(b1Var.f65353p);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", sb6.toString());
        b1Var.f65360w.set(false);
        oy.k kVar = b1Var.f65353p;
        oy.k kVar2 = oy.k.f349825f;
        if (kVar != kVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onPause skipped, state=" + b1Var.f65353p);
            return;
        }
        if (kVar != kVar2 && kVar != oy.k.f349824e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "pause ignored, state=" + b1Var.f65353p);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "pause state=" + b1Var.f65353p);
        if (b1Var.f65354q == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "pause failed, messagePlaybackContext is null");
            return;
        }
        b1Var.wj(oy.k.f349826g, true);
        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = b1Var.f65358u;
        if (supervisedLifecycleScope != null) {
            v65.i.c(supervisedLifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.f0(b1Var, null), 1, null);
        }
        com.tencent.mm.feature.chatrecordstts.i iVar = b1Var.f65363z;
        if (iVar != null) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.feature.chatrecordstts.g gVar = iVar.f65456a;
            long j17 = currentTimeMillis - gVar.f65432c;
            gVar.getClass();
            gVar.f65430a.put("hear_has_pause", 2);
            ((cy1.a) iVar.a()).Ej("chat_hear_msg_pause", kz5.c1.m(gVar.f65430a, kz5.c1.k(new jz5.l("hear_msg_duration_ms", java.lang.Integer.valueOf((int) j17)), new jz5.l("hear_msg_cnt", java.lang.Integer.valueOf(gVar.f65431b.size())), new jz5.l("selected_msg_list", kz5.n0.g0(gVar.f65431b, "#", null, null, 0, null, null, 62, null)))), 33488);
        }
    }

    @Override // f25.f
    public void onResume() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAudioFocusChange onResume state=");
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65518d;
        sb6.append(b1Var.f65353p);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", sb6.toString());
        if (b1Var.f65353p != oy.k.f349826g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onResume skipped, state=" + b1Var.f65353p);
        } else {
            b1Var.f65360w.set(true);
            com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = b1Var.f65358u;
            if (supervisedLifecycleScope != null) {
                v65.i.b(supervisedLifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.o0(b1Var, null), 1, null);
            }
        }
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onStop");
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65518d;
        b1Var.f65360w.set(false);
        b1Var.tj();
        com.tencent.mm.feature.chatrecordstts.i iVar = b1Var.f65363z;
        if (iVar != null) {
            iVar.b(3);
        }
    }
}
