package ei3;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.u f334651d;

    public r(ei3.u uVar) {
        this.f334651d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f334651d.f334676t == null) {
            return;
        }
        ei3.u uVar = this.f334651d;
        uVar.E = true;
        uVar.m();
    }
}
