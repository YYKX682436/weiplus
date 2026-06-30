package androidx.recyclerview.widget;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f12073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f12074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k f12076g;

    public i(androidx.recyclerview.widget.k kVar, java.util.List list, java.util.List list2, int i17) {
        this.f12076g = kVar;
        this.f12073d = list;
        this.f12074e = list2;
        this.f12075f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new androidx.recyclerview.widget.g(this), true);
        ((androidx.recyclerview.widget.j) this.f12076g.f12103c).execute(new androidx.recyclerview.widget.h(this, a17));
    }
}
