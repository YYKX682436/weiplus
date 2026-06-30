package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.t4 f103089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f103091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.gs f103092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103093h;

    public cs(so2.t4 t4Var, int i17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.convert.gs gsVar, in5.s0 s0Var) {
        this.f103089d = t4Var;
        this.f103090e = i17;
        this.f103091f = finderObject;
        this.f103092g = gsVar;
        this.f103093h = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.dm2 object_extend;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("topicId=");
        so2.t4 t4Var = this.f103089d;
        sb6.append(t4Var.f410609f);
        sb6.append(", objectIndex=");
        sb6.append(this.f103090e);
        sb6.append(", objectId=");
        sb6.append(this.f103091f.getId());
        com.tencent.mars.xlog.Log.i("FinderPostPlaySquareContainerConvert", sb6.toString());
        in5.s0 s0Var = this.f103093h;
        int i17 = this.f103090e;
        this.f103092g.getClass();
        try {
            android.content.Context context = s0Var.itemView.getContext();
            if (context instanceof android.app.Activity) {
                java.util.List list = t4Var.f410611h;
                long j17 = t4Var.f410609f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 0)));
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("topic_id", j17);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(list, i17);
                intent.putExtra("from_object_id", finderObject != null ? finderObject.getId() : 0L);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(list, i17);
                intent.putExtra("from_object_dup_flag", (finderObject2 == null || (object_extend = finderObject2.getObject_extend()) == null) ? null : object_extend.getString(62));
                java.lang.String str = t4Var.f410612i;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("by_pass", str);
                intent.putExtra("single_comment_scene", 383);
                new com.tencent.mm.plugin.finder.feed.model.y9().b(new com.tencent.mm.plugin.finder.feed.model.r9(new java.util.ArrayList(arrayList2), null, i17, null, null, 16, null), intent);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Zk((android.app.Activity) context, intent);
                com.tencent.mars.xlog.Log.i("FinderPostPlaySquareContainerConvert", "跳转到单流页: topicId=" + j17 + ", objectIndex=" + i17);
            } else {
                com.tencent.mars.xlog.Log.e("FinderPostPlaySquareContainerConvert", "Context is not Activity, cannot start activity");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderPostPlaySquareContainerConvert", "跳转单流页失败: " + e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
