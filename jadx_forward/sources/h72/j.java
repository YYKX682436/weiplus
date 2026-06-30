package h72;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f360978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.s f360979e;

    public j(h72.s sVar, float f17) {
        this.f360979e = sVar;
        this.f360978d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.m mVar = this.f360979e.f361000a;
        if (mVar != null) {
            mVar.e(this.f360978d);
        }
    }
}
