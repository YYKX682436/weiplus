package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l f183241d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l lVar) {
        this.f183241d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l lVar = this.f183241d;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountSwitchUIC", "[onClickSwitch]");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = lVar.f183244f;
        if (list != null) {
            for (m92.b bVar : kz5.n0.F0(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.k())) {
                arrayList2.add(new j92.a(bVar, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f68723xdec927b, lVar.f183249n)));
            }
        }
        if (lVar.f183251p) {
            j92.a aVar = new j92.a(new m92.b(), false);
            aVar.f379887f = lVar.f183248m;
            arrayList2.add(aVar);
        }
        lVar.f183245g = arrayList2;
        if (lVar.f183243e == null) {
            h92.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec.f183232y;
            android.app.Activity m80379x76847179 = lVar.m80379x76847179();
            android.view.Window window = lVar.m80379x76847179().getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec a17 = bVar2.a(m80379x76847179, window, new h92.d());
            lVar.f183243e = a17;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82798x4905e9fa = a17.m82798x4905e9fa();
            m82798x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(lVar.m80379x76847179()));
            java.util.ArrayList arrayList3 = lVar.f183245g;
            if (arrayList3 != null) {
                lVar.f183246h = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.account.component.FinderAccountSwitchUIC$buildConvert$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l lVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l.this;
                        i92.b bVar3 = new i92.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.h(lVar2), true);
                        java.util.ArrayList arrayList4 = lVar2.f183245g;
                        bVar3.f371250u = arrayList4 != null ? arrayList4.size() : 0;
                        return bVar3;
                    }
                }, arrayList3, false);
            }
            m82798x4905e9fa.mo7960x6cab2c8d(lVar.f183246h);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = lVar.f183246h;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.i(lVar, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, m82798x4905e9fa, "account_panel", 32, 0, null, null, 56, null);
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = lVar.f183246h;
            if (c22848x6ddd90cf2 != null) {
                java.util.List m82898xfb7e5820 = c22848x6ddd90cf2.m82898xfb7e5820();
                m82898xfb7e5820.clear();
                java.util.ArrayList arrayList4 = lVar.f183245g;
                if (arrayList4 != null) {
                    java.util.Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        m82898xfb7e5820.add((j92.a) it.next());
                    }
                }
                c22848x6ddd90cf2.m8146xced61ae5();
            }
        }
        java.util.ArrayList arrayList5 = lVar.f183245g;
        int size = arrayList5 != null ? arrayList5.size() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = lVar.f183243e;
        if (c13638xb683e9ec != null) {
            c13638xb683e9ec.m55420xbd04defe(size);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec2 = lVar.f183243e;
        if (c13638xb683e9ec2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.s(c13638xb683e9ec2, false, false, 0, 7, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
