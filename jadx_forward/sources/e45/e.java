package e45;

/* loaded from: classes10.dex */
public final class e implements d45.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e45.h f330912a;

    public e(e45.h hVar) {
        this.f330912a = hVar;
    }

    @Override // d45.d
    public void a(int i17, boolean z17) {
        d45.d dVar = this.f330912a.f330933y;
        if (dVar != null) {
            dVar.a(i17, z17);
        }
    }

    @Override // d45.d
    public void b(int i17, android.view.View view, int i18) {
        int i19;
        if (i18 == 1) {
            e45.h hVar = this.f330912a;
            d45.q qVar = hVar.f330924p;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z17 = qVar != null ? qVar.z(i17) : null;
            if (z17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z17.f219963e)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(z17 == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "item is null %s, item original path is null", objArr);
            } else {
                int i27 = t23.p0.k().f496830f;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = hVar.f330915d;
                if (i27 == 5 && r26.i0.p(z17.f219971p, "image/gif", true)) {
                    db5.e1.T(activityC19730xa7b9756f.mo55332x76847179(), activityC19730xa7b9756f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjl));
                } else {
                    d45.q qVar2 = hVar.f330924p;
                    java.util.ArrayList arrayList = qVar2 != null ? qVar2.f307990g : null;
                    if (arrayList != null) {
                        java.util.ArrayList x17 = qVar2 != null ? qVar2.x(arrayList) : null;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17);
                        if (abstractC15633xee433078 != null && x17 != null) {
                            i19 = 0;
                            for (java.lang.Object obj : x17) {
                                int i28 = i19 + 1;
                                if (i19 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj, abstractC15633xee433078)) {
                                    break;
                                } else {
                                    i19 = i28;
                                }
                            }
                        }
                    }
                    i19 = -1;
                    if (i19 == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FS.AlbumFileUIC", "onMediaClick, oldPos:" + i17 + ", newPos:-1");
                    } else {
                        d45.q qVar3 = hVar.f330924p;
                        t23.p0.p(qVar3 != null ? qVar3.x(qVar3.f307990g) : null);
                        android.content.Intent intent = new android.content.Intent(activityC19730xa7b9756f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.class);
                        intent.putExtra("query_source_type", hVar.f330917f);
                        d45.q qVar4 = hVar.f330924p;
                        intent.putStringArrayListExtra("preview_image_list", qVar4 != null ? qVar4.E() : null);
                        d45.q qVar5 = hVar.f330924p;
                        intent.putParcelableArrayListExtra("preview_media_item_list", qVar5 != null ? qVar5.f307991h : null);
                        intent.putExtra("preview_all", true);
                        intent.putExtra("preview_position", i19);
                        hVar.b(i19, true);
                        intent.putExtra("send_raw_img", true);
                        intent.putExtra("key_force_hide_edit_image_button", true);
                        intent.putExtra("key_force_show_raw_image_button", false);
                        intent.putExtra("key_is_raw_image_button_disable", true);
                        intent.putExtra("max_select_count", hVar.f330920i - activityC19730xa7b9756f.b7());
                        intent.putExtra("GalleryUI_FromUser", hVar.f330925q);
                        intent.putExtra("GalleryUI_ToUser", hVar.f330926r);
                        intent.putExtra("album_video_max_duration", Integer.MAX_VALUE);
                        intent.putExtra("album_video_min_duration", 0);
                        intent.putExtra("media_type", 2);
                        intent.putExtra("select_type_tag", hVar.f330922n);
                        activityC19730xa7b9756f.startActivityForResult(intent, 0);
                    }
                }
            }
            d45.d dVar = hVar.f330933y;
            if (dVar != null) {
                dVar.b(i17, view, i18);
            }
        }
    }
}
