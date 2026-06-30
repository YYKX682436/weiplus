package ku3;

/* loaded from: classes10.dex */
public final class x0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f393986e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        this.f393985d = c17028xc20c4c47;
        this.f393986e = c16993xacc19624;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.os.Bundle bundle = ((zt3.c) obj).f557122c;
        if (bundle != null) {
            int i17 = bundle.getInt("PARAM_1_INT");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47.f237389x1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47 = this.f393985d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = this.f393986e;
            c17028xc20c4c47.L(configProvider, i17);
            lu3.m recorder = c17028xc20c4c47.getRecorder();
            recorder.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
            recorder.f402953p = configProvider;
            recorder.f402960w = recorder.c(true, new lu3.g(true, recorder, null));
        }
    }
}
