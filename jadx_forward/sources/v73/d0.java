package v73;

/* loaded from: classes9.dex */
public class d0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 f515215d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82) {
        this.f515215d = activityC16101x10c7b82;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82 = this.f515215d;
        activityC16101x10c7b82.f223864x = activityC16101x10c7b82.f223858r.getText().toString();
        activityC16101x10c7b82.mo48674x36654fab();
        activityC16101x10c7b82.Y6();
        return false;
    }
}
