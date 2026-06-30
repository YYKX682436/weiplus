package n75;

/* loaded from: classes4.dex */
public abstract class a extends p012xc85e97e9.p093xedfae76a.c1 implements p012xc85e97e9.p093xedfae76a.m1, n75.b {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f416990d = new p012xc85e97e9.p093xedfae76a.l1();

    public abstract java.util.Set N6();

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 mo2512x119738b3() {
        return this.f416990d;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f416990d.a();
    }
}
