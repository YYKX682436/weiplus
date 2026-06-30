package gx1;

/* loaded from: classes12.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.d f358827d;

    public c(gx1.d dVar) {
        this.f358827d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx1.d dVar = this.f358827d;
        android.content.Intent intent = new android.content.Intent(dVar.f358837f.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2.class);
        java.lang.String str = dVar.f358836e.f376844a;
        if (str != null) {
            intent.putExtra("key_detail_data_id", str);
        }
        android.content.Context context = dVar.f358837f.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
