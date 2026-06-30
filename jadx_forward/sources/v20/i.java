package v20;

/* loaded from: classes.dex */
public final class i implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f514304c;

    public i(java.lang.String str, java.lang.String str2, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f514302a = str;
        this.f514303b = str2;
        this.f514304c = qVar;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public final void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f514304c;
        if (i18 != -1 || i17 != 1015) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, "")));
            return;
        }
        boolean z17 = true;
        java.lang.String str = this.f514302a;
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str2 = this.f514303b;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        ((dk5.s5) tg3.t1.a()).Ui(str, str2);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str3 = (java.lang.String) kz5.n0.Z(stringArrayListExtra);
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(bool, str3 != null ? str3 : "")));
    }
}
