package yl2;

/* loaded from: classes.dex */
public final class j0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f544566a;

    public j0(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f544566a = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "gotoFaceVerifyForUserFlag result: " + valueOf);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f544566a;
        if (i17 != -1 || valueOf == null || valueOf.intValue() != 1) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("RESULT_USER_FLAG", 0) : 0;
        if (intent == null || (str = intent.getStringExtra("RESULT_REALNAME_AUTH_URL")) == null) {
            str = "";
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Integer.valueOf(intExtra), str)));
    }
}
