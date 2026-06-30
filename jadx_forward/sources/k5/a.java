package k5;

/* loaded from: classes13.dex */
public class a extends k5.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5.w f385648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f385649f;

    public a(b5.w wVar, java.util.UUID uuid) {
        this.f385648e = wVar;
        this.f385649f = uuid;
    }

    @Override // k5.d
    public void b() {
        b5.w wVar = this.f385648e;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = wVar.f99430c;
        abstractC1265x5c5aefcc.c();
        try {
            a(wVar, this.f385649f.toString());
            abstractC1265x5c5aefcc.h();
            abstractC1265x5c5aefcc.f();
            b5.g.a(wVar.f99429b, wVar.f99430c, wVar.f99432e);
        } catch (java.lang.Throwable th6) {
            abstractC1265x5c5aefcc.f();
            throw th6;
        }
    }
}
