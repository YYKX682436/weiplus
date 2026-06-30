package g63;

/* loaded from: classes8.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 f350685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f350686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 activityC16045xfe36c025, boolean z17) {
        super(0);
        this.f350685d = activityC16045xfe36c025;
        this.f350686e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16046x45eb7dfd c16046x45eb7dfd = this.f350685d.f223527m;
        if (c16046x45eb7dfd != null) {
            c16046x45eb7dfd.setVisibility(this.f350686e ? 0 : 8);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyCoverView");
        throw null;
    }
}
