package pk4;

/* loaded from: classes14.dex */
public class m extends android.graphics.SurfaceTexture {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.SurfaceTexture f438042a;

    public m(int i17) {
        super(i17);
        this.f438042a = null;
    }

    public static java.lang.String a() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        android.util.StringBuilderPrinter stringBuilderPrinter = new android.util.StringBuilderPrinter(sb6);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        stringBuilderPrinter.println("#accinfo.revision=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        stringBuilderPrinter.println("#accinfo.build=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c + ":" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274639b + ":" + com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#accinfo.env=");
        sb7.append(z65.c.f551988a ? "f" : "b");
        sb7.append(":");
        sb7.append(java.lang.Thread.currentThread().getName());
        sb7.append(":");
        sb7.append(z65.c.f551989b);
        stringBuilderPrinter.println(sb7.toString());
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            str = java.lang.String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", java.lang.Integer.valueOf(((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryClass()), android.os.Environment.getDataDirectory().getAbsolutePath(), java.lang.Integer.valueOf(statFs.getBlockSize()), java.lang.Integer.valueOf(statFs.getBlockCount()), java.lang.Integer.valueOf(statFs.getAvailableBlocks()), lp0.b.e0(), java.lang.Integer.valueOf(statFs2.getBlockSize()), java.lang.Integer.valueOf(statFs2.getBlockCount()), java.lang.Integer.valueOf(statFs2.getAvailableBlocks()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSurfaceTextureWrap", "check data size failed :%s", e17.getMessage());
            str = "";
        }
        stringBuilderPrinter.println("#accinfo.data=" + str);
        java.util.Date date = new java.util.Date();
        stringBuilderPrinter.println("#accinfo.crashTime=" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.getDefault()).format(date));
        stringBuilderPrinter.println(com.p314xaae8f345.mm.app.C5000x71a2fa35.f134767a);
        return sb6.toString();
    }

    @Override // android.graphics.SurfaceTexture
    public void attachToGLContext(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, attachToGLContext");
        this.f438042a.attachToGLContext(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Boolean, java.lang.Object] */
    @Override // android.graphics.SurfaceTexture
    public void detachFromGLContext() {
        boolean z17;
        java.lang.String str = " detect texture problem error code = 0, detach = false, and error = ";
        java.lang.String str2 = "DetachFromGLContext";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, detachFromGLContext");
        try {
            this.f438042a.detachFromGLContext();
            z17 = false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSurfaceTextureWrap", e17, "%s", "detect texture problem, RuntimeException detachFromGLContext");
            z17 = true;
        }
        if (z17) {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    java.lang.reflect.Method declaredMethod = android.graphics.SurfaceTexture.class.getDeclaredMethod("nativeDetachFromGLContext", new java.lang.Class[0]);
                                    declaredMethod.setAccessible(true);
                                    int intValue = ((java.lang.Integer) declaredMethod.invoke(this.f438042a, new java.lang.Object[0])).intValue();
                                    java.lang.String str3 = a() + " detect texture problem error code = " + intValue + ", detach = true, and error = " + z17;
                                    z65.c.b(android.util.Base64.encodeToString(str3.getBytes(), 2), "DetachFromGLContext");
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str3);
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                    ?? valueOf2 = java.lang.Boolean.valueOf(z17);
                                    ?? r07 = {valueOf, bool, valueOf2};
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", r07);
                                    str = r07;
                                    str2 = valueOf2;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.String str4 = a() + str + z17;
                                    z65.c.b(android.util.Base64.encodeToString(str4.getBytes(), 2), str2);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str4);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z17));
                                    throw th6;
                                }
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSurfaceTextureWrap", e18, "%s", "detect texture problem, Exception");
                                java.lang.String str5 = a() + " detect texture problem error code = 0, detach = false, and error = " + z17;
                                z65.c.b(android.util.Base64.encodeToString(str5.getBytes(), 2), "DetachFromGLContext");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str5);
                                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                                ?? valueOf3 = java.lang.Boolean.valueOf(z17);
                                ?? r08 = {0, bool2, valueOf3};
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", r08);
                                str = r08;
                                str2 = valueOf3;
                            }
                        } catch (java.lang.reflect.InvocationTargetException e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSurfaceTextureWrap", e19, "%s", "detect texture problem, InvocationTargetException");
                            java.lang.String str6 = a() + " detect texture problem error code = 0, detach = false, and error = " + z17;
                            z65.c.b(android.util.Base64.encodeToString(str6.getBytes(), 2), "DetachFromGLContext");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str6);
                            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                            ?? valueOf4 = java.lang.Boolean.valueOf(z17);
                            ?? r09 = {0, bool3, valueOf4};
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", r09);
                            str = r09;
                            str2 = valueOf4;
                        }
                    } catch (java.lang.NoSuchMethodException e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSurfaceTextureWrap", e27, "%s", "detect texture problem, NoSuchMethodException");
                        java.lang.String str7 = a() + " detect texture problem error code = 0, detach = false, and error = " + z17;
                        z65.c.b(android.util.Base64.encodeToString(str7.getBytes(), 2), "DetachFromGLContext");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str7);
                        java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                        ?? valueOf5 = java.lang.Boolean.valueOf(z17);
                        ?? r010 = {0, bool4, valueOf5};
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", r010);
                        str = r010;
                        str2 = valueOf5;
                    }
                } catch (java.lang.IllegalArgumentException e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSurfaceTextureWrap", e28, "%s", "detect texture problem, IllegalArgumentException");
                    java.lang.String str8 = a() + " detect texture problem error code = 0, detach = false, and error = " + z17;
                    z65.c.b(android.util.Base64.encodeToString(str8.getBytes(), 2), "DetachFromGLContext");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str8);
                    java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
                    ?? valueOf6 = java.lang.Boolean.valueOf(z17);
                    ?? r011 = {0, bool5, valueOf6};
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", r011);
                    str = r011;
                    str2 = valueOf6;
                }
            } catch (java.lang.IllegalAccessException e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSurfaceTextureWrap", e29, "%s", "detect texture problem, IllegalAccessException");
                java.lang.String str9 = a() + " detect texture problem error code = 0, detach = false, and error = " + z17;
                z65.c.b(android.util.Base64.encodeToString(str9.getBytes(), 2), "DetachFromGLContext");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSurfaceTextureWrap", str9);
                java.lang.Boolean bool6 = java.lang.Boolean.FALSE;
                ?? valueOf7 = java.lang.Boolean.valueOf(z17);
                ?? r012 = {0, bool6, valueOf7};
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", r012);
                str = r012;
                str2 = valueOf7;
            }
        }
    }

    /* renamed from: equals */
    public boolean m158668xb2c87fbf(java.lang.Object obj) {
        return this.f438042a.equals(obj);
    }

    @Override // android.graphics.SurfaceTexture
    public long getTimestamp() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTimestamp");
        return this.f438042a.getTimestamp();
    }

    @Override // android.graphics.SurfaceTexture
    public void getTransformMatrix(float[] fArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTransformMatrix");
        this.f438042a.getTransformMatrix(fArr);
    }

    /* renamed from: hashCode */
    public int m158669x8cdac1b() {
        return this.f438042a.hashCode();
    }

    @Override // android.graphics.SurfaceTexture
    public void release() {
        super.release();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, release");
        this.f438042a.release();
    }

    @Override // android.graphics.SurfaceTexture
    public void releaseTexImage() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, releaseTexImage");
        this.f438042a.releaseTexImage();
    }

    @Override // android.graphics.SurfaceTexture
    public void setDefaultBufferSize(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setDefaultBufferSize");
        this.f438042a.setDefaultBufferSize(i17, i18);
    }

    @Override // android.graphics.SurfaceTexture
    public void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setOnFrameAvailableListener");
        this.f438042a.setOnFrameAvailableListener(onFrameAvailableListener);
    }

    /* renamed from: toString */
    public java.lang.String m158670x9616526c() {
        return this.f438042a.toString();
    }

    @Override // android.graphics.SurfaceTexture
    public void updateTexImage() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, updateTexImage");
        this.f438042a.updateTexImage();
    }
}
