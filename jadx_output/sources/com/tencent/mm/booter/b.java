package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class b implements c01.z7 {

    /* renamed from: c, reason: collision with root package name */
    public static c01.z7 f63303c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile com.tencent.mm.booter.b f63304d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f63305a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f63306b;

    public b() {
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(new com.tencent.mm.booter.a(this));
        if (this.f63306b == null) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            this.f63306b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecordStateChangeEvent>(a0Var) { // from class: com.tencent.mm.booter.BackgroundPlayer$2
                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.RecordStateChangeEvent recordStateChangeEvent) {
                    int i17 = recordStateChangeEvent.f54665g.f6786a;
                    com.tencent.mm.booter.b bVar = com.tencent.mm.booter.b.this;
                    if (i17 == 0) {
                        bVar.a();
                        return false;
                    }
                    if (i17 != 1) {
                        return false;
                    }
                    bVar.b();
                    return false;
                }
            };
        }
        this.f63306b.alive();
    }

    public static c01.z7 c() {
        if (f63303c == null) {
            f63303c = d();
        }
        return f63303c;
    }

    public static com.tencent.mm.booter.b d() {
        if (f63304d == null) {
            synchronized (com.tencent.mm.booter.b.class) {
                if (f63304d == null) {
                    f63304d = new com.tencent.mm.booter.b();
                }
            }
        }
        return f63304d;
    }

    public void a() {
        java.util.List list = this.f63305a;
        if (list == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((c01.a8) it.next()).d();
        }
    }

    public void b() {
        java.util.List list = this.f63305a;
        if (list == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((c01.a8) it.next()).b();
        }
    }
}
