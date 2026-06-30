package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lju3/d0;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.Image2VideoPluginLayout */
/* loaded from: classes10.dex */
public final class C17017x9169d6c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd {
    public yt3.y0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17017x9169d6c1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd
    /* renamed from: getPlayerView */
    public android.view.View mo55754x6b2da91c() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea(context);
        c17052x24b53ea.setAlpha(0.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image2VideoPluginLayout", "playerView :" + c17052x24b53ea);
        yt3.y0 y0Var = new yt3.y0(c17052x24b53ea, this);
        this.D = y0Var;
        m67975xd72b7a67().add(y0Var);
        return c17052x24b53ea;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (super.mo9064x4ceae47d()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image2VideoPluginLayout", "onBackPress");
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_AFTER_EDIT_INT", 0);
        iVar.h();
        java.util.Iterator<T> it = getItemContainerPlugin().f547265d.m68302x220820f0().iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zu3.n nVar = (zu3.n) it.next();
            if (nVar instanceof zu3.l) {
                i17++;
            } else if (nVar instanceof zu3.b0) {
                i18++;
            } else if (nVar instanceof zu3.z) {
                nu3.i.f421757g.f142487n = 1L;
            } else if (!(nVar instanceof zu3.v) && (nVar instanceof zu3.c0)) {
                nu3.i.f421757g.f142494u = 1L;
            }
        }
        nu3.i.f421757g.f142491r = getMoreMenuPlugin().f546965m ? 1L : 0L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6938xb937af60 c6938xb937af60 = nu3.i.f421757g;
        c6938xb937af60.f142484k = i17;
        c6938xb937af60.f142485l = i18;
        it3.y navigator = getNavigator();
        if (navigator == null) {
            return true;
        }
        it3.y.a(navigator, 0, null, 2, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        int size;
        super.r(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image2VideoPluginLayout", "loadCurrentPage info " + bVar);
        if (bVar != null) {
            yt3.y0 y0Var = this.D;
            if (y0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoToVideoPlugin", "start preview " + bVar);
                y0Var.f547256e = bVar;
                boolean z17 = false;
                y0Var.f547255d.setVisibility(0);
                y0Var.f547255d.setAlpha(0.0f);
                y0Var.f547255d.m68270x6c4ebec7(y0Var.f547257f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = y0Var.f547255d;
                java.util.ArrayList imageList = bVar.f303747k;
                c17052x24b53ea.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
                wu3.c2 c2Var = c17052x24b53ea.f237626m;
                if (c2Var != null) {
                    java.util.List list = c17052x24b53ea.f237627n;
                    if (list != null && list.size() == imageList.size() && (size = imageList.size() - 1) >= 0) {
                        for (int i17 = 0; com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) imageList.get(i17), (java.lang.String) list.get(i17)); i17++) {
                            if (i17 != size) {
                            }
                        }
                        if (z17 || c2Var.f531255e) {
                            c2Var.f531255e = true;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "play same imagelist, do nothing");
                        }
                    }
                    z17 = true;
                    if (z17) {
                    }
                    c2Var.f531255e = true;
                }
                c17052x24b53ea.f237627n = imageList;
                c17052x24b53ea.f237626m = new wu3.c2(c17052x24b53ea, imageList);
                ku5.u0 u0Var = ku5.t0.f394148d;
                wu3.c2 c2Var2 = c17052x24b53ea.f237626m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2Var2);
                ((ku5.t0) u0Var).q(c2Var2);
            }
            yt3.r4 reMuxPlugin = getReMuxPlugin();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(configProvider);
            reMuxPlugin.j(bVar, configProvider);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        int i17;
        java.util.ArrayList arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        ct0.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (status != ju3.c0.f383418l1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image2VideoPluginLayout", "statusChange " + status + " ,param : " + bundle);
        }
        int ordinal = status.ordinal();
        if (ordinal != 61) {
            if (ordinal == 65) {
                getItemContainerPlugin().mo11000xb01dfb57();
                m67949x585d574d().mo11000xb01dfb57();
                if (getMoreMenuPlugin().f546965m) {
                    java.util.regex.Pattern pattern = pm0.v.f438335a;
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                ut3.f fVar = ut3.f.f512709c;
                fVar.f512711b.putInt("key_extra_feature_flag", i17);
                int i18 = getMoreMenuPlugin().f546966n;
                android.os.Bundle bundle2 = fVar.f512711b;
                if (i18 == 2) {
                    bundle2.putString("key_group_list", getMoreMenuPlugin().a());
                } else if (getMoreMenuPlugin().f546966n == 3) {
                    bundle2.putString("key_black_list", getMoreMenuPlugin().a());
                }
                boolean c17 = m67949x585d574d().c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = m67949x585d574d().f376531n;
                java.util.ArrayList d17 = getItemContainerPlugin().d(null);
                java.util.ArrayList c18 = getItemContainerPlugin().c();
                float[] b17 = getItemContainerPlugin().b();
                yt3.y0 y0Var = this.D;
                if (y0Var == null || (bVar = y0Var.f547256e) == null || (arrayList = bVar.f303747k) == null) {
                    arrayList = new java.util.ArrayList();
                }
                st3.s sVar = new st3.s(c17, c16997xb0aa383a, d17, c18, b17, 0, 0, arrayList, null, getItemContainerPlugin().g(), 256, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image2VideoPluginLayout", "edit config: " + sVar);
                getReMuxPlugin().m(sVar);
                nu3.i iVar = nu3.i.f421751a;
                iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().e()));
                iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().f()));
                iVar.n("KEY_SELECT_MUSIC_INT", java.lang.Integer.valueOf(m67949x585d574d().f376531n == null ? 0 : 1));
                iVar.n("KEY_SELECT_ORIGIN_INT", java.lang.Integer.valueOf(!m67949x585d574d().c() ? 1 : 0));
                iVar.n("KEY_AFTER_EDIT_INT", 1);
                iVar.h();
                java.util.Iterator it = getItemContainerPlugin().c().iterator();
                int i19 = 0;
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zu3.a aVar = (zu3.a) it.next();
                    int ordinal2 = aVar.f557291a.ordinal();
                    if (ordinal2 == 0) {
                        i27++;
                    } else if (ordinal2 == 1) {
                        i19++;
                    } else if (ordinal2 == 2) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo179488xc3d7db06 = aVar.mo179488xc3d7db06();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo179488xc3d7db06, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LocationItemData");
                        r45.gd4 gd4Var = (r45.gd4) mo179488xc3d7db06;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d3564 = nu3.i.f421754d;
                        java.lang.String cityName = gd4Var.f456666d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cityName, "cityName");
                        java.lang.String poiName = gd4Var.f456667e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(poiName, "poiName");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        if (!android.text.TextUtils.isEmpty(cityName)) {
                            sb6.append(r26.i0.t(cityName, ",", " ", true));
                        }
                        if (!android.text.TextUtils.isEmpty(poiName)) {
                            if ((sb6.length() > 0) != false) {
                                sb6.append("|");
                            }
                            sb6.append(r26.i0.t(poiName, ",", " ", true));
                        }
                        java.lang.String sb7 = sb6.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                        c6927x849d3564.f142414p = c6927x849d3564.b("PositionInfo", sb7, true);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35642 = nu3.i.f421754d;
                        c6927x849d35642.f142416r = c6927x849d35642.b("PositionLatitude", java.lang.String.valueOf(gd4Var.f456670h), true);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35643 = nu3.i.f421754d;
                        c6927x849d35643.f142417s = c6927x849d35643.b("PositionLongitude", java.lang.String.valueOf(gd4Var.f456669g), true);
                    } else if (ordinal2 == 3) {
                        nu3.i.f421754d.B = 1L;
                    } else if (ordinal2 == 4) {
                        nu3.i.f421754d.A = 1L;
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35644 = nu3.i.f421754d;
                c6927x849d35644.f142410l = i19;
                c6927x849d35644.f142411m = i27;
                c6927x849d35644.f142422x = getMoreMenuPlugin().f546965m ? 1L : 0L;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35645 = nu3.i.f421754d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = m67949x585d574d().f376531n;
                c6927x849d35645.f142421w = (c16997xb0aa383a2 != null && c16997xb0aa383a2.f237252p == 4) == true ? 1L : 0L;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                ct0.b captureInfo = getCaptureInfo();
                if (captureInfo != null && (arrayList2 = captureInfo.f303747k) != null) {
                    for (java.lang.String str : arrayList2) {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(options);
                        arrayList3.add(str);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(obj, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList3.get(0), (android.graphics.BitmapFactory.Options) arrayList3.get(1)), "com/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                        int i28 = options.outWidth;
                        sb8.append(options.outHeight + ':' + i28 + "||");
                    }
                }
                int lastIndexOf = sb8.lastIndexOf("||");
                if (lastIndexOf >= 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35646 = nu3.i.f421754d;
                    c6927x849d35646.C = c6927x849d35646.b("PhotoWidthHeightScales", sb8.substring(0, lastIndexOf).toString(), true);
                }
                nu3.i iVar2 = nu3.i.f421751a;
                iVar2.d(13);
                nu3.i.f421754d.f142407i = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
                iVar2.g(configProvider != null ? configProvider.F : 0);
                return;
            }
            super.w(status, bundle);
        }
    }
}
