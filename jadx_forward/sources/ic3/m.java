package ic3;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f371944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f371946f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7, wj.t0 t0Var) {
        super(1);
        this.f371944d = j17;
        this.f371945e = activityC16419x510d00b7;
        this.f371946f = t0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f371944d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371945e;
        if (mVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "✅ 结果: 被拦截（返回空广告数据）\n说明: 元宝已安装，触发拦截\n耗时: " + currentTimeMillis + "ms\n\n请查看日志验证：\n1. GetAdInfo result=Reject(4)\n2. ClientIntercept(15) KV（value=reason）");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 结果: 未拦截（获取到广告）\n说明: 元宝未安装，放行\n耗时: " + currentTimeMillis + "ms\naid: " + mVar.f536286a);
        }
        wj.t0 t0Var = this.f371946f;
        activityC16419x510d00b7.f229384e = t0Var;
        java.util.Objects.toString(t0Var);
        return jz5.f0.f384359a;
    }
}
