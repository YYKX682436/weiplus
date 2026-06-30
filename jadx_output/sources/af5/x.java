package af5;

/* loaded from: classes9.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView f4653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.k f4654e;

    public x(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView chattingEmojiMvvmView, z01.k kVar) {
        this.f4653d = chattingEmojiMvvmView;
        this.f4654e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingEmojiMvvmView$onUpdateViewModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t tVar = te5.t.f418749a;
        android.content.Context context = this.f4653d.getContext();
        z01.k kVar = this.f4654e;
        tVar.j(context, kVar.getEmojiMd5(), kVar.getAppId(), kVar.getAppName());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingEmojiMvvmView$onUpdateViewModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
