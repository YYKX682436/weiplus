package ca4;

/* loaded from: classes4.dex */
public class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns f121592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f121593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.app.Activity activity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        super(activity, i17, k4Var);
        this.f121592e = nsVar;
        this.f121593f = bsVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.data.SnsUtil$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f121592e.f251558a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f121593f;
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70377x3172ed()) {
            bsVar.f249588u.f251826b = 14;
        } else {
            bsVar.f249588u.f251826b = 0;
        }
        bsVar.f249588u.a(view, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsUtil$1");
    }
}
