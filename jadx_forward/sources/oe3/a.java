package oe3;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe3.c f426325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oe3.c cVar) {
        super(0);
        this.f426325d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oe3.c cVar = this.f426325d;
        android.widget.FrameLayout frameLayout = cVar.f426328y;
        if (frameLayout != null) {
            bf3.p pVar = cVar.f426327x;
            if (pVar != null) {
                pVar.c(frameLayout);
            }
            cVar.f426328y = null;
        }
        bf3.p pVar2 = cVar.f426327x;
        if (pVar2 != null) {
            pVar2.b();
        }
        return jz5.f0.f384359a;
    }
}
