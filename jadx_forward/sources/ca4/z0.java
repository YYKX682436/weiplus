package ca4;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static android.os.Vibrator f121601a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f121602b = 3200;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f121603c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f121604d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f121605e = "";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f121606f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9);

    public static java.lang.String A(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullStrSeq", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        while (stringBuffer.length() < 25) {
            stringBuffer.insert(0, "0");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullStrSeq", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return stringBuffer2;
    }

    public static void A0(android.view.View view, android.content.Context context) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scaleImageView", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (view != null && i65.a.q(context) > 1.0f) {
            float q17 = i65.a.q(context);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int b17 = i65.a.b(context, 60);
            int i18 = layoutParams.width;
            if (i18 >= 0 && (i17 = layoutParams.height) >= 0) {
                int i19 = (int) (i18 * q17);
                int i27 = (int) (q17 * i17);
                if (i19 > b17) {
                    i19 = b17;
                }
                layoutParams.width = i19;
                if (i27 <= b17) {
                    b17 = i27;
                }
                layoutParams.height = b17;
                view.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleImageView", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static android.graphics.Rect B(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rect;
    }

    public static void B0(android.view.View view, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLineHeight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (!(view instanceof android.widget.TextView) || f17 == 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLineHeight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        float textSize = textView.getTextSize() * f17;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        textView.setLineSpacing(textSize - (fontMetricsInt.descent - fontMetricsInt.ascent), 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLineHeight", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static int C(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i17 = 4;
        int i18 = 0;
        try {
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
            if (n07 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                java.lang.String str2 = n07.outMimeType;
                if (str2 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else {
                    java.lang.String lowerCase = str2.toLowerCase();
                    if (lowerCase.indexOf("png") >= 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        i18 = 1;
                    } else {
                        if (lowerCase.indexOf("jpg") < 0 && lowerCase.indexOf("jpeg") < 0) {
                            if (lowerCase.indexOf("wxam") >= 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                i18 = 4;
                            } else if (lowerCase.indexOf("vcodec") >= 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                i18 = 5;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        i18 = 2;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        if (str.indexOf("png") >= 0) {
            i17 = 1;
        } else if (str.indexOf("jpg") >= 0 || str.indexOf("jpeg") >= 0) {
            i17 = 2;
        } else if (str.indexOf("mp3") >= 0) {
            i17 = 3;
        } else if (str.indexOf("wxam") < 0) {
            if (str.indexOf("vcodec") >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return 5;
            }
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i17;
    }

    public static void C0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        f121605e += str + ";";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0157, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f330109en, 0) == 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0127, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f330109en, 0) == 0) goto L192;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence D(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r16, android.content.Context r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.D(com.tencent.mm.protocal.protobuf.TimeLineObject, android.content.Context, java.util.Map):java.lang.CharSequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x05ab, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f330109en, r6) == 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x057c, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f330109en, r6) == 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x052f, code lost:
    
        if (r12 == false) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ac  */
    /* JADX WARN: Type inference failed for: r13v32, types: [h62.d] */
    /* JADX WARN: Type inference failed for: r3v94, types: [h62.d] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns D0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r38, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 r39, android.content.Context r40, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r41, boolean r42, com.p314xaae8f345.mm.p2621x8fb0427b.e8 r43, java.lang.String r44, java.util.Map r45, java.util.Map r46, java.util.List r47) {
        /*
            Method dump skipped, instructions count: 2540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.D0(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.protocal.protobuf.SnsObject, android.content.Context, com.tencent.mm.plugin.sns.ui.bs, boolean, com.tencent.mm.storage.e8, java.lang.String, java.util.Map, java.util.Map, java.util.List):com.tencent.mm.plugin.sns.ui.ns");
    }

    public static int E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNetType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 3 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 4 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 2 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 5 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNetType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i17;
    }

    public static boolean E0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        boolean contains = str.toLowerCase().contains(str2.toLowerCase());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return contains;
    }

    public static android.graphics.Rect F(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRectSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        android.graphics.Rect rect = new android.graphics.Rect(bitmap.getWidth() / 4, 0, (int) ((r2 * 3) / 4.0d), bitmap.getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRectSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rect;
    }

    public static long F0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
        long j17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 0L;
        }
        try {
            j17 = new java.math.BigInteger(str).longValue();
        } catch (java.lang.NumberFormatException | java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return j17;
    }

    public static java.lang.String G(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = i17 + "-" + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static boolean G0(r45.mj4 mj4Var) {
        r45.mj4 mj4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadInfoIsUploadError", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z17 = true;
        if (mj4Var.f462103n != 1 && ((mj4Var2 = mj4Var.D) == null || mj4Var2.f462103n != 1)) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadInfoIsUploadError", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static int H(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i17 == 1 || i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 5;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 8;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 9;
        }
        if (i17 == 4 || i17 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return 0;
    }

    public static boolean H0(r45.mj4 mj4Var) {
        r45.mj4 mj4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadInfoIsUploadFinish", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z17 = mj4Var.f462103n == 0 && ((mj4Var2 = mj4Var.D) == null || mj4Var2.f462103n == 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadInfoIsUploadFinish", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static java.lang.String I(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sightad_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str, jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static void I0(long[] jArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("vibrate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (f121601a == null) {
                f121601a = (android.os.Vibrator) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
            }
            f121601a.vibrate(jArr, -1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUtil", e17, "vibrate error!", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("vibrate", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String J(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsb_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String K(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBigNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "snsb_" + s(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBigNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String L(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsblurs_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String M(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsblurt_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String N(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsHdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snshd_" + s(jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsHdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String O(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserUIPhotoComposing", "com.tencent.mm.plugin.sns.ui.config.SnsUserUIConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_user_photo_composing, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserUIPhotoComposing", "com.tencent.mm.plugin.sns.ui.config.SnsUserUIConfig");
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String str = fj6 ? "sns_user_v2_" : "sns_user_v1_";
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (str.length() > 0) {
                str = str.concat("-");
            }
            str = str + jj4Var.f459388d;
            i17++;
            if (i17 >= 9) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static int P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("sns_respone_count", 20);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i17;
    }

    public static int Q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i17 == 1 || i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 5;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 7;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 9;
        }
        if (i17 == 4 || i17 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return 0;
    }

    public static java.lang.String R(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sight_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static int S(java.lang.String str) {
        gp.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "getSnsSightVideoDurationInSeconds, path: %s", str);
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int V1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0));
                try {
                    dVar.release();
                } catch (java.io.IOException unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return V1;
            } catch (java.lang.Throwable unused2) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "getSnsSightVideoDurationInSeconds error: %s", str);
                    return 0;
                } finally {
                    if (dVar != null) {
                        try {
                            dVar.release();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
            }
        } catch (java.lang.Throwable unused4) {
            dVar = null;
        }
    }

    public static java.lang.String T(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStringId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String t07 = c17933xe8d1b226 == null ? "0" : t0(c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStringId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return t07;
    }

    public static java.lang.String U(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snst_" + s(jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String V(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsThumbNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "snst_" + s(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsThumbNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String W(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sns_tmpb_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String X(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpBigWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_tmpb_" + s(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpBigWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String Y(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sns_tmps_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String Z(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpSightWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_tmps_" + s(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpSightWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static void a(android.content.Intent intent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "appendAdGetA8KeySceneExtra, scene=" + i17);
            intent.putExtra("geta8key_scene", i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String a0(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sns_tmpt_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "appendAdUxInfo empty:" + str + ", " + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        try {
            str3 = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "appendAdUxInfo exp:" + e17.toString() + ", " + str2);
            str3 = "";
        }
        java.lang.String d17 = d(str, "uxinfo", str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "appendAdUxInfo, ret=" + d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return d17;
    }

    public static java.lang.String b0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpThumbWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_tmpt_" + s(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpThumbWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static void c(android.content.Intent intent, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "appendAdUxInfoForAdPay, intent==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        intent.putExtra("ad_ux_info_for_jsapi_pay", str == null ? "" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "appendAdUxInfoForAdPay, uxInfo=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String c0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTmpUserWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "snsu_" + s(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTmpUserWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            int indexOf = str.indexOf("#");
            if (indexOf >= 0) {
                str5 = str.substring(0, indexOf);
                str4 = str.substring(indexOf);
            } else {
                str4 = "";
                str5 = str;
            }
            if (str5.contains("?")) {
                str6 = str5 + "&" + str2 + "=" + str3;
            } else {
                str6 = str5 + "?" + str2 + "=" + str3;
            }
            java.lang.String str7 = str6 + str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str7;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "appendUrlParams exp:" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
    }

    public static java.lang.String d0(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUhdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsuhd_" + s(jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUhdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUrlParamsWithUrlEncode", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str4 = "";
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str4 = java.net.URLEncoder.encode(str3 == null ? "" : str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "appendUrlParamsWithUrlEncode exp:" + e17.toString() + ", " + str3);
        }
        java.lang.String d17 = d(str, str2, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUrlParamsWithUrlEncode", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return d17;
    }

    public static java.lang.String e0(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsu_" + s(jj4Var.f459388d);
        if (jj4Var.D != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static boolean f(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    public static java.lang.String f0(r45.jj4 jj4Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.F)) {
            java.lang.String str2 = jj4Var.F;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str2;
        }
        try {
            str = kk.k.g(jj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception unused) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static boolean g(com.p314xaae8f345.mm.p872xbfc2bd01.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (rVar == null || rVar.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    public static boolean g0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAccessibilityEnable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility");
        boolean z17 = accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAccessibilityEnable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static java.lang.String h(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCameraEntranceSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = gm0.j1.b().j() + "_" + j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCameraEntranceSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r6.f39014x86965dde.f451372g.contains("support.weixin.qq.com") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r6) {
        /*
            java.lang.String r0 = "isBiz"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = r6.f39033x11f29a7f
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L3f
            r45.a90 r2 = r6.f39014x86965dde
            int r3 = r2.f451370e
            r4 = 47
            if (r3 == r4) goto L3f
            int r3 = r6.f39029x81aacdfc
            r4 = 1
            if (r3 == r4) goto L40
            r5 = 2
            if (r3 == r5) goto L40
            r5 = 6
            if (r3 != r5) goto L24
            goto L40
        L24:
            java.lang.String r2 = r2.f451372g
            if (r2 == 0) goto L3f
            java.lang.String r3 = "mp.weixin.qq.com"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L40
            r45.a90 r6 = r6.f39014x86965dde
            java.lang.String r6 = r6.f451372g
            java.lang.String r2 = "support.weixin.qq.com"
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.h0(com.tencent.mm.protocal.protobuf.TimeLineObject):boolean");
    }

    public static java.lang.String i(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildSnsCopyReportData", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "<WCTimelineReportData><msgsource><cf>" + i17 + "</cf><inlenlist>" + str + "</inlenlist></msgsource></WCTimelineReportData>";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildSnsCopyReportData", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static boolean i0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        r45.y8 y8Var = c19807x593d1720.f39012x33e0f24f;
        if (y8Var != null && y8Var.f472385m != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        java.lang.String str = c19807x593d1720.f39014x86965dde.f451372g;
        if (!android.text.TextUtils.isEmpty(str) && str.contains("mp.weixin.qq.com")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19807x593d1720.f39033x11f29a7f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        boolean z17 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.k() & 2) <= 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static android.graphics.Bitmap j(java.lang.String str, android.graphics.Bitmap bitmap) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf > 0 && (i17 = lastIndexOf + 1) < str.length()) {
                java.lang.String substring = str.substring(i17);
                if (substring.startsWith("snsb") || substring.startsWith("sns_tmpb_")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    str2 = str;
                } else if (substring.startsWith("snst_") || substring.startsWith("snsu_")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
            str2 = str;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return bitmap;
        }
        int i18 = 0;
        try {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "[changes below by tomys]parsing jpg, path: %s, size: %s", str, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str)));
                com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43587xb5c99c46 = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str);
                if (m43587xb5c99c46 != null) {
                    i18 = m43587xb5c99c46.m43592x7a249f0b() % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUtil", e17, "Failed parsing JPEG file: ".concat(str2), new java.lang.Object[0]);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, i18);
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
    }

    public static boolean j0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHasSdcard", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean startsWith = str.startsWith(lp0.b.e0());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHasSdcard", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return startsWith;
    }

    public static boolean k(java.util.LinkedList linkedList, int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.util.Iterator it = linkedList.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return false;
            }
            android.util.Pair pair = (android.util.Pair) it.next();
            int intValue = ((java.lang.Integer) pair.first).intValue();
            int intValue2 = ((java.lang.Integer) pair.second).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (intValue >= intValue2) {
                if (i17 <= 1440 && i17 >= intValue) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else if (i17 >= intValue2 || i17 < 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
                z17 = true;
            } else if (i17 >= intValue2 || i17 < intValue) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                z17 = true;
            }
        } while (!z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    public static boolean k0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            if (i18 >= i17 * 2 || i17 >= i18 * 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
    }

    public static java.lang.String l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f121603c)) {
            f121603c = h(c01.id.c());
        }
        java.lang.String str = f121603c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static boolean l0(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isModeTall", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        int i17 = a17.f278669b;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isModeTall", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        boolean z17 = (((float) a17.f278668a) * 1.0f) / ((float) i17) <= 0.5625f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isModeTall", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        f121603c = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static boolean m0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPhotoAccount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z17 = false;
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhotoAccount", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
        java.lang.String str = c19807x593d1720.f39032x742a15ba;
        ((ox.g) oVar).getClass();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(str) && ((ox.g) oVar).Ri()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhotoAccount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.r n(java.lang.String str) {
        com.p314xaae8f345.mm.p872xbfc2bd01.r d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return null;
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
            options.inSampleSize = 1;
            while (true) {
                int i17 = options.inSampleSize;
                if (i17 > 10) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return null;
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "decodeFileToBitmap %s", java.lang.Integer.valueOf(i17));
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    d17 = r94.a.d(str, options);
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (d17 == null) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.r.d(str, elapsedRealtime2);
                    break;
                } catch (java.lang.OutOfMemoryError unused) {
                    options.inSampleSize++;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return d17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUtil", e17, "snsdecode error", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
    }

    public static boolean n0(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (e86Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86Var.f454667o)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9 A[Catch: Exception -> 0x0138, TryCatch #1 {Exception -> 0x0138, blocks: (B:3:0x000d, B:8:0x0017, B:10:0x001e, B:14:0x0033, B:21:0x00b9, B:22:0x00d6, B:46:0x0118, B:38:0x0131, B:35:0x0134, B:36:0x0137, B:55:0x012a, B:65:0x003f, B:67:0x0043, B:69:0x004a, B:70:0x0084, B:72:0x0090, B:73:0x0098, B:76:0x00a7, B:77:0x0092, B:80:0x0053, B:83:0x005c, B:86:0x0065, B:89:0x006f, B:92:0x0079, B:93:0x007f, B:97:0x00b0), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.o(java.lang.String):android.graphics.Bitmap");
    }

    public static boolean o0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return false;
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.r p(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "decodeFileToBlurThumbBitmap " + com.p314xaae8f345.mm.vfs.w6.j(str));
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return null;
            }
            com.p314xaae8f345.mm.p872xbfc2bd01.r n17 = n(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return n17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUtil", e17, "snsdecode error", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
    }

    public static void p0(android.content.Context context, java.lang.String _appUsername, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpHalfWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String c17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? za4.z0.c(str, java.lang.String.format("gdt_vid=%s", str4), java.lang.String.format("weixinadinfo=%s.%s.0.0", str3, str4)) : str;
        zy2.r7 r7Var = (zy2.r7) i95.n0.c(zy2.r7.class);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ((j40.p) r7Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_appUsername, "_appUsername");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 c19800x7f8d35f8 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8();
        c19800x7f8d35f8.m77198x4310efb("");
        c19800x7f8d35f8.m77212x764e93a7(c17);
        c19800x7f8d35f8.m77201x8dda1c85("");
        c19800x7f8d35f8.m77214x1e9b46cd("");
        c19800x7f8d35f8.m77199x891f0c35(_appUsername);
        byte[] bytes = "".getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        c19800x7f8d35f8.m77200x48f1247b(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        c19800x7f8d35f8.m77215x53aed94a(valueOf != null ? valueOf.intValue() : 0);
        c19786x6a1e2862.m76552x7d3cf1b2(c19800x7f8d35f8);
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534784m = new l81.b1();
        p0Var.f534783l = str5;
        xc2.y2.P(xc2.y2.f534876a, context, p0Var, 0, true, null, 0.75f, 20, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "jumpHalfWeApp userName=" + _appUsername + ", path=" + c17 + ", ver=" + str2 + ", scene=" + i17 + ", uxinfo=" + str6 + ", sceneNode=" + str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpHalfWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableAdListScroll", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6037x2de1b334 c6037x2de1b334 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6037x2de1b334();
        c6037x2de1b334.f136326g.f87823a = z17;
        c6037x2de1b334.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdListScroll", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static void q0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "jumpWeApp, use MMApplicationContext");
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = za4.z0.c(str2, java.lang.String.format("gdt_vid=%s", str5), java.lang.String.format("weixinadinfo=%s.%s.0.0", str4, str5));
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398567l = str6;
        b1Var.f398545a = str;
        b1Var.f398551d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str3, 0);
        b1Var.f398555f = str2;
        b1Var.f398565k = i17;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        b1Var.f398563j = persistableBundle;
        persistableBundle.putString("adUxInfo", str7);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtil", "jumpWeApp userName=" + str + ", path=" + str2 + ", ver=" + str3 + ", scene=" + i17 + ", uxinfo=" + str7 + ", sceneNode=" + str6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static android.text.SpannableString r(java.lang.String str, android.content.Context context, android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = (int) textView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString spannableString = new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.h(context, "<img src=\"original_label.png\"/>  " + str, (int) textSize, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return spannableString;
    }

    public static void r0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        q0(null, str, str2, str3, str4, str5, str6, str7, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String s(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        int length = str.length();
        int i17 = 0;
        while (i17 < length && str.charAt(i17) == '0') {
            i17++;
        }
        java.lang.String substring = str.substring(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return substring;
    }

    public static java.lang.String s0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String A = A(new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return A;
    }

    public static java.lang.String t(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatTimeSecondToDate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String format = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).format(new java.util.Date(j17 * 1000));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatTimeSecondToDate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return format;
    }

    public static java.lang.String t0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("longToString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w0.a(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longToString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static void u(r45.e86 e86Var, java.lang.CharSequence charSequence, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genCompressedComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.f() <= 0) {
            nsVar.f251564d.f(e86Var, charSequence);
        } else if (charSequence instanceof android.text.SpannableStringBuilder) {
            nsVar.f251564d.f(e86Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.c((android.text.SpannableStringBuilder) charSequence));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genCompressedComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x034d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap u0(java.util.List r26, int r27) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.u0(java.util.List, int):android.graphics.Bitmap");
    }

    public static java.lang.String v(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (v1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        long j17 = v1Var.f67467x63ce98ea;
        java.lang.String t07 = j17 == 0 ? t0(v1Var.f67469x29d1290e) : t0(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return t07;
    }

    public static java.lang.String v0(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (charSequence == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1[] d1VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1[]) spannableString.getSpans(0, spannableString.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1.class);
        int length = d1VarArr.length;
        for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var : d1VarArr) {
            spannableString.removeSpan(d1Var);
        }
        java.lang.String spannableString2 = spannableString.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return spannableString2;
    }

    public static java.lang.String w(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBatchDownloadKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = i17 + "_" + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBatchDownloadKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r25, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r26, android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.w0(com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.plugin.sns.ui.bs, android.content.Context):void");
    }

    public static java.lang.String x(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = i17 + "-" + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static void x0(com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdClick", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5909x7c5c81e9 c5909x7c5c81e9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5909x7c5c81e9();
        c5909x7c5c81e9.f136213g.f89743a = c11137xb05b06ad;
        c5909x7c5c81e9.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdClick", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String y(r45.e86 e86Var, com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentNickName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) e8Var).f0(e86Var.f454659d);
        if (f07 != null) {
            str = f07.g2();
        } else {
            java.lang.String str2 = e86Var.f454660e;
            str = str2 != null ? str2 : e86Var.f454659d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentNickName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String t07 = t0(c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return t07;
    }

    public static java.lang.String z(r45.kv2 kv2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (kv2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kv2Var.m75945x2fec8307(15))) {
            java.lang.String v17 = m21.y.v(kv2Var.m75945x2fec8307(15));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return v17;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kv2Var.m75945x2fec8307(2))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String v18 = m21.y.v(kv2Var.m75945x2fec8307(2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return v18;
    }

    public static void z0(java.lang.String str, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveImageToAlbum", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveImageToAlbum", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        int C = C(str);
        if (C == 4) {
            java.lang.String str2 = com.p314xaae8f345.mm.vfs.w6.i(str, false) + "_tmp";
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str2));
            ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(com.p314xaae8f345.mm.vfs.w6.i(str, false), str2, 2);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str2, context, null);
        } else if (C == 5) {
            java.lang.String str3 = com.p314xaae8f345.mm.vfs.w6.i(str, false) + "_tmp";
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str3));
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(com.p314xaae8f345.mm.p786x600aa8b.e.c(com.p314xaae8f345.mm.vfs.w6.i(str, false)), 100, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsUtil", "fail to convert image to jpeg, exception:" + e17);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str3, context, null);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str, context, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveImageToAlbum", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }
}
