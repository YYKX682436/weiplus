package bd5;

/* loaded from: classes10.dex */
public final class f implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI f19435a;

    public f(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI) {
        this.f19435a = msgHistoryGalleryPersonRecommendUI;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(insets, "insets");
        e3.d a17 = insets.a(7);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        androidx.appcompat.app.AppCompatActivity context = this.f19435a.getContext();
        int i17 = com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.F;
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479644bj);
        view.setPadding(a17.f247044a + h17, a17.f247045b, a17.f247046c + h17, a17.f247047d);
        return n3.g3.f334337b;
    }
}
