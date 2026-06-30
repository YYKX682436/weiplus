package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.f f302239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.g f302241f;

    public c0(com.p3263xee53b379.b bVar, com.p3263xee53b379.f fVar, java.lang.String str, com.p3263xee53b379.d dVar) {
        this.f302239d = fVar;
        this.f302240e = str;
        this.f302241f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p3263xee53b379.f fVar = this.f302239d;
        if (fVar != null) {
            fVar.a(this.f302240e, this.f302241f);
        }
    }
}
