package v26;

/* loaded from: classes14.dex */
public final class r0 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57, qz5.e {

    /* renamed from: d, reason: collision with root package name */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f514586d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f514587e;

    public r0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, oz5.l lVar) {
        this.f514586d = interfaceC29045xdcb5ca57;
        this.f514587e = lVar;
    }

    @Override // qz5.e
    /* renamed from: getCallerFrame */
    public qz5.e mo144028x366976c() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f514586d;
        if (interfaceC29045xdcb5ca57 instanceof qz5.e) {
            return (qz5.e) interfaceC29045xdcb5ca57;
        }
        return null;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return this.f514587e;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        this.f514586d.mo48700xdecd0e93(obj);
    }
}
