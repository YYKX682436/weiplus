package yl2;

/* loaded from: classes.dex */
public final class g0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f544539b;

    public g0(int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f544538a = i17;
        this.f544539b = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        boolean z17 = false;
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "[CTID] gotoFaceVerifyDirectCTID precheckType=" + this.f544538a + " result: " + valueOf);
        if (i17 == -1 && valueOf != null && valueOf.intValue() == 1) {
            z17 = true;
        }
        this.f544539b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
    }
}
