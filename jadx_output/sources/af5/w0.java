package af5;

/* loaded from: classes11.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context, com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        super(0);
        this.f4651d = context;
        this.f4652e = markdownNativeMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.view.GestureDetector(this.f4651d, new af5.v0(this.f4652e));
    }
}
