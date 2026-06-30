package a45;

/* loaded from: classes3.dex */
public final class i extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489464eo1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("IntentKey_MsgData");
        if (stringArrayListExtra == null) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("IntentKey_Title");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        for (java.lang.String str : stringArrayListExtra) {
            u15.a aVar = new u15.a();
            kotlin.jvm.internal.o.d(str);
            aVar.fromXml(str);
            arrayList.add(aVar);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
        if (baseMvvmActivity != null) {
            if (stringExtra == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (!((u15.a) obj).n()) {
                        arrayList2.add(obj);
                    }
                }
                objArr[0] = java.lang.Integer.valueOf(arrayList2.size());
                stringExtra = baseMvvmActivity.getString(com.tencent.mm.R.string.o6q, objArr);
                kotlin.jvm.internal.o.f(stringExtra, "getString(...)");
            }
            baseMvvmActivity.setMMTitle(stringExtra);
            baseMvvmActivity.hideActionbarLine();
            baseMvvmActivity.setBackBtn(new a45.h(this));
        }
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.chatting.basis.ChatListController chatListController = new com.tencent.mm.chatting.basis.ChatListController(context, (androidx.recyclerview.widget.RecyclerView) findViewById);
        chatListController.bindItemTypeHelper(a45.g.class);
        chatListController.bindMsg(arrayList);
    }
}
