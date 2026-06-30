package me5;

/* loaded from: classes4.dex */
public class d extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f407482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f407483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407485h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407486i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407487m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ me5.e f407488n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(me5.e eVar, int i17, r35.m3 m3Var, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.String str, java.lang.String str2) {
        super(i17, m3Var);
        this.f407488n = eVar;
        this.f407482e = map;
        this.f407483f = bundle;
        this.f407484g = weakReference;
        this.f407485h = weakReference2;
        this.f407486i = str;
        this.f407487m = str2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        this.f407488n.getClass();
        ((ih3.e) k1Var).Di("link_profile", this.f407482e, this.f407483f, this.f407484g, this.f407485h);
        java.lang.ref.WeakReference weakReference = this.f407484g;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        android.os.Bundle bundle = this.f407483f;
        long j17 = bundle.getLong("msg_id");
        java.lang.String string = bundle.getString("conv_talker_username", null);
        java.lang.String string2 = bundle.getString("send_msg_username", null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(string)) {
            me5.e.e(this.f407488n, (android.content.Context) weakReference.get(), this.f407486i, string, this.f407487m, j17, string2);
        } else {
            me5.e.e(this.f407488n, (android.content.Context) weakReference.get(), this.f407486i, null, this.f407487m, j17, string2);
        }
    }
}
