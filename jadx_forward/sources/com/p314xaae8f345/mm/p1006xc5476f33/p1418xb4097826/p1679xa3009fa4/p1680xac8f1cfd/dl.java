package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class dl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f215680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca f215681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca) {
        super(0);
        this.f215680d = activityC0065xcd7aa112;
        this.f215681e = c15456x2c452bca;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.n b17 = this.f215680d.mo273xed6858b4().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCurrentState(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeUIC", "FinderElderlyModeChangedEvent received, lifecycleState=" + b17);
        boolean a17 = b17.a(p012xc85e97e9.p093xedfae76a.n.RESUMED);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = this.f215681e;
        if (a17) {
            c15456x2c452bca.h7();
            c15456x2c452bca.f215101e = false;
        } else {
            c15456x2c452bca.f215101e = true;
        }
        return jz5.f0.f384359a;
    }
}
