package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes14.dex */
class AccessibilityViewEmbedder {
    private static final java.lang.String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final android.view.View rootAccessibilityView;
    private final com.tencent.mm.feature.ecs.nirvana.accessibility.n reflectionAccessors = new com.tencent.mm.feature.ecs.nirvana.accessibility.n(null);
    private final android.util.SparseArray<com.tencent.mm.feature.ecs.nirvana.accessibility.o> flutterIdToOrigin = new android.util.SparseArray<>();
    private final java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> originToFlutterId = new java.util.HashMap();
    private final java.util.Map<android.view.View, android.graphics.Rect> embeddedViewToDisplayBounds = new java.util.HashMap();

    public AccessibilityViewEmbedder(android.view.View view, int i17) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo r9, android.view.View r10, android.view.accessibility.AccessibilityNodeInfo r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r9.getChildCount()
            if (r1 >= r2) goto L9d
            com.tencent.mm.feature.ecs.nirvana.accessibility.n r2 = r8.reflectionAccessors
            java.lang.reflect.Method r3 = r2.f65720f
            r4 = 0
            java.lang.reflect.Field r5 = r2.f65719e
            java.lang.reflect.Method r2 = r2.f65718d
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
            io.flutter.Log.w(r7, r3, r2)
            goto L64
        L33:
            r2 = move-exception
            java.lang.String r3 = "Failed to access getChildId method."
            io.flutter.Log.w(r7, r3, r2)
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
            io.flutter.Log.w(r7, r3, r2)
            goto L64
        L5e:
            r2 = move-exception
            java.lang.String r3 = "Failed to access longArrayGetIndex method or the childNodeId field."
            io.flutter.Log.w(r7, r3, r2)
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
            java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> r4 = r8.originToFlutterId
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L8a
            java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> r2 = r8.originToFlutterId
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L94
        L8a:
            int r3 = r8.nextFlutterId
            int r4 = r3 + 1
            r8.nextFlutterId = r4
            r8.cacheVirtualIdMappings(r10, r2, r3)
            r2 = r3
        L94:
            android.view.View r3 = r8.rootAccessibilityView
            r11.addChild(r3, r2)
        L99:
            int r1 = r1 + 1
            goto L2
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder.addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void cacheVirtualIdMappings(android.view.View view, int i17, int i18) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = new com.tencent.mm.feature.ecs.nirvana.accessibility.o(view, i17, null);
        this.originToFlutterId.put(oVar, java.lang.Integer.valueOf(i18));
        this.flutterIdToOrigin.put(i18, oVar);
    }

    private android.view.accessibility.AccessibilityNodeInfo convertToFlutterNode(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17, android.view.View view) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i17);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i17);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        android.graphics.Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo r7, android.view.View r8, android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r6 = this;
            com.tencent.mm.feature.ecs.nirvana.accessibility.n r0 = r6.reflectionAccessors
            java.lang.reflect.Method r0 = r0.f65716b
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
            io.flutter.Log.w(r3, r4, r0)
            goto L28
        L22:
            r0 = move-exception
            java.lang.String r4 = "Failed to access getParentNodeId method."
            io.flutter.Log.w(r3, r4, r0)
        L28:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r0 >= r4) goto L35
            java.lang.String r7 = "Unexpected Android version. Unable to find the parent ID."
            io.flutter.Log.w(r3, r7)
            r7 = r1
            goto L7b
        L35:
            android.view.accessibility.AccessibilityNodeInfo r7 = android.view.accessibility.AccessibilityNodeInfo.obtain(r7)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.setDataPosition(r2)
            r7.writeToParcel(r0, r2)
            r0.setDataPosition(r2)
            long r3 = r0.readLong()
            boolean r7 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.b(r3, r2)
            if (r7 == 0) goto L53
            r0.readInt()
        L53:
            r7 = 1
            boolean r7 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.b(r3, r7)
            if (r7 == 0) goto L5d
            r0.readLong()
        L5d:
            r7 = 2
            boolean r7 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.b(r3, r7)
            if (r7 == 0) goto L67
            r0.readInt()
        L67:
            r7 = 3
            boolean r7 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.b(r3, r7)
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
            java.util.Map<com.tencent.mm.feature.ecs.nirvana.accessibility.o, java.lang.Integer> r0 = r6.originToFlutterId
            com.tencent.mm.feature.ecs.nirvana.accessibility.o r2 = new com.tencent.mm.feature.ecs.nirvana.accessibility.o
            r2.<init>(r8, r7, r1)
            java.lang.Object r7 = r0.get(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L9e
            android.view.View r8 = r6.rootAccessibilityView
            int r7 = r7.intValue()
            r9.setParent(r8, r7)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder.setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void setFlutterNodesTranslateBounds(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo;
        com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = this.flutterIdToOrigin.get(i17);
        if (oVar == null) {
            return null;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.embeddedViewToDisplayBounds;
        android.view.View view = oVar.f65721a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(oVar.f65722b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i17, view);
    }

    public java.lang.Integer getRecordFlutterId(android.view.View view, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.Long a17 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.a(this.reflectionAccessors, accessibilityRecord);
        if (a17 == null) {
            return null;
        }
        return this.originToFlutterId.get(new com.tencent.mm.feature.ecs.nirvana.accessibility.o(view, (int) (a17.longValue() >> 32), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View r6, int r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            com.tencent.mm.feature.ecs.nirvana.accessibility.n r1 = r5.reflectionAccessors
            java.lang.String r2 = "AccessibilityBridge"
            java.lang.reflect.Method r1 = r1.f65715a
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
            io.flutter.Log.w(r2, r4, r1)
            goto L25
        L1f:
            r1 = move-exception
            java.lang.String r4 = "Failed to access getSourceNodeId method."
            io.flutter.Log.w(r2, r4, r1)
        L25:
            r1 = r3
        L26:
            if (r1 != 0) goto L29
            return r3
        L29:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r5.embeddedViewToDisplayBounds
            r2.put(r6, r8)
            long r1 = r1.longValue()
            r8 = 32
            long r1 = r1 >> r8
            int r8 = (int) r1
            r5.cacheVirtualIdMappings(r6, r8, r7)
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.convertToFlutterNode(r0, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder.getRootNode(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean onAccessibilityHoverEvent(int i17, android.view.MotionEvent motionEvent) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = this.flutterIdToOrigin.get(i17);
        if (oVar == null) {
            return false;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.embeddedViewToDisplayBounds;
        android.view.View view = oVar.f65721a;
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

    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = this.flutterIdToOrigin.get(i17);
        if (oVar == null || (accessibilityNodeProvider = oVar.f65721a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(oVar.f65722b, i18, bundle);
    }

    public android.view.View platformViewOfNode(int i17) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = this.flutterIdToOrigin.get(i17);
        if (oVar == null) {
            return null;
        }
        return oVar.f65721a;
    }

    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(accessibilityEvent);
        java.lang.Long a17 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.a(this.reflectionAccessors, accessibilityEvent);
        if (a17 == null) {
            return false;
        }
        int longValue = (int) (a17.longValue() >> 32);
        java.lang.Integer num = this.originToFlutterId.get(new com.tencent.mm.feature.ecs.nirvana.accessibility.o(view, longValue, null));
        if (num == null) {
            int i17 = this.nextFlutterId;
            this.nextFlutterId = i17 + 1;
            num = java.lang.Integer.valueOf(i17);
            cacheVirtualIdMappings(view, longValue, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i18 = 0; i18 < obtain.getRecordCount(); i18++) {
            android.view.accessibility.AccessibilityRecord record = obtain.getRecord(i18);
            java.lang.Long a18 = com.tencent.mm.feature.ecs.nirvana.accessibility.n.a(this.reflectionAccessors, record);
            if (a18 == null) {
                return false;
            }
            com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = new com.tencent.mm.feature.ecs.nirvana.accessibility.o(view, (int) (a18.longValue() >> 32), null);
            if (!this.originToFlutterId.containsKey(oVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(oVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
