package af5;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingTingSpaceMvvmView f4580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingTingSpaceMvvmView chattingTingSpaceMvvmView) {
        super(1);
        this.f4580d = chattingTingSpaceMvvmView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c it = (a11.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.f505b.setVisibility(8);
        it.f506c.setText(this.f4580d.getContext().getResources().getString(com.tencent.mm.R.string.pit));
        return jz5.f0.f302826a;
    }
}
