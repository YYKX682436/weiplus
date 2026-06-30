package w82;

/* loaded from: classes12.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525370d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505) {
        this.f525370d = viewOnClickListenerC13625xe5fb4505;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525370d;
        android.widget.ProgressBar progressBar = viewOnClickListenerC13625xe5fb4505.f183118z;
        if (progressBar != null && progressBar.getVisibility() != 8) {
            viewOnClickListenerC13625xe5fb4505.f183118z.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = viewOnClickListenerC13625xe5fb4505.A;
        if (c22626x3e1b8dda == null || c22626x3e1b8dda.getVisibility() == 8) {
            return;
        }
        viewOnClickListenerC13625xe5fb4505.A.setVisibility(8);
    }
}
