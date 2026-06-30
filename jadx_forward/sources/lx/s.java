package lx;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.u f403468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403469e;

    public s(lx.u uVar, java.lang.String str) {
        this.f403468d = uVar;
        this.f403469e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lx.u uVar = this.f403468d;
        try {
            com.p314xaae8f345.p2845xc516c4b6.biz.C23280xd9c114f4 c23280xd9c114f4 = uVar.f403491f;
            if (c23280xd9c114f4 != null) {
                c23280xd9c114f4.m85829xb5ae70e3(new lx.r(this.f403469e));
            }
        } finally {
            uVar.f403493h = null;
        }
    }
}
