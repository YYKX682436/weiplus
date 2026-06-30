package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class x implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 f91267d;

    public x(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1) {
        this.f91267d = c0077x141f33d1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        n3.d dVar;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1 = this.f91267d;
        if (c0077x141f33d1.b()) {
            if (!c0077x141f33d1.isShown()) {
                c0077x141f33d1.m2634x9c99e208().mo2732x63a3b28a();
                return;
            }
            c0077x141f33d1.m2634x9c99e208().mo2735x35dafd();
            n3.f fVar = c0077x141f33d1.f90887n;
            if (fVar == null || (dVar = fVar.f415863a) == null) {
                return;
            }
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q) dVar).n(true);
        }
    }
}
