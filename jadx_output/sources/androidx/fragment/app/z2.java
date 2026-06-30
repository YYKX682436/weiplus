package androidx.fragment.app;

/* loaded from: classes13.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f11529e;

    public z2(androidx.fragment.app.b3 b3Var, java.util.ArrayList arrayList, java.util.Map map) {
        this.f11528d = arrayList;
        this.f11529e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.util.ArrayList arrayList = this.f11528d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view = (android.view.View) arrayList.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            java.lang.String k17 = n3.a1.k(view);
            if (k17 != null) {
                java.util.Iterator it = this.f11529e.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (k17.equals(entry.getValue())) {
                        str = (java.lang.String) entry.getKey();
                        break;
                    }
                }
                n3.a1.v(view, str);
            }
        }
    }
}
