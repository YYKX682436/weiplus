package pe4;

/* loaded from: classes15.dex */
public class k implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f435238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pe4.m f435239b;

    public k(pe4.m mVar, java.lang.CharSequence charSequence) {
        this.f435239b = mVar;
        this.f435238a = charSequence;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        pe4.m mVar = this.f435239b;
        mVar.f435245n.post(mVar.f435249r);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        pe4.m mVar = this.f435239b;
        mVar.f435244m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c5p);
        mVar.f435245n.setText(this.f435238a);
        android.widget.TextView textView = mVar.f435245n;
        textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aa9));
        mVar.f435245n.removeCallbacks(mVar.f435249r);
    }
}
