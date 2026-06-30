package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lju3/d0;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew */
/* loaded from: classes10.dex */
public class C17016x4a873f55 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17016x4a873f55(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd
    /* renamed from: getPlayerView */
    public android.view.View mo55754x6b2da91c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C17000x9e479d07 c17000x9e479d07 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C17000x9e479d07(getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "playerView :" + c17000x9e479d07);
        m67973x60536bd9(new yt3.o1(c17000x9e479d07, this, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyh)));
        m67975xd72b7a67().add(m67965xcd7d0565());
        return c17000x9e479d07;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (!super.mo9064x4ceae47d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "onBackPress");
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
            ct0.b captureInfo = getCaptureInfo();
            if (captureInfo != null && captureInfo.f303739c) {
                ((ku5.t0) ku5.t0.f394148d).g(new ju3.b0(this));
            }
            m67965xcd7d0565().mo9066x6761d4f();
            it3.y navigator = getNavigator();
            if (navigator != null) {
                it3.y.a(navigator, 0, null, 2, null);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        super.mo10989x3f5eee52();
        nu3.i.f421751a.a("MEDIA_EDIT_PAGE_STAYTIME_LONG", getBrowserTimeMs());
        dx1.g.f326022a.j("SnsPublishProcess", "mediaEditPageStaytime_", java.lang.Long.valueOf(getBrowserTimeMs()), bx1.u.f117843e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        dw3.d0 a17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "loadCurrentPage info " + bVar);
        super.r(bVar);
        if (bVar != null) {
            dw3.f.f325738c = 0;
            boolean z17 = true;
            if (bVar.a()) {
                dw3.f.f325738c++;
            }
            if (bVar.b()) {
                dw3.f.f325738c++;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            yt3.e1 bgPlugin = getBgPlugin();
            ct0.b captureInfo = getCaptureInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(captureInfo);
            bgPlugin.a(captureInfo, getConfigProvider());
            yt3.o1 m67965xcd7d0565 = m67965xcd7d0565();
            ct0.b captureInfo2 = getCaptureInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(captureInfo2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
            m67965xcd7d0565.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "start preview " + captureInfo2);
            m67965xcd7d0565.f547097i = captureInfo2;
            m67965xcd7d0565.f547098m = configProvider != null ? configProvider.f237218w : 10000;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = m67965xcd7d0565.f547092d;
            fp.e eVar = new fp.e(c19745xad58a1a4 != null ? c19745xad58a1a4.getContext() : null);
            m67965xcd7d0565.f547094f = eVar;
            eVar.b();
            if (c19745xad58a1a4 != null) {
                c19745xad58a1a4.setVisibility(0);
            }
            if (c19745xad58a1a4 != null) {
                c19745xad58a1a4.setAlpha(0.0f);
            }
            if (c19745xad58a1a4 != null) {
                c19745xad58a1a4.mo69327xab3268fe(captureInfo2.d());
            }
            if ((configProvider != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(configProvider.f237213r, java.lang.Boolean.TRUE) : false) && (a17 = dw3.e0.f325735a.a(captureInfo2.d())) != null) {
                int i17 = a17.f325724b;
                int i18 = a17.f325723a;
                int i19 = a17.f325726d;
                boolean z19 = i19 == 0 || i19 == 180 ? i18 > i17 : i17 > i18;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.DEFAULT;
                if (configProvider == null || (e1Var = configProvider.f237211p) == e1Var2) {
                    if (!z19) {
                        if (c19745xad58a1a4 != null) {
                            c19745xad58a1a4.m75828x772f3ddc(true);
                        }
                        if (c19745xad58a1a4 != null) {
                            c19745xad58a1a4.m75834xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                        }
                    } else if (c19745xad58a1a4 != null) {
                        c19745xad58a1a4.m75834xebd28962(e1Var2);
                    }
                } else if (c19745xad58a1a4 != null) {
                    c19745xad58a1a4.m75834xebd28962(e1Var);
                }
                m67965xcd7d0565.f547102q = true;
            }
            if (c19745xad58a1a4 != null) {
                c19745xad58a1a4.mo69326x360a109e(m67965xcd7d0565.f547104s);
            }
            m67965xcd7d0565.f547100o = captureInfo2.f303740d;
            m67965xcd7d0565.f547101p = captureInfo2.f303741e;
            android.widget.TextView textView = m67965xcd7d0565.f547093e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView != null && z65.c.a()) {
                di3.u.f314296a.m77784x795fa299(new yt3.j1(m67965xcd7d0565, textView));
            }
            android.os.SystemClock.elapsedRealtime();
            yt3.r4 reMuxPlugin = getReMuxPlugin();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider2 = getConfigProvider();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(configProvider2);
            reMuxPlugin.j(bVar, configProvider2);
            android.os.SystemClock.elapsedRealtime();
            au3.l cropVideoPlugin = getCropVideoPlugin();
            ct0.b captureInfo3 = getCaptureInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(captureInfo3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider3 = getConfigProvider();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(configProvider3);
            cropVideoPlugin.getClass();
            cropVideoPlugin.f95652o = captureInfo3;
            cropVideoPlugin.f95653p = configProvider3;
            android.os.SystemClock.elapsedRealtime();
            android.os.Bundle bundle = bVar.f303750n;
            if (bundle != null) {
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("AUDIO_CACHE_INFO_LIST_KEY");
                android.os.Bundle bundle2 = bVar.f303750n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle2);
                int i27 = bundle2.getInt("AUDIO_CACHE_INFO_INDEX_KEY", 0);
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    iu3.e m67949x585d574d = m67949x585d574d();
                    m67949x585d574d.getClass();
                    m67949x585d574d.b().mo68175x581c5bc2(i27, parcelableArrayList);
                }
            }
            nu3.i iVar = nu3.i.f421751a;
            iVar.n("KEY_MEDIA_TYPE_INT", 2);
            iVar.n("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", java.lang.Integer.valueOf(bVar.f303741e));
            iVar.n("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar.n("KEY_EDIT_PUBLISHID_INT", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar.n("KEY_EDIT_SESSION_ID", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            nu3.e eVar2 = nu3.e.f421731a;
            java.lang.Object b17 = iVar.l().b("KEY_EDIT_SESSION_ID", 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
            nu3.e.f421734d = ((java.lang.Number) b17).longValue();
            nu3.i.f421754d.f142406h = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d3564 = nu3.i.f421754d;
            java.util.ArrayList arrayList = bVar.f303747k;
            c6927x849d3564.f142423y = !(arrayList == null || arrayList.isEmpty()) ? 1L : 2L;
            nu3.i.f421754d.f142424z = bVar.f303747k.size();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6938xb937af60 c6938xb937af60 = nu3.i.f421757g;
            java.util.ArrayList arrayList2 = bVar.f303747k;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z17 = false;
            }
            c6938xb937af60.f142492s = z17 ? 2L : 1L;
            nu3.i.f421757g.f142493t = bVar.f303747k.size();
            if (bVar.f303739c) {
                nu3.m mVar = nu3.m.f421762a;
                mVar.q(bVar.f303737a);
                mVar.r(bVar.f303742f);
            } else {
                nu3.m.f421762a.o(bVar.f303737a);
            }
            nu3.m.f421762a.f(getConfigProvider());
            ct0.b captureInfo4 = getCaptureInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(captureInfo4);
            if (captureInfo4.f303739c) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider4 = getConfigProvider();
            if ((configProvider4 != null ? configProvider4.F : 0) > 0) {
                iVar.n("KEY_MEDIA_SOURCE_INT", 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        int i17;
        java.util.ArrayList<java.lang.String> arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        ju3.c0 c0Var = ju3.c0.f383418l1;
        if (status != c0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "statusChange " + status + " ,param : " + bundle);
        }
        if (ju3.a0.f383393a[status.ordinal()] != 1) {
            if (status != c0Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorVideoPluginLayoutNew", "unknown status " + status);
            }
            super.w(status, bundle);
            return;
        }
        java.lang.String b17 = getBgPlugin().b();
        m67965xcd7d0565().mo9065x41012807();
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
        st3.s sVar = new st3.s(m67949x585d574d().c(), m67949x585d574d().f376531n, getItemContainerPlugin().d(null), getItemContainerPlugin().c(), getItemContainerPlugin().b(), m67965xcd7d0565().f547100o, m67965xcd7d0565().f547101p, new java.util.ArrayList(), b17, getItemContainerPlugin().g());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "edit config: " + sVar);
        nu3.m mVar = nu3.m.f421762a;
        int[] iArr = new int[3];
        iArr[0] = getItemContainerPlugin().e();
        iArr[1] = getItemContainerPlugin().f();
        iArr[2] = m67949x585d574d().f376531n == null ? 0 : 1;
        mVar.g(iArr);
        getReMuxPlugin().m(sVar);
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().e()));
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().f()));
        iVar.n("KEY_SELECT_MUSIC_INT", java.lang.Integer.valueOf(m67949x585d574d().f376531n == null ? 0 : 1));
        iVar.n("KEY_SELECT_ORIGIN_INT", java.lang.Integer.valueOf(!m67949x585d574d().c() ? 1 : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        java.util.Iterator it = getItemContainerPlugin().c().iterator();
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zu3.a aVar = (zu3.a) it.next();
            int ordinal = aVar.f557291a.ordinal();
            if (ordinal == 0) {
                i27++;
            } else if (ordinal == 1) {
                i19++;
            } else if (ordinal == 2) {
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
            } else if (ordinal == 3) {
                nu3.i.f421754d.B = 1L;
            } else if (ordinal == 4) {
                nu3.i.f421754d.A = 1L;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35644 = nu3.i.f421754d;
        c6927x849d35644.f142410l = i19;
        c6927x849d35644.f142411m = i27;
        c6927x849d35644.f142422x = getMoreMenuPlugin().f546965m ? 1L : 0L;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        ct0.b captureInfo = getCaptureInfo();
        if (captureInfo != null && (arrayList = captureInfo.f303747k) != null) {
            for (java.lang.String str : arrayList) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options);
                arrayList2.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1)), "com/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                int i28 = options.outWidth;
                sb8.append(options.outHeight + ':' + i28 + "||");
            }
        }
        int lastIndexOf = sb8.lastIndexOf("||");
        if (lastIndexOf >= 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35645 = nu3.i.f421754d;
            c6927x849d35645.C = c6927x849d35645.b("PhotoWidthHeightScales", sb8.substring(0, lastIndexOf).toString(), true);
        }
        nu3.i iVar2 = nu3.i.f421751a;
        iVar2.d(13);
        nu3.i.f421754d.f142407i = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
        iVar2.g(configProvider != null ? configProvider.F : 0);
        iVar2.h();
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            vVar.e();
        }
    }
}
