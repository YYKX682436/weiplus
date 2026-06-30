package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class eg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.s0 f285406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f285408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f285410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf f285411i;

    public eg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf zfVar, ot0.s0 s0Var, int i17, long j17, java.lang.String str, long j18) {
        this.f285411i = zfVar;
        this.f285406d = s0Var;
        this.f285407e = i17;
        this.f285408f = j17;
        this.f285409g = str;
        this.f285410h = j18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map x17 = ot0.q.x(this.f285406d.M);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf zfVar = this.f285411i;
        if (x17 != null) {
            java.lang.String str = "";
            int i17 = this.f285407e;
            if (i17 != 0) {
                str = i17 + "";
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.q4) ((zy2.ib) i95.n0.c(zy2.ib.class))).wi(zfVar.f287667s.g(), ".msg.appmsg.mmreader.category.item" + str, x17, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(27, 2, 25, null))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "biz enter finder logic");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int m78386x9c19e6d7 = zfVar.f287667s.f542250l.m78386x9c19e6d7("KOpenArticleSceneFromScene", 10000);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("biz_video_scene", 0);
        bundle.putInt(com.p314xaae8f345.mm.ui.j2.f290523a, m78386x9c19e6d7);
        bundle.putInt("geta8key_scene", 7);
        bundle.putString("geta8key_username", zfVar.f287667s.x());
        os1.a.a(zfVar.f287667s.g(), this.f285408f, this.f285409g, this.f285410h, this.f285407e, bundle);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
