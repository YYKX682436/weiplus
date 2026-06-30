package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class x10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f217919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f217920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217921f;

    public x10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, boolean z17, boolean z18) {
        this.f217919d = f50Var;
        this.f217920e = z17;
        this.f217921f = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.bc5 bc5Var;
        r45.bc5 bc5Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f217919d;
        r45.lk2 lk2Var = f50Var.f215872e;
        boolean z17 = true;
        if (((lk2Var == null || (bc5Var2 = (r45.bc5) lk2Var.m75936x14adae67(38)) == null || bc5Var2.m75939xb282bd08(0) != 1) ? false : true) != false) {
            r45.lk2 lk2Var2 = f50Var.f215872e;
            java.lang.String m75945x2fec8307 = (lk2Var2 == null || (bc5Var = (r45.bc5) lk2Var2.m75936x14adae67(38)) == null) ? null : bc5Var.m75945x2fec8307(1);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                android.app.Activity context = f50Var.m80379x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w10 w10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w10(m75945x2fec8307, f50Var);
                f50Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
                e3Var.a();
                e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.du6);
                android.widget.TextView textView = (android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.azj);
                android.widget.TextView textView2 = (android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.re9);
                android.widget.TextView textView3 = (android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.obc);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                com.p314xaae8f345.mm.ui.fk.a(textView);
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n20(w10Var));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o20(e3Var));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
                com.p314xaae8f345.mm.ui.fk.a(textView3);
                e3Var.i();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int Z6 = f50Var.Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.D(f50Var.m80379x76847179(), false, Z6);
        p2Var.W(p2Var.i(f50Var.m80379x76847179(), Z6, false));
        p2Var.R(gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = f50Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z18 = this.f217920e;
        jSONObject.put("is_red_dot", z18 ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "post_video", 1, jSONObject, false, null, 48, null);
        if (z18) {
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera");
            if (I0 != null && L0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("4", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        if (this.f217921f) {
            intent.putExtra("key_create_scene", 4);
        } else {
            intent.putExtra("key_create_scene", 2);
        }
        r45.lk2 lk2Var3 = f50Var.f215872e;
        if (lk2Var3 != null) {
            intent.putExtra("key_prepare_resp", lk2Var3.mo14344x5f01b1f6());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).qj(f50Var.m158354x19263085(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
