package rf5;

/* loaded from: classes10.dex */
public interface b extends pf5.g, bm5.s0 {
    default void J0(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        rf5.a aVar = (rf5.a) pf5.z.f435481a.a(activity).a(rf5.a.class);
        aVar.getClass();
        java.lang.String mo10824xb5887064 = mo10824xb5887064();
        java.util.HashMap hashMap = aVar.f476665d;
        if (hashMap.containsKey(mo10824xb5887064)) {
            java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(mo10824xb5887064());
            if (linkedList != null) {
                linkedList.add(this);
                return;
            }
            return;
        }
        java.lang.String mo10824xb58870642 = mo10824xb5887064();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(this);
        hashMap.put(mo10824xb58870642, linkedList2);
    }

    default void x8(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        rf5.a aVar = (rf5.a) pf5.z.f435481a.a(activity).a(rf5.a.class);
        aVar.getClass();
        java.lang.String mo10824xb5887064 = mo10824xb5887064();
        java.util.HashMap hashMap = aVar.f476665d;
        java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(mo10824xb5887064);
        if (linkedList != null) {
            linkedList.remove(this);
            if (linkedList.isEmpty()) {
                hashMap.remove(mo10824xb5887064());
            }
        }
    }
}
