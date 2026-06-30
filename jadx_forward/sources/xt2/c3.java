package xt2;

/* loaded from: classes3.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f538193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.content.Context context, xt2.e3 e3Var) {
        super(0);
        this.f538193d = context;
        this.f538194e = e3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View c14986x9295a1e4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab.C14986x9295a1e4(this.f538193d, null, 0, 6, null);
        int f17 = i65.a.f(this.f538193d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        int i17 = -f17;
        layoutParams.setMargins(i17, i17, i17, i17);
        c14986x9295a1e4.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup = this.f538194e.f538243o;
        if (viewGroup != null) {
            viewGroup.addView(c14986x9295a1e4);
        }
        c14986x9295a1e4.setVisibility(8);
        return c14986x9295a1e4;
    }
}
