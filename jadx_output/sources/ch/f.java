package ch;

/* loaded from: classes7.dex */
public final class f implements com.tencent.magicbrush.handler.fs.IMBFileSystemInner {

    /* renamed from: a, reason: collision with root package name */
    public final dh.a f41182a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.magicbrush.MagicBrush f41183b;

    public f(dh.a fs6, com.tencent.magicbrush.MagicBrush mb6) {
        kotlin.jvm.internal.o.g(fs6, "fs");
        kotlin.jvm.internal.o.g(mb6, "mb");
        this.f41182a = fs6;
        this.f41183b = mb6;
    }

    @Override // com.tencent.magicbrush.handler.fs.IMBFileSystemInner
    public java.lang.String getAbsolutePath(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return this.f41182a.getAbsolutePath(path);
    }

    @Override // com.tencent.magicbrush.handler.fs.IMBFileSystemInner
    public void readDataFromURL(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f41182a.a(path, new ch.e(this, path));
    }

    @Override // com.tencent.magicbrush.handler.fs.IMBFileSystemInner
    public byte[] readDataFromURLSync(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return this.f41182a.readDataFromURLSync(path);
    }
}
