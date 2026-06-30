package gk5;

/* loaded from: classes9.dex */
public final class k0 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f354211a;

    public k0(gk5.r0 r0Var) {
        this.f354211a = r0Var;
    }

    @Override // tg3.x0
    public final void a(int i17, int i18, java.util.List resultList, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultList, "resultList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardNoteToWeWorkUIC", "onCallback() called with: errorType = [" + i17 + "], errorCode = [" + i18 + "], resultList = [" + resultList + ']');
        if (i17 == 0 && i18 == 0) {
            return;
        }
        this.f354211a.V6();
    }
}
