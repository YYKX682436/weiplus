package uw4;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f513260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f513261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uw4.n f513262f;

    public f(uw4.n nVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f513262f = nVar;
        this.f513260d = str;
        this.f513261e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*com.tencent.mm.ui.widget.MMWebView*/.mo14660x738236e6(this.f513260d, this.f513261e);
    }
}
