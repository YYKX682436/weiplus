package ea3;

/* loaded from: classes10.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.n f332143d;

    public f(ea3.n nVar) {
        this.f332143d = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Integer) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.hju);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Integer) tag2).intValue() : -1;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(intValue);
        objArr[1] = java.lang.Integer.valueOf(intValue2);
        ea3.n nVar = this.f332143d;
        objArr[2] = java.lang.Boolean.valueOf(nVar.f332175v != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "onClick! postion:%d type:%d mlisten:%b", objArr);
        if (intValue != -1 && intValue2 != -1 && nVar.f332175v != null) {
            nVar.m8147xed6e4d18(intValue);
            ea3.p pVar = ((ea3.C28288x337573) nVar.f332175v).f332203a;
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onItemClick position:%d type:%d", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            android.app.Activity activity = pVar.f332183f;
            if (intValue2 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z17 = pVar.f332195u.z(intValue);
                if (z17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z17.f219963e)) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = java.lang.Boolean.valueOf(z17 == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "item is null %s, item original path is null", objArr2);
                } else {
                    ea3.n nVar2 = pVar.f332195u;
                    if (!nVar2.f332169p || (!((i17 = pVar.B) == 2 || i17 == 3) || nVar2.B() <= 0 || ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) pVar.f332195u.f332163g.get(0)).mo63659xfb85f7b0() == z17.mo63659xfb85f7b0() || !(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) pVar.f332195u.f332163g.get(0)).mo63659xfb85f7b0() == 2 || z17.mo63659xfb85f7b0() == 2))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onMediaClick, item %s type:%d.", z17, java.lang.Integer.valueOf(z17.mo63659xfb85f7b0()));
                        if ("enable".equals(pVar.f332199y) && z17.mo63659xfb85f7b0() != 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "jumpAlbumPreviewUI");
                            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                            t23.p0.k().f496830f = 44;
                            android.content.Intent intent = new android.content.Intent();
                            intent.setClassName(pVar.getContext(), "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
                            ea3.n nVar3 = pVar.f332195u;
                            int mo63659xfb85f7b0 = z17.mo63659xfb85f7b0();
                            nVar3.getClass();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator it = nVar3.f332162f.iterator();
                            while (it.hasNext()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                                if (mo63659xfb85f7b0 == 2) {
                                    if (abstractC15633xee433078.mo63659xfb85f7b0() == mo63659xfb85f7b0) {
                                        arrayList2.add(abstractC15633xee433078);
                                    }
                                } else if (abstractC15633xee433078.r()) {
                                    arrayList2.add(abstractC15633xee433078);
                                }
                            }
                            intent.putExtra("preview_all", true);
                            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                            t23.p0.p(arrayList2);
                            intent.putExtra("preview_position", arrayList2.indexOf(z17));
                            ea3.n nVar4 = pVar.f332195u;
                            nVar4.getClass();
                            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                            java.util.Iterator it6 = nVar4.f332163g.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next()).f219963e);
                            }
                            intent.putStringArrayListExtra("preview_image_list", arrayList3);
                            intent.putParcelableArrayListExtra("preview_media_item_list", pVar.f332195u.f332163g);
                            intent.putExtra("max_select_count", (z17.mo63659xfb85f7b0() == 2 && pVar.f332195u.f332170q) ? 1 : pVar.f332197w);
                            intent.putExtra("send_raw_img", false);
                            if (activity instanceof q80.z) {
                                ((q80.z) activity).R1(new ea3.w(pVar));
                            }
                            j45.l.n(activity, "gallery", ".ui.ImagePreviewUI", intent, 56055);
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("type", ea3.p.f(z17.mo63659xfb85f7b0()));
                        if (z17.mo63659xfb85f7b0() == 2) {
                            zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
                            java.lang.String str2 = z17.f219963e;
                            ((yg0.u4) r3Var).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
                            str = b17.f264269e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId video:%s", str);
                        } else {
                            str = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(z17.f219963e).f264269e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId image:%s", str);
                        }
                        hashMap.put("info", pVar.h(z17));
                        hashMap.put(dm.i4.f66867x2a5c95c7, str);
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("targetItem", hashMap);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81 c16227xc3198c81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81) pVar.F;
                        c16227xc3198c81.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumView", "onClickedItem" + hashMap2);
                        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = c16227xc3198c81.f225654e;
                        if (c28688xe8dbe4c2 != null) {
                            c28688xe8dbe4c2.m138438xd8c5c779("onItemTapped", hashMap2);
                        }
                    } else {
                        db5.e1.T(pVar.getContext(), i65.a.r(pVar.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.fiq));
                    }
                }
            } else if (intValue2 == 2) {
                int i18 = pVar.B;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "requestShowSystemSelectMediaUI: $queryType, $activity");
                java.lang.String[] strArr = i18 != 1 ? i18 != 2 ? (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO")).toArray(new java.lang.String[0]) : (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO")).toArray(new java.lang.String[0]) : (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES")).toArray(new java.lang.String[0]);
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.l(activity, strArr, 145);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
