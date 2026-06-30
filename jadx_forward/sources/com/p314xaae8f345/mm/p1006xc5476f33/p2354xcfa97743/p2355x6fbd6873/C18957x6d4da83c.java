package com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873;

/* renamed from: com.tencent.mm.plugin.voipmp.platform.ZIDL_GNpdI8iE4B */
/* loaded from: classes11.dex */
class C18957x6d4da83c extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.s f258730a;

    /* renamed from: ZIDL_AX */
    private native void m73244x1964d17f(long j17, long j18, boolean z17);

    /* renamed from: ZIDL_AV */
    public void m73245x1964d17d(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r rVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.s sVar = this.f258730a;
        er4.u uVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? null : er4.u.VoIPMPSystemAuthRequestTypeCamera : er4.u.VoIPMPSystemAuthRequestTypeMicrophone : er4.u.VoIPMPSystemAuthRequestTypeUnknown;
        co5.m0 m0Var = (co5.m0) sVar;
        m0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "requestAsync ... (type=" + uVar + ')');
        int i18 = uVar == null ? -1 : co5.z.f125432a[uVar.ordinal()];
        if (i18 == 1) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            boolean Bi = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 82, "", "", new co5.l0(m0Var, j17, context));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "check microphone (checkMicroPhone=" + Bi + ')');
            if (!Bi || (rVar = m0Var.f125401a) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.C18957x6d4da83c) rVar).f0(j17, true);
            return;
        }
        if (i18 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("voipmp.systemauth", "unknonw type");
            return;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        boolean Bi2 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context2, "android.permission.CAMERA", 19, "", "", new co5.f0(m0Var, j17, context2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "check camera (checkCamera=" + Bi2 + ')');
        if (!Bi2 || (rVar2 = m0Var.f125401a) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.C18957x6d4da83c) rVar2).f0(j17, true);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.s) obj;
        this.f258730a = sVar;
        co5.m0 m0Var = (co5.m0) sVar;
        m0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "setCallback ... (callback=" + this + ')');
        m0Var.f125401a = this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r
    public void f0(long j17, boolean z17) {
        m73244x1964d17f(this.f60633xf042a733, j17, z17);
    }
}
