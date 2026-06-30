package sc2;

/* loaded from: classes2.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487340g;

    public c3(ad2.h hVar, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f487337d = hVar;
        this.f487338e = s0Var;
        this.f487339f = view;
        this.f487340g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((sc2.m3) this.f487337d).M(this.f487338e, this.f487339f, true, this.f487340g);
    }
}
