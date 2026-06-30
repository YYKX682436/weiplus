package i81;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i81.q f371135e;

    public m(i81.q qVar, java.lang.String str) {
        this.f371135e = qVar;
        this.f371134d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        i81.q qVar = this.f371135e;
        i81.p pVar = qVar.f371142h;
        if (pVar != null) {
            pVar.a(this.f371134d);
        }
        qVar.setVisibility(8);
    }
}
