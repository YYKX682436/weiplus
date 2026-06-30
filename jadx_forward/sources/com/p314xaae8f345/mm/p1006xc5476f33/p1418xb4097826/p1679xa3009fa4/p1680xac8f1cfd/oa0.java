package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class oa0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f216991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f216992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(android.content.Context context, boolean z17) {
        super(1);
        this.f216991d = context;
        this.f216992e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Context context = this.f216991d;
        if ((context == null || it.getF206440z() == context.hashCode()) && (it.mo56691xdfac0a65() instanceof cw2.v9)) {
            it.mo56709x764d819b(this.f216992e);
        }
        return java.lang.Boolean.FALSE;
    }
}
