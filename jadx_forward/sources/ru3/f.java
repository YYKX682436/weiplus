package ru3;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f481287a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f481288b = ru3.d.f481285d;

    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f481287a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f481287a = null;
    }

    public final void b(android.content.Context context, boolean z17, int i17, yz5.a cancel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancel, "cancel");
        this.f481288b = cancel;
        if (this.f481287a == null) {
            this.f481287a = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(i17), z17, 0, new ru3.e(this));
        }
    }
}
