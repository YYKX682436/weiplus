package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class tu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f186182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yu f186183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186184f;

    public tu(ya2.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yu yuVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f186182d = b2Var;
        this.f186183e = yuVar;
        this.f186184f = abstractC14490x69736cb5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        r45.xk b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yu yuVar = this.f186183e;
        ya2.b2 b2Var = this.f186182d;
        if (b2Var == null || (b17 = ya2.d.b(b2Var, false)) == null) {
            f0Var = null;
        } else {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String m75945x2fec8307 = b17.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            intent.putExtra("Contact_User", m75945x2fec8307);
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(yuVar.f3639x46306858.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            f0Var = jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f186184f;
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", b2Var != null ? b2Var.D0() : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            android.content.Context context = yuVar.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent2, abstractC14490x69736cb5.mo2128x1ed62e84(), null, 0, 6, false, 0, abstractC14490x69736cb5.w(), 192, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context2 = yuVar.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            i0Var.mk(context2, intent2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        android.content.Context context3 = yuVar.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        o3Var.Zi(4, mo2128x1ed62e84, xy2.c.d(context3), 1, b2Var != null ? b2Var.D0() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
