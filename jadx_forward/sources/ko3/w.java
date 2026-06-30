package ko3;

/* loaded from: classes13.dex */
public enum w {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb f391563d = com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb.a();

    w() {
    }

    public final void h() {
        try {
            ((android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio")).addOnModeChangedListener(((ku5.t0) ku5.t0.f394148d).p("n_asm_task"), new ko3.v(this));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ASM", "start asm failed: " + th6);
        }
    }
}
