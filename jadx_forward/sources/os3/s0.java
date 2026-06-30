package os3;

/* loaded from: classes8.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.t0 f429723d;

    public s0(os3.t0 t0Var) {
        this.f429723d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.t0 t0Var = this.f429723d;
        if (t0Var.f429736c.f236370i.f236417f.isFocused()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = t0Var.f429736c;
        if (!activityC16931x24037f86.f236374o.f236417f.isFocused() && activityC16931x24037f86.f236370i.m67777xeb5f5875().size() == 0 && activityC16931x24037f86.f236374o.m67777xeb5f5875().size() == 0) {
            android.text.Editable text = activityC16931x24037f86.f236370i.f236417f.getText();
            boolean z17 = true;
            if (text == null || text.toString().length() <= 0) {
                android.text.Editable text2 = activityC16931x24037f86.f236374o.f236417f.getText();
                if (text2 != null && text2.toString().length() > 0) {
                    z17 = false;
                }
                if (z17) {
                    activityC16931x24037f86.f236368g.setVisibility(0);
                    activityC16931x24037f86.f236369h.setVisibility(8);
                    activityC16931x24037f86.f236373n.setVisibility(8);
                }
            }
        }
    }
}
