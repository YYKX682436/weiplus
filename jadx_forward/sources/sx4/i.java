package sx4;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.q f495146e;

    public i(sx4.q qVar, java.lang.String str) {
        this.f495146e = qVar;
        this.f495145d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx4.q qVar = this.f495146e;
        qVar.f495172c.setVisibility(8);
        qVar.f495178i.Z(this.f495145d);
    }
}
