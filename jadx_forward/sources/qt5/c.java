package qt5;

/* loaded from: classes14.dex */
public class c implements qt5.i0 {

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f448188u = "BaseScanCamera";

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.Camera f448189a;

    /* renamed from: k, reason: collision with root package name */
    public boolean f448199k;

    /* renamed from: o, reason: collision with root package name */
    public int f448203o;

    /* renamed from: p, reason: collision with root package name */
    public int f448204p;

    /* renamed from: q, reason: collision with root package name */
    public int f448205q;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f448190b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f448191c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile qt5.d f448192d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f448193e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile qt5.d f448194f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f448195g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f448196h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Point f448197i = null;

    /* renamed from: j, reason: collision with root package name */
    public float f448198j = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f448200l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f448201m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f448202n = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f448206r = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f448207s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f448208t = "";

    public c() {
        f448188u += "#" + hashCode();
    }

    public void a() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "close(), previewing " + this.f448191c);
        if (this.f448189a != null) {
            this.f448190b = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f448189a.setPreviewCallback(null);
            this.f448189a.stopPreview();
            this.f448191c = false;
            this.f448193e = false;
            this.f448194f = null;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "stopPreview costTime " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            yj0.a.j(this.f448189a, "com/tencent/scanlib/camera/BaseScanCamera", "close", "()V", "android/hardware/Camera", "release", "()V");
            this.f448189a = null;
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "camera.close() costTime " + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        } else {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(f448188u, "close(), camera == null");
        }
        this.f448201m = false;
        this.f448202n = -1;
        this.f448199k = false;
        this.f448206r = -1;
        this.f448207s = false;
    }

    public final android.graphics.Point b(android.graphics.Point point) {
        android.hardware.Camera.Parameters parameters = this.f448189a.getParameters();
        java.lang.String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        android.graphics.Point point2 = null;
        if (str != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(parameters.getSupportedPreviewSizes());
            java.util.Collections.sort(arrayList, new qt5.b(null));
            arrayList.remove(0);
            int i17 = point.x;
            float f17 = i17 / point.y;
            java.lang.String.format("visible.x: %d, visible.y: %d, ratio: %f", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(f17));
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("SCREEN_PIXELS: %s", java.lang.Integer.valueOf(point.x * point.y)));
            java.util.Iterator it = arrayList.iterator();
            float f18 = Float.POSITIVE_INFINITY;
            while (true) {
                if (it.hasNext()) {
                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
                    int i18 = size.width;
                    int i19 = size.height;
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                    int min = !this.f448199k ? i18 : java.lang.Math.min(i18, i19);
                    int max = !this.f448199k ? i19 : java.lang.Math.max(i18, i19);
                    java.lang.String.format("maybeFlippedWidth: %d, maybeFlippedHeight: %d", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(max));
                    if (min == point.x && max == point.y) {
                        android.graphics.Point point3 = new android.graphics.Point(i18, i19);
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "Found preview size exactly matching screen size: " + point3);
                        point2 = point3;
                        break;
                    }
                    if (i18 * i19 >= 307200) {
                        float abs = java.lang.Math.abs((min / max) - f17);
                        if (abs < f18) {
                            point2 = new android.graphics.Point(i18, i19);
                            f18 = abs;
                        }
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                    }
                } else {
                    if (point2 == null) {
                        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
                        point2 = new android.graphics.Point(previewSize.width, previewSize.height);
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "No suitable preview sizes, using default: " + point2);
                    }
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "Found best approximate preview size: " + point2);
                }
            }
        }
        return point2 == null ? new android.graphics.Point((point.x >> 3) << 3, (point.y >> 3) << 3) : point2;
    }

    public int c() {
        android.hardware.Camera camera = this.f448189a;
        if (camera == null || camera.getParameters() == null || this.f448189a.getParameters().getZoomRatios() == null || this.f448189a.getParameters().getZoomRatios().size() <= 0) {
            return 100;
        }
        return this.f448189a.getParameters().getZoomRatios().get(this.f448203o).intValue();
    }

    public java.lang.String d(boolean z17) {
        android.hardware.Camera.Parameters parameters;
        if (!z17) {
            try {
                java.lang.String str = this.f448208t;
                if (str != null && !str.isEmpty()) {
                    return this.f448208t;
                }
            } catch (java.lang.Exception e17) {
                this.f448208t = "";
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, e17, "getFocusMode exception");
            }
        }
        if (!this.f448190b) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(f448188u, "getFocusMode camera not open, ignore");
            return this.f448208t;
        }
        android.hardware.Camera camera = this.f448189a;
        if (camera != null && (parameters = camera.getParameters()) != null) {
            java.lang.String focusMode = parameters.getFocusMode();
            this.f448208t = focusMode;
            return focusMode;
        }
        return "";
    }

    public final android.graphics.Point e(android.graphics.Point point) {
        float f17;
        float f18;
        int i17;
        if (this.f448199k) {
            android.graphics.Point point2 = this.f448196h;
            f17 = (point2.x * 1.0f) / point.y;
            f18 = point2.y * 1.0f;
            i17 = point.x;
        } else {
            android.graphics.Point point3 = this.f448196h;
            f17 = (point3.x * 1.0f) / point.x;
            f18 = point3.y * 1.0f;
            i17 = point.y;
        }
        this.f448198j = java.lang.Math.max(f17, f18 / i17);
        float f19 = point.x;
        float f27 = this.f448198j;
        return new android.graphics.Point((int) (f19 * f27), (int) (point.y * f27));
    }

    public android.graphics.Point f(android.graphics.Point point) {
        android.graphics.Point point2 = this.f448197i;
        int i17 = point2.x;
        android.graphics.Point point3 = this.f448196h;
        int i18 = (i17 - point3.x) / 2;
        int i19 = (point2.y - point3.y) / 2;
        android.graphics.Point point4 = new android.graphics.Point(point.x + i18, point.y + i19);
        if (this.f448199k) {
            android.graphics.Point point5 = this.f448197i;
            int i27 = point5.y;
            android.graphics.Point point6 = this.f448196h;
            i18 = (i27 - point6.x) / 2;
            i19 = (point5.x - point6.y) / 2;
            point4 = new android.graphics.Point(point.y + i19, (this.f448196h.x - point.x) + i18);
        }
        java.lang.String.format("dx %d, dy %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        float f17 = point4.x;
        float f18 = this.f448198j;
        android.graphics.Point point7 = new android.graphics.Point((int) (f17 / f18), (int) (point4.y / f18));
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "viewPoint " + point + ", previewPoint " + point4 + ", scanPoint " + point7);
        return point7;
    }

    public android.graphics.Rect g(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("visibleResolution:%s, previewResolution:%s", this.f448196h, this.f448197i));
        android.graphics.Point f17 = f(this.f448199k ? new android.graphics.Point(rect.right, rect.top) : new android.graphics.Point(rect.left, rect.top));
        android.graphics.Point f18 = f(this.f448199k ? new android.graphics.Point(rect.left, rect.bottom) : new android.graphics.Point(rect.right, rect.bottom));
        rect2.set(f17.x, f17.y, f18.x, f18.y);
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("uiRect %s, scanRect %s", rect, rect2));
        return rect2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r1 <= (r5.size() - 1)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(java.util.List r5, int r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L86
            int r0 = r5.size()
            if (r0 <= 0) goto L86
            java.lang.String r0 = qt5.c.f448188u
            int r1 = r5.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1}
            java.lang.String r2 = "zoomRatios: %s,size: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            int r0 = java.util.Collections.binarySearch(r5, r0)
            java.lang.String r1 = qt5.c.f448188u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "insert index: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(r1, r2)
            if (r0 < 0) goto L3d
            goto L87
        L3d:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r0 + (-1)
            if (r0 < 0) goto L6f
            int r2 = r5.size()
            int r2 = r2 + (-1)
            if (r0 > r2) goto L6f
            if (r1 < 0) goto L6f
            int r2 = r5.size()
            int r2 = r2 + (-1)
            if (r1 > r2) goto L6f
            java.lang.Object r2 = r5.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 - r6
            java.lang.Object r5 = r5.get(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r6 - r5
            if (r2 <= r6) goto L87
            goto L84
        L6f:
            if (r0 < 0) goto L7a
            int r6 = r5.size()
            int r6 = r6 + (-1)
            if (r0 > r6) goto L7a
            goto L87
        L7a:
            if (r1 < 0) goto L86
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r1 > r5) goto L86
        L84:
            r0 = r1
            goto L87
        L86:
            r0 = 0
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qt5.c.h(java.util.List, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:30:0x00bc, B:32:0x00c0, B:34:0x00c8, B:39:0x00d4, B:42:0x00dc, B:44:0x00e2, B:47:0x00ea, B:49:0x0112, B:50:0x0129, B:51:0x0115, B:53:0x0123, B:54:0x0158), top: B:29:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:30:0x00bc, B:32:0x00c0, B:34:0x00c8, B:39:0x00d4, B:42:0x00dc, B:44:0x00e2, B:47:0x00ea, B:49:0x0112, B:50:0x0129, B:51:0x0115, B:53:0x0123, B:54:0x0158), top: B:29:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qt5.c.i(int):void");
    }

    public void j(java.lang.String str) {
        android.hardware.Camera.Parameters parameters;
        java.util.List<java.lang.String> supportedFocusModes;
        try {
            if (!this.f448190b) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(f448188u, "setFocusMode camera not open, ignore");
                return;
            }
            android.hardware.Camera camera = this.f448189a;
            if (camera == null || (supportedFocusModes = (parameters = camera.getParameters()).getSupportedFocusModes()) == null || !supportedFocusModes.contains(str)) {
                return;
            }
            parameters.setFocusMode(str);
            this.f448189a.setParameters(parameters);
            this.f448208t = str;
        } catch (java.lang.Exception e17) {
            this.f448208t = "";
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, e17, "setFocusMode exception");
        }
    }

    public void k() {
        try {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "set scan focus");
            java.util.List<java.lang.String> supportedFocusModes = this.f448189a.getParameters().getSupportedFocusModes();
            if (supportedFocusModes != null) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "supported focus modes size = " + supportedFocusModes.size());
                for (java.lang.String str : supportedFocusModes) {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "supported focus modes : " + str);
                }
                if (supportedFocusModes.contains("continuous-video")) {
                    j("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    j("auto");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, e17, "setScanFocus exception");
        }
    }

    public void l(android.graphics.Point point) {
        this.f448196h = new android.graphics.Point(point);
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "setVisibleSize: " + this.f448196h);
        try {
            android.graphics.Point b17 = b(this.f448196h);
            this.f448195g = b17;
            this.f448197i = e(b17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, e17, "setVisibleSize exception");
        }
    }

    public void m(android.graphics.SurfaceTexture surfaceTexture) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f448189a == null || this.f448191c) {
            return;
        }
        if (surfaceTexture != null) {
            try {
                this.f448189a.setPreviewTexture(surfaceTexture);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, th6, "startPreview-setPreviewTexture exception");
                this.f448194f = new qt5.d(1051, "setPreviewTexture failed", th6);
                return;
            }
        }
        android.graphics.Point point = this.f448196h;
        if (point == null) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(f448188u, "startPreview visibleResolution null, and ignore");
            this.f448194f = null;
            return;
        }
        try {
            if (this.f448195g == null) {
                android.graphics.Point b17 = b(point);
                this.f448195g = b17;
                this.f448197i = e(b17);
            }
            try {
                android.hardware.Camera.Parameters parameters = this.f448189a.getParameters();
                android.graphics.Point point2 = this.f448195g;
                parameters.setPreviewSize(point2.x, point2.y);
                this.f448189a.setParameters(parameters);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, e17, "startPreview-setPreviewSize exception");
            }
            try {
                this.f448193e = true;
                yj0.a.j(this.f448189a, "com/tencent/scanlib/camera/BaseScanCamera", "startPreview", "(Landroid/graphics/SurfaceTexture;)V", "android/hardware/Camera", "startPreview", "()V");
                this.f448191c = true;
                this.f448194f = new qt5.d(0, "", null);
                java.lang.String.format("startPreview done costTime=[%s]", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis)));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, th7, "startPreview exception");
                this.f448194f = new qt5.d(1053, "startPreview failed", th7);
            }
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, th8, "startPreview-getCameraResolution exception");
            this.f448194f = new qt5.d(1052, "getCameraResolution failed", th8);
        }
    }

    public void n(android.hardware.Camera.PreviewCallback previewCallback) {
        android.hardware.Camera camera = this.f448189a;
        if (camera != null) {
            try {
                camera.setOneShotPreviewCallback(previewCallback);
            } catch (java.lang.RuntimeException e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, e17, "takeOneShot exception");
            }
        }
    }

    public void o(int i17) {
        if (this.f448189a == null || !this.f448191c) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = this.f448189a.getParameters();
            java.util.List<java.lang.Integer> zoomRatios = parameters.getZoomRatios();
            if (zoomRatios != null && zoomRatios.size() > 0) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("zoom action:%d,beforeZoom:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(parameters.getZoom())));
                if (i17 == 0) {
                    this.f448203o = 0;
                } else if (i17 == 1) {
                    this.f448203o = this.f448204p;
                } else if (i17 == 2) {
                    int i18 = this.f448203o;
                    int i19 = this.f448205q;
                    if (i18 < i19) {
                        int i27 = i18 + 1;
                        this.f448203o = i27;
                        if (i27 <= i19) {
                            i19 = i27;
                        }
                        this.f448203o = i19;
                    }
                } else if (i17 == 3) {
                    int i28 = this.f448203o;
                    int i29 = this.f448204p;
                    if (i28 > i29) {
                        int i37 = i28 - 1;
                        this.f448203o = i37;
                        if (i37 >= i29) {
                            i29 = i37;
                        }
                        this.f448203o = i29;
                    }
                } else if (i17 == 4) {
                    this.f448203o = this.f448205q;
                } else if (i17 == 5) {
                    int i38 = this.f448203o;
                    int i39 = this.f448204p;
                    if (i38 != i39) {
                        this.f448203o = i39;
                    } else {
                        this.f448203o = this.f448205q;
                    }
                }
                parameters.setZoom(this.f448203o);
                this.f448189a.setParameters(parameters);
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("zoom action:%d,afterZoom:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(parameters.getZoom())));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, "zoom action exception:" + e17.getMessage());
        }
    }

    public void p(int i17) {
        int i18;
        if (this.f448189a == null || !this.f448191c || i17 <= 0) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = this.f448189a.getParameters();
            java.util.List<java.lang.Integer> zoomRatios = parameters.getZoomRatios();
            if (zoomRatios != null && zoomRatios.size() > 0) {
                java.lang.String.format("zoom to ratio:%d", java.lang.Integer.valueOf(i17));
                if (i17 >= zoomRatios.get(this.f448204p).intValue() && i17 <= zoomRatios.get(this.f448205q).intValue()) {
                    i18 = h(zoomRatios, i17);
                } else if (i17 < zoomRatios.get(this.f448204p).intValue()) {
                    i18 = this.f448204p;
                } else {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, "exceed max zoom");
                    int i19 = this.f448203o;
                    int i27 = this.f448205q;
                    i18 = i19 + ((i27 - i19) / 5);
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i(f448188u, java.lang.String.format("zoom:%d,ratio:%d", java.lang.Integer.valueOf(i18), zoomRatios.get(i18)));
                this.f448203o = i18;
                parameters.setZoom(i18);
                this.f448189a.setParameters(parameters);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(f448188u, "zoom scale exception:" + e17.getMessage());
        }
    }
}
