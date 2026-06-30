package b50;

/* loaded from: classes11.dex */
public final class e0 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f99471b;

    public e0(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, int i17) {
        this.f99470a = c10601x91d05935;
        this.f99471b = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i
    public void a(java.util.List list) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23430xf10635d3 m86374x2eaf75;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            linkedList.addAll(list);
        }
        if (list == null || list.isEmpty()) {
            arrayList = new java.util.ArrayList();
        } else {
            java.util.List k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.k(linkedList, false);
            com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935 = this.f99470a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                m86374x2eaf75 = r5.m86374x2eaf75((r32 & 1) != 0 ? r5.bizusername : null, (r32 & 2) != 0 ? r5.finder_feed_export_id : null, (r32 & 4) != 0 ? r5.refresh_interval : null, (r32 & 8) != 0 ? r5.title : null, (r32 & 16) != 0 ? r5.live_scene : null, (r32 & 32) != 0 ? r5.cover : null, (r32 & 64) != 0 ? r5.use_weapp : null, (r32 & 128) != 0 ? r5.finder_session_buffer : null, (r32 & 256) != 0 ? r5.data_buffer : null, (r32 & 512) != 0 ? r5.weapp_data : null, (r32 & 1024) != 0 ? r5.finder_data : null, (r32 & 2048) != 0 ? r5.live_status : 2L, (r32 & 4096) != 0 ? r5.from_session_id_info : null, (r32 & 8192) != 0 ? r5.nonce_id : null, (r32 & 16384) != 0 ? c10601x91d05935.a((r45.lk) it.next()).report_info : null);
                arrayList2.add(m86374x2eaf75);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99470a.f148594d, "BizFinderLiveLogic.onClick getValidBizFinderLiveInfo size=" + arrayList2.size());
            arrayList = arrayList2;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new b50.d0(this.f99470a, this.f99471b, arrayList));
    }
}
