package pf1;

/* loaded from: classes7.dex */
public abstract class q extends android.widget.FrameLayout implements pf1.c {

    /* renamed from: h, reason: collision with root package name */
    public static final pf1.o f435320h = new pf1.o(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.MutableContextWrapper f435321d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f435322e;

    /* renamed from: f, reason: collision with root package name */
    public final pf1.v f435323f;

    /* renamed from: g, reason: collision with root package name */
    public final pf1.e f435324g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.MutableContextWrapper context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f435321d = context;
        this.f435322e = rt6;
        this.f435323f = new pf1.v(this);
        this.f435324g = new pf1.e(this);
    }

    /* renamed from: destroy */
    public abstract void mo158326x5cd39ffa();

    /* renamed from: getAndroidContext */
    public android.content.Context m158330x3af91936() {
        return getContext();
    }

    @Override // pf1.c
    /* renamed from: getAndroidView */
    public android.view.View mo158317x11b85c7e() {
        return this;
    }

    /* renamed from: getAppId */
    public java.lang.String m158331x74292566() {
        java.lang.String str = mo158327x5db1c38().f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        return str;
    }

    @Override // android.view.View
    public android.content.MutableContextWrapper getContext() {
        return this.f435321d;
    }

    /* renamed from: getController */
    public pf1.b m158332x143f1b92() {
        return this.f435324g;
    }

    /* renamed from: getHtmlId */
    public int m158333x1d24f51c() {
        return 0;
    }

    /* renamed from: getJsBridgeComponentDelegate */
    public final pf1.v m158334x8e6896da() {
        return this.f435323f;
    }

    /* renamed from: getRt */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo158327x5db1c38() {
        return this.f435322e;
    }

    /* renamed from: getRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 m158335x9a3f0ba2() {
        return mo158327x5db1c38();
    }

    /* renamed from: getWebView */
    public abstract /* synthetic */ pf1.d mo158318x86b9ebe3();
}
