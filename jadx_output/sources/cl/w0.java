package cl;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f42811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42812f;

    public w0(cl.q0 q0Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f42812f = q0Var;
        this.f42810d = str;
        this.f42811e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.eclipsesource.mmv8.V8Value object = this.f42812f.f().getObject(this.f42810d);
        if (object == null) {
            object = com.eclipsesource.mmv8.V8.getUndefined();
        }
        this.f42811e.onReceiveValue(object);
    }
}
