package tn1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn1.c f502326d;

    public a(tn1.c cVar) {
        this.f502326d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tn1.c cVar = this.f502326d;
        java.util.Iterator it = cVar.f502329a.iterator();
        while (it.hasNext()) {
            tn1.b bVar = (tn1.b) it.next();
            int i17 = bVar.f502327a;
            java.lang.Object obj = bVar.f502328b;
            if (i17 == 2 && obj != null && (obj instanceof java.lang.String)) {
                c01.n8.a().c((java.lang.String) obj, 16);
            } else if (i17 == 1 && obj != null && (obj instanceof java.lang.String)) {
                zo3.p.Ni().f((java.lang.String) obj);
            }
        }
        cVar.f502329a.clear();
    }
}
