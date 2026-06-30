package d85;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final d85.h f308728a = new d85.h();

    public static final java.lang.reflect.Field a(d85.h hVar, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Field field;
        hVar.getClass();
        try {
            field = cls.getDeclaredField(str2);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContentProviderHooker", "[findField] = " + field);
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContentProviderHooker", "NoSuchFieldException: " + th.getMessage());
                return field;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            field = null;
        }
        return field;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|2|3|4|5|6|7|8|(11:50|51|(9:46|47|13|14|15|16|(3:40|41|(1:20)(2:(1:23)(1:39)|(1:25)(2:26|(1:28)(7:29|(1:31)|32|33|(1:35)|36|38))))|18|(0)(0))|12|13|14|15|16|(0)|18|(0)(0))|10|(0)|12|13|14|15|16|(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0030, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r12 = this;
            java.lang.String r0 = "ContentProviderHooker"
            java.lang.String r1 = "hookBiggerEqualApi26LessApi29()"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r1 = 0
            e52.a r2 = e52.b.f331144a     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "android.app.ActivityManager"
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.Exception -> L80
            goto L13
        L12:
            r3 = r4
        L13:
            java.lang.String r5 = "IActivityManagerSingleton"
            r6 = 1
            if (r3 == 0) goto L20
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L20 java.lang.Exception -> L80
            r3.setAccessible(r6)     // Catch: java.lang.NoSuchFieldException -> L20 java.lang.Exception -> L80
            goto L21
        L20:
            r3 = r4
        L21:
            if (r3 != 0) goto L25
        L23:
            r3 = r4
            goto L29
        L25:
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L80
        L29:
            java.lang.String r5 = "android.util.Singleton"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L30 java.lang.Exception -> L80
            goto L31
        L30:
            r5 = r4
        L31:
            java.lang.String r7 = "mInstance"
            if (r5 == 0) goto L3d
            java.lang.reflect.Field r5 = r5.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.Exception -> L80
            r5.setAccessible(r6)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.Exception -> L80
            goto L3e
        L3d:
            r5 = r4
        L3e:
            if (r5 != 0) goto L41
            return
        L41:
            if (r3 != 0) goto L45
            r6 = r4
            goto L49
        L45:
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Exception -> L80
        L49:
            if (r6 != 0) goto L4c
            return
        L4c:
            com.tencent.mm.sensitive.ContentProviderHooker$HookInvocationHandler r7 = new com.tencent.mm.sensitive.ContentProviderHooker$HookInvocationHandler     // Catch: java.lang.Exception -> L80
            r7.<init>(r6)     // Catch: java.lang.Exception -> L80
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Exception -> L80
            java.util.ArrayList r2 = r2.a(r8)     // Catch: java.lang.Exception -> L80
            if (r2 != 0) goto L5c
            return
        L5c:
            int r8 = r2.size()     // Catch: java.lang.Exception -> L80
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L80
            r10 = r1
        L63:
            if (r10 >= r8) goto L6e
            java.lang.Object r11 = r2.get(r10)     // Catch: java.lang.Exception -> L80
            r9[r10] = r11     // Catch: java.lang.Exception -> L80
            int r10 = r10 + 1
            goto L63
        L6e:
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Exception -> L80
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L7c
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r2, r9, r7)     // Catch: java.lang.Exception -> L80
        L7c:
            r5.set(r3, r4)     // Catch: java.lang.Exception -> L80
            goto L88
        L80:
            r2 = move-exception
            java.lang.String r3 = "hookBiggerEqualApi26LessApi29"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r2, r3, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d85.h.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[Catch: Exception -> 0x014a, TRY_LEAVE, TryCatch #2 {Exception -> 0x014a, blocks: (B:7:0x001b, B:18:0x0087, B:23:0x0092, B:25:0x0098, B:29:0x00a4, B:31:0x00ad, B:33:0x00b6, B:35:0x00c5, B:37:0x00cd, B:38:0x00d0, B:43:0x00d9, B:45:0x00e1, B:78:0x00ed, B:69:0x00fc, B:71:0x0108, B:54:0x0111, B:58:0x011c, B:60:0x0125, B:62:0x012e, B:64:0x013d, B:65:0x0141, B:100:0x007b), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[Catch: Exception -> 0x014a, LOOP:1: B:59:0x0123->B:60:0x0125, LOOP_END, TryCatch #2 {Exception -> 0x014a, blocks: (B:7:0x001b, B:18:0x0087, B:23:0x0092, B:25:0x0098, B:29:0x00a4, B:31:0x00ad, B:33:0x00b6, B:35:0x00c5, B:37:0x00cd, B:38:0x00d0, B:43:0x00d9, B:45:0x00e1, B:78:0x00ed, B:69:0x00fc, B:71:0x0108, B:54:0x0111, B:58:0x011c, B:60:0x0125, B:62:0x012e, B:64:0x013d, B:65:0x0141, B:100:0x007b), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[Catch: Exception -> 0x014a, TryCatch #2 {Exception -> 0x014a, blocks: (B:7:0x001b, B:18:0x0087, B:23:0x0092, B:25:0x0098, B:29:0x00a4, B:31:0x00ad, B:33:0x00b6, B:35:0x00c5, B:37:0x00cd, B:38:0x00d0, B:43:0x00d9, B:45:0x00e1, B:78:0x00ed, B:69:0x00fc, B:71:0x0108, B:54:0x0111, B:58:0x011c, B:60:0x0125, B:62:0x012e, B:64:0x013d, B:65:0x0141, B:100:0x007b), top: B:6:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d85.h.c():void");
    }
}
