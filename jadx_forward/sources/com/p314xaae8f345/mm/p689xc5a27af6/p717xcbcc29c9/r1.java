package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes5.dex */
public abstract class r1 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        if (r0 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(android.content.Context r16, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r17) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.a(android.content.Context, com.tencent.mm.storage.f9):java.lang.String");
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        java.lang.String V1 = f9Var.V1();
        return V1 == null ? f9Var.y0() : V1;
    }

    public static final void c(boolean z17, final yz5.a task) {
        android.os.Looper looper;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        try {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("runMainHandler", "getMainLooper null");
                return;
            }
            try {
                looper = android.os.Looper.myLooper();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("runMainHandler", "getMyLooper exception: " + e17);
                looper = null;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mainLooper, looper) || z17) {
                new android.os.Handler(mainLooper).post(new java.lang.Runnable(task) { // from class: com.tencent.mm.feature.chatrecordstts.q1

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f147058d;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "function");
                        this.f147058d = task;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f147058d.mo152xb9724478();
                    }
                });
            } else {
                task.mo152xb9724478();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("runMainHandler", "getMainLooper exception: " + e18);
        }
    }
}
