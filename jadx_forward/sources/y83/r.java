package y83;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16158xaee0b5d5 f541531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16158xaee0b5d5 activityC16158xaee0b5d5) {
        super(0);
        this.f541531d = activityC16158xaee0b5d5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f541531d.findViewById(com.p314xaae8f345.mm.R.id.hr_);
        int i17 = com.p314xaae8f345.mm.R.id.f565089b75;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f565089b75);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.gxl;
            com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gxl);
            if (c16155xa1f2bfdb != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                i17 = com.p314xaae8f345.mm.R.id.f568771o00;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568771o00);
                if (textView != null) {
                    return new w83.f(relativeLayout, linearLayout, c16155xa1f2bfdb, relativeLayout, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
