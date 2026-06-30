package yw;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f547891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f547892g;

    public j(yw.y yVar, int i17, boolean z17, boolean z18) {
        this.f547889d = yVar;
        this.f547890e = i17;
        this.f547891f = z17;
        this.f547892g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547889d.f548042a;
        if (cVar != null) {
            cVar.F0(this.f547890e, yw.m.a(this.f547891f, this.f547892g));
        }
    }
}
