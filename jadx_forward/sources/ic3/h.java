package ic3;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        super(1);
        this.f371936d = activityC16419x510d00b7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371936d;
        if (mVar != null) {
            java.lang.String str = mVar.f536286a;
            boolean D = r26.n0.D(str, "123456", false, 2, null);
            activityC16419x510d00b7.f229385f = str;
            if (D) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "✅ Fallback 注入成功\naid: " + str + "\nhintText: " + mVar.f536287b + "\n\n请查看日志验证：\n1. GetAdInfo result=Fallback(7)\n2. extra 包含 use_fallback\n3. Expose/ExposeEnd/Click 上报包含 use_fallback");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 返回的是真广告（非 fallback）\n可能 CGI 成功返回了广告\naid: ".concat(str));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 未返回广告（fallback 也未注入）\n可能 useFallback 配置不完整");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC16419x510d00b7.f229383d, "[综合测试-Fallback] ⚠️ 未返回广告");
        }
        return jz5.f0.f384359a;
    }
}
