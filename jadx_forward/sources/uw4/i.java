package uw4;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f513267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f513268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uw4.n f513269f;

    public i(uw4.n nVar, java.lang.String str, java.util.Map map) {
        this.f513269f = nVar;
        this.f513267d = str;
        this.f513268e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*com.tencent.xweb.WebView*/.mo32266x141096a9(this.f513267d, this.f513268e);
    }
}
