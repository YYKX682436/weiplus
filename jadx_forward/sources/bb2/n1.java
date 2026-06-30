package bb2;

/* loaded from: classes10.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.a f100457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(bb2.w1 w1Var, wp.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100456d = w1Var;
        this.f100457e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bb2.n1(this.f100456d, this.f100457e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bb2.n1 n1Var = (bb2.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bb2.w1 w1Var = (bb2.w1) new java.lang.ref.WeakReference(this.f100456d).get();
        if (w1Var != null) {
            java.lang.Object obj2 = this.f100457e.f529887y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
            bb2.o oVar = (bb2.o) obj2;
            bb2.m0 m0Var = bb2.m0.f100451a;
            android.view.View view = w1Var.f100569a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bs_id", pm0.v.u(oVar.f100459a.m75942xfb822ef2(0)));
            jSONObject.put("feedid", pm0.v.u(w1Var.e().mo2128x1ed62e84()));
            m0Var.a(context, V6, "bullet_screen", false, jSONObject, w1Var.f100579k, oVar.f100459a.m75939xb282bd08(6));
        }
        return jz5.f0.f384359a;
    }
}
