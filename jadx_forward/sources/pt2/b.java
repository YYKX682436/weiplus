package pt2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac f439772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f439773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f439775g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac c14959x1a54a2ac, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super(1);
        this.f439772d = c14959x1a54a2ac;
        this.f439773e = abstractC14490x69736cb5;
        this.f439774f = i17;
        this.f439775g = k3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac c14959x1a54a2ac = this.f439772d;
        android.content.Context mo7438x76847179 = c14959x1a54a2ac.mo7438x76847179();
        if (mo7438x76847179 != null) {
            pf5.u uVar = pf5.u.f435469a;
            java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(mo7438x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p);
            java.lang.String valueOf2 = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(mo7438x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(mo7438x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216920s;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(mo7438x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216920s;
            if (str3 == null) {
                str3 = "";
            }
            zl2.q4 q4Var = zl2.q4.f555466a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f439773e;
            boolean C = q4Var.C(abstractC14490x69736cb5);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca = c14959x1a54a2ac.f207437u;
            if (C) {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((ml2.j0) ((zy2.zb) c17)).sj(abstractC14490x69736cb5, this.f439774f, ml2.x1.f409740n, valueOf2, str2, str3, "");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_context_id", valueOf);
                intent.putExtra("key_from_comment_scene", valueOf2);
                intent.putExtra("key_click_tab_context_id", str2);
                intent.putExtra("key_click_sub_tab_context_id", str3);
                if (c14951x18cbc2ca != null) {
                    c14951x18cbc2ca.g(abstractC14490x69736cb5, intent, c14959x1a54a2ac.f207438v);
                }
            } else {
                int i17 = c14959x1a54a2ac.f210798p;
                if (i17 == -1) {
                    i17 = 0;
                }
                if (c14951x18cbc2ca != null) {
                    java.util.List list = c14959x1a54a2ac.f207438v;
                    android.view.View itemView = this.f439775g.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                    c14951x18cbc2ca.m(abstractC14490x69736cb5, list, i17, itemView);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
