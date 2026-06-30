package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class d80 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80 f208166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80 f80Var) {
        super(2);
        this.f208166d = f80Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        java.lang.String m76829x97edf6c0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
        java.lang.String username = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Context context = this.f208166d.f208286d;
        r45.xk m59211x37f6d02b = feed.getFeedObject().m59211x37f6d02b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (m59211x37f6d02b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigForNewLiveCardStyle", "jumpBizProfile: bizUsername = " + m59211x37f6d02b.m75945x2fec8307(0));
            java.lang.String m75945x2fec8307 = m59211x37f6d02b.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, feed.mo2128x1ed62e84(), null, 0, 5, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            intent.putExtra("Contact_User", m75945x2fec8307);
            intent.putExtra("Contact_Scene", 213);
            boolean z17 = true;
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            java.lang.String m76829x97edf6c02 = feed.getFeedObject().getFeedObject().m76829x97edf6c0();
            if (m76829x97edf6c02 != null && m76829x97edf6c02.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
                java.lang.String w17 = feed.w();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
                m76829x97edf6c0 = o3Var.ek(mo2128x1ed62e84, w17, e17 != null ? e17.f216913n : 0);
            } else {
                m76829x97edf6c0 = feed.getFeedObject().getFeedObject().m76829x97edf6c0();
            }
            intent.putExtra("Contact_Scene_Note", m76829x97edf6c0);
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", username);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent2, feed.mo2128x1ed62e84(), null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(4, feed.mo2128x1ed62e84(), nyVar.V6(), 1, username);
        }
        return f0Var2;
    }
}
