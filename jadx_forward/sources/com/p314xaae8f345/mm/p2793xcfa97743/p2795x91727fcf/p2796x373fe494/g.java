package com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494;

/* loaded from: classes8.dex */
public final class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f295299d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f295300e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f295301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f295299d = new java.util.ArrayList();
    }

    public final void O6(int i17, com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.a voipTalkerConvertData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voipTalkerConvertData, "voipTalkerConvertData");
        java.lang.Long l17 = this.f295301f;
        if (l17 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            long longValue = l17.longValue();
            java.lang.String talkername = ((com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.b) voipTalkerConvertData).f295295d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkername, "talkername");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7007xea2f21bf c7007xea2f21bf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7007xea2f21bf();
            long j17 = 2;
            c7007xea2f21bf.f143212d = 2L;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), talkername)) {
                j17 = 1;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(talkername, true);
                if (!(n17 != null && n17.r2())) {
                    j17 = 3;
                }
            }
            c7007xea2f21bf.f143214f = j17;
            c7007xea2f21bf.f143213e = longValue;
            c7007xea2f21bf.k();
        }
        android.content.Intent intent = new android.content.Intent();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        intent.setClass(m158354x19263085, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.class);
        intent.putExtra("Contact_User", ((com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.b) voipTalkerConvertData).f295295d);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x192630852, arrayList.toArray(), "com/tencent/mm/voipmp/support/history/VoIPHistoryData", "onClickTalker", "(ILcom/tencent/mm/voipmp/support/history/IVoIPHistoryConvertData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x192630852.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x192630852, "com/tencent/mm/voipmp/support/history/VoIPHistoryData", "onClickTalker", "(ILcom/tencent/mm/voipmp/support/history/IVoIPHistoryConvertData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        byte[] decode = android.util.Base64.decode(m158359x1e885992().getStringExtra("userInfos"), 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        try {
            c75.c.d(new org.json.JSONArray(new java.lang.String(decode, UTF_8)), new com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.f(this));
            java.lang.Long l17 = this.f295301f;
            if (l17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                long longValue = l17.longValue();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7007xea2f21bf c7007xea2f21bf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7007xea2f21bf();
                c7007xea2f21bf.f143212d = 1L;
                c7007xea2f21bf.f143213e = longValue;
                c7007xea2f21bf.k();
            }
        } catch (org.json.JSONException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
