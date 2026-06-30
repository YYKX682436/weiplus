package ca4;

/* loaded from: classes4.dex */
public class x0 extends com.tencent.mm.plugin.sns.ui.q1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ns f40059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f40060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.app.Activity activity, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        super(activity, i17, k4Var);
        this.f40059e = nsVar;
        this.f40060f = bsVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.q1, com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtil$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f40059e.f170025a;
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f40060f;
        if (snsInfo == null || !snsInfo.isAd()) {
            bsVar.f168055u.f170293b = 14;
        } else {
            bsVar.f168055u.f170293b = 0;
        }
        bsVar.f168055u.a(view, obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtil$1");
    }
}
