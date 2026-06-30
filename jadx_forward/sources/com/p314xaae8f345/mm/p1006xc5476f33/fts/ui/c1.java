package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class c1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219559a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219559a = abstractActivityC15595x3a75f78;
    }

    @Override // k23.v2
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "FloatingVoiceInput onStartPress");
    }

    @Override // k23.v2
    public void b(java.lang.String str, java.lang.String voiceID) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "FloatingVoiceInput onResult: " + str);
        boolean isEmpty = str.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219559a;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "empty query");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.E1;
            abstractActivityC15595x3a75f78.X6();
            return;
        }
        k23.c1 a17 = k23.c1.f385069h.a(abstractActivityC15595x3a75f78.mo55332x76847179());
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.fts.ui.c1$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c1.this;
                c1Var.getClass();
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f782 = c1Var.f219559a;
                if (booleanValue) {
                    abstractActivityC15595x3a75f782.L = true;
                    return null;
                }
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.E1;
                abstractActivityC15595x3a75f782.X6();
                return null;
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        k23.v0 v0Var = a17.f385074g;
        if (v0Var != null) {
            v0Var.w(8, "", str);
        }
        android.app.Activity m80379x76847179 = a17.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) m80379x76847179;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = activityC15607x502bbbb2.L1;
        android.app.Activity context = a17.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        z13.f fVar = (z13.f) a18;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3();
        j3Var.f219617a = true;
        j3Var.f219619c = true;
        j3Var.f219620d = false;
        j3Var.f219621e = new k23.a1(q2Var, a17, str, voiceID, activityC15607x502bbbb2, true, lVar, fVar);
        q2Var.o(str, j3Var);
    }

    @Override // k23.v2
    /* renamed from: onCancel */
    public void mo63604x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "FloatingVoiceInput onCancel");
    }
}
