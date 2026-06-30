package af5;

/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.g f4638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, z01.g gVar) {
        super(2);
        this.f4637d = chattingAskShareMvvmView;
        this.f4638e = gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView thumbIv = (android.widget.ImageView) obj;
        yz5.l successCallback = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(thumbIv, "thumbIv");
        kotlin.jvm.internal.o.g(successCallback, "successCallback");
        kotlinx.coroutines.l.d(v65.m.a(this.f4637d), null, null, new af5.r(this.f4637d, this.f4638e, thumbIv, successCallback, null), 3, null);
        return jz5.f0.f302826a;
    }
}
