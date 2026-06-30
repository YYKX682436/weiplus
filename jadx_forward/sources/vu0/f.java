package vu0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.h f521616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vu0.u f521618f;

    public f(vu0.h hVar, java.lang.String str, vu0.u uVar) {
        this.f521616d = hVar;
        this.f521617e = str;
        this.f521618f = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f521616d.c(this.f521617e, this.f521618f);
    }
}
