package qx0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx0.e f448803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qx0.e eVar) {
        super(0);
        this.f448803d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qx0.e eVar = this.f448803d;
        if (eVar.isShowing()) {
            eVar.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
