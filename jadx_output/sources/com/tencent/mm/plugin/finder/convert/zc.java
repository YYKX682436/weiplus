package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gm2 f105099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f105100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f105101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f105104i;

    public zc(r45.gm2 gm2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.convert.qe qeVar, java.lang.String str, in5.s0 s0Var, android.view.View view) {
        this.f105099d = gm2Var;
        this.f105100e = finderItem;
        this.f105101f = qeVar;
        this.f105102g = str;
        this.f105103h = s0Var;
        this.f105104i = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long j17;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.gm2 gm2Var = this.f105099d;
        int integer = gm2Var.getInteger(3);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f105101f;
        in5.s0 s0Var = this.f105103h;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f105100e;
        if (integer > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_topic_type", gm2Var.getInteger(2));
            intent.putExtra("key_topic_title", gm2Var.getString(1));
            intent.putExtra("KEY_TOPIC_ID", gm2Var.getLong(0));
            com.tencent.mm.protobuf.g byteString = gm2Var.getByteString(4);
            if (byteString != null) {
                intent.putExtra("KEY_HOT_TOPIC_BUFFER", byteString.f192156a);
            }
            intent.putExtra("key_hot_topic_type", gm2Var.getInteger(2));
            intent.putExtra("KEY_CLICK_FEED_ID", finderItem != null ? java.lang.Long.valueOf(finderItem.getId()) : null);
            intent.putExtra("key_ref_object_id", finderItem != null ? java.lang.Long.valueOf(finderItem.getId()) : null);
            intent.putExtra("key_ref_object_dup_flag", finderItem != null ? finderItem.getDupFlag() : null);
            intent.putExtra("KEY_TAB_TYPE", qeVar.f104360h);
            java.lang.String str = this.f105102g;
            if (str == null) {
                str = "";
            }
            intent.putExtra("key_from_user", str);
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            i0Var.il(context2, intent);
            j17 = 1;
        } else {
            java.lang.Object obj = s0Var.f293125i;
            kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
            boolean k07 = qeVar.k0((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[refreshNewsLayout] hot news not support jump! isShowRealNameRecommendLayout=" + k07);
            if (k07) {
                android.view.View view2 = this.f105104i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            j17 = 0;
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long id6 = (finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? 0L : feedObject.getId();
        java.lang.String dupFlag = finderItem != null ? finderItem.getDupFlag() : null;
        long j18 = gm2Var.getLong(0);
        java.lang.String string = gm2Var.getString(1);
        java.lang.String str2 = string == null ? "" : string;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        o3Var.Kk(id6, dupFlag, 2L, j18, str2, j17, nyVar != null ? nyVar.f135380n : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
