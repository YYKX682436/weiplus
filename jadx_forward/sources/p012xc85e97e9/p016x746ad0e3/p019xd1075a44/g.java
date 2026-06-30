package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd f91119d;

    public g(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd) {
        this.f91119d = c0074x22961cbd;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = this.f91119d;
        c0074x22961cbd.b();
        c0074x22961cbd.C = c0074x22961cbd.f90851g.animate().translationY(-c0074x22961cbd.f90851g.getHeight()).setListener(c0074x22961cbd.D);
    }
}
