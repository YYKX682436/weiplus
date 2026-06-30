package tr2;

/* loaded from: classes5.dex */
public final class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr2.l f502915a;

    public g(tr2.l lVar) {
        this.f502915a = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
    /* renamed from: onDismiss */
    public final void mo51018xb349b3ab() {
        tr2.l lVar = this.f502915a;
        android.view.ViewParent parent = lVar.f502933l.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(lVar.f502933l);
        }
    }
}
