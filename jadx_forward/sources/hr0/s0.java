package hr0;

/* loaded from: classes12.dex */
public final class s0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final hr0.s0 f364861a = new hr0.s0();

    public static final void a(java.util.Set set, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i17) {
        set.add(uncaughtExceptionHandler);
        java.lang.reflect.Field[] declaredFields = uncaughtExceptionHandler.getClass().getDeclaredFields();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
        for (java.lang.reflect.Field field : declaredFields) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(uncaughtExceptionHandler);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SignalHookHandler", r26.i0.s("\t", i17) + " - " + field.getName() + ": " + field.getClass().getName() + " = " + obj);
            if ((obj instanceof java.lang.Thread.UncaughtExceptionHandler) && !set.contains(obj)) {
                a(set, (java.lang.Thread.UncaughtExceptionHandler) obj, i17 + 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r13 != null ? r13.processName : null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b) != false) goto L59;
     */
    @Override // m3.a
    /* renamed from: accept */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3938xab27b508(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr0.s0.mo3938xab27b508(java.lang.Object):void");
    }
}
