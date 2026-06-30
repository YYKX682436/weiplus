package ed4;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f332821a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        this.f332821a = new java.lang.ref.WeakReference(bsVar);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 q1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableCallBack");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs) this.f332821a.get();
        if (bsVar != null && (q1Var = bsVar.f249588u) != null) {
            if (obj instanceof ca4.h ? ((ca4.h) obj).f121467a : false) {
                q1Var.f251826b = 0;
            } else {
                q1Var.f251826b = 6;
            }
            q1Var.a(view, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableCallBack");
    }
}
