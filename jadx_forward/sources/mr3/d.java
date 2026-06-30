package mr3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f412387b;

    /* renamed from: c, reason: collision with root package name */
    public final lo.j f412388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f412389d;

    public d(java.lang.String str, boolean z17, lo.j onGetChatImage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGetChatImage, "onGetChatImage");
        this.f412386a = str;
        this.f412387b = z17;
        this.f412388c = onGetChatImage;
        this.f412389d = 9;
    }

    public final void a(android.app.Activity context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 >= this.f412389d) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 1, true);
        k0Var.f293405n = new mr3.b(context, this);
        k0Var.f293414s = new mr3.c(this, context, i17);
        k0Var.v();
    }
}
