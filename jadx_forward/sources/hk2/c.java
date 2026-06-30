package hk2;

/* loaded from: classes2.dex */
public final class c implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f363415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f363416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f363417c;

    public c(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, android.widget.LinearLayout linearLayout, android.widget.ProgressBar progressBar) {
        this.f363415a = interfaceC4987x84e327cb;
        this.f363416b = linearLayout;
        this.f363417c = progressBar;
    }

    @Override // sr.b
    public void a(int i17) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f363415a;
        boolean E0 = interfaceC4987x84e327cb.E0();
        android.widget.LinearLayout linearLayout = this.f363416b;
        if (!E0 && i17 != 1) {
            android.widget.ProgressBar progressBar = this.f363417c;
            if (i17 == 0) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
            } else if (i17 != -1) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            } else if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emojiStatus ");
        sb6.append(i17);
        sb6.append(" md5 ");
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        sb6.append(mo42933xb5885648);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuItemEmoji", sb6.toString());
    }
}
