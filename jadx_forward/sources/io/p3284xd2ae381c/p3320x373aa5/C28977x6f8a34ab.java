package io.p3284xd2ae381c.p3320x373aa5;

/* renamed from: io.flutter.view.AccessibilityViewEmbedder */
/* loaded from: classes14.dex */
class C28977x6f8a34ab {
    private static final java.lang.String TAG = "AccessibilityBridge";

    /* renamed from: nextFlutterId */
    private int f72316x5950e0a4;

    /* renamed from: rootAccessibilityView */
    private final android.view.View f72319x2eff7851;

    /* renamed from: reflectionAccessors */
    private final io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors f72318xf8510321 = new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors();

    /* renamed from: flutterIdToOrigin */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId> f72315x47f568f8 = new android.util.SparseArray<>();

    /* renamed from: originToFlutterId */
    private final java.util.Map<io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId, java.lang.Integer> f72317x683efb16 = new java.util.HashMap();

    /* renamed from: embeddedViewToDisplayBounds */
    private final java.util.Map<android.view.View, android.graphics.Rect> f72314xdf58df0d = new java.util.HashMap();

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$ReflectionAccessors */
    /* loaded from: classes14.dex */
    public static class ReflectionAccessors {

        /* renamed from: childNodeIdsField */
        private final java.lang.reflect.Field f72320x918fc80;

        /* renamed from: getChildId */
        private final java.lang.reflect.Method f72321x6a486321;

        /* renamed from: getParentNodeId */
        private final java.lang.reflect.Method f72322x97801e7d;

        /* renamed from: getRecordSourceNodeId */
        private final java.lang.reflect.Method f72323xb0f1039f;

        /* renamed from: getSourceNodeId */
        private final java.lang.reflect.Method f72324xa742652e;

