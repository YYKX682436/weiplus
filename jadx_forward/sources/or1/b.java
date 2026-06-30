package or1;

/* loaded from: classes12.dex */
public class b extends fb5.b {
    @Override // fb5.b
    public void a(android.view.View view, fb5.a aVar) {
        if (view == null || aVar == null || !(aVar instanceof or1.a)) {
            return;
        }
        or1.a aVar2 = (or1.a) aVar;
        aVar2.f428986g = view.findViewById(com.p314xaae8f345.mm.R.id.f564923aj3);
        aVar2.f402217a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9n);
        aVar2.f428981b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbg);
        aVar2.f428982c = view.findViewById(com.p314xaae8f345.mm.R.id.f569071ox2);
        aVar2.f428984e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ga_);
        aVar2.f428983d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hed);
        aVar2.f428985f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f569300ps0);
    }

    @Override // fb5.b
    public void b(android.content.Context context, fb5.a aVar, fb5.c cVar, java.lang.Object... objArr) {
        if (context == null || aVar == null || cVar == null || cVar.f342415b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
            return;
        }
        if (!(cVar instanceof or1.c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
            return;
        }
        or1.a aVar2 = (or1.a) aVar;
        or1.c cVar2 = (or1.c) cVar;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(aVar2.f402217a, cVar2.f428997l);
        android.view.View view = aVar2.f428982c;
        int i17 = cVar2.f428998m ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = aVar2.f428986g;
        int i18 = cVar2.f428999n ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizContactDataItem$BizContactViewItem", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lr1.m.b(aVar2.f428981b, cVar2.f428994i);
        boolean b17 = lr1.m.b(aVar2.f428985f, cVar2.f428996k);
        boolean b18 = lr1.m.b(aVar2.f428984e, cVar2.f428995j);
        if (lr1.m.b(aVar2.f428983d, cVar2.f428993h)) {
            if (b17 || b18) {
                aVar2.f428983d.setMaxLines(1);
            } else {
                aVar2.f428983d.setMaxLines(2);
            }
        }
    }

    @Override // fb5.b
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        return view == null ? android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ciy, null) : view;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @Override // fb5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.content.Context r17, android.view.View r18, fb5.c r19, java.lang.Object... r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or1.b.d(android.content.Context, android.view.View, fb5.c, java.lang.Object[]):boolean");
    }
}
