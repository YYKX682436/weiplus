package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.AndroidTouchProcessor */
/* loaded from: classes14.dex */
public class C28537x46552842 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f70432x7118e671 = false;

    /* renamed from: BYTES_PER_FIELD */
    static final int f70433xe0def024 = 8;

    /* renamed from: DEFAULT_HORIZONTAL_SCROLL_FACTOR */
    static final int f70434xfdbf2284 = 48;

    /* renamed from: DEFAULT_VERTICAL_SCROLL_FACTOR */
    static final int f70435x61a249d6 = 48;

    /* renamed from: IDENTITY_TRANSFORM */
    private static final android.graphics.Matrix f70436x9dea810b = new android.graphics.Matrix();

    /* renamed from: IMPLICIT_VIEW_ID */
    private static final int f70437x9236c9b = 0;

    /* renamed from: POINTER_DATA_FIELD_COUNT */
    static final int f70438x509d6617 = 36;

    /* renamed from: POINTER_DATA_FLAG_BATCHED */
    private static final int f70439xbec10839 = 1;
    private static final java.lang.String TAG = "AndroidTouchProcessor";

    /* renamed from: TOOL_TYPE_BITS */
    private static final int f70440xb8f50104 = 3;

    /* renamed from: TOOL_TYPE_MASK */
    private static final int f70441xb8f9e2ea = 7;

    /* renamed from: cachedVerticalScrollFactor */
    private int f70442xaea28954;

    /* renamed from: renderer */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f70445xe28140c3;

    /* renamed from: trackMotionEvents */
    private final boolean f70446xb887195a;

    /* renamed from: ongoingPans */
    private final java.util.Map<java.lang.Integer, float[]> f70444xacd7e991 = new java.util.HashMap();

    /* renamed from: motionEventTracker */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34 f70443x28a1ee14 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.m137338x9cf0d20b();

    /* renamed from: io.flutter.embedding.android.AndroidTouchProcessor$PointerChange */
    /* loaded from: classes14.dex */
    public @interface PointerChange {
        public static final int ADD = 1;

        /* renamed from: CANCEL */
        public static final int f70447x760d227a = 0;

        /* renamed from: DOWN */
        public static final int f70448x201ca2 = 4;

        /* renamed from: HOVER */
        public static final int f70449x41bd11c = 3;

        /* renamed from: MOVE */
        public static final int f70450x2433d1 = 5;

        /* renamed from: PAN_ZOOM_END */
        public static final int f70451xcc8efd1 = 9;

        /* renamed from: PAN_ZOOM_START */
        public static final int f70452xff1441d8 = 7;

        /* renamed from: PAN_ZOOM_UPDATE */
        public static final int f70453xe6a669f3 = 8;

        /* renamed from: REMOVE */
        public static final int f70454x8fddec84 = 2;
        public static final int UP = 6;
    }

    /* renamed from: io.flutter.embedding.android.AndroidTouchProcessor$PointerDeviceKind */
    /* loaded from: classes11.dex */
    public @interface PointerDeviceKind {

        /* renamed from: INVERTED_STYLUS */
        public static final int f70455x3f823f5c = 3;

        /* renamed from: MOUSE */
        public static final int f70456x4624485 = 1;

        /* renamed from: STYLUS */
        public static final int f70457x926b8ed2 = 2;

        /* renamed from: TOUCH */
        public static final int f70458x4c4e71f = 0;

        /* renamed from: TRACKPAD */
        public static final int f70459x7a602768 = 4;

        /* renamed from: UNKNOWN */
        public static final int f70460x19d1382a = 5;
    }

    /* renamed from: io.flutter.embedding.android.AndroidTouchProcessor$PointerSignalKind */
    /* loaded from: classes11.dex */
    public @interface PointerSignalKind {

        /* renamed from: NONE */
        public static final int f70461x24a738 = 0;

        /* renamed from: SCALE */
        public static final int f70462x4b1112a = 3;

        /* renamed from: SCROLL */
        public static final int f70463x9178dacd = 1;

        /* renamed from: SCROLL_INERTIA_CANCEL */
        public static final int f70464x40469771 = 2;

        /* renamed from: UNKNOWN */
        public static final int f70465x19d1382a = 4;
    }

    public C28537x46552842(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df, boolean z17) {
        this.f70445xe28140c3 = c28641x1f60b8df;
        this.f70446xb887195a = z17;
    }

    /* renamed from: addPointerForIndex */
    private void m136964x3da52005(android.view.MotionEvent motionEvent, int i17, int i18, int i19, android.graphics.Matrix matrix, java.nio.ByteBuffer byteBuffer) {
        m136965x3da52005(motionEvent, i17, i18, i19, matrix, byteBuffer, null);
    }

    /* renamed from: getHorizontalScrollFactor */
    private float m136966x4d81ffb6(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? android.view.ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : m136972x5deb2b7f(context);
    }

    /* renamed from: getPointerChangeForAction */
    private int m136967x493fbd88(int i17) {
        if (i17 == 0) {
            return 4;
        }
        if (i17 == 1) {
            return 6;
        }
        if (i17 == 5) {
            return 4;
        }
        if (i17 == 6) {
            return 6;
        }
        if (i17 == 2) {
            return 5;
        }
        if (i17 == 7) {
            return 3;
        }
        if (i17 == 3) {
            return 0;
        }
        return i17 == 8 ? 3 : -1;
    }

    /* renamed from: getPointerChangeForPanZoom */
    private int m136968xf4705cfe(int i17) {
        if (i17 == 4) {
            return 7;
        }
        if (i17 == 5) {
            return 8;
        }
        return (i17 == 6 || i17 == 0) ? 9 : -1;
    }

    /* renamed from: getPointerDeviceTypeForToolType */
    private int m136969xd893bc44(int i17) {
        if (i17 == 1) {
            return 0;
        }
        if (i17 == 2) {
            return 2;
        }
        if (i17 != 3) {
            return i17 != 4 ? 5 : 3;
        }
        return 1;
    }

    /* renamed from: getVerticalScrollFactor */
    private float m136970xec0db588(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? m136971x5bafcff9(context) : m136972x5deb2b7f(context);
    }

    /* renamed from: getVerticalScrollFactorAbove26 */
    private float m136971x5bafcff9(android.content.Context context) {
        return android.view.ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    /* renamed from: getVerticalScrollFactorPre26 */
    private int m136972x5deb2b7f(android.content.Context context) {
        if (this.f70442xaea28954 == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f70442xaea28954 = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f70442xaea28954;
    }

    /* renamed from: uniquePointerIdByType */
    private int m136973xa608a78(android.view.MotionEvent motionEvent, int i17) {
        return (motionEvent.getToolType(i17) & 7) | (motionEvent.getPointerId(i17) << 3);
    }

    /* renamed from: onGenericMotionEvent */
    public boolean m136974x16dab66c(android.view.MotionEvent motionEvent, android.content.Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z17 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z17) {
            return false;
        }
        int m136967x493fbd88 = m136967x493fbd88(motionEvent.getActionMasked());
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 36 * 8);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        m136965x3da52005(motionEvent, motionEvent.getActionIndex(), m136967x493fbd88, 0, f70436x9dea810b, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new java.lang.AssertionError("Packet position is not on field boundary.");
        }
        this.f70445xe28140c3.m138023x6067b195(allocateDirect, allocateDirect.position());
        return true;
    }

    /* renamed from: onTouchEvent */
    public boolean m136975x667eb1da(android.view.MotionEvent motionEvent) {
        return m136976x667eb1da(motionEvent, f70436x9dea810b);
    }

    /* renamed from: addPointerForIndex */
    private void m136965x3da52005(android.view.MotionEvent motionEvent, int i17, int i18, int i19, android.graphics.Matrix matrix, java.nio.ByteBuffer byteBuffer, android.content.Context context) {
        long j17;
        int i27;
        double d17;
        double d18;
        double d19;
        double d27;
        double d28;
        double d29;
        android.view.InputDevice.MotionRange motionRange;
        int i28 = -1;
        if (i18 == -1) {
            return;
        }
        int m136973xa608a78 = m136973xa608a78(motionEvent, i17);
        int m136969xd893bc44 = m136969xd893bc44(motionEvent.getToolType(i17));
        float[] fArr = {motionEvent.getX(i17), motionEvent.getY(i17)};
        matrix.mapPoints(fArr);
        if (m136969xd893bc44 == 1) {
            j17 = motionEvent.getButtonState() & 31;
            if (j17 == 0 && motionEvent.getSource() == 8194 && i18 == 4) {
                this.f70444xacd7e991.put(java.lang.Integer.valueOf(m136973xa608a78), fArr);
            }
        } else {
            j17 = m136969xd893bc44 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.f70444xacd7e991.containsKey(java.lang.Integer.valueOf(m136973xa608a78));
        if (containsKey) {
            int m136968xf4705cfe = m136968xf4705cfe(i18);
            if (m136968xf4705cfe == -1) {
                return;
            } else {
                i28 = m136968xf4705cfe;
            }
        }
        long m137344x5db1b11 = this.f70446xb887195a ? this.f70443x28a1ee14.m137339x697f14b(motionEvent).m137344x5db1b11() : 0L;
        int i29 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        int i37 = i28;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(m137344x5db1b11);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            i27 = i37;
            byteBuffer.putLong(i27);
            byteBuffer.putLong(4L);
        } else {
            i27 = i37;
            byteBuffer.putLong(i18);
            byteBuffer.putLong(m136969xd893bc44);
        }
        byteBuffer.putLong(i29);
        byteBuffer.putLong(m136973xa608a78);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = this.f70444xacd7e991.get(java.lang.Integer.valueOf(m136973xa608a78));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j17);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i17));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d17 = 1.0d;
            d18 = 0.0d;
        } else {
            d18 = motionRange.getMin();
            d17 = motionRange.getMax();
        }
        byteBuffer.putDouble(d18);
        byteBuffer.putDouble(d17);
        if (m136969xd893bc44 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i17));
            d19 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d19 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i17));
        byteBuffer.putDouble(motionEvent.getToolMajor(i17));
        byteBuffer.putDouble(motionEvent.getToolMinor(i17));
        byteBuffer.putDouble(d19);
        byteBuffer.putDouble(d19);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i17));
        if (m136969xd893bc44 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i17));
        } else {
            byteBuffer.putDouble(d19);
        }
        byteBuffer.putLong(i19);
        if (i29 == 1) {
            if (context != null) {
                d28 = m136966x4d81ffb6(context);
                d29 = m136970xec0db588(context);
            } else {
                d28 = 48.0d;
                d29 = 48.0d;
            }
            byteBuffer.putDouble(d28 * (-motionEvent.getAxisValue(10, i17)));
            byteBuffer.putDouble(d29 * (-motionEvent.getAxisValue(9, i17)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = this.f70444xacd7e991.get(java.lang.Integer.valueOf(m136973xa608a78));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d27 = 0.0d;
        } else {
            d27 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d27);
        byteBuffer.putDouble(d27);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d27);
        byteBuffer.putLong(0L);
        if (containsKey && i27 == 9) {
            this.f70444xacd7e991.remove(java.lang.Integer.valueOf(m136973xa608a78));
        }
    }

    /* renamed from: onTouchEvent */
    public boolean m136976x667eb1da(android.view.MotionEvent motionEvent, android.graphics.Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int m136967x493fbd88 = m136967x493fbd88(motionEvent.getActionMasked());
        boolean z17 = actionMasked == 0 || actionMasked == 5;
        boolean z18 = !z17 && (actionMasked == 1 || actionMasked == 6);
        int i17 = (z18 && m136969xd893bc44(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect((pointerCount + i17) * 36 * 8);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        if (z17) {
            m136964x3da52005(motionEvent, motionEvent.getActionIndex(), m136967x493fbd88, 0, matrix, allocateDirect);
        } else if (z18) {
            for (int i18 = 0; i18 < pointerCount; i18++) {
                if (i18 != motionEvent.getActionIndex() && motionEvent.getToolType(i18) == 1) {
                    m136964x3da52005(motionEvent, i18, 5, 1, matrix, allocateDirect);
                }
            }
            m136964x3da52005(motionEvent, motionEvent.getActionIndex(), m136967x493fbd88, 0, matrix, allocateDirect);
            if (i17 != 0) {
                m136964x3da52005(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect);
            }
        } else {
            for (int i19 = 0; i19 < pointerCount; i19++) {
                m136964x3da52005(motionEvent, i19, m136967x493fbd88, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.f70445xe28140c3.m138023x6067b195(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new java.lang.AssertionError("Packet position is not on field boundary");
    }
}