        /* renamed from: longArrayGetIndex */
        private final java.lang.reflect.Method f72325xb9440f79;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getChildId */
        public java.lang.Long m139621x6a486321(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17) {
            java.lang.reflect.Method method = this.f72321x6a486321;
            if (method == null && (this.f72320x918fc80 == null || this.f72325xb9440f79 == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (java.lang.Long) method.invoke(accessibilityNodeInfo, java.lang.Integer.valueOf(i17));
                } catch (java.lang.IllegalAccessException e17) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "Failed to access getChildId method.", e17);
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "The getChildId method threw an exception when invoked.", e18);
                }
            } else {
                try {
                    return java.lang.Long.valueOf(((java.lang.Long) this.f72325xb9440f79.invoke(this.f72320x918fc80.get(accessibilityNodeInfo), java.lang.Integer.valueOf(i17))).longValue());
                } catch (java.lang.ArrayIndexOutOfBoundsException e19) {
                    e = e19;
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (java.lang.IllegalAccessException e27) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e27);
                } catch (java.lang.reflect.InvocationTargetException e28) {
                    e = e28;
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getParentNodeId */
        public java.lang.Long m139622x97801e7d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            java.lang.reflect.Method method = this.f72322x97801e7d;
            if (method != null) {
                try {
                    return java.lang.Long.valueOf(((java.lang.Long) method.invoke(accessibilityNodeInfo, new java.lang.Object[0])).longValue());
                } catch (java.lang.IllegalAccessException e17) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "Failed to access getParentNodeId method.", e17);
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "The getParentNodeId method threw an exception when invoked.", e18);
                }
            }
            return m139627x5f560ec8(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getRecordSourceNodeId */
        public java.lang.Long m139623xb0f1039f(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
            java.lang.reflect.Method method = this.f72323xb0f1039f;
            if (method == null) {
                return null;
            }
            try {
                return (java.lang.Long) method.invoke(accessibilityRecord, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e17) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "Failed to access the getRecordSourceNodeId method.", e17);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e18) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e18);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getSourceNodeId */
        public java.lang.Long m139624xa742652e(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            java.lang.reflect.Method method = this.f72324xa742652e;
            if (method == null) {
                return null;
            }
            try {
                return (java.lang.Long) method.invoke(accessibilityNodeInfo, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e17) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "Failed to access getSourceNodeId method.", e17);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e18) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "The getSourceNodeId method threw an exception when invoked.", e18);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getVirtualNodeId */
        public static int m139625xd0df51f2(long j17) {
            return (int) (j17 >> 32);
        }

        /* renamed from: isBitSet */
        private static boolean m139626xd56581df(long j17, int i17) {
            return (j17 & (1 << i17)) != 0;
        }

        /* renamed from: yoinkParentIdFromParcel */
        private static java.lang.Long m139627x5f560ec8(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m139626xd56581df(readLong, 0)) {
                obtain2.readInt();
            }
            if (m139626xd56581df(readLong, 1)) {
                obtain2.readLong();
            }
            if (m139626xd56581df(readLong, 2)) {
                obtain2.readInt();
            }
            java.lang.Long valueOf = m139626xd56581df(readLong, 3) ? java.lang.Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ReflectionAccessors() {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method method3;
            java.lang.reflect.Method method4;
            java.lang.reflect.Field field;
            java.lang.reflect.Method method5;
            java.lang.reflect.Method method6 = null;
            try {
                method = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = android.view.accessibility.AccessibilityRecord.class.getMethod("getSourceNodeId", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused2) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (android.os.Build.VERSION.SDK_INT <= 26) {
                try {
                    method3 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getParentNodeId", new java.lang.Class[0]);
                } catch (java.lang.NoSuchMethodException unused3) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "can't invoke getParentNodeId with reflection");
                    method3 = null;
                }
                try {
                    method4 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getChildId", java.lang.Integer.TYPE);
                    field = null;
                } catch (java.lang.NoSuchMethodException unused4) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "can't invoke getChildId with reflection");
                    method4 = null;
                    field = null;
                }
                method5 = field;
                method6 = method3;
            } else {
                try {
                    java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = java.lang.Class.forName("android.util.LongArray").getMethod("get", java.lang.Integer.TYPE);
                    field = declaredField;
                    method4 = null;
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused5) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                    method5 = 0;
                }
            }
            this.f72324xa742652e = method;
            this.f72322x97801e7d = method6;
            this.f72323xb0f1039f = method2;
            this.f72321x6a486321 = method4;
            this.f72320x918fc80 = field;
            this.f72325xb9440f79 = method5;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$ViewAndId */
    /* loaded from: classes14.dex */
    public static class ViewAndId {

        /* renamed from: id, reason: collision with root package name */
        final int f374928id;

        /* renamed from: view */
        final android.view.View f72326x373aa5;

        /* renamed from: equals */
        public boolean m139628xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId)) {
                return false;
            }
            io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = (io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId) obj;
            return this.f374928id == viewAndId.f374928id && this.f72326x373aa5.equals(viewAndId.f72326x373aa5);
        }

        /* renamed from: hashCode */
        public int m139629x8cdac1b() {
            return ((this.f72326x373aa5.hashCode() + 31) * 31) + this.f374928id;
        }

        private ViewAndId(android.view.View view, int i17) {
            this.f72326x373aa5 = view;
            this.f374928id = i17;
        }
    }

    public C28977x6f8a34ab(android.view.View view, int i17) {
        this.f72319x2eff7851 = view;
        this.f72316x5950e0a4 = i17;
    }

    /* renamed from: addChildrenToFlutterNode */
    private void m139603x78638e3(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i17;
        for (int i18 = 0; i18 < accessibilityNodeInfo.getChildCount(); i18++) {
            java.lang.Long m139621x6a486321 = this.f72318xf8510321.m139621x6a486321(accessibilityNodeInfo, i18);
            if (m139621x6a486321 != null) {
                int m139625xd0df51f2 = io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors.m139625xd0df51f2(m139621x6a486321.longValue());
                io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId(view, m139625xd0df51f2);
                if (this.f72317x683efb16.containsKey(viewAndId)) {
                    i17 = this.f72317x683efb16.get(viewAndId).intValue();
                } else {
                    int i19 = this.f72316x5950e0a4;
                    this.f72316x5950e0a4 = i19 + 1;
                    m139604xd3ec55a9(view, m139625xd0df51f2, i19);
                    i17 = i19;
                }
                accessibilityNodeInfo2.addChild(this.f72319x2eff7851, i17);
            }
        }
    }

    /* renamed from: cacheVirtualIdMappings */
    private void m139604xd3ec55a9(android.view.View view, int i17, int i18) {
        io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId(view, i17);
        this.f72317x683efb16.put(viewAndId, java.lang.Integer.valueOf(i18));
        this.f72315x47f568f8.put(i18, viewAndId);
    }

    /* renamed from: convertToFlutterNode */
    private android.view.accessibility.AccessibilityNodeInfo m139605x9f2367d0(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17, android.view.View view) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.f72319x2eff7851, i17);
        obtain.setPackageName(this.f72319x2eff7851.getContext().getPackageName());
        obtain.setSource(this.f72319x2eff7851, i17);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        android.graphics.Rect rect = this.f72314xdf58df0d.get(view);
        m139606x8b8f2bf2(accessibilityNodeInfo, obtain);
        m139608xbb3b32c(accessibilityNodeInfo, rect, obtain);
        m139603x78638e3(accessibilityNodeInfo, view, obtain);
        m139607x8fdce46(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    /* renamed from: copyAccessibilityFields */
    private void m139606x8b8f2bf2(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
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

    /* renamed from: setFlutterNodeParent */
    private void m139607x8fdce46(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        java.lang.Long m139622x97801e7d = this.f72318xf8510321.m139622x97801e7d(accessibilityNodeInfo);
        if (m139622x97801e7d == null) {
            return;
        }
        java.lang.Integer num = this.f72317x683efb16.get(new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId(view, io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors.m139625xd0df51f2(m139622x97801e7d.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.f72319x2eff7851, num.intValue());
        }
    }

    /* renamed from: setFlutterNodesTranslateBounds */
    private void m139608xbb3b32c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    /* renamed from: createAccessibilityNodeInfo */
    public android.view.accessibility.AccessibilityNodeInfo m139609x427e11a2(int i17) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo;
        io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = this.f72315x47f568f8.get(i17);
        if (viewAndId == null || !this.f72314xdf58df0d.containsKey(viewAndId.f72326x373aa5) || viewAndId.f72326x373aa5.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = viewAndId.f72326x373aa5.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.f374928id)) == null) {
            return null;
        }
        return m139605x9f2367d0(createAccessibilityNodeInfo, i17, viewAndId.f72326x373aa5);
    }

    /* renamed from: getRecordFlutterId */
    public java.lang.Integer m139610xa9447ad0(android.view.View view, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.Long m139623xb0f1039f = this.f72318xf8510321.m139623xb0f1039f(accessibilityRecord);
        if (m139623xb0f1039f == null) {
            return null;
        }
        return this.f72317x683efb16.get(new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId(view, io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors.m139625xd0df51f2(m139623xb0f1039f.longValue())));
    }

    /* renamed from: getRootNode */
    public android.view.accessibility.AccessibilityNodeInfo m139611x71e59f7a(android.view.View view, int i17, android.graphics.Rect rect) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        java.lang.Long m139624xa742652e = this.f72318xf8510321.m139624xa742652e(createAccessibilityNodeInfo);
        if (m139624xa742652e == null) {
            return null;
        }
        this.f72314xdf58df0d.put(view, rect);
        m139604xd3ec55a9(view, io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors.m139625xd0df51f2(m139624xa742652e.longValue()), i17);
        return m139605x9f2367d0(createAccessibilityNodeInfo, i17, view);
    }

    /* renamed from: onAccessibilityHoverEvent */
    public boolean m139612x32e691cd(int i17, android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = this.f72315x47f568f8.get(i17);
        if (viewAndId == null) {
            return false;
        }
        android.graphics.Rect rect = this.f72314xdf58df0d.get(viewAndId.f72326x373aa5);
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
        return viewAndId.f72326x373aa5.dispatchGenericMotionEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    /* renamed from: performAction */
    public boolean m139613x8c1184f7(int i17, int i18, android.os.Bundle bundle) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = this.f72315x47f568f8.get(i17);
        if (viewAndId == null || (accessibilityNodeProvider = viewAndId.f72326x373aa5.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.f374928id, i18, bundle);
    }

    /* renamed from: platformViewOfNode */
    public android.view.View m139614x7302d451(int i17) {
        io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = this.f72315x47f568f8.get(i17);
        if (viewAndId == null) {
            return null;
        }
        return viewAndId.f72326x373aa5;
    }

    /* renamed from: requestSendAccessibilityEvent */
    public boolean m139615xacf4d503(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(accessibilityEvent);
        java.lang.Long m139623xb0f1039f = this.f72318xf8510321.m139623xb0f1039f(accessibilityEvent);
        if (m139623xb0f1039f == null) {
            return false;
        }
        int m139625xd0df51f2 = io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors.m139625xd0df51f2(m139623xb0f1039f.longValue());
        java.lang.Integer num = this.f72317x683efb16.get(new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId(view, m139625xd0df51f2));
        if (num == null) {
            int i17 = this.f72316x5950e0a4;
            this.f72316x5950e0a4 = i17 + 1;
            num = java.lang.Integer.valueOf(i17);
            m139604xd3ec55a9(view, m139625xd0df51f2, num.intValue());
        }
        obtain.setSource(this.f72319x2eff7851, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i18 = 0; i18 < obtain.getRecordCount(); i18++) {
            android.view.accessibility.AccessibilityRecord record = obtain.getRecord(i18);
            java.lang.Long m139623xb0f1039f2 = this.f72318xf8510321.m139623xb0f1039f(record);
            if (m139623xb0f1039f2 == null) {
                return false;
            }
            io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId viewAndId = new io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ViewAndId(view, io.p3284xd2ae381c.p3320x373aa5.C28977x6f8a34ab.ReflectionAccessors.m139625xd0df51f2(m139623xb0f1039f2.longValue()));
            if (!this.f72317x683efb16.containsKey(viewAndId)) {
                return false;
            }
            record.setSource(this.f72319x2eff7851, this.f72317x683efb16.get(viewAndId).intValue());
        }
        return this.f72319x2eff7851.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
