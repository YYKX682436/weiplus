package hb5;

/* loaded from: classes11.dex */
public class c implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428 f361686d;

    public c(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428 activityC21583x3a52b428) {
        this.f361686d = activityC21583x3a52b428;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428 activityC21583x3a52b428 = this.f361686d;
        if (i17 == 0 && com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428.f279419o) {
            intent.putExtra("Select_Conv_User", activityC21583x3a52b428.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6j, ""));
            intent.putExtra("select_raw_user_name", "notify@all");
        } else {
            s01.a0 a0Var = (s01.a0) activityC21583x3a52b428.f279421e.getItem(i17);
            s01.h hVar = activityC21583x3a52b428.f279424h;
            java.lang.String v07 = hVar == null ? null : hVar.v0(a0Var.f65840x13fe5d2b);
            intent.putExtra("select_raw_user_name", a0Var.f65840x13fe5d2b);
            intent.putExtra("Select_Conv_User", v07);
        }
        activityC21583x3a52b428.setResult(-1, intent);
        activityC21583x3a52b428.finish();
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
