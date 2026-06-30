package ad4;

/* loaded from: classes4.dex */
public final class t extends com.tencent.mm.plugin.sns.ui.q1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f3201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.e86 e86Var, android.content.Context context) {
        super(null, 0, null);
        this.f3201e = e86Var;
        this.f3202f = context;
    }

    @Override // com.tencent.mm.plugin.sns.ui.q1, com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = this.f3201e.f373126d;
        }
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
        android.content.Context context = this.f3202f;
        if (q17 == null || !q17.k2()) {
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 103);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(str, 8L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
            return;
        }
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 37);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 103);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
    }
}
