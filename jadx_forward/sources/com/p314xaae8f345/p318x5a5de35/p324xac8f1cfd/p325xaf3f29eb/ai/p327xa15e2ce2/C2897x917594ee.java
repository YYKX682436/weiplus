package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2;

/* renamed from: com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder */
/* loaded from: classes12.dex */
public class C2897x917594ee {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec f127399a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.Uri f127400b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.File f127401c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f127402d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f127403e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f127404f = 1024;

    /* renamed from: g, reason: collision with root package name */
    public int f127405g = 1;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f127406h = null;

    /* renamed from: com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f127407a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f127408b;

        public AnonymousClass1(boolean z17, android.app.Activity activity) {
            this.f127407a = z17;
            this.f127408b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee c2897x917594ee;
            byte[] a17;
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee c2897x917594ee2 = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this;
            try {
                if (c2897x917594ee2.f127400b == null) {
                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.a(c2897x917594ee2, "get image data is null！");
                    return;
                }
                try {
                    a17 = this.f127407a ? com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.a(c2897x917594ee2, this.f127408b) : com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.b(c2897x917594ee2, this.f127408b);
                } catch (java.lang.Exception e17) {
                    e17.getLocalizedMessage();
                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this, "clip error!");
                    c2897x917594ee = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this;
                }
                if (a17 == null) {
                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this, "clip error! bitmapBytes is null");
                    return;
                }
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee c2897x917594ee3 = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this;
                java.lang.String encodeToString = android.util.Base64.encodeToString(a17, 2);
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec = c2897x917594ee3.f127399a;
                if (interfaceC2896x36f74bec != null) {
                    interfaceC2896x36f74bec.m21609xfcfa6fec(encodeToString);
                }
                c2897x917594ee = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this;
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2898x28705875.m21620x692721c7(c2897x917594ee.f127401c);
            } finally {
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2898x28705875.m21620x692721c7(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.this.f127401c);
            }
        }
    }

    public static byte[] a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee c2897x917594ee, android.app.Activity activity) {
        android.graphics.Bitmap m21713x9abd072a = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21713x9abd072a(activity, c2897x917594ee.f127400b, c2897x917594ee.f127405g, c2897x917594ee.f127406h);
        byte[] m21712x5a2c3731 = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21712x5a2c3731(m21713x9abd072a, c2897x917594ee.f127404f, c2897x917594ee.f127405g);
        if (m21713x9abd072a != null) {
            m21713x9abd072a.recycle();
        }
        return m21712x5a2c3731;
    }

    public static byte[] b(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee c2897x917594ee, android.app.Activity activity) {
        java.lang.String m21718xfb83cc9b = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21718xfb83cc9b(activity, c2897x917594ee.f127400b);
        int m21716x3200ff51 = !android.text.TextUtils.isEmpty(m21718xfb83cc9b) ? com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21716x3200ff51(m21718xfb83cc9b) : 0;
        android.graphics.Point point = c2897x917594ee.f127406h;
        if (point != null && (m21716x3200ff51 == 90 || m21716x3200ff51 == 270)) {
            android.graphics.Point point2 = c2897x917594ee.f127406h;
            point = new android.graphics.Point(point2.y, point2.x);
        }
        android.graphics.Bitmap m21722x404aee8d = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21722x404aee8d(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21713x9abd072a(activity, c2897x917594ee.f127400b, c2897x917594ee.f127405g, point), m21716x3200ff51);
        byte[] m21712x5a2c3731 = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2907xb8ab90f4.m21712x5a2c3731(m21722x404aee8d, c2897x917594ee.f127404f, c2897x917594ee.f127405g);
        if (m21722x404aee8d != null) {
            m21722x404aee8d.recycle();
        }
        return m21712x5a2c3731;
    }

    /* renamed from: onActivityResult */
    public void m21611x9d4787cb(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec;
        if (activity == null) {
            return;
        }
        if (i17 == 2000) {
            if (i18 != -1) {
                a("select photo error code: " + i18);
            } else if (intent == null) {
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec2 = this.f127399a;
                if (interfaceC2896x36f74bec2 != null) {
                    interfaceC2896x36f74bec2.m21610x864f1c0e("user cancel select photo!");
                }
            } else if (this.f127402d) {
                java.io.File m21619x744dc7db = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2898x28705875.m21619x744dc7db(activity, true);
                this.f127401c = m21619x744dc7db;
                if (m21619x744dc7db != null) {
                    android.content.Intent intent2 = new android.content.Intent("com.android.camera.action.CROP");
                    intent2.addFlags(1);
                    intent2.addFlags(2);
                    intent2.putExtra("crop", "true");
                    intent2.putExtra("scale ", true);
                    intent2.putExtra("return-data", false);
                    intent2.putExtra("outputFormat", android.graphics.Bitmap.CompressFormat.JPEG.toString());
                    intent2.setDataAndType(intent.getData(), "image/*");
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        android.net.Uri uri = com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2898x28705875.uri;
                        this.f127400b = uri;
                        intent2.putExtra("output", uri);
                    } else {
                        android.net.Uri fromFile = android.net.Uri.fromFile(this.f127401c);
                        this.f127400b = fromFile;
                        intent2.putExtra("output", fromFile);
                    }
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(3000);
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.k(activity, arrayList.toArray(), "com/tencent/cloud/component/common/ai/clipphoto/ClipPhotoHolder", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    } catch (java.lang.Exception e17) {
                        e17.getLocalizedMessage();
                        a(activity, intent);
                    }
                } else {
                    a(activity, intent);
                }
            } else if (!this.f127403e || (interfaceC2896x36f74bec = this.f127399a) == null) {
                a(activity, intent);
            } else {
                interfaceC2896x36f74bec.m21608xdb66b3ec(intent.getData());
            }
        }
        if (i17 == 3000) {
            if (i18 != -1) {
                a("clip error code: " + i18);
            } else {
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec3 = this.f127399a;
                if (interfaceC2896x36f74bec3 != null) {
                    interfaceC2896x36f74bec3.m21607x5adb91c2();
                }
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.AnonymousClass1(true, activity));
            }
        }
    }

    /* renamed from: release */
    public void m21612x41012807() {
        if (this.f127399a != null) {
            this.f127399a = null;
        }
    }

    /* renamed from: setClipPhotoEventListener */
    public void m21613xa3c0b2ce(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec) {
        this.f127399a = interfaceC2896x36f74bec;
    }

    /* renamed from: setCompressImageSize */
    public void m21614x64724e78(android.graphics.Point point) {
        this.f127406h = point;
    }

    /* renamed from: setCompressLevel */
    public void m21615xb6c2b000(int i17) {
        this.f127405g = i17;
    }

    /* renamed from: setReturnOnlyUri */
    public void m21616x6afd458e(boolean z17) {
        this.f127403e = z17;
    }

    /* renamed from: startSelectAlbum */
    public void m21617xc26ac911(android.app.Activity activity, boolean z17) {
        m21618xc26ac911(activity, z17, 1024);
    }

    /* renamed from: startSelectAlbum */
    public void m21618xc26ac911(android.app.Activity activity, boolean z17, int i17) {
        if (activity == null) {
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec = this.f127399a;
            if (interfaceC2896x36f74bec != null) {
                interfaceC2896x36f74bec.m21610x864f1c0e("activity is null");
                return;
            }
            return;
        }
        this.f127404f = i17;
        this.f127402d = z17;
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.PICK");
        intent.setType("image/*");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(2000);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/cloud/component/common/ai/clipphoto/ClipPhotoHolder", "startSelectAlbum", "(Landroid/app/Activity;ZI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void a(android.app.Activity activity, android.content.Intent intent) {
        this.f127400b = intent.getData();
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec = this.f127399a;
        if (interfaceC2896x36f74bec != null) {
            interfaceC2896x36f74bec.m21607x5adb91c2();
        }
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee.AnonymousClass1(false, activity));
    }

    public static void a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.C2897x917594ee c2897x917594ee, java.lang.String str) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec = c2897x917594ee.f127399a;
        if (interfaceC2896x36f74bec != null) {
            interfaceC2896x36f74bec.m21610x864f1c0e(str);
        }
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2.InterfaceC2896x36f74bec interfaceC2896x36f74bec = this.f127399a;
        if (interfaceC2896x36f74bec != null) {
            interfaceC2896x36f74bec.m21610x864f1c0e(str);
        }
    }
}
