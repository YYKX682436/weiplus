package gf;

/* loaded from: classes7.dex */
public final class o0 implements com.p314xaae8f345.p2936x80def495.jni.InterfaceC25594x1b3dbf7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f352687a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f352687a = service;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.SkylineFileSystemImpl", service.mo48798x74292566() + " init " + service);
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25594x1b3dbf7
    /* renamed from: writeTempFileAsync */
    public void mo95907x5d21ef4d(byte[] bytes, java.lang.String suffix, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25595x3146795c callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f394148d).a(new gf.n0(this, callback, bytes, suffix));
    }
}
