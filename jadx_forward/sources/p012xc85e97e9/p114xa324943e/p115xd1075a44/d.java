package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* loaded from: classes15.dex */
public class d extends android.database.DataSetObserver implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, p012xc85e97e9.p114xa324943e.p115xd1075a44.l {

    /* renamed from: d, reason: collision with root package name */
    public int f93967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3 f93968e;

    public d(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3 c1189x3b593a3) {
        this.f93968e = c1189x3b593a3;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.l
    public void a(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe, p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar, p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar2) {
        this.f93968e.a(aVar, aVar2);
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3 c1189x3b593a3 = this.f93968e;
        c1189x3b593a3.b(c1189x3b593a3.f93942d.m8300xfda78ef6(), c1189x3b593a3.f93942d.m8299xf939df19());
        float f17 = c1189x3b593a3.f93947i;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        c1189x3b593a3.c(c1189x3b593a3.f93942d.m8300xfda78ef6(), f17, true);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        this.f93967d = i17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        if (f17 > 0.5f) {
            i17++;
        }
        this.f93968e.c(i17, f17, false);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        if (this.f93967d == 0) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1189x3b593a3 c1189x3b593a3 = this.f93968e;
            c1189x3b593a3.b(c1189x3b593a3.f93942d.m8300xfda78ef6(), c1189x3b593a3.f93942d.m8299xf939df19());
            float f17 = c1189x3b593a3.f93947i;
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            c1189x3b593a3.c(c1189x3b593a3.f93942d.m8300xfda78ef6(), f17, true);
        }
    }
}
