package s24;

/* loaded from: classes.dex */
public abstract class g extends a24.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f483898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f483898g = 1;
    }

    @Override // a24.i
    public boolean X6() {
        return false;
    }

    @Override // a24.i
    public int Z6() {
        return 2;
    }

    @Override // a24.a, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public java.lang.String f7() {
        return getF243488i() ? "1" : "0";
    }

    @Override // a24.i
    public int h7() {
        return this.f483898g;
    }

    @Override // a24.i
    public final void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
    }

    /* renamed from: x7 */
    public abstract al5.c2 getF243493h();

    /* renamed from: y7 */
    public abstract boolean getF243488i();

    public boolean z7() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.p2072x38b73479.C17592xf8baa64f;
    }
}
