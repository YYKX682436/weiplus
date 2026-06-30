package w82;

/* loaded from: classes12.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f525442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f525443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525444f;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505, long j17, long j18) {
        this.f525444f = viewOnClickListenerC13625xe5fb4505;
        this.f525442d = j17;
        this.f525443e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525444f;
        android.widget.ProgressBar progressBar = viewOnClickListenerC13625xe5fb4505.f183118z;
        if (progressBar != null && progressBar.getVisibility() != 8) {
            viewOnClickListenerC13625xe5fb4505.f183118z.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = viewOnClickListenerC13625xe5fb4505.A;
        if (c22626x3e1b8dda != null) {
            if (c22626x3e1b8dda.getVisibility() != 0) {
                viewOnClickListenerC13625xe5fb4505.A.setVisibility(0);
            }
            java.lang.String str = viewOnClickListenerC13625xe5fb4505.f183099d;
            long j17 = this.f525442d;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            long j18 = this.f525443e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "download video update progress offset:%d  total: %d", valueOf, java.lang.Long.valueOf(j18));
            if (j18 > 2147483647L) {
                j18 /= 1024;
                j17 /= 1024;
            }
            if (viewOnClickListenerC13625xe5fb4505.A.m81376xb588562e() != j18 && j18 > 0) {
                viewOnClickListenerC13625xe5fb4505.A.m81380xca027da2((int) j18);
            }
            viewOnClickListenerC13625xe5fb4505.A.m81381x3ae760af((int) j17);
        }
    }
}
