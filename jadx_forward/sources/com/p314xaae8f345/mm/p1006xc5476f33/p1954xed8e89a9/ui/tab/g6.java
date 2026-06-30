package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f235867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f235868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f235869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 f235870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f235871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f235872i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var, boolean z17, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 w1Var, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f235867d = i17;
        this.f235868e = m0Var;
        this.f235869f = z17;
        this.f235870g = w1Var;
        this.f235871h = z18;
        this.f235872i = c16892x4a36dc90;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.g6(this.f235867d, this.f235868e, this.f235869f, this.f235870g, this.f235871h, this.f235872i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.g6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        java.lang.String d17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i17 = this.f235867d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f235868e;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: current identity=" + i17 + ", not WX");
            m0Var.h();
            return f0Var;
        }
        if (!this.f235869f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: scene disabled");
            m0Var.h();
            return f0Var;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 w1Var = this.f235870g;
        if (w1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: wording nil/parse-fail");
            m0Var.h();
            return f0Var;
        }
        boolean[] zArr = w1Var.f299337f;
        boolean z17 = this.f235871h;
        if (z17) {
            if (zArr[2]) {
                str = w1Var.f299336e;
            }
            str = "";
        } else {
            if (zArr[1]) {
                str = w1Var.f299335d;
            }
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] hidden: ");
            sb6.append(z17 ? com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf : "register");
            sb6.append(" wording empty");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
            m0Var.h();
            return f0Var;
        }
        if (!z17 && !((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).wi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] hidden: no photo account and cannot register");
            m0Var.h();
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = this.f235872i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var2 = c16892x4a36dc90.f235753y;
        if (m0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
            if (z17) {
                java.lang.String str3 = zArr[2] ? w1Var.f299336e : "";
                str2 = str3 != null ? str3 : "";
                string = activityC16840x4302a3e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7o);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else {
                java.lang.String str4 = zArr[1] ? w1Var.f299335d : "";
                str2 = str4 != null ? str4 : "";
                string = activityC16840x4302a3e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = m0Var2.f235997s;
            if (s4Var != null) {
                s4Var.f236101l0 = true;
                java.lang.Object mo141623x754a37bb = ((jz5.n) s4Var.f236097j0).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((android.widget.TextView) mo141623x754a37bb).setText(str2);
                java.lang.Object mo141623x754a37bb2 = ((jz5.n) s4Var.f236099k0).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
                ((android.widget.TextView) mo141623x754a37bb2).setText(string);
                java.lang.Object mo141623x754a37bb3 = ((jz5.n) s4Var.f236095i0).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
                android.view.View view = (android.view.View) mo141623x754a37bb3;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "showPhotoAccountGuideCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "showPhotoAccountGuideCard", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[PhotoAccountGuide] show guide card, biz=");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16892x4a36dc90.f235739n;
            sb7.append(z3Var != null ? z3Var.d1() : null);
            sb7.append(", hasPhoto=");
            sb7.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb7.toString());
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = c16892x4a36dc90.f235739n;
            if (z3Var2 != null && (d17 = z3Var2.d1()) != null) {
                gr3.e.d(d17, z17 ? 2802 : 2800, c16892x4a36dc90.f235734g, activityC16840x4302a3e2.getIntent(), c16892x4a36dc90.Z, c16892x4a36dc90.f235741p, 0, null, null, null, 0, 0, 4032, null);
            }
        }
        return f0Var;
    }
}
