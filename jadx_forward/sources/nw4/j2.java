package nw4;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f422391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422392f;

    public j2(nw4.n nVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f422392f = nVar;
        this.f422390d = str;
        this.f422391e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f422392f.f422420a.mo14660x738236e6(this.f422390d, this.f422391e);
    }
}
