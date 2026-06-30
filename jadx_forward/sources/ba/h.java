package ba;

/* loaded from: classes13.dex */
public class h implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173 f100203a;

    public h(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173 c2695x770e6173, ba.g gVar) {
        this.f100203a = c2695x770e6173;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173 c2695x770e6173 = this.f100203a;
        if (c2695x770e6173.f126018p) {
            return;
        }
        int id6 = compoundButton.getId();
        if (!z17) {
            if (c2695x770e6173.f126017o == id6) {
                c2695x770e6173.m20236x738abce0(-1);
            }
        } else {
            int i17 = c2695x770e6173.f126017o;
            if (i17 != -1 && i17 != id6 && c2695x770e6173.f126014i) {
                c2695x770e6173.b(i17, false);
            }
            c2695x770e6173.m20236x738abce0(id6);
        }
    }
}
