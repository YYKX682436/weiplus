package rm;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrm/i;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountRequest;", "Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountResponse;", "<init>", "()V", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0, com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000> {

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f478916d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0 request = (com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        int i17 = request.f145143d;
        boolean wi6 = ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).wi();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
        boolean z17 = bVar != null && bVar.f299434t == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanCreatePhotoAccountTask", "checkCanCreatePhotoAccount scene=" + i17 + ", canCreatePhotoAcct=" + wi6 + ", canCreateBizAcct=" + z17);
        if (i17 != 0) {
            p3325xe03a0797.p3326xc267989b.l.d(f478916d, null, null, new rm.h(i17, rVar, wi6, z17, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g.f299275b, i17 == 1 ? com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1.INTERACTIVE_GUIDE_SCENE_AFTER_FOLLOW : com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1.INTERACTIVE_GUIDE_SCENE_COMMENT_INPUT, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanCreatePhotoAccountTask", "checkCanCreatePhotoAccount done, scene=0, skip sceneEnabled/wording");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000(true, wi6, z17, false, "", "", ""));
            }
        }
    }
}
