package androidx.lifecycle;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f11636a = new java.util.HashMap();

    public final void a() {
        java.util.Iterator it = this.f11636a.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.c1) it.next()).clear();
        }
        this.f11636a.clear();
    }
}
