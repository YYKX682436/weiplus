package it3;

/* loaded from: classes10.dex */
public final class a0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465 f376083d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465 activityC16984xe6e37465) {
        this.f376083d = activityC16984xe6e37465;
    }

    @Override // f25.f
    public void c(boolean z17) {
        jt3.h hVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IAudioFocusService onPause lose audio focus & gain result:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465 activityC16984xe6e37465 = this.f376083d;
        f25.m0 m0Var = activityC16984xe6e37465.f237164n;
        sb6.append(m0Var != null ? java.lang.Boolean.valueOf(((g25.e) m0Var).f349513c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", sb6.toString());
        f25.m0 m0Var2 = activityC16984xe6e37465.f237164n;
        boolean z18 = false;
        if (m0Var2 != null && ((g25.e) m0Var2).f349513c) {
            z18 = true;
        }
        if (z18 || (hVar = activityC16984xe6e37465.f237162i) == null) {
            return;
        }
        hVar.d();
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "IAudioFocusService onResume gain audio focus");
        jt3.h hVar = this.f376083d.f237162i;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
    }
}
