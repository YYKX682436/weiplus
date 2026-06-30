package ns2;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f420922a = new java.util.LinkedHashMap();

    public final void a(java.lang.Object obj, java.util.Set handlers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handlers, "handlers");
        java.util.Iterator it = handlers.iterator();
        while (it.hasNext()) {
            ns2.l handler = (ns2.l) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleConfig", "groupName:" + obj + " handler:" + handler);
            java.util.Map map = this.f420922a;
            if (map.containsKey(obj)) {
                java.util.Set set = (java.util.Set) ((java.util.LinkedHashMap) map).get(obj);
                if (set != null) {
                    set.add(handler);
                }
            } else {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(handler);
                map.put(obj, hashSet);
            }
        }
    }
}
