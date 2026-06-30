package l45;

/* loaded from: classes10.dex */
public class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f397972a;

    public d(l45.n nVar) {
        this.f397972a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f397972a;
        android.widget.EditText editText = (android.widget.EditText) nVar.f397993a.mo177319xb073c692().findViewById(com.p314xaae8f345.mm.R.id.o4a);
        editText.requestFocus();
        editText.setSelection(editText.length());
        nVar.f397993a.m160419xa85e9179().c(true);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec) nVar.f397993a.findViewById(com.p314xaae8f345.mm.R.id.mii)).m82874x7b868205(editText.getCurrentTextColor());
        nVar.f397993a.m177309xb3ec347().post(new l45.c(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
