package tf4;

/* loaded from: classes12.dex */
public final class b extends xm1.k {

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f500483k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f500484l;

    public b(yz5.l onStartRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onStartRecord, "onStartRecord");
        this.f500483k = onStartRecord;
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        if (this.f500484l) {
            return;
        }
        this.f500484l = true;
        this.f500483k.mo146xb9724478(java.lang.Boolean.TRUE);
    }
}
