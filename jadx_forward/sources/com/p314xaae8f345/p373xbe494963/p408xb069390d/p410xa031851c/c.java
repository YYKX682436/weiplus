package com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b f128698a;

    private c(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar) {
        this.f128698a = bVar;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar) {
        return new com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.c(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b bVar = this.f128698a;
        if (bVar.f128675e != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(bVar.f128671a, "onRequestRestart");
            bVar.f128675e.a();
        }
    }
}
