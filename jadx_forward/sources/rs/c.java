package rs;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f480773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs.k f480774e;

    public c(rs.k kVar, java.util.ArrayList arrayList) {
        this.f480774e = kVar;
        this.f480773d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f480773d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rs.k kVar = this.f480774e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f480813l.remove(arrayList);
                return;
            }
            kVar.D((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next());
        }
    }
}
