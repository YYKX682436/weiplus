package dm2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f323199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 f323200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 c14375x1f466727, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323200e = c14375x1f466727;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dm2.b(this.f323200e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dm2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f323199d;
        boolean z17 = true;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render mainScope.launch");
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        do {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 c14375x1f466727 = this.f323200e;
            if (!(c14375x1f466727.f197844g.isEmpty() ^ z17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render taskList is empty");
                c14375x1f466727.f197845h = null;
                c14375x1f466727.f197843f.removeAllViews();
                c14375x1f466727.f197846i = null;
                return jz5.f0.f384359a;
            }
            if (c14375x1f466727.f197845h == null) {
                i17 = (int) (java.lang.System.currentTimeMillis() % ((java.util.ArrayList) c14375x1f466727.f197844g).size());
                c14375x1f466727.f197845h = (r45.rd4) kz5.n0.a0(c14375x1f466727.f197844g, i17);
            } else {
                int i19 = 0;
                int i27 = 0;
                for (java.lang.Object obj2 : c14375x1f466727.f197844g) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.rd4 rd4Var = (r45.rd4) obj2;
                    r45.rd4 rd4Var2 = c14375x1f466727.f197845h;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rd4Var2 != null ? rd4Var2.m75945x2fec8307(2) : null, rd4Var.m75945x2fec8307(2)) && i28 < ((java.util.ArrayList) c14375x1f466727.f197844g).size()) {
                        i19 = i28;
                    }
                    i27 = i28;
                }
                c14375x1f466727.f197845h = (r45.rd4) kz5.n0.a0(c14375x1f466727.f197844g, i19);
                i17 = i19;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render currentShowTask: index=" + i17 + ' ' + c14375x1f466727.f197845h);
            r45.rd4 rd4Var3 = c14375x1f466727.f197845h;
            if (rd4Var3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 c14376x7fc1695 = c14375x1f466727.f197846i;
                android.widget.RelativeLayout relativeLayout = c14375x1f466727.f197843f;
                if (c14376x7fc1695 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render first time to show child view");
                    android.content.Context context = c14375x1f466727.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 c14376x7fc16952 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695(context, null, 2, null);
                    c14376x7fc16952.a(rd4Var3);
                    relativeLayout.addView(c14376x7fc16952);
                    c14375x1f466727.f197846i = c14376x7fc16952;
                } else if (((java.util.ArrayList) c14375x1f466727.f197844g).size() == z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render taskList.size == 1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 c14376x7fc16953 = c14375x1f466727.f197846i;
                    if (c14376x7fc16953 != null) {
                        c14376x7fc16953.a(rd4Var3);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render not first time to show child view");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 c14376x7fc16954 = c14375x1f466727.f197846i;
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setAnimationListener(new dm2.a(c14375x1f466727, c14376x7fc16954));
                    translateAnimation.setDuration(400L);
                    if (c14376x7fc16954 != null) {
                        c14376x7fc16954.startAnimation(translateAnimation);
                    }
                    android.content.Context context2 = c14375x1f466727.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 c14376x7fc16955 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695(context2, null, 2, null);
                    c14376x7fc16955.a(rd4Var3);
                    relativeLayout.addView(c14376x7fc16955);
                    c14375x1f466727.f197846i = c14376x7fc16955;
                    android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation2.setDuration(400L);
                    c14376x7fc16955.startAnimation(translateAnimation2);
                }
            }
            r45.rd4 rd4Var4 = c14375x1f466727.f197845h;
            long m75942xfb822ef2 = (rd4Var4 != null ? rd4Var4.m75942xfb822ef2(5) : 0L) * 1000;
            if (m75942xfb822ef2 == 0) {
                m75942xfb822ef2 = 3000;
            }
            j17 = m75942xfb822ef2 >= 3000 ? m75942xfb822ef2 : 3000L;
            z17 = true;
            this.f323199d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) != aVar);
        return aVar;
    }
}
