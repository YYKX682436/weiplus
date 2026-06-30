package k3;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final k3.o f385310a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f385311b;

    public c(k3.o oVar, android.os.Handler handler) {
        this.f385310a = oVar;
        this.f385311b = handler;
    }

    public void a(k3.k kVar) {
        int i17 = kVar.f385329b;
        boolean z17 = i17 == 0;
        android.os.Handler handler = this.f385311b;
        k3.o oVar = this.f385310a;
        if (z17) {
            handler.post(new k3.a(this, oVar, kVar.f385328a));
        } else {
            handler.post(new k3.b(this, oVar, i17));
        }
    }
}
