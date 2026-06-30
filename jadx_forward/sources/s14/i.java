package s14;

/* loaded from: classes.dex */
public final class i implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17499xf7256adf f483683a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17499xf7256adf activityC17499xf7256adf) {
        this.f483683a = activityC17499xf7256adf;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceAssistantPermission", "onSwitchChanged: user toggled switch to " + z17);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17499xf7256adf.f242973f;
        this.f483683a.getClass();
        int i18 = z17 ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceAssistantPermission", "doSetVoiceAssistantEnable: enable = " + z17 + ", writing value = " + i18 + " to ConfigStorage");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, java.lang.Integer.valueOf(i18));
    }
}
