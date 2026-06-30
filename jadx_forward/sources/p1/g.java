package p1;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f432350a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.v f432351b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f432352c;

    public g(java.util.Map changes, p1.v pointerInputEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changes, "changes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerInputEvent, "pointerInputEvent");
        this.f432350a = changes;
        this.f432351b = pointerInputEvent;
    }

    public final boolean a(long j17) {
        java.lang.Object obj;
        java.util.List list = this.f432351b.f432436a;
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i17);
            if (p1.r.a(((p1.w) obj).f432442a, j17)) {
                break;
            }
            i17++;
        }
        p1.w wVar = (p1.w) obj;
        if (wVar != null) {
            return wVar.f432448g;
        }
        return false;
    }
}
