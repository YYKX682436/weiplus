package ea3;

/* loaded from: classes10.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.y f332212d;

    public x(ea3.y yVar) {
        this.f332212d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ea3.y yVar = this.f332212d;
        yVar.f332214b.f332196v.startAnimation(android.view.animation.AnimationUtils.loadAnimation(yVar.f332214b.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd));
        yVar.f332214b.f332196v.setVisibility(8);
    }
}
