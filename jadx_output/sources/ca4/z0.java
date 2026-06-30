package ca4;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static android.os.Vibrator f40068a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f40069b = 3200;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f40070c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f40071d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f40072e = "";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f40073f = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);

    public static java.lang.String A(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullStrSeq", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        while (stringBuffer.length() < 25) {
            stringBuffer.insert(0, "0");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullStrSeq", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return stringBuffer2;
    }

    public static void A0(android.view.View view, android.content.Context context) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scaleImageView", "com.tencent.mm.plugin.sns.data.SnsUtil");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleImageView", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static android.graphics.Rect B(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rect;
    }

    public static void B0(android.view.View view, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLineHeight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (!(view instanceof android.widget.TextView) || f17 == 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLineHeight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        float textSize = textView.getTextSize() * f17;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        textView.setLineSpacing(textSize - (fontMetricsInt.descent - fontMetricsInt.ascent), 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLineHeight", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static int C(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i17 = 4;
        int i18 = 0;
        try {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
            if (n07 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                java.lang.String str2 = n07.outMimeType;
                if (str2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else {
                    java.lang.String lowerCase = str2.toLowerCase();
                    if (lowerCase.indexOf("png") >= 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        i18 = 1;
                    } else {
                        if (lowerCase.indexOf("jpg") < 0 && lowerCase.indexOf("jpeg") < 0) {
                            if (lowerCase.indexOf("wxam") >= 0) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                i18 = 4;
                            } else if (lowerCase.indexOf("vcodec") >= 0) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                i18 = 5;
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        i18 = 2;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        if (str.indexOf("png") >= 0) {
            i17 = 1;
        } else if (str.indexOf("jpg") >= 0 || str.indexOf("jpeg") >= 0) {
            i17 = 2;
        } else if (str.indexOf("mp3") >= 0) {
            i17 = 3;
        } else if (str.indexOf("wxam") < 0) {
            if (str.indexOf("vcodec") >= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return 5;
            }
            i17 = i18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i17;
    }

    public static void C0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        f40072e += str + ";";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0157, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f248576en, 0) == 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0127, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f248576en, 0) == 0) goto L192;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence D(com.tencent.mm.protocal.protobuf.TimeLineObject r16, android.content.Context r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.D(com.tencent.mm.protocal.protobuf.TimeLineObject, android.content.Context, java.util.Map):java.lang.CharSequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x05ab, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f248576en, r6) == 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x057c, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.f248576en, r6) == 0) goto L196;
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
    /* JADX WARN: Type inference failed for: r6v5, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.sns.ui.ns D0(com.tencent.mm.plugin.sns.storage.SnsInfo r38, com.tencent.mm.protocal.protobuf.SnsObject r39, android.content.Context r40, com.tencent.mm.plugin.sns.ui.bs r41, boolean r42, com.tencent.mm.storage.e8 r43, java.lang.String r44, java.util.Map r45, java.util.Map r46, java.util.List r47) {
        /*
            Method dump skipped, instructions count: 2540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.D0(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.protocal.protobuf.SnsObject, android.content.Context, com.tencent.mm.plugin.sns.ui.bs, boolean, com.tencent.mm.storage.e8, java.lang.String, java.util.Map, java.util.Map, java.util.List):com.tencent.mm.plugin.sns.ui.ns");
    }

    public static int E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNetType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i17 = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 3 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 4 : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 2 : com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 5 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNetType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i17;
    }

    public static boolean E0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        boolean contains = str.toLowerCase().contains(str2.toLowerCase());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return contains;
    }

    public static android.graphics.Rect F(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRectSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        android.graphics.Rect rect = new android.graphics.Rect(bitmap.getWidth() / 4, 0, (int) ((r2 * 3) / 4.0d), bitmap.getHeight());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRectSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rect;
    }

    public static long F0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
        long j17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 0L;
        }
        try {
            j17 = new java.math.BigInteger(str).longValue();
        } catch (java.lang.NumberFormatException | java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return j17;
    }

    public static java.lang.String G(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = i17 + "-" + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static boolean G0(r45.mj4 mj4Var) {
        r45.mj4 mj4Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadInfoIsUploadError", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z17 = true;
        if (mj4Var.f380570n != 1 && ((mj4Var2 = mj4Var.D) == null || mj4Var2.f380570n != 1)) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadInfoIsUploadError", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static int H(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i17 == 1 || i17 == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 5;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 8;
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 9;
        }
        if (i17 == 4 || i17 == 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return 0;
    }

    public static boolean H0(r45.mj4 mj4Var) {
        r45.mj4 mj4Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadInfoIsUploadFinish", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z17 = mj4Var.f380570n == 0 && ((mj4Var2 = mj4Var.D) == null || mj4Var2.f380570n == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadInfoIsUploadFinish", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static java.lang.String I(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sightad_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str, jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static void I0(long[] jArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("vibrate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (f40068a == null) {
                f40068a = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
            }
            f40068a.vibrate(jArr, -1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUtil", e17, "vibrate error!", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("vibrate", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String J(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsb_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String K(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBigNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "snsb_" + s(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBigNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String L(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsblurs_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String M(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsblurt_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String N(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsHdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snshd_" + s(jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsHdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String O(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserUIPhotoComposing", "com.tencent.mm.plugin.sns.ui.config.SnsUserUIConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_user_photo_composing, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserUIPhotoComposing", "com.tencent.mm.plugin.sns.ui.config.SnsUserUIConfig");
        if (list == null || list.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
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
            str = str + jj4Var.f377855d;
            i17++;
            if (i17 >= 9) {
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static int P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("sns_respone_count", 20);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i17;
    }

    public static int Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i17 == 1 || i17 == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 5;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 7;
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 9;
        }
        if (i17 == 4 || i17 == 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return 0;
    }

    public static java.lang.String R(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sight_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static int S(java.lang.String str) {
        gp.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "getSnsSightVideoDurationInSeconds, path: %s", str);
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int V1 = com.tencent.mm.sdk.platformtools.t8.V1(com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0));
                try {
                    dVar.release();
                } catch (java.io.IOException unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return V1;
            } catch (java.lang.Throwable unused2) {
                try {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "getSnsSightVideoDurationInSeconds error: %s", str);
                    return 0;
                } finally {
                    if (dVar != null) {
                        try {
                            dVar.release();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsSightVideoDurationInSeconds", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
            }
        } catch (java.lang.Throwable unused4) {
            dVar = null;
        }
    }

    public static java.lang.String T(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStringId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String t07 = snsInfo == null ? "0" : t0(snsInfo.field_snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStringId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return t07;
    }

    public static java.lang.String U(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snst_" + s(jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String V(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsThumbNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "snst_" + s(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsThumbNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String W(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sns_tmpb_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String X(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpBigWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_tmpb_" + s(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpBigWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String Y(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sns_tmps_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String Z(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpSightWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_tmps_" + s(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpSightWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static void a(android.content.Intent intent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (intent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "appendAdGetA8KeySceneExtra, scene=" + i17);
            intent.putExtra("geta8key_scene", i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String a0(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "sns_tmpt_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "appendAdUxInfo empty:" + str + ", " + str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        try {
            str3 = java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "appendAdUxInfo exp:" + e17.toString() + ", " + str2);
            str3 = "";
        }
        java.lang.String d17 = d(str, "uxinfo", str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "appendAdUxInfo, ret=" + d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return d17;
    }

    public static java.lang.String b0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpThumbWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_tmpt_" + s(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpThumbWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static void c(android.content.Intent intent, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "appendAdUxInfoForAdPay, intent==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        intent.putExtra("ad_ux_info_for_jsapi_pay", str == null ? "" : str);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "appendAdUxInfoForAdPay, uxInfo=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String c0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpUserWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "snsu_" + s(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpUserWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
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
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str7;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "appendUrlParams exp:" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
    }

    public static java.lang.String d0(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUhdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsuhd_" + s(jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUhdName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUrlParamsWithUrlEncode", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str4 = "";
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str4 = java.net.URLEncoder.encode(str3 == null ? "" : str3, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "appendUrlParamsWithUrlEncode exp:" + e17.toString() + ", " + str3);
        }
        java.lang.String d17 = d(str, str2, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlParamsWithUrlEncode", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return d17;
    }

    public static java.lang.String e0(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = "snsu_" + s(jj4Var.f377855d);
        if (jj4Var.D != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        java.lang.String a17 = l21.c.a(str + f0(jj4Var), jj4Var.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static boolean f(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    public static java.lang.String f0(r45.jj4 jj4Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.F)) {
            java.lang.String str2 = jj4Var.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str2;
        }
        try {
            str = kk.k.g(jj4Var.toByteArray());
        } catch (java.lang.Exception unused) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static boolean g(com.tencent.mm.memory.r rVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (rVar == null || rVar.e()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    public static boolean g0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAccessibilityEnable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        boolean z17 = accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAccessibilityEnable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static java.lang.String h(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCameraEntranceSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = gm0.j1.b().j() + "_" + j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCameraEntranceSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r6.ContentObj.f369839g.contains("support.weixin.qq.com") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h0(com.tencent.mm.protocal.protobuf.TimeLineObject r6) {
        /*
            java.lang.String r0 = "isBiz"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = r6.publicUserName
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L3f
            r45.a90 r2 = r6.ContentObj
            int r3 = r2.f369837e
            r4 = 47
            if (r3 == r4) goto L3f
            int r3 = r6.publicBrandContactType
            r4 = 1
            if (r3 == r4) goto L40
            r5 = 2
            if (r3 == r5) goto L40
            r5 = 6
            if (r3 != r5) goto L24
            goto L40
        L24:
            java.lang.String r2 = r2.f369839g
            if (r2 == 0) goto L3f
            java.lang.String r3 = "mp.weixin.qq.com"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L40
            r45.a90 r6 = r6.ContentObj
            java.lang.String r6 = r6.f369839g
            java.lang.String r2 = "support.weixin.qq.com"
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.h0(com.tencent.mm.protocal.protobuf.TimeLineObject):boolean");
    }

    public static java.lang.String i(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSnsCopyReportData", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "<WCTimelineReportData><msgsource><cf>" + i17 + "</cf><inlenlist>" + str + "</inlenlist></msgsource></WCTimelineReportData>";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSnsCopyReportData", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static boolean i0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        r45.y8 y8Var = timeLineObject.AppInfo;
        if (y8Var != null && y8Var.f390852m != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        java.lang.String str = timeLineObject.ContentObj.f369839g;
        if (!android.text.TextUtils.isEmpty(str) && str.contains("mp.weixin.qq.com")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.publicUserName)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        boolean z17 = (com.tencent.mm.plugin.sns.model.d6.k() & 2) <= 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static android.graphics.Bitmap j(java.lang.String str, android.graphics.Bitmap bitmap) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (bitmap == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf > 0 && (i17 = lastIndexOf + 1) < str.length()) {
                java.lang.String substring = str.substring(i17);
                if (substring.startsWith("snsb") || substring.startsWith("sns_tmpb_")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    str2 = str;
                } else if (substring.startsWith("snst_") || substring.startsWith("snsu_")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
            str2 = str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return bitmap;
        }
        int i18 = 0;
        try {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "[changes below by tomys]parsing jpg, path: %s, size: %s", str, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
                com.tencent.mm.compatible.util.Exif fromFile = com.tencent.mm.compatible.util.Exif.fromFile(str);
                if (fromFile != null) {
                    i18 = fromFile.getOrientationInDegree() % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUtil", e17, "Failed parsing JPEG file: ".concat(str2), new java.lang.Object[0]);
            }
            return com.tencent.mm.sdk.platformtools.x.w0(bitmap, i18);
        } finally {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
    }

    public static boolean j0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHasSdcard", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean startsWith = str.startsWith(lp0.b.e0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHasSdcard", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return startsWith;
    }

    public static boolean k(java.util.LinkedList linkedList, int i17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.util.Iterator it = linkedList.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return false;
            }
            android.util.Pair pair = (android.util.Pair) it.next();
            int intValue = ((java.lang.Integer) pair.first).intValue();
            int intValue2 = ((java.lang.Integer) pair.second).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (intValue >= intValue2) {
                if (i17 <= 1440 && i17 >= intValue) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else if (i17 >= intValue2 || i17 < 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
                z17 = true;
            } else if (i17 >= intValue2 || i17 < intValue) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                z17 = true;
            }
        } while (!z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    public static boolean k0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.sdk.platformtools.x.J(str, options);
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            if (i18 >= i17 * 2 || i17 >= i18 * 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPic", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
    }

    public static java.lang.String l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(f40070c)) {
            f40070c = h(c01.id.c());
        }
        java.lang.String str = f40070c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static boolean l0(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isModeTall", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        int i17 = a17.f197136b;
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isModeTall", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        boolean z17 = (((float) a17.f197135a) * 1.0f) / ((float) i17) <= 0.5625f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isModeTall", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        f40070c = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static boolean m0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPhotoAccount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z17 = false;
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhotoAccount", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
        java.lang.String str = timeLineObject.publicPhotoAccountUserName;
        ((ox.g) oVar).getClass();
        if (com.tencent.mm.storage.z3.F3(str) && ((ox.g) oVar).Ri()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhotoAccount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z17;
    }

    public static com.tencent.mm.memory.r n(java.lang.String str) {
        com.tencent.mm.memory.r d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return null;
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            boolean z17 = com.tencent.mm.sdk.platformtools.x.f193064a;
            options.inSampleSize = 1;
            while (true) {
                int i17 = options.inSampleSize;
                if (i17 > 10) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return null;
                }
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "decodeFileToBitmap %s", java.lang.Integer.valueOf(i17));
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    d17 = r94.a.d(str, options);
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (d17 == null) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.statistics.r.d(str, elapsedRealtime2);
                    break;
                } catch (java.lang.OutOfMemoryError unused) {
                    options.inSampleSize++;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return d17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUtil", e17, "snsdecode error", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
    }

    public static boolean n0(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (e86Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373134o)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return false;
    }

    public static com.tencent.mm.memory.r p(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "decodeFileToBlurThumbBitmap " + com.tencent.mm.vfs.w6.j(str));
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return null;
            }
            com.tencent.mm.memory.r n17 = n(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return n17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUtil", e17, "snsdecode error", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
    }

    public static void p0(android.content.Context context, java.lang.String _appUsername, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpHalfWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String c17 = !com.tencent.mm.sdk.platformtools.t8.K0(str) ? za4.z0.c(str, java.lang.String.format("gdt_vid=%s", str4), java.lang.String.format("weixinadinfo=%s.%s.0.0", str3, str4)) : str;
        zy2.r7 r7Var = (zy2.r7) i95.n0.c(zy2.r7.class);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ((j40.p) r7Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(_appUsername, "_appUsername");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo = new com.tencent.mm.protocal.protobuf.MiniAppInfo();
        miniAppInfo.setApp_id("");
        miniAppInfo.setPath(c17);
        miniAppInfo.setFetch_info_id("");
        miniAppInfo.setRequest_id("");
        miniAppInfo.setAppusername(_appUsername);
        byte[] bytes = "".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        miniAppInfo.setExtra_data(new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
        miniAppInfo.setScene(valueOf != null ? valueOf.intValue() : 0);
        finderJumpInfo.setMini_app_info(miniAppInfo);
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453251m = new l81.b1();
        p0Var.f453250l = str5;
        xc2.y2.P(xc2.y2.f453343a, context, p0Var, 0, true, null, 0.75f, 20, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "jumpHalfWeApp userName=" + _appUsername + ", path=" + c17 + ", ver=" + str2 + ", scene=" + i17 + ", uxinfo=" + str6 + ", sceneNode=" + str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpHalfWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static void q(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAdListScroll", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.autogen.events.SnsAdListScrollEvent snsAdListScrollEvent = new com.tencent.mm.autogen.events.SnsAdListScrollEvent();
        snsAdListScrollEvent.f54793g.f6290a = z17;
        snsAdListScrollEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdListScroll", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static void q0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "jumpWeApp, use MMApplicationContext");
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = za4.z0.c(str2, java.lang.String.format("gdt_vid=%s", str5), java.lang.String.format("weixinadinfo=%s.%s.0.0", str4, str5));
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317034l = str6;
        b1Var.f317012a = str;
        b1Var.f317018d = com.tencent.mm.sdk.platformtools.t8.D1(str3, 0);
        b1Var.f317022f = str2;
        b1Var.f317032k = i17;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        b1Var.f317030j = persistableBundle;
        persistableBundle.putString("adUxInfo", str7);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtil", "jumpWeApp userName=" + str + ", path=" + str2 + ", ver=" + str3 + ", scene=" + i17 + ", uxinfo=" + str7 + ", sceneNode=" + str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static android.text.SpannableString r(java.lang.String str, android.content.Context context, android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = (int) textView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString spannableString = new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.h(context, "<img src=\"original_label.png\"/>  " + str, (int) textSize, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return spannableString;
    }

    public static void r0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        q0(null, str, str2, str3, str4, str5, str6, str7, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String s(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        int length = str.length();
        int i17 = 0;
        while (i17 < length && str.charAt(i17) == '0') {
            i17++;
        }
        java.lang.String substring = str.substring(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return substring;
    }

    public static java.lang.String s0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String A = A(new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return A;
    }

    public static java.lang.String t(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatTimeSecondToDate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String format = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date(j17 * 1000));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatTimeSecondToDate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return format;
    }

    public static java.lang.String t0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("longToString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w0.a(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longToString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return a17;
    }

    public static void u(r45.e86 e86Var, java.lang.CharSequence charSequence, com.tencent.mm.plugin.sns.ui.ns nsVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCompressedComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (com.tencent.mm.plugin.sns.model.j4.f() <= 0) {
            nsVar.f170031d.f(e86Var, charSequence);
        } else if (charSequence instanceof android.text.SpannableStringBuilder) {
            nsVar.f170031d.f(e86Var, com.tencent.mm.plugin.sns.ui.widget.t2.c((android.text.SpannableStringBuilder) charSequence));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCompressedComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
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

    public static java.lang.String v(com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (v1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        long j17 = v1Var.field_parentID;
        java.lang.String t07 = j17 == 0 ? t0(v1Var.field_snsID) : t0(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return t07;
    }

    public static java.lang.String v0(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (charSequence == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        com.tencent.mm.pluginsdk.ui.span.d1[] d1VarArr = (com.tencent.mm.pluginsdk.ui.span.d1[]) spannableString.getSpans(0, spannableString.length(), com.tencent.mm.pluginsdk.ui.span.d1.class);
        int length = d1VarArr.length;
        for (com.tencent.mm.pluginsdk.ui.span.d1 d1Var : d1VarArr) {
            spannableString.removeSpan(d1Var);
        }
        java.lang.String spannableString2 = spannableString.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return spannableString2;
    }

    public static java.lang.String w(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBatchDownloadKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = i17 + "_" + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBatchDownloadKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w0(com.tencent.mm.plugin.sns.ui.ns r25, com.tencent.mm.plugin.sns.ui.bs r26, android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.z0.w0(com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.plugin.sns.ui.bs, android.content.Context):void");
    }

    public static java.lang.String x(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = i17 + "-" + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    public static void x0(com.tencent.mm.modelsns.SnsAdClick snsAdClick) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdClick", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.autogen.events.ReportAdClickEvent reportAdClickEvent = new com.tencent.mm.autogen.events.ReportAdClickEvent();
        reportAdClickEvent.f54680g.f8210a = snsAdClick;
        reportAdClickEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdClick", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    public static java.lang.String y(r45.e86 e86Var, com.tencent.mm.storage.e8 e8Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.storage.k4) e8Var).f0(e86Var.f373126d);
        if (f07 != null) {
            str = f07.g2();
        } else {
            java.lang.String str2 = e86Var.f373127e;
            str = str2 != null ? str2 : e86Var.f373126d;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    public static java.lang.String y0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String t07 = t0(snsInfo.field_snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return t07;
    }

    public static java.lang.String z(r45.kv2 kv2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (kv2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(kv2Var.getString(15))) {
            java.lang.String v17 = m21.y.v(kv2Var.getString(15));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return v17;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(kv2Var.getString(2))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        java.lang.String v18 = m21.y.v(kv2Var.getString(2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return v18;
    }

    public static void z0(java.lang.String str, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveImageToAlbum", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveImageToAlbum", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        int C = C(str);
        if (C == 4) {
            java.lang.String str2 = com.tencent.mm.vfs.w6.i(str, false) + "_tmp";
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str2));
            ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(com.tencent.mm.vfs.w6.i(str, false), str2, 2);
            com.tencent.mm.pluginsdk.ui.tools.l7.a(str2, context, null);
        } else if (C == 5) {
            java.lang.String str3 = com.tencent.mm.vfs.w6.i(str, false) + "_tmp";
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str3));
            try {
                com.tencent.mm.sdk.platformtools.x.D0(com.tencent.mm.graphics.e.c(com.tencent.mm.vfs.w6.i(str, false)), 100, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtil", "fail to convert image to jpeg, exception:" + e17);
            }
            com.tencent.mm.pluginsdk.ui.tools.l7.a(str3, context, null);
        } else {
            com.tencent.mm.pluginsdk.ui.tools.l7.a(str, context, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveImageToAlbum", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }
}
