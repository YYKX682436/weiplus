package zi3;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi3.f f554700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cv.v0 f554701e;

    public e(zi3.f fVar, cv.v0 v0Var) {
        this.f554700d = fVar;
        this.f554701e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.Toast toast = this.f554700d.f554712t;
        if (toast != null) {
            toast.cancel();
        }
        this.f554700d.f554712t = db5.t7.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574112m21, this.f554701e.f304050b));
        android.widget.Toast toast2 = this.f554700d.f554712t;
        if (toast2 != null) {
            toast2.show();
        }
    }
}
