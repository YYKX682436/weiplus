package qw3;

/* loaded from: classes9.dex */
public class a0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448671d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        this.f448671d = activityC17101x8420a569;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448671d;
        activityC17101x8420a569.mo48674x36654fab();
        if (activityC17101x8420a569.f238010J) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new qw3.z(this), 200L);
        return false;
    }
}
