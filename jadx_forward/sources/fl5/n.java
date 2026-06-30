package fl5;

/* loaded from: classes5.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.lang.reflect.Constructor a(fl5.n nVar, java.lang.String str) {
        nVar.getClass();
        if (str == null) {
            throw new java.lang.IllegalArgumentException("name is null.");
        }
        java.util.HashMap hashMap = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22663xdc925b30.f293089q;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = java.lang.Class.forName(str).getConstructor(android.content.Context.class, android.util.AttributeSet.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getConstructor(...)");
            hashMap.put(str, obj);
        }
        return (java.lang.reflect.Constructor) obj;
    }
}
