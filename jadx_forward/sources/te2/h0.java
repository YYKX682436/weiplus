package te2;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f499582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f499583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(te2.i0 i0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499582e = i0Var;
        this.f499583f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.h0(this.f499582e, this.f499583f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499581d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i18 = this.f499583f;
        te2.i0 i0Var = this.f499582e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!i0Var.f499630q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f499626m, "has released, return");
                return f0Var;
            }
            if (i18 == 1) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D = i0Var.D();
                if (D != null) {
                    vl2.s sVar = vl2.s.f519401a;
                    vl2.h hVar = vl2.h.f519367v;
                    this.f499581d = 1;
                    if (sVar.d(hVar, D, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i0Var.f499629p < 1) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D2 = i0Var.D();
                if (D2 != null) {
                    vl2.s sVar2 = vl2.s.f519401a;
                    vl2.h hVar2 = vl2.h.f519369x;
                    this.f499581d = 2;
                    if (sVar2.d(hVar2, D2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D3 = i0Var.D();
                if (D3 != null) {
                    vl2.s sVar3 = vl2.s.f519401a;
                    vl2.h hVar3 = vl2.h.f519368w;
                    this.f499581d = 3;
                    if (sVar3.d(hVar3, D3, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2 && i17 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        i0Var.f499629p = i18;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D4 = i0Var.D();
        if (D4 != null) {
            D4.m82582x3ae760af(0.0d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D5 = i0Var.D();
        if (D5 != null) {
            D5.m82583xcde73672(1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D6 = i0Var.D();
        if (D6 != null) {
            D6.g();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D7 = i0Var.D();
        if (D7 != null) {
            D7.a(i0Var.f499627n);
        }
        if (i0Var.u().getVisibility() == 8) {
            android.view.View u17 = i0Var.u();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$updateLuckyMoneyCount$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i0Var.z();
        }
        if (i0Var.x()) {
            android.widget.TextView C = i0Var.C();
            if (C != null) {
                C.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = i0Var.f499624h;
            if (i18 <= 1) {
                android.widget.TextView C2 = i0Var.C();
                if (C2 != null) {
                    C2.setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsp));
                }
            } else {
                if (2 <= i18 && i18 < 10) {
                    android.widget.TextView C3 = i0Var.C();
                    if (C3 != null) {
                        C3.setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dso, java.lang.Integer.valueOf(i18)));
                    }
                } else {
                    android.widget.TextView C4 = i0Var.C();
                    if (C4 != null) {
                        C4.setText("x" + i18);
                    }
                }
            }
        } else {
            android.widget.TextView C5 = i0Var.C();
            if (C5 != null) {
                C5.setText("x" + i18);
            }
            android.widget.TextView C6 = i0Var.C();
            if (C6 != null) {
                C6.setVisibility(i18 == 1 ? 8 : 0);
            }
        }
        return f0Var;
    }
}
