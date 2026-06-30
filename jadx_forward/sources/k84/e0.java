package k84;

/* loaded from: classes4.dex */
public final class e0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.p f386546e;

    public e0(k84.q1 q1Var, mb4.p pVar) {
        this.f386545d = q1Var;
        this.f386546e = pVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        i64.p pVar = (i64.p) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        k84.q1 q1Var = this.f386545d;
        java.lang.String j17 = q1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe CountTitle = ");
        java.lang.String str = null;
        sb6.append(pVar != null ? pVar.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        if (pVar == null || (a17 = pVar.a()) == null) {
            mb4.h0 c17 = this.f386546e.c();
            if (c17 != null) {
                str = c17.a();
            }
        } else {
            str = a17;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 S = q1Var.S();
        if (S != null) {
            if (str == null) {
                str = "";
            }
            S.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$4$1");
        return f0Var;
    }
}
