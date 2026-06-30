package d95;

/* loaded from: classes12.dex */
public class i implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Printer f309217d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.Printer f309218e = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26991xeb892456(5, "MicroMsg.MMDataBase");

    public i(d95.f fVar, java.lang.StringBuilder sb6) {
        this.f309217d = new android.util.StringBuilderPrinter(sb6);
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        ((android.util.StringBuilderPrinter) this.f309217d).println(str);
        this.f309218e.println(str);
    }
}
