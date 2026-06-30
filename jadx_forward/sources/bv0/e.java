package bv0;

/* loaded from: classes5.dex */
public final class e implements dy0.i {

    /* renamed from: a, reason: collision with root package name */
    public final n3.q f106223a;

    /* renamed from: b, reason: collision with root package name */
    public final bv0.h f106224b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f106225c;

    /* renamed from: d, reason: collision with root package name */
    public bv0.d f106226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f106227e;

    public e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        n3.q qVar = new n3.q(context, new bv0.b(this));
        ((n3.p) qVar.f415922a).f415915a.setIsLongpressEnabled(false);
        this.f106223a = qVar;
        this.f106224b = new bv0.h(context, new bv0.c(this));
        this.f106226d = bv0.d.f106219d;
        this.f106227e = new java.util.ArrayList();
    }

    public final void a(bv0.a gestureCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureCallback, "gestureCallback");
        java.util.ArrayList arrayList = this.f106227e;
        if (arrayList.contains(gestureCallback)) {
            return;
        }
        arrayList.add(gestureCallback);
    }
}
