package c8;

/* loaded from: classes12.dex */
public class g implements java.io.FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121173a;

    public g(c8.h hVar, java.lang.String str) {
        this.f121173a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File file, java.lang.String str) {
        return str.startsWith(this.f121173a);
    }
}
