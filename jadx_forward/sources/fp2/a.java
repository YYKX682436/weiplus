package fp2;

/* loaded from: classes2.dex */
public final class a extends cp2.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, r45.qt2 contextObj, r45.dd2 dd2Var) {
        super(activity, contextObj, "", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f302466m = fragment;
        this.f302467n = dd2Var;
    }

    @Override // cp2.c
    /* renamed from: getCommentScene */
    public int mo122374x8fadefe3() {
        return this.f302461e.m75939xb282bd08(5);
    }

    @Override // cp2.v0
    public int s() {
        r45.dd2 dd2Var = this.f302467n;
        return (dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0) + 15;
    }

    @Override // cp2.v0
    public int y() {
        r45.dd2 dd2Var = this.f302467n;
        return (dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0) + 1001;
    }
}
