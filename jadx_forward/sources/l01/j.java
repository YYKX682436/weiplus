package l01;

/* loaded from: classes7.dex */
public class j extends java.io.BufferedOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l01.k kVar, java.io.OutputStream outputStream, java.lang.String str) {
        super(outputStream);
        this.f396310d = str;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        super.flush();
        com.p314xaae8f345.mm.vfs.w6.h(this.f396310d);
    }
}
