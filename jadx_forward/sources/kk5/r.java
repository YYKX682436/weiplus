package kk5;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.w f390212d;

    public r(kk5.w wVar) {
        this.f390212d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/uic/ImportFromGroupUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kk5.w wVar = this.f390212d;
        wVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(wVar.m158354x19263085(), "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_need_result", true);
        intent.putExtra("group_multi_select", true);
        intent.putExtra("max_limit_num", Integer.MAX_VALUE);
        wVar.m158354x19263085().startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/ui/uic/ImportFromGroupUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
