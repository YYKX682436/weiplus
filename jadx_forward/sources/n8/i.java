package n8;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f417059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8.m f417060e;

    public i(n8.m mVar, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        this.f417060e = mVar;
        this.f417059d = c1601x7dc4e417;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f417060e.f417070b.B(this.f417059d);
    }
}
