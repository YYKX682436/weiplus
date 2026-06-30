package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class ri extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f108915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ti f108916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f108920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(boolean z17, com.tencent.mm.plugin.finder.feed.ti tiVar, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f108915d = z17;
        this.f108916e = tiVar;
        this.f108917f = str;
        this.f108918g = str2;
        this.f108919h = str3;
        this.f108920i = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        zl2.u4 u4Var = !this.f108915d ? zl2.u4.f473990f : zl2.u4.f473988d;
        com.tencent.mm.plugin.finder.feed.ti tiVar = this.f108916e;
        android.app.Activity context = tiVar.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = new com.tencent.mm.plugin.finder.live.widget.hp((androidx.appcompat.app.AppCompatActivity) context, null, u4Var, 2, null);
        tiVar.f109061d = hpVar;
        hpVar.L = new com.tencent.mm.plugin.finder.feed.ni(tiVar);
        hpVar.N = new com.tencent.mm.plugin.finder.feed.oi(tiVar);
        hpVar.K = new com.tencent.mm.plugin.finder.feed.pi(tiVar);
        java.lang.String str2 = this.f108917f;
        if (!(str2 == null || str2.length() == 0)) {
            hpVar.f118580a2 = str2;
        }
        com.tencent.mm.plugin.finder.live.widget.hp hpVar2 = tiVar.f109061d;
        if (hpVar2 != null) {
            hpVar2.f0();
        }
        long Z = pm0.v.Z(this.f108918g);
        java.lang.String str3 = this.f108919h;
        long Z2 = pm0.v.Z(str3);
        r45.xn1 xn1Var = (r45.xn1) this.f108920i.f310123d;
        com.tencent.mm.plugin.finder.feed.qi qiVar = new com.tencent.mm.plugin.finder.feed.qi(tiVar, str3);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        ke2.t tVar = new ke2.t(Z, Z2, str, 3, xn1Var.getByteString(9), null, null);
        az2.j.u(tVar, tiVar.getActivity(), null, 1000L, 2, null);
        pq5.g l17 = tVar.l();
        androidx.appcompat.app.AppCompatActivity activity = tiVar.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            l17.f(mMActivity);
        }
        l17.K(new com.tencent.mm.plugin.finder.feed.si(str, xn1Var, qiVar));
        return jz5.f0.f302826a;
    }
}
