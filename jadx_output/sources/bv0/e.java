package bv0;

/* loaded from: classes5.dex */
public final class e implements dy0.i {

    /* renamed from: a, reason: collision with root package name */
    public final n3.q f24690a;

    /* renamed from: b, reason: collision with root package name */
    public final bv0.h f24691b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24692c;

    /* renamed from: d, reason: collision with root package name */
    public bv0.d f24693d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f24694e;

    public e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        n3.q qVar = new n3.q(context, new bv0.b(this));
        ((n3.p) qVar.f334389a).f334382a.setIsLongpressEnabled(false);
        this.f24690a = qVar;
        this.f24691b = new bv0.h(context, new bv0.c(this));
        this.f24693d = bv0.d.f24686d;
        this.f24694e = new java.util.ArrayList();
    }

    public final void a(bv0.a gestureCallback) {
        kotlin.jvm.internal.o.g(gestureCallback, "gestureCallback");
        java.util.ArrayList arrayList = this.f24694e;
        if (arrayList.contains(gestureCallback)) {
            return;
        }
        arrayList.add(gestureCallback);
    }
}
