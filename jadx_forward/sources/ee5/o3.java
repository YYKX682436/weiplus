package ee5;

/* loaded from: classes4.dex */
public final class o3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.q3 f333524d;

    public o3(ee5.q3 q3Var) {
        this.f333524d = q3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        fn5.o0 o0Var = (fn5.o0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "queryState: " + o0Var);
        if (o0Var == fn5.o0.f346278f) {
            ee5.q3 q3Var = this.f333524d;
            android.widget.ProgressBar progressBar = q3Var.f333545m;
            if (progressBar != null && progressBar.getVisibility() == 0) {
                android.widget.ProgressBar progressBar2 = q3Var.f333545m;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = q3Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                int R6 = ((ee5.z) pf5.z.f435481a.a(activity).a(ee5.z.class)).R6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "observeQueryState >> " + R6 + ", " + q3Var.f333553u);
                int i17 = R6 - q3Var.f333553u;
                if (q3Var.f333548p == 1 || i17 <= 0) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = q3Var.f333547o;
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setVisibility(0);
                    }
                    android.widget.TextView textView = q3Var.f333546n;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    ee5.q3 q3Var2 = this.f333524d;
                    q3Var2.f333552t = pf5.e.m158343xd39de650(q3Var2, null, null, new ee5.l3(q3Var2, null), 3, null);
                    return;
                }
                android.widget.TextView textView2 = q3Var.f333546n;
                if (textView2 != null) {
                    textView2.setText("+" + i17);
                }
                android.widget.TextView textView3 = q3Var.f333546n;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = q3Var.f333547o;
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(8);
                }
                ee5.q3 q3Var3 = this.f333524d;
                q3Var3.f333554v = pf5.e.m158343xd39de650(q3Var3, null, null, new ee5.n3(q3Var3, null), 3, null);
            }
        }
    }
}
