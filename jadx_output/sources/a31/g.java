package a31;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a31.m mVar) {
        super(0);
        this.f956d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        a31.m mVar = this.f956d;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = mVar.f969c;
        if (speechInputLayout != null) {
            speechInputLayout.c(3);
        }
        android.os.Vibrator vibrator = mVar.f984r;
        if (vibrator != null) {
            vibrator.vibrate(30L);
        }
        mVar.f987u = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new a31.i(mVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
