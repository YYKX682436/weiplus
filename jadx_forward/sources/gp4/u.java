package gp4;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        super(1);
        this.f355970d = c18801xf3fcf614;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        yz5.l itemChangeListener = this.f355970d.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.mo146xb9724478(it);
        }
        return jz5.f0.f384359a;
    }
}
