package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class p implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s f183257d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s sVar) {
        this.f183257d = sVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        j92.a aVar = (j92.a) holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s sVar = this.f183257d;
        if (sVar.f183265i.a(sVar.m80379x76847179())) {
            return;
        }
        java.lang.String str = aVar.f379885d.f68710x21f9b213;
        if (str == null || str.length() == 0) {
            if (!aVar.f379888g) {
                db5.t7.m(sVar.m80379x76847179(), sVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572780ci1, java.lang.Integer.valueOf(sVar.f183268o)));
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            int m75939xb282bd08 = sVar.f183270q.m75939xb282bd08(0);
            intent.putExtra("KEY_CREATE_SCENE_USER_TYPE", m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? m75939xb282bd08 != 3 ? m75939xb282bd08 != 4 ? 0 : 103 : 104 : 101 : 102);
            intent.putExtra("KEY_CREATE_SCENE_FEED_ID", sVar.f183270q.m75942xfb822ef2(1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "onAddAccount() called with: requestCode:11104 context = " + sVar.m80379x76847179());
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.app.Activity context = sVar.m80379x76847179();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            intent.addFlags(67108864);
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.class);
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
            com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
            if (m78751x5dc77fb5 != null) {
                ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.r.f183259a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = sVar.f183261e;
            if (c13638xb683e9ec != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.o(c13638xb683e9ec, false, 1, null);
            }
        }
    }
}
