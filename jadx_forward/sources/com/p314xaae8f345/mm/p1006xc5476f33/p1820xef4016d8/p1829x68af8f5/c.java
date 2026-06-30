package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227374d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227374d = c16344xea85a40c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227374d;
        if (c16344xea85a40c.N1) {
            android.content.Intent intent = new android.content.Intent();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(10, 2, 32, intent);
            intent.putExtra("finder_username", c16344xea85a40c.E1.f463039o);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16344xea85a40c.E1.f463048x)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "same_receive_link is null");
            } else {
                java.lang.String uri = android.net.Uri.parse(c16344xea85a40c.E1.f463048x).buildUpon().appendQueryParameter("fromscene", "2").appendQueryParameter("type", "2").build().toString();
                intent.putExtra("key_same_receive_link", uri);
                gb3.m.f351561i = uri;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "same_receive_link is %s", uri);
            }
            intent.putExtra("key_packet_id", c16344xea85a40c.E1.f463041q);
            intent.putExtra("key_enter_from_story", true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("redbag_scene", 1);
                jSONObject.put("coverid", c16344xea85a40c.E1.f463041q);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th6);
            }
            intent.putExtra("key_extra_info", jSONObject.toString());
            intent.putExtra("key_enter_profile_type", 52);
            boolean i17 = c16344xea85a40c.i();
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (i17) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(c16344xea85a40c.U, intent);
                c16344xea85a40c.U.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
            } else if (c16344xea85a40c.V != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(c16344xea85a40c.V, intent);
                c16344xea85a40c.V.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
            }
            gb3.n.a(7);
            gb3.m.a(84, c16344xea85a40c.G1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227406n++;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("red_cover_id", c16344xea85a40c.E1.f463041q);
                jSONObject2.put("finderusername", c16344xea85a40c.E1.f463039o);
                jSONObject2.put("red_cover_type", 1);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th7);
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link_unfold", 1, jSONObject2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
