package m21;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f404516a;

    public static int a(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        if (i17 != 38) {
                            return i17 != 76 ? -1 : 5;
                        }
                        return 6;
                    }
                }
            }
        }
        return i18;
    }

    public static android.content.Intent b(int i17, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.os.Bundle bundle) {
        char c17;
        java.lang.String str4;
        java.lang.String str5 = c11286x34a5504.f33121x993583fc;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
        int mo14189x368f3a = iMediaObject.mo14189x368f3a();
        int a17 = a(3);
        if (mo14189x368f3a == 36) {
            c17 = 0;
        } else if (mo14189x368f3a == 76) {
            c17 = '*';
        } else if (mo14189x368f3a != 101) {
            if (mo14189x368f3a != 130) {
                if (mo14189x368f3a != 38 && mo14189x368f3a != 39) {
                    switch (mo14189x368f3a) {
                        case 1:
                            c17 = 2;
                            break;
                        case 2:
                            c17 = 1;
                            break;
                        case 3:
                            c17 = 4;
                            break;
                        case 4:
                            c17 = 5;
                            break;
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            c17 = 65535;
                            break;
                    }
                } else {
                    c17 = 15;
                }
            }
            c17 = 3;
        } else {
            c17 = 'e';
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KThrid_app", true);
        iMediaObject.mo14189x368f3a();
        intent.putExtra("Ksnsupload_appid", str2);
        intent.putExtra("Ksnsupload_appname", str3);
        intent.putExtra("Ksnsupload_open_sdk_version", i17);
        intent.putExtra("KSnsAction", true);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_app_is_game", z17);
        android.os.Bundle bundle2 = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f33049x38eb0007 = c11286x34a5504;
        req.mo48427x792022dd(bundle2);
        intent.putExtra("Ksnsupload_timeline", bundle2);
        if (c17 == 65535) {
            return null;
        }
        int mo14189x368f3a2 = iMediaObject.mo14189x368f3a();
        str4 = "";
        if (mo14189x368f3a2 == 36) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) req.f33049x38eb0007.f33122xe4128443;
            intent.putExtra("Ksnsupload_link", c11287xc333feeb.f33178xa1713a8c);
            intent.putExtra("Ksnsupload_contentattribute", 0);
            intent.putExtra("ksnsis_appbrand", true);
            intent.putExtra("Ksnsupload_source", 5);
            intent.putExtra("Ksnsupload_type", 1);
            intent.putExtra("KsnsUpload_BrandUsername", c11287xc333feeb.f33177xf01afcf6);
            intent.putExtra("KsnsUpload_BrandPath", c11287xc333feeb.f33176x346425);
            intent.putExtra("KsnsUpload_BrandVersionType", c11287xc333feeb.f33175xc6c9cf27);
            java.lang.String str6 = c11286x34a5504.f33130x6942258;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            intent.putExtra("Ksnsupload_title", str6 != null ? str6 : "");
            intent.putExtra("Ksnsupload_imgbuf", c11286x34a5504.f33128x4f3b3aa0);
            return intent;
        }
        if (mo14189x368f3a2 == 76) {
            java.lang.String str7 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) iMediaObject).f33201x324c710a;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str7 == null) {
                str7 = "";
            }
            if (a(76) == -1) {
                return null;
            }
            intent.putExtra("Ksnsupload_link", str7);
            intent.putExtra("Ksnsupload_title", "");
            intent.putExtra("Ksnsupload_type", 25);
            intent.putExtra("ksnsis_music", true);
            if (bundle != null) {
                intent.putExtra("music_mv_cover_url", bundle.getString("music_mv_cover_url", ""));
            }
            return intent;
        }
        if (mo14189x368f3a2 == 101) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11291xe63498b8 c11291xe63498b8 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11291xe63498b8) iMediaObject;
            java.lang.String string = bundle.getString("kWXEntryActivity_bundle_game_share_card_msgid");
            com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = (com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138) bundle.getParcelable("kWXEntryActivity_bundle_game_share_card_liteapp");
            if (c16075xd72ab138 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "johnjh sns gamepageobject or liteappbizdatainfo is null");
                return null;
            }
            java.lang.String str8 = c11286x34a5504.f33130x6942258;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            intent.putExtra("Ksnsupload_title", str8 != null ? str8 : "");
            intent.putExtra("Ksnsupload_imgbuf", c11286x34a5504.f33128x4f3b3aa0);
            intent.putExtra("Ksnsupload_type", 34);
            intent.putExtra("ksnsis_gamesharecard", true);
            if (c11291xe63498b8.f33208x7b98c171) {
                intent.putExtra("ksnsUpload_gameShareIsVideo", 1);
            } else {
                intent.putExtra("ksnsUpload_gameShareIsVideo", 0);
            }
            intent.putExtra("ksnsUpload_gameShareData", c11291xe63498b8.f33209xa1acac29);
            intent.putExtra("ksnsUpload_gameShareDuration", c11291xe63498b8.f33210x795c1b2f);
            intent.putExtra("ksnsUpload_gameShareId", string);
            intent.putExtra("KsnsUpload_LiteAppId", c16075xd72ab138.f223649d);
            intent.putExtra("KsnsUpload_LiteAppPath", c16075xd72ab138.f223650e);
            intent.putExtra("KsnsUpload_LiteAppQuery", c16075xd72ab138.f223651f);
            intent.putExtra("ksnsUpload_gameShareLiteAppBizData", c16075xd72ab138.f223652g);
            intent.putExtra("ksnsUpload_gameShareLiteAppPriority", c16075xd72ab138.f223654i);
            return intent;
        }
        if (mo14189x368f3a2 != 130) {
            if (mo14189x368f3a2 == 38) {
                intent.putExtra("KBlockAdd", true);
                intent.putExtra("Ksnsupload_type", 14);
                java.lang.String str9 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) iMediaObject).f33233xd426afc1;
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str9);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") || !com.p314xaae8f345.mm.vfs.w6.j("")) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    c01.d9.b();
                    sb6.append(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Ai());
                    sb6.append(p17);
                    str4 = sb6.toString();
                    try {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6065x346f8681 c6065x346f8681 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6065x346f8681();
                        c6065x346f8681.f136347g.f89859a = str9;
                        c6065x346f8681.e();
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) c6065x346f8681.f136348h.f89936a;
                        if (bitmap == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", str9);
                            return null;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
                        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str4);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", e17.getMessage());
                    }
                }
                intent.putExtra("KSightPath", str9);
                intent.putExtra("KSightThumbPath", str4);
                intent.putExtra("sight_md5", p17);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_open_timeline_after_thirdapp_post_video, true)) {
                    intent.putExtra("K_go_to_SnsTimeLineUI", true);
                }
                return intent;
            }
            if (mo14189x368f3a2 == 39) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3 c11282x3580fbc3 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) iMediaObject;
                intent.putExtra("KBlockAdd", true);
                intent.putExtra("Ksnsupload_type", 14);
                java.lang.String str10 = c11282x3580fbc3.f33097xd426afc1;
                java.lang.String str11 = c11282x3580fbc3.f33099x44a0a2f4;
                java.lang.String str12 = c11282x3580fbc3.f33098x5d6543b9;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSnsImpl", "videoPath %s,thumbPath %s,cdnUrl %s,cdnThumbUrl %s", str10, "", str11, str12);
                java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(str10);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") || !com.p314xaae8f345.mm.vfs.w6.j("")) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    c01.d9.b();
                    sb7.append(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Ai());
                    sb7.append(p18);
                    str4 = sb7.toString();
                    try {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6065x346f8681 c6065x346f86812 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6065x346f8681();
                        c6065x346f86812.f136347g.f89859a = str10;
                        c6065x346f86812.e();
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) c6065x346f86812.f136348h.f89936a;
                        if (bitmap2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", str10);
                            return null;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", java.lang.Integer.valueOf(bitmap2.getWidth()), java.lang.Integer.valueOf(bitmap2.getHeight()));
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap2, 80, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
                        android.graphics.BitmapFactory.Options n08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str4);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", java.lang.Integer.valueOf(n08.outWidth), java.lang.Integer.valueOf(n08.outHeight));
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", e18.getMessage());
                    }
                }
                intent.putExtra("KSightPath", str10);
                intent.putExtra("KSightThumbPath", str4);
                intent.putExtra("sight_md5", p18);
                intent.putExtra("KSightCdnUrl", str11);
                intent.putExtra("KSightCdnThumbUrl", str12);
                return intent;
            }
            switch (mo14189x368f3a2) {
                case 1:
                    intent.putExtra("Kdescription", ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) iMediaObject).f33229x36452d);
                    intent.putExtra("Ksnsupload_type", 8);
                    return intent;
                case 2:
                    intent.putExtra("KBlockAdd", true);
                    intent.putExtra("Ksnsupload_type", 0);
                    intent.putExtra("sns_kemdia_path", ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) iMediaObject).f33105xcba65c20);
                    return intent;
                case 3:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423) iMediaObject;
                    java.lang.String str13 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33185x324c710a) ? c11288x597a4423.f33185x324c710a : c11288x597a4423.f33184xc6370d0b;
                    if (str13 == null) {
                        str13 = "";
                    }
                    if (a17 == -1) {
                        return null;
                    }
                    intent.putExtra("Ksnsupload_link", str13);
                    intent.putExtra("Ksnsupload_title", "");
                    intent.putExtra("Ksnsupload_type", 2);
                    intent.putExtra("ksnsis_music", true);
                    return intent;
                case 4:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) iMediaObject;
                    java.lang.String str14 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11298x4d56d1f9.f33238x44a0a2f4) ? c11298x4d56d1f9.f33238x44a0a2f4 : c11298x4d56d1f9.f33237x3accbfe1;
                    if (str14 == null) {
                        str14 = "";
                    }
                    if (a17 == -1) {
                        return null;
                    }
                    intent.putExtra("Ksnsupload_link", str14);
                    intent.putExtra("Ksnsupload_title", "");
                    intent.putExtra("Ksnsupload_type", 1);
                    intent.putExtra("ksnsis_video", true);
                    return intent;
                case 5:
                    intent.putExtra("Ksnsupload_link", ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) iMediaObject).f33249xa1713a8c);
                    java.lang.String str15 = c11286x34a5504.f33130x6942258;
                    boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    intent.putExtra("Ksnsupload_title", str15 != null ? str15 : "");
                    intent.putExtra("Ksnsupload_imgbuf", c11286x34a5504.f33128x4f3b3aa0);
                    intent.putExtra("Ksnsupload_type", 1);
                    return intent;
                case 6:
                    break;
                case 7:
                    return null;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "none type not support!");
                    return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSnsImpl", "file is not support!");
        return null;
    }
}
