package jz1;

/* loaded from: classes5.dex */
public class j implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public long f384228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz1.e f384229e;

    public j(jz1.e eVar) {
        this.f384229e = eVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f384229e.Vi(1, 251L);
        if (currentTimeMillis - this.f384228d >= 251) {
            this.f384228d = currentTimeMillis;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
    }
}
