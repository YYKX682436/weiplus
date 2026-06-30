package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b;

/* renamed from: com.tencent.tinker.loader.hotplug.IncrementComponentManager */
/* loaded from: classes13.dex */
public final class C26618xe516d55f {
    private static final java.lang.String TAG = "Tinker.IncrementCompMgr";

    /* renamed from: TAG_ACTIVITY */
    private static final int f55573xe6111a34 = 0;

    /* renamed from: TAG_PROVIDER */
    private static final int f55574xde92d16 = 2;

    /* renamed from: TAG_RECEIVER */
    private static final int f55575x18911114 = 3;

    /* renamed from: TAG_SERVICE */
    private static final int f55576x2e4a22d0 = 1;

    /* renamed from: sContext */
    private static android.content.Context f55577x4616f5bc;

    /* renamed from: sInitialized */
    private static volatile boolean f55578x21c49861;

    /* renamed from: sPackageName */
    private static java.lang.String f55579xe61817e;

    /* renamed from: CLASS_NAME_TO_ACTIVITY_INFO_MAP */
    private static final java.util.Map<java.lang.String, android.content.pm.ActivityInfo> f55571x3158b1a4 = new java.util.HashMap();

    /* renamed from: CLASS_NAME_TO_INTENT_FILTER_MAP */
    private static final java.util.Map<java.lang.String, android.content.IntentFilter> f55572xbafc01c1 = new java.util.HashMap();

