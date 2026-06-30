package ej4;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f334914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej4.v f334915f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.widget.TextView textView, ej4.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f334914e = textView;
        this.f334915f = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ej4.u(this.f334914e, this.f334915f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ej4.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334913d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bk4.f a17 = bk4.i.a();
            android.widget.TextView textView = this.f334914e;
            ej4.v vVar = this.f334915f;
            java.lang.CharSequence O = a17.O(textView, vVar.f334907a, textView.getText(), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20), vVar.f334917e, vVar.f334918f);
            if (O != null) {
                android.widget.TextView textView2 = this.f334914e;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView2.getText(), O)) {
                    if (O instanceof android.text.Spannable) {
                        fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                        java.lang.String userName = vVar.f334916d;
                        ((ee0.n4) k4Var).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cacheSnsNickSpan", "com.tencent.mm.feature.sns.SnsFeatureService");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                        java.util.HashMap hashMap = nd4.f.f418011a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("put", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineSpanPool");
                        nd4.f.f418011a.put(userName.concat("-1"), (android.text.Spannable) O);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("put", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineSpanPool");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cacheSnsNickSpan", "com.tencent.mm.feature.sns.SnsFeatureService");
                    }
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                    ej4.t tVar = new ej4.t(textView2, vVar, O, null);
                    this.f334913d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, tVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
