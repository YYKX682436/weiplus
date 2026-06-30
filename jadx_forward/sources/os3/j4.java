package os3;

/* loaded from: classes8.dex */
public class j4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429661d;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429661d = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429661d;
        if (viewOnCreateContextMenuListenerC16941x4db497e1.isFinishing() || viewOnCreateContextMenuListenerC16941x4db497e1.isDestroyed()) {
            return;
        }
        java.lang.String string = bundle.getString("mail_id");
        if (viewOnCreateContextMenuListenerC16941x4db497e1.f236460f.f393159a.equals(string)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new os3.h4(this, bundle, string));
        }
    }
}
