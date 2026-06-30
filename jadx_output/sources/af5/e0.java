package af5;

/* loaded from: classes9.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.s f4569d;

    public e0(z01.s sVar) {
        this.f4569d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingLocationCardMvvmView$onUpdateViewModel$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o15.a aVar = this.f4569d.f469158f;
        if (aVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingLocationCardMvvmView$onUpdateViewModel$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("kwebmap_slat", aVar.u());
        intent.putExtra("kwebmap_lng", aVar.w());
        intent.putExtra("kPoiid", aVar.r());
        intent.putExtra("kPoiName", aVar.s());
        intent.putExtra("Kwebmap_locaion", aVar.l());
        intent.putExtra("kShowshare", false);
        intent.putExtra("key_is_forward_preview", true);
        j45.l.j(view.getContext(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingLocationCardMvvmView$onUpdateViewModel$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
