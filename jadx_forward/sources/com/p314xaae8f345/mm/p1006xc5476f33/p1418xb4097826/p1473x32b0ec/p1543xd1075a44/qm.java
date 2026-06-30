package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm f201069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f201070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar, zi2.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201068d = str;
        this.f201069e = wmVar;
        this.f201070f = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qm(this.f201068d, this.f201069e, this.f201070f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qm qmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qm) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qmVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dk2.u7 u7Var = dk2.u7.f315714a;
        java.lang.String giftId = this.f201068d;
        ce2.i e17 = u7Var.e(giftId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.f201069e;
        if (e17 != null) {
            wmVar.f201745m = giftId;
            zi2.w wVar = this.f201070f;
            wVar.getClass();
            ch2.r rVar = (ch2.r) wVar.U0(ch2.r.class);
            if (rVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
                rVar.f122983m = giftId;
            }
            if (wmVar.f201754v == null) {
                android.content.Context context = wmVar.f201739d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                wmVar.f201754v = new vg2.y1(context, (tg2.h) ((jz5.n) wmVar.f201752t).mo141623x754a37bb(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pm.f200925d);
            }
            wmVar.l(wVar);
            wmVar.getClass();
            ((mm2.c1) wVar.P0(mm2.c1.class)).f410419t3.mo7806x9d92d11c(wVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mm(wmVar, wVar));
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(e17.R0(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            android.widget.ImageView imageView = wmVar.f201743h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "access$getIconView$p(...)");
            a17.c(imageView);
            wmVar.f201747o = true;
            wmVar.f201739d.setTag(giftId);
            wVar.getClass();
            jf2.k0 k0Var = (jf2.k0) wVar.U0(jf2.k0.class);
            if (k0Var != null) {
                k0Var.a7("onKTVGiftResourceLoaded", false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wmVar.f201741f, "onUpdateOuterGift: gift loaded and ready, giftId=" + giftId);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(wmVar.f201741f, "onUpdateOuterGift: giftInfo not found after loading, giftId=" + giftId);
            wmVar.n();
        }
        return jz5.f0.f384359a;
    }
}
