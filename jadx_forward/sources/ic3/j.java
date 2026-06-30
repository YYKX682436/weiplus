package ic3;

/* loaded from: classes12.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.i f371939e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7, xj.i iVar) {
        this.f371938d = activityC16419x510d00b7;
        this.f371939e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371938d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        ((wj.j0) this.f371939e).oj(activityC16419x510d00b7.f229384e, "test_comprehensive_report");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "✅ 上报流程测试完成\n\n请查看日志验证：\n1. Expose(6) KV\n2. ExposeEnd(16) KV（value=时长 ms）\n3. NotShow(19) KV（value=0, extra=原因）");
        java.lang.String str2 = activityC16419x510d00b7.f229383d;
    }
}
