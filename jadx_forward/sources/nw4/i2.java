package nw4;

/* loaded from: classes.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422387e;

    public i2(nw4.n nVar, java.lang.String str) {
        this.f422387e = nVar;
        this.f422386d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422387e.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f422386d + ")", null);
        } catch (java.lang.Exception unused) {
        }
    }
}
