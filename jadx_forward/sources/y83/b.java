package y83;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16154x39bb67ac f541513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16154x39bb67ac activityC16154x39bb67ac) {
        super(0);
        this.f541513d = activityC16154x39bb67ac;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f541513d.findViewById(com.p314xaae8f345.mm.R.id.hr8);
        int i17 = com.p314xaae8f345.mm.R.id.gxl;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gxl);
        if (c16155xa1f2bfdb != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.l69);
            if (progressBar != null) {
                return new w83.d(relativeLayout, c16155xa1f2bfdb, relativeLayout, progressBar);
            }
            i17 = com.p314xaae8f345.mm.R.id.l69;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
