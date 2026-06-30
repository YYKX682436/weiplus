package x03;

/* loaded from: classes15.dex */
public final class d2 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f532536a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f532537b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f532538c = false;

    public final void a() {
        if (this.f532536a == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f532537b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof x03.b2) {
                this.f532536a.mo138416x56f72e32();
            } else if (next instanceof x03.c2) {
                x03.c2 c2Var = (x03.c2) next;
                this.f532536a.mo138417x5c4d208(c2Var.f532529a, c2Var.f532530b, c2Var.f532531c);
            } else {
                this.f532536a.mo138418x90b54003(next);
            }
        }
        arrayList.clear();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
    /* renamed from: endOfStream */
    public void mo138416x56f72e32() {
        x03.b2 b2Var = new x03.b2(null);
        if (!this.f532538c) {
            this.f532537b.add(b2Var);
        }
        a();
        this.f532538c = true;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
    /* renamed from: error */
    public void mo138417x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        x03.c2 c2Var = new x03.c2(str, str2, obj);
        if (!this.f532538c) {
            this.f532537b.add(c2Var);
        }
        a();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
    /* renamed from: success */
    public void mo138418x90b54003(java.lang.Object obj) {
        if (!this.f532538c) {
            this.f532537b.add(obj);
        }
        a();
    }
}
