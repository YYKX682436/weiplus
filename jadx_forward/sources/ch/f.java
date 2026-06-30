package ch;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.fs.InterfaceC4213x5d50cacd {

    /* renamed from: a, reason: collision with root package name */
    public final dh.a f122715a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f122716b;

    public f(dh.a fs6, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad mb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mb6, "mb");
        this.f122715a = fs6;
        this.f122716b = mb6;
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.fs.InterfaceC4213x5d50cacd
    /* renamed from: getAbsolutePath */
    public java.lang.String mo14817x1d57e4b2(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return this.f122715a.mo52657x1d57e4b2(path);
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.fs.InterfaceC4213x5d50cacd
    /* renamed from: readDataFromURL */
    public void mo14818x68f342e5(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f122715a.a(path, new ch.e(this, path));
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.fs.InterfaceC4213x5d50cacd
    /* renamed from: readDataFromURLSync */
    public byte[] mo14819x6644d720(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return this.f122715a.mo52658x6644d720(path);
    }
}
