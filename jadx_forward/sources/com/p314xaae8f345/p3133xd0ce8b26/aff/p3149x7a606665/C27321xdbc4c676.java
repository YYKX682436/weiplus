package com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665;

/* renamed from: com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41B */
/* loaded from: classes15.dex */
class C27321xdbc4c676 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.d f298418a;

    public C27321xdbc4c676(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.d dVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.d) obj;
        this.f298418a = dVar;
        ey.q qVar = (ey.q) dVar;
        qVar.getClass();
        qVar.f338817e = this;
    }

    /* renamed from: ZIDL_AX */
    private native void m112953x1964d17f(long j17, long j18, boolean z17);

    /* renamed from: ZIDL_BX */
    private native void m112954x1964d19e(long j17, long j18, boolean z17);

    /* renamed from: ZIDL_CX */
    private native void m112955x1964d1bd(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_DX */
    private native void m112956x1964d1dc(long j17, long j18, byte[] bArr);

    public void Q1(long j17, java.lang.String str) {
        m112955x1964d1bd(this.f60633xf042a733, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void R1(long j17, java.lang.String str) {
        m112956x1964d1dc(this.f60633xf042a733, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void S1(long j17, boolean z17) {
        m112954x1964d19e(this.f60633xf042a733, j17, z17);
    }

    public void T1(long j17, boolean z17) {
        m112953x1964d17f(this.f60633xf042a733, j17, z17);
    }

    /* renamed from: ZIDL_AV */
    public void m112957x1964d17d(long j17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o notification = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o.f298438i, bArr);
        ey.q qVar = (ey.q) this.f298418a;
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyFunctionCallStartAsync ");
        boolean[] zArr = notification.f298443h;
        sb6.append(zArr[2] ? notification.f298440e : "");
        sb6.append(' ');
        sb6.append(zArr[3] ? notification.f298441f : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", sb6.toString());
        java.util.HashMap hashMap = qVar.f338818f;
        java.lang.String str = zArr[2] ? notification.f298440e : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getModuleName(...)");
        java.lang.String str2 = zArr[3] ? notification.f298441f : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFunctionName(...)");
        if (hashMap.containsKey(qVar.Ai(str, str2))) {
            java.lang.String str3 = zArr[2] ? notification.f298440e : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getModuleName(...)");
            java.lang.String str4 = zArr[3] ? notification.f298441f : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getFunctionName(...)");
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(qVar.Ai(str3, str4));
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ey.t) it.next()).c(notification);
                }
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c cVar = qVar.f338817e;
        if (cVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.C27321xdbc4c676) cVar).T1(j17, true);
        }
    }

    /* renamed from: ZIDL_BV */
    public void m112958x1964d19c(long j17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e notification = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e.f298422m, bArr);
        ey.q qVar = (ey.q) this.f298418a;
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "notifyFunctionCallEndAsync");
        java.util.HashMap hashMap = qVar.f338819g;
        boolean[] zArr = notification.f298428i;
        java.lang.String str = zArr[2] ? notification.f298424e : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getModuleName(...)");
        java.lang.String str2 = zArr[3] ? notification.f298425f : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFunctionName(...)");
        if (hashMap.containsKey(qVar.Ai(str, str2))) {
            java.lang.String str3 = zArr[2] ? notification.f298424e : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getModuleName(...)");
            java.lang.String str4 = zArr[3] ? notification.f298425f : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getFunctionName(...)");
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(qVar.Ai(str3, str4));
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ey.k) it.next()).c(notification);
                }
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c cVar = qVar.f338817e;
        if (cVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.C27321xdbc4c676) cVar).S1(j17, true);
        }
    }

    /* renamed from: ZIDL_CV */
    public void m112959x1964d1bb(long j17) {
        ey.q qVar = (ey.q) this.f298418a;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "getFunctionProtocolPathAsync");
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.io.File file = new java.io.File(context.getCacheDir(), "FunctionCall.protocol");
            if (!file.exists()) {
                java.io.InputStream open = context.getAssets().open("FunctionCall.protocol");
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                    try {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(open);
                        vz5.a.b(open, fileOutputStream, 0, 2, null);
                        vz5.b.a(fileOutputStream, null);
                        vz5.b.a(open, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "getFunctionProtocolPathAsync copied to: " + file.getAbsolutePath());
                    } finally {
                    }
                } finally {
                }
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c cVar = qVar.f338817e;
            if (cVar != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.C27321xdbc4c676) cVar).Q1(j17, file.getAbsolutePath());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FunctionCallService", "getFunctionProtocolPathAsync failed: " + e17.getMessage());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c cVar2 = qVar.f338817e;
            if (cVar2 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.C27321xdbc4c676) cVar2).Q1(j17, "");
            }
        }
    }

    /* renamed from: ZIDL_DV */
    public void m112960x1964d1da(long j17) {
        ey.q qVar = (ey.q) this.f298418a;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCallService", "getProtocolTempDirAsync");
        java.lang.String absolutePath = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.c cVar = qVar.f338817e;
        if (cVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.C27321xdbc4c676) cVar).R1(j17, absolutePath);
        }
    }
}
