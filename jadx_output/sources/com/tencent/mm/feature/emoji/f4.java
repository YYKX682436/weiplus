package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public final class f4 extends i95.w implements com.tencent.mm.feature.emoji.api.p6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f66264d = "MicroMsg.EmoticonLiteAppFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f66265e = "wxalited0b57585613a7551e08fc832ec6ab2e6";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f66266f = "storeHome/nativeSetEmotionCache";

    /* renamed from: g, reason: collision with root package name */
    public boolean f66267g;

    public final d22.v Ai(qk.h7 h7Var) {
        d22.d0 d0Var;
        d22.d dVar;
        if (h7Var instanceof qk.u) {
            kotlin.jvm.internal.o.e(h7Var, "null cannot be cast to non-null type com.tencent.mm.api.EmoticonBrowsePageExternalContext");
            qk.u uVar = (qk.u) h7Var;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = uVar.f364340o;
            boolean z17 = iEmojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo;
            java.lang.String str = uVar.f364339n;
            if (z17) {
                kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                dVar = new d22.d(str, (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
            } else if (iEmojiInfo != null) {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = uVar.f364340o;
                emojiInfo.field_md5 = iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null;
                emojiInfo.field_externMd5 = iEmojiInfo2 != null ? iEmojiInfo2.g1() : null;
                emojiInfo.field_catalog = iEmojiInfo2 != null ? iEmojiInfo2.getGroup() : 0;
                emojiInfo.field_groupId = iEmojiInfo2 != null ? iEmojiInfo2.getGroupId() : null;
                emojiInfo.field_cdnUrl = iEmojiInfo2 != null ? iEmojiInfo2.l0() : null;
                emojiInfo.field_aeskey = iEmojiInfo2 != null ? iEmojiInfo2.getAesKey() : null;
                emojiInfo.field_encrypturl = iEmojiInfo2 != null ? iEmojiInfo2.J1() : null;
                emojiInfo.field_externUrl = iEmojiInfo2 != null ? iEmojiInfo2.Z() : null;
                emojiInfo.field_designerID = iEmojiInfo2 != null ? iEmojiInfo2.X0() : null;
                emojiInfo.field_activityid = iEmojiInfo2 != null ? iEmojiInfo2.S0() : null;
                emojiInfo.field_attachedText = iEmojiInfo2 != null ? iEmojiInfo2.q0() : null;
                emojiInfo.field_attachTextColor = iEmojiInfo2 != null ? iEmojiInfo2.k0() : null;
                emojiInfo.field_lensId = iEmojiInfo2 != null ? iEmojiInfo2.H1() : null;
                emojiInfo.H2 = iEmojiInfo2 != null ? iEmojiInfo2.E1() : null;
                dVar = new d22.d(str, emojiInfo);
            } else {
                dVar = new d22.d(str, null);
            }
            dVar.f364155a = uVar.f364155a;
            java.lang.String str2 = uVar.f364005g;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            dVar.f364005g = str2;
            java.lang.String str3 = uVar.f364006h;
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            dVar.f364006h = str3;
            java.lang.String str4 = uVar.f364007i;
            kotlin.jvm.internal.o.g(str4, "<set-?>");
            dVar.f364007i = str4;
            dVar.f364008j = uVar.f364008j;
            java.lang.String str5 = uVar.f364009k;
            kotlin.jvm.internal.o.g(str5, "<set-?>");
            dVar.f364009k = str5;
            java.lang.String str6 = uVar.f364010l;
            kotlin.jvm.internal.o.g(str6, "<set-?>");
            dVar.f364010l = str6;
            java.lang.String str7 = uVar.f364011m;
            kotlin.jvm.internal.o.g(str7, "<set-?>");
            dVar.f364011m = str7;
            dVar.f364156b = uVar.f364156b;
            java.lang.String str8 = uVar.f364157c;
            kotlin.jvm.internal.o.g(str8, "<set-?>");
            dVar.f364157c = str8;
            dVar.f364159e = uVar.f364159e;
            dVar.f364160f = uVar.f364160f;
            android.os.Parcelable parcelable = uVar.f364341p;
            if (parcelable != null) {
                dVar.f225833q = (com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener) parcelable;
            }
            return dVar;
        }
        if (h7Var instanceof qk.c0) {
            kotlin.jvm.internal.o.e(h7Var, "null cannot be cast to non-null type com.tencent.mm.api.EmoticonStoreDetailPageExternalContext");
            qk.c0 c0Var = (qk.c0) h7Var;
            if (android.text.TextUtils.isEmpty(c0Var.f364051q)) {
                d0Var = new d22.d0(c0Var.f364050p, null, null);
            } else {
                java.lang.String r17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.r(c0Var.f364051q);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                d0Var = new d22.d0(r17 == null ? "" : r17, null, null);
                d0Var.f364198g = 10;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10993, 3, r17);
            }
            d0Var.f364155a = c0Var.f364155a;
            int i17 = c0Var.f364198g;
            if (i17 > 0) {
                d0Var.f364198g = i17;
            }
            java.lang.String str9 = c0Var.f364199h;
            kotlin.jvm.internal.o.g(str9, "<set-?>");
            d0Var.f364199h = str9;
            d0Var.f364200i = c0Var.f364200i;
            java.lang.String str10 = c0Var.f364201j;
            kotlin.jvm.internal.o.g(str10, "<set-?>");
            d0Var.f364201j = str10;
            java.lang.String str11 = c0Var.f364202k;
            kotlin.jvm.internal.o.g(str11, "<set-?>");
            d0Var.f364202k = str11;
            d0Var.f364203l = c0Var.f364203l;
            java.lang.String str12 = c0Var.f364204m;
            kotlin.jvm.internal.o.g(str12, "<set-?>");
            d0Var.f364204m = str12;
            d0Var.f364205n = c0Var.f364205n;
            java.lang.String str13 = c0Var.f364206o;
            kotlin.jvm.internal.o.g(str13, "<set-?>");
            d0Var.f364206o = str13;
            java.lang.String str14 = c0Var.f364157c;
            kotlin.jvm.internal.o.g(str14, "<set-?>");
            d0Var.f364157c = str14;
            d0Var.f364159e = c0Var.f364159e;
            d0Var.f364160f = c0Var.f364160f;
            return d0Var;
        }
        if (h7Var instanceof qk.b0) {
            kotlin.jvm.internal.o.e(h7Var, "null cannot be cast to non-null type com.tencent.mm.api.EmoticonRewardPageExternalContext");
            qk.b0 b0Var = (qk.b0) h7Var;
            d22.b0 b0Var2 = new d22.b0(b0Var.f364017h);
            b0Var2.f364190g = b0Var.f364190g;
            b0Var2.f364155a = b0Var.f364155a;
            b0Var2.f364159e = b0Var.f364159e;
            return b0Var2;
        }
        if (h7Var instanceof qk.a0) {
            qk.a0 a0Var = (qk.a0) h7Var;
            d22.n nVar = new d22.n(a0Var.f364004j);
            nVar.f364133i = a0Var.f364133i;
            nVar.f364155a = h7Var.f364155a;
            java.lang.String str15 = ((qk.a0) h7Var).f364132h;
            kotlin.jvm.internal.o.g(str15, "<set-?>");
            nVar.f364132h = str15;
            nVar.f364159e = h7Var.f364159e;
            nVar.f364160f = h7Var.f364160f;
            return nVar;
        }
        if (h7Var instanceof d22.w) {
            d22.w wVar = new d22.w();
            wVar.f225877j = ((d22.w) h7Var).f225877j;
            return wVar;
        }
        if (h7Var instanceof qk.w) {
            qk.w wVar2 = (qk.w) h7Var;
            d22.f fVar = new d22.f(wVar2.f364352p);
            java.lang.String str16 = wVar2.f364052g;
            kotlin.jvm.internal.o.g(str16, "<set-?>");
            fVar.f364052g = str16;
            java.lang.String str17 = wVar2.f364053h;
            kotlin.jvm.internal.o.g(str17, "<set-?>");
            fVar.f364053h = str17;
            java.lang.String str18 = wVar2.f364054i;
            kotlin.jvm.internal.o.g(str18, "<set-?>");
            fVar.f364054i = str18;
            java.lang.String str19 = wVar2.f364055j;
            kotlin.jvm.internal.o.g(str19, "<set-?>");
            fVar.f364055j = str19;
            java.lang.String str20 = wVar2.f364056k;
            kotlin.jvm.internal.o.g(str20, "<set-?>");
            fVar.f364056k = str20;
            java.lang.String str21 = wVar2.f364057l;
            kotlin.jvm.internal.o.g(str21, "<set-?>");
            fVar.f364057l = str21;
            java.lang.String str22 = wVar2.f364058m;
            kotlin.jvm.internal.o.g(str22, "<set-?>");
            fVar.f364058m = str22;
            fVar.f364059n = wVar2.f364059n;
            fVar.f364060o = wVar2.f364060o;
            fVar.f364159e = h7Var.f364159e;
            fVar.f364160f = h7Var.f364160f;
            return fVar;
        }
        if (h7Var instanceof qk.z) {
            d22.l lVar = new d22.l();
            lVar.f364155a = h7Var.f364155a;
            lVar.f364156b = h7Var.f364156b;
            qk.z zVar = (qk.z) h7Var;
            lVar.f364111g = zVar.f364111g;
            lVar.f364112h = zVar.f364112h;
            java.lang.String str23 = zVar.f364115k;
            kotlin.jvm.internal.o.g(str23, "<set-?>");
            lVar.f364115k = str23;
            lVar.f364159e = h7Var.f364159e;
            lVar.f364160f = h7Var.f364160f;
            return lVar;
        }
        if (h7Var instanceof qk.y) {
            d22.j jVar = new d22.j();
            jVar.f364155a = h7Var.f364155a;
            jVar.f364156b = h7Var.f364156b;
            qk.y yVar = (qk.y) h7Var;
            jVar.f364089g = yVar.f364089g;
            jVar.f364090h = yVar.f364090h;
            java.lang.String str24 = yVar.f364092j;
            kotlin.jvm.internal.o.g(str24, "<set-?>");
            jVar.f364092j = str24;
            jVar.f364159e = h7Var.f364159e;
            java.lang.String str25 = yVar.f364093k;
            kotlin.jvm.internal.o.g(str25, "<set-?>");
            jVar.f364093k = str25;
            jVar.f364091i = yVar.f364091i;
            jVar.f364160f = h7Var.f364160f;
            return jVar;
        }
        if (!(h7Var instanceof qk.x)) {
            com.tencent.mars.xlog.Log.w(this.f66264d, "unable to handle this page context");
            return null;
        }
        d22.h hVar = new d22.h();
        hVar.f364155a = h7Var.f364155a;
        hVar.f364156b = h7Var.f364156b;
        qk.x xVar = (qk.x) h7Var;
        hVar.f364075g = xVar.f364075g;
        hVar.f364076h = xVar.f364076h;
        java.lang.String str26 = xVar.f364079k;
        kotlin.jvm.internal.o.g(str26, "<set-?>");
        hVar.f364079k = str26;
        hVar.f364159e = h7Var.f364159e;
        java.lang.String str27 = xVar.f364078j;
        kotlin.jvm.internal.o.g(str27, "<set-?>");
        hVar.f364078j = str27;
        java.lang.String str28 = xVar.f364080l;
        kotlin.jvm.internal.o.g(str28, "<set-?>");
        hVar.f364080l = str28;
        java.lang.String str29 = xVar.f364081m;
        kotlin.jvm.internal.o.g(str29, "<set-?>");
        hVar.f364081m = str29;
        java.lang.String str30 = xVar.f364082n;
        kotlin.jvm.internal.o.g(str30, "<set-?>");
        hVar.f364082n = str30;
        hVar.f364077i = xVar.f364077i;
        hVar.f364160f = h7Var.f364160f;
        return hVar;
    }

    public org.json.JSONObject Bi(r45.kj0 banner) {
        kotlin.jvm.internal.o.g(banner, "banner");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = banner.f378734o;
        if (str != null) {
            linkedHashMap.put("productId", str);
        }
        java.lang.String str2 = banner.f378727e;
        if (str2 != null) {
            linkedHashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        }
        java.lang.String str3 = banner.f378728f;
        if (str3 != null) {
            linkedHashMap.put("locateUrl", str3);
        }
        linkedHashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(banner.f378729g));
        java.lang.String str4 = banner.f378730h;
        if (str4 != null) {
            linkedHashMap.put("secondUrl", str4);
        }
        linkedHashMap.put("setType", java.lang.Integer.valueOf(banner.f378731i));
        java.lang.String str5 = banner.f378732m;
        if (str5 != null) {
            linkedHashMap.put("iconUrl", str5);
        }
        java.lang.String str6 = banner.f378733n;
        if (str6 != null) {
            linkedHashMap.put("desc", str6);
        }
        java.lang.String str7 = banner.f378735p;
        if (str7 != null) {
            linkedHashMap.put("tagUrl", str7);
        }
        java.lang.String str8 = banner.f378736q;
        if (str8 != null) {
            linkedHashMap.put("setKey", str8);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        r45.ij0 ij0Var = banner.f378726d;
        if (ij0Var != null) {
            java.lang.String str9 = ij0Var.f377091d;
            if (str9 != null) {
                linkedHashMap2.put("imgUrl", str9);
            }
            java.lang.String str10 = banner.f378726d.f377094g;
            if (str10 != null) {
                linkedHashMap2.put("stripUrl", str10);
            }
            java.lang.String str11 = banner.f378726d.f377095h;
            if (str11 != null) {
                linkedHashMap2.put("detailBackGroundUrl", str11);
            }
            linkedHashMap2.put("width", java.lang.Integer.valueOf(banner.f378726d.f377092e));
            linkedHashMap2.put("height", java.lang.Integer.valueOf(banner.f378726d.f377093f));
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            r45.jj0 jj0Var = banner.f378726d.f377096i;
            if (jj0Var != null) {
                java.lang.String str12 = jj0Var.f377847d;
                if (str12 != null) {
                    linkedHashMap3.put("wording", str12);
                }
                java.util.LinkedList linkedList = banner.f378726d.f377096i.f377848e;
                if (linkedList != null) {
                    linkedHashMap3.put("textColorArgb", linkedList);
                }
                java.util.LinkedList linkedList2 = banner.f378726d.f377096i.f377850g;
                if (linkedList2 != null) {
                    linkedHashMap3.put("bgColorArgb", linkedList2);
                }
                linkedHashMap3.put("textColorArgbCount", java.lang.Integer.valueOf(banner.f378726d.f377096i.f377849f));
                linkedHashMap3.put("bgColorArgbCount", java.lang.Integer.valueOf(banner.f378726d.f377096i.f377851h));
            }
            linkedHashMap2.put("emotionBannerMarkTagStyle", linkedHashMap3);
        }
        linkedHashMap.put("bannerImg", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        r45.lj0 lj0Var = banner.f378737r;
        if (lj0Var != null) {
            java.lang.String str13 = lj0Var.f379515d;
            if (str13 != null) {
                linkedHashMap4.put("appId", str13);
            }
            java.lang.String str14 = banner.f378737r.f379516e;
            if (str14 != null) {
                linkedHashMap4.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, str14);
            }
        }
        linkedHashMap.put("jumpInfo", linkedHashMap4);
        return new org.json.JSONObject(linkedHashMap);
    }

    public org.json.JSONObject Di(r45.zj0 summary) {
        kotlin.jvm.internal.o.g(summary, "summary");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = summary.f392128d;
        if (str != null) {
            linkedHashMap.put("productId", str);
        }
        java.lang.String str2 = summary.f392129e;
        if (str2 != null) {
            linkedHashMap.put("iconUrl", str2);
        }
        java.lang.String str3 = summary.f392131g;
        if (str3 != null) {
            linkedHashMap.put("packDesc", str3);
        }
        java.lang.String str4 = summary.f392130f;
        if (str4 != null) {
            linkedHashMap.put("packName", str4);
        }
        java.lang.String str5 = summary.f392145x;
        if (str5 != null) {
            linkedHashMap.put("introduce", str5);
        }
        java.lang.String str6 = summary.f392146y;
        if (str6 != null) {
            linkedHashMap.put("tagUri", str6);
        }
        java.lang.String str7 = summary.f392136o;
        if (str7 != null) {
            linkedHashMap.put("coverUrl", str7);
        }
        java.lang.String str8 = summary.f392147z;
        if (str8 != null) {
            linkedHashMap.put("exptDesc", str8);
        }
        java.lang.String str9 = summary.C;
        if (str9 != null) {
            linkedHashMap.put("designerIpsetKey", str9);
        }
        java.lang.String str10 = summary.f392133i;
        if (str10 != null) {
            linkedHashMap.put("packPrice", str10);
        }
        java.lang.String str11 = summary.f392142u;
        if (str11 != null) {
            linkedHashMap.put("priceType", str11);
        }
        java.lang.String str12 = summary.f392141t;
        if (str12 != null) {
            linkedHashMap.put("priceNum", str12);
        }
        java.lang.String str13 = summary.f392132h;
        if (str13 != null) {
            linkedHashMap.put("packAuthInfo", str13);
        }
        java.lang.String str14 = summary.f392138q;
        if (str14 != null) {
            linkedHashMap.put("packCopyright", str14);
        }
        java.lang.String str15 = summary.f392140s;
        if (str15 != null) {
            linkedHashMap.put("panelUrl", str15);
        }
        java.lang.String str16 = summary.f392143v;
        if (str16 != null) {
            linkedHashMap.put("sendInfo", str16);
        }
        java.lang.String str17 = summary.f392144w;
        if (str17 != null) {
            linkedHashMap.put("timeLimitStr", str17);
        }
        linkedHashMap.put("packType", java.lang.Integer.valueOf(summary.f392134m));
        linkedHashMap.put("packFlag", java.lang.Integer.valueOf(summary.f392135n));
        linkedHashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Integer.valueOf(summary.f392139r));
        linkedHashMap.put("packWeCoinNum", java.lang.Integer.valueOf(summary.A));
        linkedHashMap.put("weCoinNum", java.lang.Integer.valueOf(summary.B));
        linkedHashMap.put("packExpire", java.lang.Integer.valueOf(summary.f392137p));
        linkedHashMap.put("totalThumbNum", java.lang.Integer.valueOf(summary.F));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        r45.tj0 tj0Var = summary.D;
        if (tj0Var != null) {
            java.lang.String str18 = tj0Var.f386496e;
            if (str18 != null) {
                linkedHashMap2.put("iconUrl", str18);
            }
            java.lang.String str19 = summary.D.f386497f;
            if (str19 != null) {
                linkedHashMap2.put("desc", str19);
            }
            java.lang.String str20 = summary.D.f386498g;
            if (str20 != null) {
                linkedHashMap2.put("linkUrl", str20);
            }
            java.lang.String str21 = summary.D.f386501m;
            if (str21 != null) {
                linkedHashMap2.put("reportInfo", str21);
            }
            linkedHashMap2.put("linkType", java.lang.Integer.valueOf(summary.D.f386495d));
            linkedHashMap2.put("iconWidth", java.lang.Integer.valueOf(summary.D.f386499h));
            linkedHashMap2.put("iconHeight", java.lang.Integer.valueOf(summary.D.f386500i));
            linkedHashMap2.put("linkId", java.lang.Integer.valueOf(summary.D.f386502n));
            linkedHashMap2.put("linkFlag", java.lang.Long.valueOf(summary.D.f386503o));
        }
        linkedHashMap.put("link", linkedHashMap2);
        return new org.json.JSONObject(linkedHashMap);
    }

    public void wi(android.content.Context context, qk.h7 liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
        d22.v Ai = Ai(liteAppContext);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.e(this.f66264d, "cast external context to page context failed");
        } else {
            d22.u.f225876a.a(context, Ai);
        }
    }
}
