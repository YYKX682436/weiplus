package h53;

/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final sd.g f360597a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f360598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f360599c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f360600d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f360601e = new java.util.LinkedList();

    public q(sd.g gVar) {
        this.f360597a = gVar;
    }

    public void a(sd.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "dispatchEvent, hasDestroyed = %b, hasReady = %b", java.lang.Boolean.valueOf(this.f360599c), java.lang.Boolean.valueOf(this.f360598b));
        if (this.f360599c) {
            return;
        }
        if (this.f360598b) {
            this.f360597a.c(eVar);
        } else {
            this.f360600d.add(eVar);
        }
    }
}
