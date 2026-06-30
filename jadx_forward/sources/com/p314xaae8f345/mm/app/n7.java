package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class n7 implements com.p314xaae8f345.mm.p2617xca9a2a67.f {
    public boolean a(android.content.Context context, android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        boolean z17;
        java.lang.String className = (intent == null || intent.getComponent() == null) ? "" : intent.getComponent().getClassName();
        java.util.List list = j45.l.f379246a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((j45.i) it.next()).b(context, className, intent, 0, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return true;
        }
        java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) j45.l.f379247b).iterator();
        while (it6.hasNext()) {
            if (((j45.j) it6.next()).a(context, activity, intent, i17, bundle)) {
                return true;
            }
        }
        return false;
    }
}
