package df2;

/* loaded from: classes3.dex */
public final class zd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.de f313490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(df2.de deVar) {
        super(0);
        this.f313490d = deVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int dimensionPixelOffset;
        int c17;
        df2.de deVar = this.f313490d;
        if (deVar.U6()) {
            android.view.View view = deVar.f311503m;
            java.lang.Object layoutParams = view != null ? view.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, com.p314xaae8f345.mm.ui.zk.a(deVar.O6(), 28), 0);
                android.view.View view2 = deVar.f311503m;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            android.view.View view3 = deVar.f311503m;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (zl2.r4.f555483a.y1(deVar.getStore().getLiveRoomData())) {
                dimensionPixelOffset = deVar.O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
                c17 = com.p314xaae8f345.mm.ui.bl.c(deVar.O6());
            } else {
                dimensionPixelOffset = deVar.O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561266dq);
                c17 = com.p314xaae8f345.mm.ui.bl.c(deVar.O6());
            }
            int i17 = dimensionPixelOffset + c17;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i17);
                android.view.View view4 = deVar.f311503m;
                if (view4 != null) {
                    view4.setLayoutParams(marginLayoutParams);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
