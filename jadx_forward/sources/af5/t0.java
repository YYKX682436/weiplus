package af5;

/* loaded from: classes11.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f86176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b) {
        super(1);
        this.f86176d = c22094xdaed490b;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        v11.e button = (v11.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(button, "button");
        yz5.l onInteractButtonClickListener = this.f86176d.getOnInteractButtonClickListener();
        if (onInteractButtonClickListener != null) {
            onInteractButtonClickListener.mo146xb9724478(button);
        }
        return jz5.f0.f384359a;
    }
}
