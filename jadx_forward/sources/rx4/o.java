package rx4;

/* loaded from: classes8.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.s f482775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rx4.s sVar) {
        super(0);
        this.f482775d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.LinearLayout linearLayout;
        rx4.s sVar = this.f482775d;
        sVar.f482795g = null;
        ((java.util.ArrayList) sVar.f482796h).clear();
        ((java.util.LinkedHashMap) sVar.f482797i).clear();
        sVar.f482798m = null;
        sVar.f482799n = false;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) sVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.t4z);
        if (viewGroup != null && (linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565660t50)) != null) {
            linearLayout.removeAllViews();
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
