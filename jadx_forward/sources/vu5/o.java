package vu5;

/* loaded from: classes12.dex */
public class o implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public int f521895d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f521896e;

    public o(vu5.p pVar, java.util.List list) {
        this.f521896e = list;
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        if (this.f521895d > 1) {
            this.f521896e.add(str.trim());
        }
        this.f521895d++;
    }
}
