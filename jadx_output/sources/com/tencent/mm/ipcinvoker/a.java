package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.j f68326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable f68327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lk0.f f68328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68329g;

    public a(com.tencent.mm.ipcinvoker.b bVar, com.tencent.mm.ipcinvoker.j jVar, android.os.Parcelable parcelable, lk0.f fVar, java.lang.String str) {
        this.f68326d = jVar;
        this.f68327e = parcelable;
        this.f68328f = fVar;
        this.f68329g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f68326d.invoke(this.f68327e, new com.tencent.mm.ipcinvoker.c(this.f68328f));
        } catch (java.lang.NullPointerException e17) {
            rk0.c.b("IPC.BaseIPCService", "invoke task, clazz=%s, npe=%s", this.f68329g, e17);
        }
    }
}
