package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class su extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final int f186109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(android.view.View itemView, int i17) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f186109d = i17;
    }

    public static final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.su suVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        suVar.getClass();
        r45.xk m59211x37f6d02b = abstractC14490x69736cb5.getFeedObject().m59211x37f6d02b();
        jz5.f0 f0Var = null;
        if (m59211x37f6d02b != null) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String m75945x2fec8307 = m59211x37f6d02b.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            intent.putExtra("Contact_User", m75945x2fec8307);
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", str);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            ((c61.l7) b6Var).Cj(rq2.x.f480448b, intent2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent2);
        }
    }
}
