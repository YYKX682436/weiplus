package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* renamed from: com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder */
/* loaded from: classes14.dex */
class C10535x6f8a34ab {
    private static final java.lang.String TAG = "AccessibilityBridge";

    /* renamed from: nextFlutterId */
    private int f28820x5950e0a4;

    /* renamed from: rootAccessibilityView */
    private final android.view.View f28823x2eff7851;

    /* renamed from: reflectionAccessors */
    private final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n f28822xf8510321 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n(null);

    /* renamed from: flutterIdToOrigin */
    private final android.util.SparseArray<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o> f28819x47f568f8 = new android.util.SparseArray<>();

    /* renamed from: originToFlutterId */
    private final java.util.Map<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o, java.lang.Integer> f28821x683efb16 = new java.util.HashMap();

    /* renamed from: embeddedViewToDisplayBounds */
    private final java.util.Map<android.view.View, android.graphics.Rect> f28818xdf58df0d = new java.util.HashMap();

    public C10535x6f8a34ab(android.view.View view, int i17) {
        this.f28823x2eff7851 = view;
        this.f28820x5950e0a4 = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[SYNTHETIC] */
    /* renamed from: addChildrenToFlutterNode */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m44233x78638e3(android.view.accessibility.AccessibilityNodeInfo r9, android.view.View r10, android.view.accessibility.AccessibilityNodeInfo r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r9.getChildCount()
            if (r1 >= r2) goto L9d
            com.tencent.mm.feature.ecs.nirvana.accessibility.n r2 = r8.f28822xf8510321
            java.lang.reflect.Method r3 = r2.f147253f
            r4 = 0
            java.lang.reflect.Field r5 = r2.f147252e
            java.lang.reflect.Method r2 = r2.f147251d
            if (r2 != 0) goto L18
            if (r5 == 0) goto L64
            if (r3 != 0) goto L18
            goto L64
        L18:
            r6 = 1
            java.lang.String r7 = "AccessibilityBridge"
            if (r2 == 0) goto L3a
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L33
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L33
            r3[r0] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L33
            java.lang.Object r2 = r2.invoke(r9, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L33
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L33
            goto L65
        L2c:
            r2 = move-exception
            java.lang.String r3 = "The getChildId method threw an exception when invoked."
            io.p3284xd2ae381c.Log.w(r7, r3, r2)
            goto L64
        L33:
            r2 = move-exception
            java.lang.String r3 = "Failed to access getChildId method."
            io.p3284xd2ae381c.Log.w(r7, r3, r2)
            goto L64
        L3a:
            java.lang.Object r2 = r5.get(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            r5[r0] = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            java.lang.Object r2 = r3.invoke(r2, r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            long r2 = r2.longValue()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L55 java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e
            goto L65
        L55:
            r2 = move-exception
            goto L58
        L57:
            r2 = move-exception
        L58:
            java.lang.String r3 = "The longArrayGetIndex method threw an exception when invoked."
            io.p3284xd2ae381c.Log.w(r7, r3, r2)
            goto L64
        L5e:
            r2 = move-exception
            java.lang.String r3 = "Failed to access longArrayGetIndex method or the childNodeId field."
            io.p3284xd2ae381c.Log.w(r7, r3, r2)
        L64:
            r2 = r4
        L65:
            if (r2 != 0) goto L68
            goto L99
        L68:
            long r2 = r2.longValue()
            r5 = 32
            long r2 = r2 >> r5
            int r2 = (int) r2
            com.tencent.mm.feature.ecs.nirvana.accessibility.o r3 = new com.tencent.mm.feature.ecs.nirvana.accessibility.o
            r3.<init>(r10, r2, r4)
            java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> r4 = r8.f28821x683efb16
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L8a
            java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> r2 = r8.f28821x683efb16
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L94
        L8a:
            int r3 = r8.f28820x5950e0a4
            int r4 = r3 + 1
            r8.f28820x5950e0a4 = r4
            r8.m44234xd3ec55a9(r10, r2, r3)
            r2 = r3
        L94:
            android.view.View r3 = r8.f28823x2eff7851
            r11.addChild(r3, r2)
        L99:
            int r1 = r1 + 1
            goto L2
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.C10535x6f8a34ab.m44233x78638e3(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* renamed from: cacheVirtualIdMappings */
    private void m44234xd3ec55a9(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o(view, i17, null);
        this.f28821x683efb16.put(oVar, java.lang.Integer.valueOf(i18));
        this.f28819x47f568f8.put(i18, oVar);
    }

    /* renamed from: convertToFlutterNode */
    private android.view.accessibility.AccessibilityNodeInfo m44235x9f2367d0(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17, android.view.View view) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.f28823x2eff7851, i17);
        obtain.setPackageName(this.f28823x2eff7851.getContext().getPackageName());
        obtain.setSource(this.f28823x2eff7851, i17);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        android.graphics.Rect rect = this.f28818xdf58df0d.get(view);
        m44236x8b8f2bf2(accessibilityNodeInfo, obtain);
        m44238xbb3b32c(accessibilityNodeInfo, rect, obtain);
        m44233x78638e3(accessibilityNodeInfo, view, obtain);
        m44237x8fdce46(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    /* renamed from: copyAccessibilityFields */
    private void m44236x8b8f2bf2(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i17 = android.os.Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i17 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007e  */
    /* renamed from: setFlutterNodeParent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m44237x8fdce46(android.view.accessibility.AccessibilityNodeInfo r7, android.view.View r8, android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r6 = this;
            com.tencent.mm.feature.ecs.nirvana.accessibility.n r0 = r6.f28822xf8510321
            java.lang.reflect.Method r0 = r0.f147249b
            r1 = 0
            r2 = 0
            java.lang.String r3 = "AccessibilityBridge"
            if (r0 == 0) goto L28
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L22
            java.lang.Object r0 = r0.invoke(r7, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L22
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L22
            long r4 = r0.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L22
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L22
            goto L7b
        L1b:
            r0 = move-exception
            java.lang.String r4 = "The getParentNodeId method threw an exception when invoked."
            io.p3284xd2ae381c.Log.w(r3, r4, r0)
            goto L28
        L22:
            r0 = move-exception
            java.lang.String r4 = "Failed to access getParentNodeId method."
            io.p3284xd2ae381c.Log.w(r3, r4, r0)
        L28:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r0 >= r4) goto L35
            java.lang.String r7 = "Unexpected Android version. Unable to find the parent ID."
            io.p3284xd2ae381c.Log.w(r3, r7)
            r7 = r1
            goto L7b
        L35:
            android.view.accessibility.AccessibilityNodeInfo r7 = android.view.accessibility.AccessibilityNodeInfo.obtain(r7)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.setDataPosition(r2)
            r7.writeToParcel(r0, r2)
            r0.setDataPosition(r2)
            long r3 = r0.readLong()
            boolean r7 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.b(r3, r2)
            if (r7 == 0) goto L53
            r0.readInt()
        L53:
            r7 = 1
            boolean r7 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.b(r3, r7)
            if (r7 == 0) goto L5d
            r0.readLong()
        L5d:
            r7 = 2
            boolean r7 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.b(r3, r7)
            if (r7 == 0) goto L67
            r0.readInt()
        L67:
            r7 = 3
            boolean r7 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.b(r3, r7)
            if (r7 == 0) goto L77
            long r2 = r0.readLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            goto L78
        L77:
            r7 = r1
        L78:
            r0.recycle()
        L7b:
            if (r7 != 0) goto L7e
            return
        L7e:
            long r2 = r7.longValue()
            r7 = 32
            long r2 = r2 >> r7
            int r7 = (int) r2
            java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> r0 = r6.f28821x683efb16
            com.tencent.mm.feature.ecs.nirvana.accessibility.o r2 = new com.tencent.mm.feature.ecs.nirvana.accessibility.o
            r2.<init>(r8, r7, r1)
            java.lang.Object r7 = r0.get(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L9e
            android.view.View r8 = r6.f28823x2eff7851
            int r7 = r7.intValue()
            r9.setParent(r8, r7)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.C10535x6f8a34ab.m44237x8fdce46(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* renamed from: setFlutterNodesTranslateBounds */
    private void m44238xbb3b32c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    /* renamed from: createAccessibilityNodeInfo */
    public android.view.accessibility.AccessibilityNodeInfo m44239x427e11a2(int i17) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = this.f28819x47f568f8.get(i17);
        if (oVar == null) {
            return null;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.f28818xdf58df0d;
        android.view.View view = oVar.f147254a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(oVar.f147255b)) == null) {
            return null;
        }
        return m44235x9f2367d0(createAccessibilityNodeInfo, i17, view);
    }

    /* renamed from: getRecordFlutterId */
    public java.lang.Integer m44240xa9447ad0(android.view.View view, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.Long a17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.a(this.f28822xf8510321, accessibilityRecord);
        if (a17 == null) {
            return null;
        }
        return this.f28821x683efb16.get(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o(view, (int) (a17.longValue() >> 32), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: getRootNode */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo m44241x71e59f7a(android.view.View r6, int r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            com.tencent.mm.feature.ecs.nirvana.accessibility.n r1 = r5.f28822xf8510321
            java.lang.String r2 = "AccessibilityBridge"
            java.lang.reflect.Method r1 = r1.f147248a
            r3 = 0
            if (r1 != 0) goto Le
            goto L25
        Le:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1f
            java.lang.Object r1 = r1.invoke(r0, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1f
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1f
            goto L26
        L18:
            r1 = move-exception
            java.lang.String r4 = "The getSourceNodeId method threw an exception when invoked."
            io.p3284xd2ae381c.Log.w(r2, r4, r1)
            goto L25
        L1f:
            r1 = move-exception
            java.lang.String r4 = "Failed to access getSourceNodeId method."
            io.p3284xd2ae381c.Log.w(r2, r4, r1)
        L25:
            r1 = r3
        L26:
            if (r1 != 0) goto L29
            return r3
        L29:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r5.f28818xdf58df0d
            r2.put(r6, r8)
            long r1 = r1.longValue()
            r8 = 32
            long r1 = r1 >> r8
            int r8 = (int) r1
            r5.m44234xd3ec55a9(r6, r8, r7)
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.m44235x9f2367d0(r0, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.C10535x6f8a34ab.m44241x71e59f7a(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* renamed from: onAccessibilityHoverEvent */
    public boolean m44242x32e691cd(int i17, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = this.f28819x47f568f8.get(i17);
        if (oVar == null) {
            return false;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.f28818xdf58df0d;
        android.view.View view = oVar.f147254a;
        android.graphics.Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i18 = 0; i18 < motionEvent.getPointerCount(); i18++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerPropertiesArr[i18] = pointerProperties;
            motionEvent.getPointerProperties(i18, pointerProperties);
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i18, pointerCoords);
            android.view.MotionEvent.PointerCoords pointerCoords2 = new android.view.MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i18] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    /* renamed from: performAction */
    public boolean m44243x8c1184f7(int i17, int i18, android.os.Bundle bundle) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = this.f28819x47f568f8.get(i17);
        if (oVar == null || (accessibilityNodeProvider = oVar.f147254a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(oVar.f147255b, i18, bundle);
    }

    /* renamed from: platformViewOfNode */
    public android.view.View m44244x7302d451(int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = this.f28819x47f568f8.get(i17);
        if (oVar == null) {
            return null;
        }
        return oVar.f147254a;
    }

    /* renamed from: requestSendAccessibilityEvent */
    public boolean m44245xacf4d503(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(accessibilityEvent);
        java.lang.Long a17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.a(this.f28822xf8510321, accessibilityEvent);
        if (a17 == null) {
            return false;
        }
        int longValue = (int) (a17.longValue() >> 32);
        java.lang.Integer num = this.f28821x683efb16.get(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o(view, longValue, null));
        if (num == null) {
            int i17 = this.f28820x5950e0a4;
            this.f28820x5950e0a4 = i17 + 1;
            num = java.lang.Integer.valueOf(i17);
            m44234xd3ec55a9(view, longValue, num.intValue());
        }
        obtain.setSource(this.f28823x2eff7851, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i18 = 0; i18 < obtain.getRecordCount(); i18++) {
            android.view.accessibility.AccessibilityRecord record = obtain.getRecord(i18);
            java.lang.Long a18 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.n.a(this.f28822xf8510321, record);
            if (a18 == null) {
                return false;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o oVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.o(view, (int) (a18.longValue() >> 32), null);
            if (!this.f28821x683efb16.containsKey(oVar)) {
                return false;
            }
            record.setSource(this.f28823x2eff7851, this.f28821x683efb16.get(oVar).intValue());
        }
        return this.f28823x2eff7851.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
