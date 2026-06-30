package x03;

/* loaded from: classes15.dex */
public final class t0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532659d;

    public t0(x03.u0 u0Var) {
        this.f532659d = u0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public final void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        x03.s1 s1Var;
        x03.u0 u0Var = this.f532659d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, "tplayer log " + interfaceC26164x73fc6bc6 + ", msg:" + i17 + ", arg1:" + j17 + ", arg2:" + j18 + ", extra:" + obj);
        if (i17 == 108) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, "video_status firstFrame ok: " + interfaceC26164x73fc6bc6);
            x03.s1 s1Var2 = u0Var.f532669d;
            if (s1Var2 != null) {
                ((x03.i1) s1Var2).c(false, 10, interfaceC26164x73fc6bc6);
                return;
            }
            return;
        }
        if (i17 == 503) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, "video_status getMessage");
            if ((obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo ? (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo) obj : null) == null || (s1Var = u0Var.f532669d) == null) {
                return;
            }
            ((x03.i1) s1Var).b((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo) obj);
            return;
        }
        if (i17 != 200) {
            if (i17 != 201) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, "video_status buffer ok: " + interfaceC26164x73fc6bc6);
            x03.s1 s1Var3 = u0Var.f532669d;
            if (s1Var3 != null) {
                ((x03.i1) s1Var3).c(false, 8, interfaceC26164x73fc6bc6);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u0Var.f532666a, "video_status need buffer: " + interfaceC26164x73fc6bc6 + " mediaId:" + u0Var.f532673h);
        x03.s1 s1Var4 = u0Var.f532669d;
        if (s1Var4 != null) {
            ((x03.i1) s1Var4).c(false, 7, interfaceC26164x73fc6bc6);
        }
    }
}
