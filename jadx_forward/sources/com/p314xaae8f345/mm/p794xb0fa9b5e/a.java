package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.j f149859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable f149860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lk0.f f149861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149862g;

    public a(com.p314xaae8f345.mm.p794xb0fa9b5e.b bVar, com.p314xaae8f345.mm.p794xb0fa9b5e.j jVar, android.os.Parcelable parcelable, lk0.f fVar, java.lang.String str) {
        this.f149859d = jVar;
        this.f149860e = parcelable;
        this.f149861f = fVar;
        this.f149862g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f149859d.mo8834xb9724478(this.f149860e, new com.p314xaae8f345.mm.p794xb0fa9b5e.c(this.f149861f));
        } catch (java.lang.NullPointerException e17) {
            rk0.c.b("IPC.BaseIPCService", "invoke task, clazz=%s, npe=%s", this.f149862g, e17);
        }
    }
}
