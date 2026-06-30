package al5;

/* loaded from: classes15.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab f87414d;

    public d3(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab) {
        this.f87414d = c22649x858f5ab;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab.f292958J;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = this.f87414d;
        android.content.Context context = c22649x858f5ab.getContext();
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SwipeBackLayout", "Reset translucent status failed");
        } else if (c22649x858f5ab.f292972t) {
            c22649x858f5ab.m81454x4335bff3(true);
            c22649x858f5ab.d(false);
            db5.f.b((android.app.Activity) context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "Reset translucent status");
        }
    }
}
