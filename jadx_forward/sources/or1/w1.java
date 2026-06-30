package or1;

/* loaded from: classes12.dex */
public class w1 extends fb5.b {
    public w1(or1.y1 y1Var) {
    }

    @Override // fb5.b
    public void a(android.view.View view, fb5.a aVar) {
        if (view == null || aVar == null || !(aVar instanceof or1.x1)) {
            return;
        }
        ((or1.x1) aVar).f429128a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_y);
    }

    @Override // fb5.b
    public void b(android.content.Context context, fb5.a aVar, fb5.c cVar, java.lang.Object... objArr) {
        if (context == null || aVar == null || cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMoreBtnDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.x1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMoreBtnDataItem", "The ViewHolder is not a instance of MoreBtnViewHolder.");
        } else if (cVar instanceof or1.y1) {
            ((or1.x1) aVar).f429128a.setText(((or1.y1) cVar).f429132d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMoreBtnDataItem", "The DataItem is not a instance of MoreBtnDataItem.");
        }
    }

    @Override // fb5.b
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        return view == null ? android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570969cj0, null) : view;
    }

    @Override // fb5.b
    public boolean d(android.content.Context context, android.view.View view, fb5.c cVar, java.lang.Object... objArr) {
        int i17;
        if (context != null && cVar != null) {
            if (objArr != null && objArr.length >= 2) {
                java.lang.Object obj = objArr[1];
                if (obj instanceof java.lang.Integer) {
                    i17 = ((java.lang.Integer) obj).intValue();
                    or1.y1 y1Var = (or1.y1) cVar;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f.class);
                    intent.putExtra("keyword", y1Var.f429134f);
                    intent.putExtra("businessType", y1Var.f429133e);
                    intent.putExtra("offset", y1Var.f429135g);
                    intent.putExtra("showEditText", true);
                    intent.putExtra("fromScene", i17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            i17 = 0;
            or1.y1 y1Var2 = (or1.y1) cVar;
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f.class);
            intent2.putExtra("keyword", y1Var2.f429134f);
            intent2.putExtra("businessType", y1Var2.f429133e);
            intent2.putExtra("offset", y1Var2.f429135g);
            intent2.putExtra("showEditText", true);
            intent2.putExtra("fromScene", i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }
}
