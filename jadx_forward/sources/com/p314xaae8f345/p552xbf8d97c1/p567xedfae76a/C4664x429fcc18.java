package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u001b\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tencent/matrix/lifecycle/LifecycleDelegateStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onCreate", "onReceiveStart", "onReceiveStop", "", "toString", "Landroidx/lifecycle/y;", ya.b.f77502x92235c1b, "Landroidx/lifecycle/y;", "", "async", "<init>", "(Landroidx/lifecycle/y;Z)V", "Companion", "com/tencent/matrix/lifecycle/m", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.LifecycleDelegateStatefulOwner */
/* loaded from: classes12.dex */
public final class C4664x429fcc18 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.m f19926x233c02ec = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.m(null);
    private final p012xc85e97e9.p093xedfae76a.y source;

    public /* synthetic */ C4664x429fcc18(p012xc85e97e9.p093xedfae76a.y yVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(yVar, (i17 & 2) != 0 ? true : z17);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
    /* renamed from: onCreate */
    public final void m40982x3e5a77bb() {
        m40992xc67387b2();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
    /* renamed from: onReceiveStart */
    public final void m40983x469b42be() {
        m40993xcc985f3c();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onReceiveStop */
    public final void m40984x9f2e4e26() {
        m40992xc67387b2();
    }

    /* renamed from: toString */
    public java.lang.String m40985x9616526c() {
        return this.source.toString();
    }

    private C4664x429fcc18(p012xc85e97e9.p093xedfae76a.y yVar, boolean z17) {
        super(z17);
        this.source = yVar;
        yVar.mo273xed6858b4().a(this);
    }
}
