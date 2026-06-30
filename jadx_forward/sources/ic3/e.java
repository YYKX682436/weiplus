package ic3;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        super(1);
        this.f371930d = activityC16419x510d00b7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371930d;
        if (mVar != null) {
            java.lang.String str = mVar.f536286a;
            activityC16419x510d00b7.f229385f = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "✅ Preload 流程测试完成\naid: " + str + "\n\n请查看日志验证：\n1. PreloadTrigger\n2. PullStart（preload 触发）\n3. PreloadSuccess\n4. GetAdInfo（getAdInfo 复用 CGI，无重复 PullStart）");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ Preload 流程测试失败\nCGI 可能失败，请查看日志");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC16419x510d00b7.f229383d, "[综合测试-Preload] ⚠️ 失败");
        }
        return jz5.f0.f384359a;
    }
}
