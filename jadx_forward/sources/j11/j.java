package j11;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f378659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j11.h f378660f;

    public j(j11.h hVar, java.lang.String str, boolean z17) {
        this.f378660f = hVar;
        this.f378658d = str;
        this.f378659e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        if (((java.util.HashMap) this.f378660f.f378647c).containsKey(this.f378658d)) {
            synchronized (this) {
                linkedList = (java.util.LinkedList) ((java.util.HashMap) this.f378660f.f378647c).get(this.f378658d);
                ((java.util.HashMap) this.f378660f.f378647c).remove(this.f378658d);
            }
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((c01.o8) it.next()).a(this.f378658d, this.f378659e);
                }
            }
        }
    }
}
