package rl3;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f478795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.o f478796e;

    public m(rl3.o oVar, int i17) {
        this.f478796e = oVar;
        this.f478795d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574142h53), 0).show();
        rl3.p pVar = this.f478796e.f478797a;
        rl3.p.w(pVar, pVar.f478798k, this.f478795d);
    }
}
