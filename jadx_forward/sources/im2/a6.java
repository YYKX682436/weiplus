package im2;

/* loaded from: classes3.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(im2.h6 h6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373783e = h6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.a6(this.f373783e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.a6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ow1 ow1Var;
        r45.td1 td1Var;
        r45.td1 td1Var2;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373782d;
        im2.h6 h6Var = this.f373783e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f373782d = 1;
            obj = im2.h6.g(h6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.l71 l71Var = (r45.l71) obj;
        h6Var.getClass();
        java.lang.String str = null;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Fk(l71Var != null ? (r45.nw1) l71Var.m75936x14adae67(1) : null, true);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Vi((l71Var == null || (nw1Var = (r45.nw1) l71Var.m75936x14adae67(1)) == null) ? 0L : nw1Var.m75942xfb822ef2(0), l71Var != null ? l71Var.m75939xb282bd08(32) : 0, l71Var != null ? (r45.t84) l71Var.m75936x14adae67(30) : null);
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85448x0).mo141623x754a37bb()).r()).intValue() == 1) {
            h6Var.P = true;
        }
        if ((l71Var != null ? (r45.td1) l71Var.m75936x14adae67(8) : null) != null) {
            h6Var.P = true;
            java.lang.String m75945x2fec8307 = (l71Var == null || (td1Var2 = (r45.td1) l71Var.m75936x14adae67(8)) == null) ? null : td1Var2.m75945x2fec8307(0);
            if (l71Var != null && (td1Var = (r45.td1) l71Var.m75936x14adae67(8)) != null) {
                str = td1Var.m75945x2fec8307(1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "updateBg: show abnormal close page, title:" + m75945x2fec8307 + ", wording:" + str);
            h6Var.Y().f492185g = m75945x2fec8307;
            h6Var.Y().f492186h = str;
            h6Var.f373896g.setText(m75945x2fec8307);
            android.widget.TextView textView = h6Var.f373897h;
            textView.setText(str);
            textView.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "is abnormal close = " + h6Var.P);
        if (l71Var != null && (ow1Var = (r45.ow1) l71Var.m75936x14adae67(40)) != null) {
            h6Var.Y().f492202x = ow1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "live_entrance_guide_info: enable_guide_page=" + ow1Var.m75933x41a8a7f2(0));
        }
        return l71Var;
    }
}
