package gx1;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.l f358833d;

    public k(gx1.l lVar) {
        this.f358833d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx1.l lVar = this.f358833d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) lVar.f358824d.f422865b;
        abstractActivityC13156x6363e8e1.getClass();
        qx1.q qVar = abstractActivityC13156x6363e8e1.f178033g;
        if (qVar != null) {
            qVar.d(null);
        }
        android.content.Context context = lVar.f358837f.getContext();
        if (lVar.i() == 5) {
            ix1.b bVar = (ix1.b) lVar.f358836e;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd.class);
            try {
                r45.gp0 gp0Var = bVar.f376857m;
                if (gp0Var == null) {
                    gp0Var = bVar.f376858n;
                }
                intent.putExtra("data_item_key", gp0Var.mo14344x5f01b1f6());
            } catch (java.io.IOException unused) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            lVar.i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
