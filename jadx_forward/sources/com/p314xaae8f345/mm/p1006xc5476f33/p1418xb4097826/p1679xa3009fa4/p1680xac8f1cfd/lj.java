package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f216601d;

    public lj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f216601d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.q23 m76980xaa7f977e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f216601d;
        blVar.getClass();
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLPostCamera");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.D(blVar.m158354x19263085(), false, 1);
        if (!hz2.d.f367846a.a("post")) {
            i95.m c17 = i95.n0.c(l40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String str = null;
            int dh6 = l40.e.dh((l40.e) c17, blVar.m80379x76847179(), null, 2, null);
            if (dh6 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_create_scene", 1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).qj(blVar.m158354x19263085(), intent);
            } else if (dh6 == 4) {
                db5.t7.m123883x26a183b(blVar.m158354x19263085(), blVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571342cc), 1).show();
                blVar.U6(4);
            } else if (dh6 == 5) {
                db5.t7.m123883x26a183b(blVar.m158354x19263085(), blVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571341cb), 1).show();
                blVar.U6(5);
            } else if (dh6 == 6) {
                db5.t7.m123883x26a183b(blVar.m158354x19263085(), blVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571340ca), 1).show();
                blVar.U6(6);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(blVar.m80379x76847179()))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.HomeActionBarUIC", "getDefaultFinderUsername is null.");
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = blVar.m158354x19263085();
                in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(blVar.m158354x19263085());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = Lj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Lj : null;
                java.lang.String Z6 = blVar.Z6(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L, abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null);
                org.json.JSONObject jSONObject = Z6 != null ? new org.json.JSONObject(Z6) : null;
                android.content.Intent intent2 = new android.content.Intent();
                qs2.e eVar = new qs2.e(3, 59, 5);
                eVar.f447795d = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
                eVar.f447796e = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
                if (jSONObject != null) {
                    java.lang.String optString = jSONObject.optString("audio_id");
                    if (!java.lang.Boolean.valueOf(!(optString == null || optString.length() == 0)).booleanValue()) {
                        optString = null;
                    }
                    if (optString == null) {
                        optString = jSONObject.optString("audioid");
                    }
                    eVar.f447802k = optString;
                    intent2.putExtra("KEY_FINDER_SOURCE_AUDIO_ID", optString);
                    java.lang.String optString2 = jSONObject.optString("song_id");
                    if (!java.lang.Boolean.valueOf(!(optString2 == null || optString2.length() == 0)).booleanValue()) {
                        optString2 = null;
                    }
                    if (optString2 == null) {
                        optString2 = jSONObject.optString("qq_music_song_id");
                    }
                    eVar.f447803l = optString2;
                    intent2.putExtra("KEY_FINDER_SOURCE_SONG_ID", optString2);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("topics");
                    if (optJSONArray != null) {
                        if (!java.lang.Boolean.valueOf(optJSONArray.length() > 0).booleanValue()) {
                            optJSONArray = null;
                        }
                        if (optJSONArray != null) {
                            str = optJSONArray.getString(0);
                        }
                    }
                    eVar.f447798g = str;
                    intent2.putExtra("KEY_FINDER_SOURCE_TOPIC_NAME", str);
                }
                if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (m76802x2dd01666 = feedObject2.m76802x2dd01666()) != null && (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) != null) {
                    intent2.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", m76980xaa7f977e.f465118d);
                    intent2.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", m76980xaa7f977e.f465119e);
                    eVar.f447804m = m76980xaa7f977e.f465118d;
                    eVar.f447805n = m76980xaa7f977e.f465119e;
                }
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ri(m158354x19263085, eVar, intent2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
