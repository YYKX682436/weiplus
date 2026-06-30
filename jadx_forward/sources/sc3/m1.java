package sc3;

/* loaded from: classes7.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.q1 f488036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488037e;

    public m1(sc3.q1 q1Var, java.lang.String str) {
        this.f488036d = q1Var;
        this.f488037e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f488036d.f488010f.d(this.f488037e);
    }
}
