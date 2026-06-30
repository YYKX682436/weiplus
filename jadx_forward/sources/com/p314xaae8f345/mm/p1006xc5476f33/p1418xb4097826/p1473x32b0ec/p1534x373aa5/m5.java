package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes8.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f198006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f f198007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f c14319xdc54373f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198007e = c14319xdc54373f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.m5(this.f198007e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.m5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f198006d;
        int i18 = 1;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", "#render mainScope.launch");
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        do {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f c14319xdc54373f = this.f198007e;
            if (((c14319xdc54373f.f197463o.isEmpty() ? 1 : 0) ^ i18) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", "#render taskList is empty");
                c14319xdc54373f.f197464p = null;
                c14319xdc54373f.f197458g.removeAllViews();
                c14319xdc54373f.f197465q = null;
                return jz5.f0.f384359a;
            }
            if (c14319xdc54373f.f197464p == null) {
                c14319xdc54373f.f197464p = (r45.s73) kz5.n0.Z(c14319xdc54373f.f197463o);
            } else {
                int i19 = 0;
                int i27 = 0;
                for (java.lang.Object obj2 : c14319xdc54373f.f197463o) {
                    int i28 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.s73 s73Var = (r45.s73) obj2;
                    r45.s73 s73Var2 = c14319xdc54373f.f197464p;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s73Var2 != null ? s73Var2.m75945x2fec8307(7) : null, s73Var.m75945x2fec8307(7)) && i28 < ((java.util.ArrayList) c14319xdc54373f.f197463o).size()) {
                        i27 = i28;
                    }
                    i19 = i28;
                }
                c14319xdc54373f.f197464p = (r45.s73) kz5.n0.a0(c14319xdc54373f.f197463o, i27);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#render currentShowTask task id: ");
            r45.s73 s73Var3 = c14319xdc54373f.f197464p;
            sb6.append(s73Var3 != null ? s73Var3.m75945x2fec8307(7) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", sb6.toString());
            r45.s73 s73Var4 = c14319xdc54373f.f197464p;
            if (s73Var4 != null) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((ml2.r0) c17).Vj(ml2.d2.f408884e, s73Var4.m75934xbce7f2f(6), 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 c14318x9be987f2 = c14319xdc54373f.f197465q;
                android.widget.RelativeLayout relativeLayout = c14319xdc54373f.f197458g;
                if (c14318x9be987f2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", "#render first time to show child view");
                    android.content.Context context = c14319xdc54373f.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 c14318x9be987f22 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2(context, null, 2, null);
                    c14318x9be987f22.a(s73Var4);
                    relativeLayout.addView(c14318x9be987f22);
                    c14319xdc54373f.f197465q = c14318x9be987f22;
                } else if (((java.util.ArrayList) c14319xdc54373f.f197463o).size() == i18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", "#render taskList.size == 1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 c14318x9be987f23 = c14319xdc54373f.f197465q;
                    if (c14318x9be987f23 != null) {
                        c14318x9be987f23.a(s73Var4);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", "#render not first time to show child view");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 c14318x9be987f24 = c14319xdc54373f.f197465q;
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l5(c14319xdc54373f, c14318x9be987f24));
                    translateAnimation.setDuration(400L);
                    if (c14318x9be987f24 != null) {
                        c14318x9be987f24.startAnimation(translateAnimation);
                    }
                    android.content.Context context2 = c14319xdc54373f.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2 c14318x9be987f25 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14318x9be987f2(context2, null, 2, null);
                    c14318x9be987f25.a(s73Var4);
                    relativeLayout.addView(c14318x9be987f25);
                    c14319xdc54373f.f197465q = c14318x9be987f25;
                    android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation2.setDuration(400L);
                    c14318x9be987f25.startAnimation(translateAnimation2);
                }
                i18 = 1;
            }
            this.f198006d = i18;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(5000L, this) != aVar);
        return aVar;
    }
}
