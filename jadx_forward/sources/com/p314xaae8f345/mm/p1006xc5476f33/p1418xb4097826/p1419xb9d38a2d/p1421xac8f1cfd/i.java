package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class i implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l f183240d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l lVar, zy2.lc lcVar) {
        this.f183240d = lVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        j92.a aVar;
        jz5.f0 f0Var;
        java.lang.String str;
        r45.yn5 yn5Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        j92.a aVar2 = (j92.a) holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.l lVar = this.f183240d;
        if (lVar.f183247i.a(lVar.m80379x76847179()) || aVar2.f379886e) {
            return;
        }
        m92.b bVar = aVar2.f379885d;
        java.lang.String str2 = bVar.f68710x21f9b213;
        if (!(str2 == null || str2.length() == 0)) {
            java.util.ArrayList arrayList = lVar.f183245g;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                aVar = null;
                while (it.hasNext()) {
                    j92.a aVar3 = (j92.a) it.next();
                    if (aVar3.f379886e) {
                        aVar = aVar3;
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.f379886e = false;
            }
            aVar2.f379886e = true;
            adapter.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = lVar.f183243e;
            if (c13638xb683e9ec != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.o(c13638xb683e9ec, false, 1, null);
            }
            lVar.f183243e = null;
            g92.b bVar2 = g92.b.f351302e;
            java.lang.String field_username = bVar.f68723xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
            bVar2.P0(field_username, "selfCenterSwitch");
            java.lang.String field_username2 = bVar.f68723xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username2, "field_username");
            lVar.f183249n = field_username2;
            bVar2.z0(lVar.m80379x76847179(), field_username2);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50) ((zy2.xa) pf5.z.f435481a.a(activity).c(zy2.xa.class));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", "onAccountChanged");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(xy2.c.e(f50Var.m80379x76847179()), zy2.y8.f559156s);
            f50Var.q7(false);
            db5.t7.m(lVar.m80379x76847179(), lVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6_));
            return;
        }
        if (!aVar2.f379888g) {
            db5.t7.m(lVar.m80379x76847179(), lVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572780ci1, java.lang.Integer.valueOf(lVar.f183250o)));
            return;
        }
        r45.zn5 zn5Var = aVar2.f379887f;
        if (zn5Var != null) {
            java.util.LinkedList m75941xfb821914 = zn5Var.m75941xfb821914(0);
            if (m75941xfb821914 == null || (yn5Var = (r45.yn5) kz5.n0.Z(m75941xfb821914)) == null || (str = yn5Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", 2);
            intent.putExtra("KEY_OTHER_USER", g92.b.f351302e.T0().length() > 0);
            intent.putExtra("KEY_WX_USERNAME", str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).rj(lVar.m158354x19263085(), intent, 11104);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            y61.e eVar = (y61.e) i95.n0.c(y61.e.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
            ((m61.i) eVar).getClass();
            android.content.Intent intent2 = new android.content.Intent(m158354x19263085, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11458x2418e7d9.class);
            intent2.putExtra("RegScene", 2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(702);
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/plugin/account/PluginAccount", "startAffiliateAccount", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec2 = lVar.f183243e;
        if (c13638xb683e9ec2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.o(c13638xb683e9ec2, false, 1, null);
        }
        lVar.f183243e = null;
    }
}
