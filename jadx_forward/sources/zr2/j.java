package zr2;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr2.k f556725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f556726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f556727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f556728g;

    public j(zr2.k kVar, java.util.LinkedList linkedList, int i17, int i18) {
        this.f556725d = kVar;
        this.f556726e = linkedList;
        this.f556727f = i17;
        this.f556728g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zr2.k.a(this.f556725d, this.f556726e, this.f556727f, this.f556728g);
    }
}
