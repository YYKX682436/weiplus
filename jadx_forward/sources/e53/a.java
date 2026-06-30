package e53;

/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.mm.app.s2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.Set entrySet = e53.b.f331146b.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            for (java.util.Map.Entry entry : ((java.util.Map) value).entrySet()) {
                if (((e53.c) entry.getValue()).f331157j != 0) {
                    if (((e53.c) entry.getValue()).f331156i) {
                        e53.c cVar = (e53.c) entry.getValue();
                        long j17 = cVar.f331155h;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        cVar.f331155h = j17 + (android.os.SystemClock.elapsedRealtime() - ((e53.c) entry.getValue()).f331157j);
                    } else {
                        e53.c cVar2 = (e53.c) entry.getValue();
                        long j18 = cVar2.f331155h;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        cVar2.f331155h = j18 + ((android.os.SystemClock.elapsedRealtime() - ((e53.c) entry.getValue()).f331157j) / 1000);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.Set entrySet = e53.b.f331146b.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            for (java.util.Map.Entry entry : ((java.util.Map) value).entrySet()) {
                if (((e53.c) entry.getValue()).f331157j != 0) {
                    e53.c cVar = (e53.c) entry.getValue();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    cVar.f331157j = android.os.SystemClock.elapsedRealtime();
                }
            }
        }
    }
}
