package lo2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 f401690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05) {
        super(2);
        this.f401690d = activityC14480x353d0a05;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String str;
        r45.lz0 m76183x8de01399;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        r45.lz0 m76183x8de013992;
        java.lang.String m76199x86742320;
        r45.hz0 m76167xefeda639;
        r45.hz0 m76167xefeda6392;
        r45.hz0 m76167xefeda6393;
        r45.hz0 m76167xefeda6394;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.view.View) obj, "<anonymous parameter 0>");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05 = this.f401690d;
            java.lang.Object obj3 = activityC14480x353d0a05.f202927x.f401656e.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            r45.ag2 ag2Var = (r45.ag2) obj3;
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = ag2Var.f451522d;
            java.lang.String str8 = "";
            if ((c19782x23db1cfa2 == null || (str = c19782x23db1cfa2.m76197x6c03c64c()) == null) && ((c19782x23db1cfa = ag2Var.f451522d) == null || (m76183x8de01399 = c19782x23db1cfa.m76183x8de01399()) == null || (str = m76183x8de01399.m75945x2fec8307(0)) == null)) {
                str = "";
            }
            intent.putExtra("Username", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = ag2Var.f451522d;
            if (c19782x23db1cfa3 == null || (str2 = c19782x23db1cfa3.m76184x8010e5e4()) == null) {
                str2 = "";
            }
            intent.putExtra("Nickname", str2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = ag2Var.f451522d;
            if (c19782x23db1cfa4 == null || (str3 = c19782x23db1cfa4.m76175x6d346f39()) == null) {
                str3 = "";
            }
            intent.putExtra("Avatar", str3);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5 = ag2Var.f451522d;
            if (c19782x23db1cfa5 == null || (str4 = c19782x23db1cfa5.m76192x3f6b0a02()) == null) {
                str4 = "";
            }
            intent.putExtra("Signature", str4);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6 = ag2Var.f451522d;
            intent.putExtra("Sex", (c19782x23db1cfa6 == null || (m76167xefeda6394 = c19782x23db1cfa6.m76167xefeda639()) == null) ? 0 : m76167xefeda6394.m75939xb282bd08(3));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa7 = ag2Var.f451522d;
            if (c19782x23db1cfa7 == null || (m76167xefeda6393 = c19782x23db1cfa7.m76167xefeda639()) == null || (str5 = m76167xefeda6393.m75945x2fec8307(1)) == null) {
                str5 = "";
            }
            intent.putExtra("Province", str5);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa8 = ag2Var.f451522d;
            if (c19782x23db1cfa8 == null || (m76167xefeda6392 = c19782x23db1cfa8.m76167xefeda639()) == null || (str6 = m76167xefeda6392.m75945x2fec8307(2)) == null) {
                str6 = "";
            }
            intent.putExtra("City", str6);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa9 = ag2Var.f451522d;
            if (c19782x23db1cfa9 == null || (m76167xefeda639 = c19782x23db1cfa9.m76167xefeda639()) == null || (str7 = m76167xefeda639.m75945x2fec8307(0)) == null) {
                str7 = "";
            }
            intent.putExtra("Country", str7);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa10 = ag2Var.f451522d;
            if (c19782x23db1cfa10 != null && (m76199x86742320 = c19782x23db1cfa10.m76199x86742320()) != null) {
                str8 = m76199x86742320;
            }
            intent.putExtra("V5UserName", str8);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa11 = ag2Var.f451522d;
            intent.putExtra("ContactMsgInfo", (c19782x23db1cfa11 == null || (m76183x8de013992 = c19782x23db1cfa11.m76183x8de01399()) == null) ? null : m76183x8de013992.mo14344x5f01b1f6());
            intent.putExtra("IsPoster", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa12 = ag2Var.f451522d;
            i0Var.pl(activityC14480x353d0a05, c19782x23db1cfa12 != null ? c19782x23db1cfa12.m76197x6c03c64c() : null, intent, 1, null);
        }
        return jz5.f0.f384359a;
    }
}
