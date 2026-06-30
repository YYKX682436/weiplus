package wc5;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.g0 f526087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(wc5.g0 g0Var) {
        super(0);
        this.f526087d = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wc5.g0 g0Var = this.f526087d;
        android.view.LayoutInflater.Factory factory = g0Var.f526102d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        cd5.a aVar = new cd5.a((uc5.r) factory, null, 2, null);
        aVar.f122193b = new wc5.d0(g0Var);
        return aVar;
    }
}
