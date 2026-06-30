package ea3;

/* loaded from: classes10.dex */
public class w implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea3.p f332211a;

    public w(ea3.p pVar) {
        this.f332211a = pVar;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        ea3.p pVar = this.f332211a;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "dealPreviewResult requestCode:%d resultCode:%d, data:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        if (i17 == 56055) {
            new java.util.HashMap();
            if (i18 == -2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppAlbumViewImpl", "dealPreviewResult back");
            } else if (i18 == -1) {
                if (intent == null) {
                    java.util.ArrayList arrayList = pVar.f332195u.f332163g;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                        if (pVar.l(abstractC15633xee433078)) {
                            java.util.ArrayList arrayList2 = pVar.H;
                            arrayList2.add(abstractC15633xee433078);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "new item, add to cache:%d", java.lang.Integer.valueOf(arrayList2.size()));
                        }
                    }
                    pVar.n(arrayList);
                } else {
                    java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
                    if (parcelableArrayListExtra == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "mediaItems == null");
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator it6 = parcelableArrayListExtra.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next()).f219963e);
                        }
                        pVar.q(arrayList3);
                    }
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("result", "ok");
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81 c16227xc3198c81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81) pVar.F;
                c16227xc3198c81.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumView", "onAlbumFinish" + hashMap);
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = c16227xc3198c81.f225654e;
                if (c28688xe8dbe4c2 != null) {
                    c28688xe8dbe4c2.m138438xd8c5c779("onAlbumFinish", hashMap);
                }
            } else if (i18 == 0 && intent != null) {
                pVar.q(intent.getStringArrayListExtra("preview_image_list"));
            }
        }
        if (intent == null || !intent.getBooleanExtra("show_photo_edit_tip", false)) {
            return;
        }
        android.content.Context context = pVar.f332182e;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("photo_edit_pref", 0);
        if (sharedPreferences.getBoolean("has_show_tip", false)) {
            return;
        }
        pVar.f332196v.setVisibility(0);
        pVar.f332196v.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7i));
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(pVar.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        pVar.f332196v.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new ea3.y(pVar));
        sharedPreferences.edit().putBoolean("has_show_tip", true).apply();
    }
}