    /* renamed from: ACTIVITY_INFO_ATTR_TRANSLATOR */
    private static final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.AttrTranslator<android.content.pm.ActivityInfo> f55570x96ca56c7 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.AttrTranslator<android.content.pm.ActivityInfo>() { // from class: com.tencent.tinker.loader.hotplug.IncrementComponentManager.1
        /* renamed from: parseLaunchMode */
        private int m104576xe5c93309(java.lang.String str) {
            if ("standard".equalsIgnoreCase(str)) {
                return 0;
            }
            if ("singleTop".equalsIgnoreCase(str)) {
                return 1;
            }
            if ("singleTask".equalsIgnoreCase(str)) {
                return 2;
            }
            if ("singleInstance".equalsIgnoreCase(str)) {
                return 3;
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.TAG, "Unknown launchMode: " + str, new java.lang.Object[0]);
            return 0;
        }

        /* renamed from: parseScreenOrientation */
        private int m104577xaff52351(java.lang.String str) {
            if ("unspecified".equalsIgnoreCase(str)) {
                return -1;
            }
            if ("behind".equalsIgnoreCase(str)) {
                return 3;
            }
            if ("landscape".equalsIgnoreCase(str)) {
                return 0;
            }
            if ("portrait".equalsIgnoreCase(str)) {
                return 1;
            }
            if ("reverseLandscape".equalsIgnoreCase(str)) {
                return 8;
            }
            if ("reversePortrait".equalsIgnoreCase(str)) {
                return 9;
            }
            if ("sensorLandscape".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("sensorPortrait".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("sensor".equalsIgnoreCase(str)) {
                return 4;
            }
            if ("fullSensor".equalsIgnoreCase(str)) {
                return 10;
            }
            if ("nosensor".equalsIgnoreCase(str)) {
                return 5;
            }
            if ("user".equalsIgnoreCase(str)) {
                return 2;
            }
            if ("fullUser".equalsIgnoreCase(str)) {
                return 13;
            }
            if ("locked".equalsIgnoreCase(str)) {
                return 14;
            }
            if ("userLandscape".equalsIgnoreCase(str)) {
                return 11;
            }
            return "userPortrait".equalsIgnoreCase(str) ? 12 : -1;
        }

        @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.AttrTranslator
        /* renamed from: onInit */
        public void mo104578xc39adf8f(android.content.Context context, int i17, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            if (i17 == 0) {
                try {
                    if (xmlPullParser.getEventType() == 2 && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100.equals(xmlPullParser.getName())) {
                    } else {
                        throw new java.lang.IllegalStateException("unexpected xml parser state when parsing incremental component manifest.");
                    }
                } catch (org.xmlpull.v1.XmlPullParserException e17) {
                    throw new java.lang.IllegalStateException(e17);
                }
            }
        }

        @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.AttrTranslator
        /* renamed from: onTranslate, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo104579x3ceb2e2f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, android.content.pm.ActivityInfo activityInfo) {
            int i18 = 0;
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d.equals(str)) {
                if (str2.charAt(0) == '.') {
                    activityInfo.name = context.getPackageName() + str2;
                    return;
                }
                activityInfo.name = str2;
                return;
            }
            if ("parentActivityName".equals(str)) {
                if (str2.charAt(0) == '.') {
                    activityInfo.parentActivityName = context.getPackageName() + str2;
                    return;
                }
                activityInfo.parentActivityName = str2;
                return;
            }
            if ("exported".equals(str)) {
                activityInfo.exported = "true".equalsIgnoreCase(str2);
                return;
            }
            if ("launchMode".equals(str)) {
                activityInfo.launchMode = m104576xe5c93309(str2);
                return;
            }
            if ("theme".equals(str)) {
                activityInfo.theme = context.getResources().getIdentifier(str2, "style", context.getPackageName());
                return;
            }
            if ("uiOptions".equals(str)) {
                activityInfo.uiOptions = java.lang.Integer.decode(str2).intValue();
                return;
            }
            if ("permission".equals(str)) {
                activityInfo.permission = str2;
                return;
            }
            if ("taskAffinity".equals(str)) {
                activityInfo.taskAffinity = str2;
                return;
            }
            if ("multiprocess".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 1;
                    return;
                } else {
                    activityInfo.flags &= -2;
                    return;
                }
            }
            if ("finishOnTaskLaunch".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 2;
                    return;
                } else {
                    activityInfo.flags &= -3;
                    return;
                }
            }
            if ("clearTaskOnLaunch".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 4;
                    return;
                } else {
                    activityInfo.flags &= -5;
                    return;
                }
            }
            if ("noHistory".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 128;
                    return;
                } else {
                    activityInfo.flags &= -129;
                    return;
                }
            }
            if ("alwaysRetainTaskState".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 8;
                    return;
                } else {
                    activityInfo.flags &= -9;
                    return;
                }
            }
            if ("stateNotNeeded".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 16;
                    return;
                } else {
                    activityInfo.flags &= -17;
                    return;
                }
            }
            if ("excludeFromRecents".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 32;
                    return;
                } else {
                    activityInfo.flags &= -33;
                    return;
                }
            }
            if ("allowTaskReparenting".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 64;
                    return;
                } else {
                    activityInfo.flags &= -65;
                    return;
                }
            }
            if ("finishOnCloseSystemDialogs".equals(str)) {
                if ("true".equalsIgnoreCase(str2)) {
                    activityInfo.flags |= 256;
                    return;
                } else {
                    activityInfo.flags &= -257;
                    return;
                }
            }
            if (!"showOnLockScreen".equals(str) && !"showForAllUsers".equals(str)) {
                if ("immersive".equals(str)) {
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags |= 2048;
                        return;
                    } else {
                        activityInfo.flags &= -2049;
                        return;
                    }
                }
                if ("hardwareAccelerated".equals(str)) {
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags |= 512;
                        return;
                    } else {
                        activityInfo.flags &= -513;
                        return;
                    }
                }
                if ("documentLaunchMode".equals(str)) {
                    activityInfo.documentLaunchMode = java.lang.Integer.decode(str2).intValue();
                    return;
                }
                if ("maxRecents".equals(str)) {
                    activityInfo.maxRecents = java.lang.Integer.decode(str2).intValue();
                    return;
                }
                if ("configChanges".equals(str)) {
                    activityInfo.configChanges = java.lang.Integer.decode(str2).intValue();
                    return;
                }
                if ("windowSoftInputMode".equals(str)) {
                    activityInfo.softInputMode = java.lang.Integer.decode(str2).intValue();
                    return;
                }
                if ("persistableMode".equals(str)) {
                    activityInfo.persistableMode = java.lang.Integer.decode(str2).intValue();
                    return;
                }
                if ("allowEmbedded".equals(str)) {
                    int m104707xd270966b = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104707xd270966b(android.content.pm.ActivityInfo.class, "FLAG_ALLOW_EMBEDDED", 0);
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags = m104707xd270966b | activityInfo.flags;
                        return;
                    } else {
                        activityInfo.flags = (~m104707xd270966b) & activityInfo.flags;
                        return;
                    }
                }
                if ("autoRemoveFromRecents".equals(str)) {
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags |= 8192;
                        return;
                    } else {
                        activityInfo.flags &= -8193;
                        return;
                    }
                }
                if ("relinquishTaskIdentity".equals(str)) {
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags |= 4096;
                        return;
                    } else {
                        activityInfo.flags &= -4097;
                        return;
                    }
                }
                if ("resumeWhilePausing".equals(str)) {
                    if ("true".equalsIgnoreCase(str2)) {
                        activityInfo.flags |= 16384;
                        return;
                    } else {
                        activityInfo.flags &= -16385;
                        return;
                    }
                }
                if ("screenOrientation".equals(str)) {
                    activityInfo.screenOrientation = m104577xaff52351(str2);
                    return;
                }
                if ("label".equals(str)) {
                    try {
                        i18 = context.getResources().getIdentifier(str2, "string", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55579xe61817e);
                    } catch (java.lang.Throwable unused) {
                    }
                    if (i18 != 0) {
                        activityInfo.labelRes = i18;
                        return;
                    } else {
                        activityInfo.nonLocalizedLabel = str2;
                        return;
                    }
                }
                try {
                    if ("icon".equals(str)) {
                        activityInfo.icon = context.getResources().getIdentifier(str2, null, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55579xe61817e);
                    } else if ("banner".equals(str)) {
                        activityInfo.banner = context.getResources().getIdentifier(str2, null, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55579xe61817e);
                    } else if (!"logo".equals(str)) {
                        return;
                    } else {
                        activityInfo.logo = context.getResources().getIdentifier(str2, null, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55579xe61817e);
                    }
                    return;
                } catch (java.lang.Throwable unused2) {
                    return;
                }
            }
            int m104707xd270966b2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104707xd270966b(android.content.pm.ActivityInfo.class, "FLAG_SHOW_FOR_ALL_USERS", 0);
            if ("true".equalsIgnoreCase(str2)) {
                activityInfo.flags = m104707xd270966b2 | activityInfo.flags;
            } else {
                activityInfo.flags = (~m104707xd270966b2) & activityInfo.flags;
            }
        }
    };

    /* renamed from: com.tencent.tinker.loader.hotplug.IncrementComponentManager$AttrTranslator */
    /* loaded from: classes12.dex */
    public static abstract class AttrTranslator<T_RESULT> {
        private AttrTranslator() {
        }

        /* renamed from: onInit */
        public void mo104578xc39adf8f(android.content.Context context, int i17, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        }

        /* renamed from: onTranslate */
        public abstract void mo104579x3ceb2e2f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, T_RESULT t_result);

        /* renamed from: translate */
        public final void m104580x3ec0f14e(android.content.Context context, int i17, org.xmlpull.v1.XmlPullParser xmlPullParser, T_RESULT t_result) {
            mo104578xc39adf8f(context, i17, xmlPullParser);
            int attributeCount = xmlPullParser.getAttributeCount();
            for (int i18 = 0; i18 < attributeCount; i18++) {
                if (com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f.equals(xmlPullParser.getAttributePrefix(i18))) {
                    mo104579x3ceb2e2f(context, i17, xmlPullParser.getAttributeName(i18), xmlPullParser.getAttributeValue(i18), t_result);
                }
            }
        }
    }

    private C26618xe516d55f() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: ensureInitialized */
    private static synchronized void m104567x44063fb6() {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.class) {
            if (!f55578x21c49861) {
                throw new java.lang.IllegalStateException("Not initialized!!");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.xmlpull.v1.XmlPullParser] */
    /* renamed from: init */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean m104568x316510(android.content.Context r6, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 r7) {
        /*
            java.lang.Class<com.tencent.tinker.loader.hotplug.IncrementComponentManager> r0 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.class
            monitor-enter(r0)
            java.util.HashMap r1 = r7.m104717xa17536fe()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "assets/inc_component_meta.txt"
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto L1b
            java.lang.String r6 = "Tinker.IncrementCompMgr"
            java.lang.String r7 = "package has no incremental component meta, skip init."
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lad
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(r6, r7, r2)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)
            return r1
        L1b:
            boolean r1 = r6 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L2b
            r1 = r6
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch: java.lang.Throwable -> Lad
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto L29
            goto L2b
        L29:
            r6 = r1
            goto L1b
        L2b:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55577x4616f5bc = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = r6.getPackageName()     // Catch: java.lang.Throwable -> Lad
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55579xe61817e = r1     // Catch: java.lang.Throwable -> Lad
            java.util.HashMap r7 = r7.m104717xa17536fe()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "assets/inc_component_meta.txt"
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lad
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.Throwable -> Lad
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Lad
            r7 = 0
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L99 org.xmlpull.v1.XmlPullParserException -> L9c
            r2.setInput(r1)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            int r3 = r2.getEventType()     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
        L50:
            r4 = 1
            if (r3 == r4) goto L8b
            r4 = 2
            if (r3 == r4) goto L57
            goto L86
        L57:
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            java.lang.String r4 = "activity"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            if (r4 == 0) goto L6f
            android.content.pm.ActivityInfo r3 = m104570x6e9e0ee2(r6, r2)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            java.util.Map<java.lang.String, android.content.pm.ActivityInfo> r4 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55571x3158b1a4     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            java.lang.String r5 = r3.name     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            goto L86
        L6f:
            java.lang.String r4 = "service"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            if (r4 == 0) goto L78
            goto L86
        L78:
            java.lang.String r4 = "receiver"
            boolean r4 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            if (r4 == 0) goto L81
            goto L86
        L81:
            java.lang.String r4 = "provider"
            r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
        L86:
            int r3 = r2.next()     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            goto L50
        L8b:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.f55578x21c49861 = r4     // Catch: java.lang.Throwable -> L95 org.xmlpull.v1.XmlPullParserException -> L97
            r2.setInput(r7)     // Catch: java.lang.Throwable -> L90
        L90:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(r1)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)
            return r4
        L95:
            r6 = move-exception
            goto La4
        L97:
            r6 = move-exception
            goto L9e
        L99:
            r6 = move-exception
            r2 = r7
            goto La4
        L9c:
            r6 = move-exception
            r2 = r7
        L9e:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L95
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L95
            throw r3     // Catch: java.lang.Throwable -> L95
        La4:
            if (r2 == 0) goto La9
            r2.setInput(r7)     // Catch: java.lang.Throwable -> La9
        La9:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(r1)     // Catch: java.lang.Throwable -> Lad
            throw r6     // Catch: java.lang.Throwable -> Lad
        Lad:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104568x316510(android.content.Context, com.tencent.tinker.loader.shareutil.ShareSecurityCheck):boolean");
    }

    /* renamed from: isIncrementActivity */
    public static boolean m104569xd06cef94(java.lang.String str) {
        m104567x44063fb6();
        return str != null && f55571x3158b1a4.containsKey(str);
    }

    /* renamed from: parseActivity */
    private static synchronized android.content.pm.ActivityInfo m104570x6e9e0ee2(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.pm.ActivityInfo activityInfo;
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.class) {
            activityInfo = new android.content.pm.ActivityInfo();
            android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
            activityInfo.applicationInfo = applicationInfo;
            activityInfo.packageName = f55579xe61817e;
            activityInfo.processName = applicationInfo.processName;
            activityInfo.launchMode = 0;
            activityInfo.permission = applicationInfo.permission;
            activityInfo.screenOrientation = -1;
            activityInfo.taskAffinity = applicationInfo.taskAffinity;
            if ((applicationInfo.flags & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0) {
                activityInfo.flags |= 512;
            }
            activityInfo.documentLaunchMode = 0;
            activityInfo.uiOptions = applicationInfo.uiOptions;
            f55570x96ca56c7.m104580x3ec0f14e(context, 0, xmlPullParser, activityInfo);
            int depth = xmlPullParser.getDepth();
            while (true) {
                int next = xmlPullParser.next();
                if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                    break;
                }
                if (next != 3 && next != 4) {
                    java.lang.String name = xmlPullParser.getName();
                    if ("intent-filter".equalsIgnoreCase(name)) {
                        m104571xcb548387(context, activityInfo.name, xmlPullParser);
                    } else if ("meta-data".equalsIgnoreCase(name)) {
                        m104572xb6710b22(context, activityInfo, xmlPullParser);
                    }
                }
            }
        }
        return activityInfo;
    }

    /* renamed from: parseIntentFilter */
    private static synchronized void m104571xcb548387(android.content.Context context, java.lang.String str, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.class) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4);
            if (!android.text.TextUtils.isEmpty(attributeValue)) {
                intentFilter.setPriority(java.lang.Integer.decode(attributeValue).intValue());
            }
            java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "autoVerify");
            if (!android.text.TextUtils.isEmpty(attributeValue2)) {
                try {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa((java.lang.Class<?>) android.content.IntentFilter.class, "setAutoVerify", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.Boolean.TYPE}).invoke(intentFilter, java.lang.Boolean.valueOf("true".equalsIgnoreCase(attributeValue2)));
                } catch (java.lang.Throwable unused) {
                }
            }
            int depth = xmlPullParser.getDepth();
            while (true) {
                int next = xmlPullParser.next();
                if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                    break;
                }
                if (next != 3 && next != 4) {
                    java.lang.String name = xmlPullParser.getName();
                    if ("action".equals(name)) {
                        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        if (attributeValue3 != null) {
                            intentFilter.addAction(attributeValue3);
                        }
                    } else if ("category".equals(name)) {
                        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        if (attributeValue4 != null) {
                            intentFilter.addCategory(attributeValue4);
                        }
                    } else if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306.equals(name)) {
                        java.lang.String attributeValue5 = xmlPullParser.getAttributeValue(null, "mimeType");
                        if (attributeValue5 != null) {
                            try {
                                intentFilter.addDataType(attributeValue5);
                            } catch (android.content.IntentFilter.MalformedMimeTypeException e17) {
                                throw new org.xmlpull.v1.XmlPullParserException("bad mimeType", xmlPullParser, e17);
                            }
                        }
                        java.lang.String attributeValue6 = xmlPullParser.getAttributeValue(null, "scheme");
                        if (attributeValue6 != null) {
                            intentFilter.addDataScheme(attributeValue6);
                        }
                        java.lang.String attributeValue7 = xmlPullParser.getAttributeValue(null, "ssp");
                        if (attributeValue7 != null) {
                            intentFilter.addDataSchemeSpecificPart(attributeValue7, 0);
                        }
                        java.lang.String attributeValue8 = xmlPullParser.getAttributeValue(null, "sspPrefix");
                        if (attributeValue8 != null) {
                            intentFilter.addDataSchemeSpecificPart(attributeValue8, 1);
                        }
                        java.lang.String attributeValue9 = xmlPullParser.getAttributeValue(null, "sspPattern");
                        if (attributeValue9 != null) {
                            intentFilter.addDataSchemeSpecificPart(attributeValue9, 2);
                        }
                        java.lang.String attributeValue10 = xmlPullParser.getAttributeValue(null, "host");
                        java.lang.String attributeValue11 = xmlPullParser.getAttributeValue(null, "port");
                        if (attributeValue10 != null) {
                            intentFilter.addDataAuthority(attributeValue10, attributeValue11);
                        }
                        java.lang.String attributeValue12 = xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                        if (attributeValue12 != null) {
                            intentFilter.addDataPath(attributeValue12, 0);
                        }
                        java.lang.String attributeValue13 = xmlPullParser.getAttributeValue(null, "pathPrefix");
                        if (attributeValue13 != null) {
                            intentFilter.addDataPath(attributeValue13, 1);
                        }
                        java.lang.String attributeValue14 = xmlPullParser.getAttributeValue(null, "pathPattern");
                        if (attributeValue14 != null) {
                            intentFilter.addDataPath(attributeValue14, 2);
                        }
                    }
                    m104575xa9399a40(xmlPullParser);
                }
            }
            f55572xbafc01c1.put(str, intentFilter);
        }
    }

    /* renamed from: parseMetaData */
    private static synchronized void m104572xb6710b22(android.content.Context context, android.content.pm.ActivityInfo activityInfo, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.class) {
            java.lang.ClassLoader classLoader = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.class.getClassLoader();
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
            if (!android.text.TextUtils.isEmpty(attributeValue)) {
                if (activityInfo.metaData == null) {
                    activityInfo.metaData = new android.os.Bundle(classLoader);
                }
                activityInfo.metaData.putString(attributeValue, attributeValue2);
            }
        }
    }

    /* renamed from: queryActivityInfo */
    public static android.content.pm.ActivityInfo m104573xe1c42d45(java.lang.String str) {
        m104567x44063fb6();
        if (str != null) {
            return f55571x3158b1a4.get(str);
        }
        return null;
    }

    /* renamed from: resolveIntent */
    public static android.content.pm.ResolveInfo m104574xde5883a8(android.content.Intent intent) {
        android.content.IntentFilter intentFilter;
        java.lang.String str;
        m104567x44063fb6();
        android.content.ComponentName component = intent.getComponent();
        int i17 = -1;
        int i18 = 0;
        if (component != null) {
            str = component.getClassName();
            if (f55571x3158b1a4.containsKey(str)) {
                i17 = 0;
            } else {
                str = null;
            }
            intentFilter = null;
        } else {
            int i19 = -1;
            java.lang.String str2 = null;
            intentFilter = null;
            int i27 = 0;
            for (java.util.Map.Entry<java.lang.String, android.content.IntentFilter> entry : f55572xbafc01c1.entrySet()) {
                java.lang.String key = entry.getKey();
                android.content.IntentFilter value = entry.getValue();
                int match = value.match(intent.getAction(), intent.getType(), intent.getScheme(), intent.getData(), intent.getCategories(), TAG);
                boolean z17 = (match == -3 || match == -4 || match == -2 || match == -1) ? false : true;
                int priority = value.getPriority();
                if (z17 && priority > i19) {
                    intentFilter = value;
                    str2 = key;
                    i27 = match;
                    i19 = priority;
                }
            }
            str = str2;
            i17 = i19;
            i18 = i27;
        }
        if (str == null) {
            return null;
        }
        android.content.pm.ResolveInfo resolveInfo = new android.content.pm.ResolveInfo();
        android.content.pm.ActivityInfo activityInfo = f55571x3158b1a4.get(str);
        resolveInfo.activityInfo = activityInfo;
        resolveInfo.filter = intentFilter;
        resolveInfo.match = i18;
        resolveInfo.priority = i17;
        resolveInfo.resolvePackageName = f55579xe61817e;
        resolveInfo.icon = activityInfo.icon;
        resolveInfo.labelRes = activityInfo.labelRes;
        return resolveInfo;
    }

    /* renamed from: skipCurrentTag */
    private static void m104575xa9399a40(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }
}
