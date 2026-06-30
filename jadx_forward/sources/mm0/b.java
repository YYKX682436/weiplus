package mm0;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f410107a = new java.util.concurrent.ConcurrentHashMap();

    public synchronized void a(mm0.g gVar) {
        if (gVar != null) {
            java.lang.CharSequence charSequence = gVar.f410137d;
            if (charSequence != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) this.f410107a.get(charSequence.toString());
                if (linkedList == null) {
                    linkedList = new java.util.LinkedList();
                }
                linkedList.add(gVar);
                this.f410107a.put(gVar.f410137d.toString(), linkedList);
            }
        }
    }
}
