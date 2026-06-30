package rl3;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl3.l f478792d;

    public k(rl3.l lVar) {
        this.f478792d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rl3.l lVar = this.f478792d;
        if (currentTimeMillis - lVar.f478793a > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            lVar.f478793a = java.lang.System.currentTimeMillis();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3v), 0).show();
        }
    }
}
