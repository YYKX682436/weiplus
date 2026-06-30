package af5;

/* loaded from: classes9.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85 f86186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.k f86187e;

    public x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85 c22076x79b79a85, z01.k kVar) {
        this.f86186d = c22076x79b79a85;
        this.f86187e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingEmojiMvvmView$onUpdateViewModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t tVar = te5.t.f500282a;
        android.content.Context context = this.f86186d.getContext();
        z01.k kVar = this.f86187e;
        tVar.j(context, kVar.m178252xc128bcce(), kVar.m178250x74292566(), kVar.m178251xe77ac16());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingEmojiMvvmView$onUpdateViewModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
