package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class pk implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 f214380d;

    public pk(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4, int i18) {
        this.f214380d = c15346x1cf713c4;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.util.LinkedList m75941xfb821914;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4 = this.f214380d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.lk m62374xc879b3f2 = c15346x1cf713c4.m62374xc879b3f2();
            m62374xc879b3f2.getClass();
            java.lang.String format = java.lang.String.format("%s,%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 3}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(21529, format);
            android.content.Intent intent = new android.content.Intent();
            m62374xc879b3f2.getClass();
            intent.setClassName((android.content.Context) null, "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI");
            m62374xc879b3f2.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(null, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderPresenter", "goSetting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.lk m62374xc879b3f22 = c15346x1cf713c4.m62374xc879b3f2();
        java.util.ArrayList a17 = m62374xc879b3f22.a(so2.j1.class);
        pm0.v.O("FinderSnsLiveListExpose", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kk(a17, 61));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",2,");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            r45.nw1 m76794xd0557130 = ((so2.j1) it.next()).f491972d.m76794xd0557130();
            arrayList2.add(java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L));
        }
        sb6.append(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
        sb6.append(',');
        sb6.append(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        sb6.append(',');
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it6 = a17.iterator();
        while (it6.hasNext()) {
            r45.pw2 m76831xa623bd0b = ((so2.j1) it6.next()).f491972d.m76831xa623bd0b();
            if (m76831xa623bd0b == null || (m75941xfb821914 = m76831xa623bd0b.m75941xfb821914(3)) == null) {
                str = null;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                java.util.Iterator it7 = m75941xfb821914.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it7.next()).m76197x6c03c64c());
                }
                str = kz5.n0.g0(arrayList4, ";", null, null, 0, null, null, 62, null);
            }
            arrayList3.add(str);
        }
        sb6.append(kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(21530, sb6.toString());
        m62374xc879b3f22.getClass();
        throw null;
    }
}
