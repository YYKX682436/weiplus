package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f236014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236015e;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90, java.util.List list) {
        this.f236014d = c16892x4a36dc90;
        this.f236015e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = this.f236014d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e c16922xfbfc713e = c16892x4a36dc90.f235743p1;
        if (c16922xfbfc713e != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16892x4a36dc90.f235739n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z3Var);
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            int i17 = c16892x4a36dc90.f235741p;
            long j17 = c16892x4a36dc90.f235734g;
            android.content.Intent intent = c16892x4a36dc90.f235731d.getIntent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = c16892x4a36dc90.f235753y;
            java.util.List menuList = this.f236015e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuList, "menuList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
            if (c16922xfbfc713e.q()) {
                return;
            }
            cs3.f fVar = c16922xfbfc713e.builder;
            java.lang.Object obj = fVar != null ? fVar.f303639d : null;
            vr3.z zVar = obj instanceof vr3.z ? (vr3.z) obj : null;
            if (zVar != null) {
                zVar.f521196f = d17;
                ((java.util.ArrayList) zVar.f521197g).addAll(menuList);
                zVar.f521198h = i17;
                zVar.f521199i = j17;
                zVar.f521200m = intent;
                zVar.f521202o = m0Var;
                cs3.f fVar2 = zVar.f521201n;
                if (fVar2 != null && (m82555x4905e9fa = fVar2.g().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                c16922xfbfc713e.setVisibility(4);
                c16922xfbfc713e.m82799xc8ac06c0().setVisibility(4);
                cs3.f fVar3 = c16922xfbfc713e.builder;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar3);
                cs3.d dVar = new cs3.d(c16922xfbfc713e);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2 = fVar3.g().m82555x4905e9fa();
                if (m82555x4905e9fa2.getMeasuredHeight() <= 0) {
                    m82555x4905e9fa2.getViewTreeObserver().addOnGlobalLayoutListener(new vr3.y(m82555x4905e9fa2, zVar, fVar3, dVar));
                    return;
                }
                int a17 = zVar.a(fVar3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "content measure ready, height: " + a17);
                dVar.mo146xb9724478(java.lang.Integer.valueOf(a17));
            }
        }
    }
}
