package kz4;

/* loaded from: classes12.dex */
public class m implements android.text.Html.TagHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f395489c = java.util.regex.Pattern.compile("\\d+");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f395490d = java.util.regex.Pattern.compile("#[a-f0-9]+");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f395491e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Stack f395492a = new java.util.Stack();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f395493b = new java.util.HashMap();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f395491e = hashMap;
        hashMap.put("aqua", 65535);
        hashMap.put("black", 0);
        hashMap.put("blue", 255);
        hashMap.put("fuchsia", 16711935);
        hashMap.put("green", 32768);
        hashMap.put("grey", 8421504);
        hashMap.put("lime", 65280);
        hashMap.put("maroon", 8388608);
        hashMap.put("navy", 128);
        hashMap.put("olive", 8421376);
        hashMap.put("purple", 8388736);
        hashMap.put("red", 16711680);
        hashMap.put("silver", 12632256);
        hashMap.put("teal", 32896);
        hashMap.put("white", 16777215);
        hashMap.put("yellow", 16776960);
    }

    public static int b(java.lang.String str) {
        int i17;
        int i18;
        java.lang.Integer num = (java.lang.Integer) f395491e.get(str.toLowerCase());
        if (num != null) {
            return num.intValue();
        }
        try {
            java.lang.String str2 = str.toString();
            int length = str2.length();
            if ('-' == str2.charAt(0)) {
                i18 = -1;
                i17 = 1;
            } else {
                i17 = 0;
                i18 = 1;
            }
            int i19 = 16;
            if ('0' == str2.charAt(i17)) {
                if (i17 == length - 1) {
                    return 0;
                }
                int i27 = i17 + 1;
                char charAt = str2.charAt(i27);
                if ('x' != charAt && 'X' != charAt) {
                    i19 = 8;
                    i17 = i27;
                }
                i17 += 2;
            } else if ('#' == str2.charAt(i17)) {
                i17++;
            } else {
                i19 = 10;
            }
            return java.lang.Integer.parseInt(str2.substring(i17), i19) * i18;
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public static void d(android.text.Editable editable) {
        int length = editable.length();
        if ((length < 1 || editable.charAt(length - 1) != '\n') && length != 0) {
            editable.append("\n");
            editable.setSpan(kz4.f.f395482a, editable.length() - 1, editable.length(), 33);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if ((r2 == oz4.s.NOTEUL) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r2 == oz4.s.NOTEOL) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            java.util.Stack r0 = r6.f395492a
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r0.peek()
            oz4.a r1 = (oz4.a) r1
            oz4.s r2 = r1.f431805a
            r3 = 0
            r4 = 1
            if (r7 == 0) goto L20
            r2.getClass()
            oz4.s r5 = oz4.s.NOTEOL
            if (r2 != r5) goto L1d
            r5 = r4
            goto L1e
        L1d:
            r5 = r3
        L1e:
            if (r5 != 0) goto L34
        L20:
            if (r7 != 0) goto L2c
            r2.getClass()
            oz4.s r5 = oz4.s.NOTEUL
            if (r2 != r5) goto L2a
            r3 = r4
        L2a:
            if (r3 != 0) goto L34
        L2c:
            if (r7 != 0) goto L45
            boolean r2 = r2.h()
            if (r2 == 0) goto L45
        L34:
            int r7 = r1.f431807c
            if (r7 <= r4) goto L41
            int r7 = r7 - r4
            r1.f431807c = r7
            int r7 = r1.f431806b
            int r7 = r7 - r4
            r1.f431806b = r7
            goto L4b
        L41:
            r0.pop()
            goto L4b
        L45:
            r0.pop()
            r6.a(r7)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kz4.m.a(boolean):void");
    }

    public final java.lang.Object c(android.text.Editable editable, java.lang.Class cls) {
        java.lang.Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return spans[spans.length - 1];
    }

    public final void e(boolean z17, oz4.s sVar) {
        if (z17) {
            sVar = oz4.s.NOTEOL;
        }
        java.util.Stack stack = this.f395492a;
        oz4.a aVar = stack.isEmpty() ? null : (oz4.a) stack.peek();
        if (aVar == null) {
            stack.push(new oz4.a(sVar, 1, 1));
        } else if (aVar.f431805a != sVar) {
            stack.push(new oz4.a(sVar, aVar.f431806b + 1, 1));
        } else {
            aVar.f431806b++;
            aVar.f431807c++;
        }
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z17, java.lang.String str, android.text.Editable editable, org.xml.sax.XMLReader xMLReader) {
        int b17;
        int b18;
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashMap hashMap = this.f395493b;
        hashMap.clear();
        try {
            java.lang.reflect.Field declaredField = xMLReader.getClass().getDeclaredField("theNewElement");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(xMLReader);
            java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("theAtts");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.reflect.Field declaredField3 = obj2.getClass().getDeclaredField(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            declaredField3.setAccessible(true);
            java.lang.String[] strArr = (java.lang.String[]) declaredField3.get(obj2);
            java.lang.reflect.Field declaredField4 = obj2.getClass().getDeclaredField("length");
            declaredField4.setAccessible(true);
            int intValue = ((java.lang.Integer) declaredField4.get(obj2)).intValue();
            for (int i17 = 0; i17 < intValue; i17++) {
                int i18 = i17 * 5;
                hashMap.put(strArr[i18 + 1], strArr[i18 + 4]);
            }
        } catch (java.lang.Exception unused) {
        }
        if (z17) {
            boolean equalsIgnoreCase = str.equalsIgnoreCase("wx-ul");
            oz4.s sVar = oz4.s.NOTEUL;
            if (equalsIgnoreCase) {
                e(false, sVar);
            } else {
                boolean equalsIgnoreCase2 = str.equalsIgnoreCase("wx-ol");
                oz4.s sVar2 = oz4.s.NOTEOL;
                if (equalsIgnoreCase2) {
                    e(true, sVar2);
                } else {
                    boolean equalsIgnoreCase3 = str.equalsIgnoreCase("wn-todo");
                    java.util.Stack stack = this.f395492a;
                    if (equalsIgnoreCase3) {
                        stack.push(new oz4.a(oz4.s.NOTETODO, 1, 1));
                        java.lang.String str4 = (java.lang.String) hashMap.get("checked");
                        java.lang.Object kVar = new kz4.k(((oz4.a) stack.peek()).f431806b, false, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && str4.equals("1"));
                        int length = editable.length();
                        editable.setSpan(kVar, length, length, 17);
                    } else {
                        java.lang.Object obj3 = null;
                        if (str.equalsIgnoreCase("wx-li")) {
                            java.lang.String str5 = (java.lang.String) hashMap.get("done");
                            boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && str5.equals("true");
                            if (stack.isEmpty()) {
                                obj3 = new kz4.l(0, false);
                            } else {
                                oz4.a aVar = (oz4.a) stack.peek();
                                oz4.s sVar3 = aVar.f431805a;
                                int i19 = aVar.f431806b;
                                sVar3.getClass();
                                if (sVar3 == sVar2) {
                                    obj3 = new kz4.j(i19, false);
                                } else if (sVar3 == sVar) {
                                    obj3 = new kz4.l(i19, false);
                                } else if (sVar3.h()) {
                                    obj3 = new kz4.k(i19, false, z18);
                                }
                            }
                            if (obj3 != null) {
                                int length2 = editable.length();
                                editable.setSpan(obj3, length2, length2, 17);
                            }
                        } else if (str.equalsIgnoreCase("wx-font") || str.equalsIgnoreCase("span")) {
                            java.lang.String str6 = (java.lang.String) hashMap.get("style");
                            int i27 = Integer.MIN_VALUE;
                            if (str6 != null) {
                                str2 = null;
                                str3 = null;
                                for (java.lang.String str7 : str6.toLowerCase(java.util.Locale.ENGLISH).split(";")) {
                                    if (str7.startsWith("font-size")) {
                                        java.util.regex.Matcher matcher = f395489c.matcher(str7);
                                        if (matcher.find(0)) {
                                            try {
                                                i27 = java.lang.Integer.parseInt(str7.substring(matcher.start(), matcher.end()));
                                            } catch (java.lang.NumberFormatException unused2) {
                                            }
                                        }
                                    } else {
                                        boolean startsWith = str7.startsWith("color");
                                        java.util.regex.Pattern pattern = f395490d;
                                        if (startsWith) {
                                            java.util.regex.Matcher matcher2 = pattern.matcher(str7);
                                            if (matcher2.find(0)) {
                                                str2 = str7.substring(matcher2.start(), matcher2.end());
                                            }
                                        } else if (str7.startsWith("background-color")) {
                                            java.util.regex.Matcher matcher3 = pattern.matcher(str7);
                                            if (matcher3.find(0)) {
                                                str3 = str7.substring(matcher3.start(), matcher3.end());
                                            }
                                        }
                                    }
                                }
                            } else {
                                str2 = null;
                                str3 = null;
                            }
                            java.lang.String str8 = (java.lang.String) hashMap.get("face");
                            int length3 = editable.length();
                            kz4.g gVar = new kz4.g(null);
                            gVar.f395483a = i27;
                            gVar.f395484b = str2;
                            gVar.f395485c = str3;
                            gVar.f395486d = str8;
                            editable.setSpan(gVar, length3, length3, 17);
                        } else if (str.equalsIgnoreCase("wx-b")) {
                            java.lang.Object eVar = new kz4.e(null);
                            int length4 = editable.length();
                            editable.setSpan(eVar, length4, length4, 17);
                        } else if (str.equalsIgnoreCase("wx-mark")) {
                            java.lang.Object hVar = new kz4.h(null);
                            int length5 = editable.length();
                            editable.setSpan(hVar, length5, length5, 17);
                        } else if (str.equalsIgnoreCase("wx-p")) {
                            d(editable);
                        } else if (str.equalsIgnoreCase("wx-div")) {
                            d(editable);
                        }
                    }
                }
            }
        } else {
            if (str.equalsIgnoreCase("wx-ul")) {
                a(false);
            } else if (str.equalsIgnoreCase("wx-ol")) {
                a(true);
            } else if (str.equalsIgnoreCase("wn-todo")) {
                kz4.i iVar = (kz4.i) c(editable, kz4.i.class);
                if (iVar != null) {
                    if (editable.length() == 0 || editable.charAt(editable.length() - 1) != '\n') {
                        editable.append('\n');
                    }
                    int spanStart = editable.getSpanStart(iVar);
                    int length6 = editable.length();
                    if (!iVar.f395487a) {
                        editable.setSpan(new oz4.l(((kz4.k) iVar).f395488b, mz4.b.b(), spanStart == length6, false, false), spanStart, length6, 33);
                    }
                    editable.removeSpan(iVar);
                }
            } else if (str.equalsIgnoreCase("wx-li")) {
                kz4.i iVar2 = (kz4.i) c(editable, kz4.i.class);
                if (iVar2 != null) {
                    if (editable.length() == 0 || editable.charAt(editable.length() - 1) != '\n') {
                        editable.append('\n');
                    }
                    int spanStart2 = editable.getSpanStart(iVar2);
                    int length7 = editable.length();
                    if (!iVar2.f395487a) {
                        int b19 = mz4.b.b();
                        editable.setSpan(iVar2 instanceof kz4.j ? new oz4.n(1, b19, spanStart2 == length7, false, false) : new oz4.d(b19, spanStart2 == length7, false, false), spanStart2, length7, 33);
                    }
                    editable.removeSpan(iVar2);
                }
            } else if (str.equalsIgnoreCase("wx-font") || str.equalsIgnoreCase("span")) {
                int length8 = editable.length();
                java.lang.Object c17 = c(editable, kz4.g.class);
                if (c17 != null) {
                    int spanStart3 = editable.getSpanStart(c17);
                    editable.removeSpan(c17);
                    if (spanStart3 != length8) {
                        kz4.g gVar2 = (kz4.g) c17;
                        if (!android.text.TextUtils.isEmpty(gVar2.f395486d)) {
                            editable.setSpan(new android.text.style.TypefaceSpan(gVar2.f395486d), spanStart3, length8, 33);
                        }
                        int i28 = gVar2.f395483a;
                        if (i28 > 0) {
                            editable.setSpan(new android.text.style.AbsoluteSizeSpan(java.lang.Math.round(i28 * mz4.b.a())), spanStart3, length8, 33);
                        }
                        if ((!android.text.TextUtils.isEmpty(gVar2.f395484b)) && (b18 = b(gVar2.f395484b)) != -1) {
                            editable.setSpan(new android.text.style.ForegroundColorSpan(b18 | (-16777216)), spanStart3, length8, 33);
                        }
                        if ((!android.text.TextUtils.isEmpty(gVar2.f395485c)) && (b17 = b(gVar2.f395485c)) != -1) {
                            editable.setSpan(new android.text.style.BackgroundColorSpan(b17 | (-16777216)), spanStart3, length8, 33);
                        }
                    }
                }
            } else if (str.equalsIgnoreCase("wx-b")) {
                java.lang.Object c19516x75d53f8f = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19516x75d53f8f();
                int length9 = editable.length();
                java.lang.Object c18 = c(editable, kz4.e.class);
                int spanStart4 = editable.getSpanStart(c18);
                editable.removeSpan(c18);
                if (spanStart4 != length9) {
                    editable.setSpan(c19516x75d53f8f, spanStart4, length9, 33);
                }
            } else if (str.equalsIgnoreCase("wx-mark")) {
                java.lang.Object c19517x8b6eadfe = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19517x8b6eadfe();
                int length10 = editable.length();
                java.lang.Object c19 = c(editable, kz4.h.class);
                int spanStart5 = editable.getSpanStart(c19);
                editable.removeSpan(c19);
                if (spanStart5 != length10) {
                    editable.setSpan(c19517x8b6eadfe, spanStart5, length10, 33);
                }
            } else if (str.equalsIgnoreCase("wx-p")) {
                d(editable);
            } else {
                str.equalsIgnoreCase("wx-div");
            }
            hashMap.clear();
        }
        kz4.a.f395480b = editable;
    }
}
