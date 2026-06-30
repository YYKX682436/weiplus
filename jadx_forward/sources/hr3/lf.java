package hr3;

/* loaded from: classes5.dex */
public final class lf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365312e;

    public lf(hr3.pf pfVar, java.lang.String str) {
        this.f365311d = pfVar;
        this.f365312e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$showWithLocalPath$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.pf pfVar = this.f365311d;
        android.content.Intent intent = new android.content.Intent(pfVar.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22308x8618c28d.class);
        lk5.s.e(intent, true);
        intent.putExtra("Contact_User", pfVar.m133981x6c03c64c());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(this.f365312e);
        intent.putExtra("remark_image_path", arrayList2);
        intent.putExtra("selected_item", 0);
        intent.putExtra("view_only", false);
        pfVar.m158354x19263085().startActivityForResult(intent, 103);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$showWithLocalPath$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
