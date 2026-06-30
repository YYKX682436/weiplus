package a31;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f82489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a31.m mVar) {
        super(0);
        this.f82489d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        a31.m mVar = this.f82489d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = mVar.f82502c;
        if (c19651x7fe9d32 != null) {
            c19651x7fe9d32.c(3);
        }
        android.os.Vibrator vibrator = mVar.f82517r;
        if (vibrator != null) {
            vibrator.vibrate(30L);
        }
        mVar.f82520u = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new a31.i(mVar, null), 3, null);
        return jz5.f0.f384359a;
    }
}
