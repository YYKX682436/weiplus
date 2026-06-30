package com.tencent.mm.plugin.announcement;

/* loaded from: classes8.dex */
public class s implements n75.b {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.announcement.s f74705e = new com.tencent.mm.plugin.announcement.s();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f74706d = false;

    @Override // n75.b
    public l75.k0 Q4() {
        if (!this.f74706d) {
            synchronized (this) {
                if (!this.f74706d) {
                    dm.a2.createTable(gm0.j1.u().f273153f);
                }
                this.f74706d = true;
            }
        }
        return gm0.j1.u().f273153f;
    }
}
