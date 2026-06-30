package b50;

/* loaded from: classes11.dex */
public final class e0 implements com.tencent.mm.pluginsdk.model.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17938b;

    public e0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, int i17) {
        this.f17937a = boxFlutterBizPlugin;
        this.f17938b = i17;
    }

    @Override // com.tencent.mm.pluginsdk.model.i
    public void a(java.util.List list) {
        java.util.ArrayList arrayList;
        com.tencent.pigeon.biz_base.BizFinderLiveInfo copy;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            linkedList.addAll(list);
        }
        if (list == null || list.isEmpty()) {
            arrayList = new java.util.ArrayList();
        } else {
            java.util.List k17 = com.tencent.mm.pluginsdk.model.b0.f189197a.k(linkedList, false);
            com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = this.f17937a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                copy = r5.copy((r32 & 1) != 0 ? r5.bizusername : null, (r32 & 2) != 0 ? r5.finder_feed_export_id : null, (r32 & 4) != 0 ? r5.refresh_interval : null, (r32 & 8) != 0 ? r5.title : null, (r32 & 16) != 0 ? r5.live_scene : null, (r32 & 32) != 0 ? r5.cover : null, (r32 & 64) != 0 ? r5.use_weapp : null, (r32 & 128) != 0 ? r5.finder_session_buffer : null, (r32 & 256) != 0 ? r5.data_buffer : null, (r32 & 512) != 0 ? r5.weapp_data : null, (r32 & 1024) != 0 ? r5.finder_data : null, (r32 & 2048) != 0 ? r5.live_status : 2L, (r32 & 4096) != 0 ? r5.from_session_id_info : null, (r32 & 8192) != 0 ? r5.nonce_id : null, (r32 & 16384) != 0 ? boxFlutterBizPlugin.a((r45.lk) it.next()).report_info : null);
                arrayList2.add(copy);
            }
            com.tencent.mars.xlog.Log.i(this.f17937a.f67061d, "BizFinderLiveLogic.onClick getValidBizFinderLiveInfo size=" + arrayList2.size());
            arrayList = arrayList2;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new b50.d0(this.f17937a, this.f17938b, arrayList));
    }
}
