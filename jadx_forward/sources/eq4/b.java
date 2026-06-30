package eq4;

/* loaded from: classes12.dex */
public final class b extends xm1.k {

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f337436k;

    /* renamed from: l, reason: collision with root package name */
    public fp.e f337437l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f337438m;

    public b(yz5.l onStartRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onStartRecord, "onStartRecord");
        this.f337436k = onStartRecord;
        i();
        ym1.f.f544667h.h(this, "record");
    }

    public final void C(boolean z17) {
        if (!z17) {
            q("record");
            ym1.f.f544667h.o("record");
        }
        fp.e eVar = this.f337437l;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        if (this.f337438m) {
            return;
        }
        this.f337438m = true;
        q("record");
        ym1.f.f544667h.o("record");
        this.f337436k.mo146xb9724478(java.lang.Boolean.TRUE);
    }
}
