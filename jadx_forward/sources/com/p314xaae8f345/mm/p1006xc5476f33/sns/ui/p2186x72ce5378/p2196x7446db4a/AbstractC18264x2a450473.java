package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsBaseRepository;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "lifecycle", "<init>", "(Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository */
/* loaded from: classes4.dex */
public abstract class AbstractC18264x2a450473 implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f250638d;

    public AbstractC18264x2a450473(p012xc85e97e9.p093xedfae76a.y lifecycle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        this.f250638d = lifecycle;
        lifecycle.mo273xed6858b4().a(this);
    }

    public abstract void a();

    public abstract void b();

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChanged", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int i17 = zc4.d.f552968a[event.ordinal()];
        if (i17 == 1) {
            a();
        } else if (i17 == 2) {
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChanged", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository");
    }
}
