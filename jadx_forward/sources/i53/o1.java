package i53;

/* loaded from: classes8.dex */
public class o1 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 f370216d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949) {
        this.f370216d = activityC15909x288b5949;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        int i18 = i17 % 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949 = this.f370216d;
        if (i18 == 0) {
            activityC15909x288b5949.f221588d.setSelected(true);
            activityC15909x288b5949.f221589e.setSelected(false);
            activityC15909x288b5949.f221591g.a();
        } else {
            activityC15909x288b5949.f221589e.setSelected(true);
            activityC15909x288b5949.f221588d.setSelected(false);
        }
        activityC15909x288b5949.U6(i17, true);
    }
}
