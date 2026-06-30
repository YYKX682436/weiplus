package zi0;

/* loaded from: classes13.dex */
public final class d implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f554617a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f554618b = false;

    public final void a() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
    /* renamed from: endOfStream */
    public void mo138416x56f72e32() {
        zi0.b bVar = new zi0.b(null);
        if (!this.f554618b) {
            this.f554617a.add(bVar);
        }
        a();
        this.f554618b = true;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
    /* renamed from: error */
    public void mo138417x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        zi0.c cVar = new zi0.c(str, str2, obj);
        if (!this.f554618b) {
            this.f554617a.add(cVar);
        }
        a();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
    /* renamed from: success */
    public void mo138418x90b54003(java.lang.Object obj) {
        if (!this.f554618b) {
            this.f554617a.add(obj);
        }
        a();
    }
}
