package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ba0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f215395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(yz5.l lVar) {
        super(1);
        this.f215395d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (((java.lang.Boolean) this.f215395d.mo146xb9724478(it)).booleanValue()) {
            boolean z17 = it.mo56691xdfac0a65() instanceof cw2.v9;
            boolean mo58787xc00617a4 = it.mo58787xc00617a4();
            it.mo56716x4121a19(false);
            if (z17) {
                android.view.ViewParent mo56691xdfac0a65 = it.mo56691xdfac0a65();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo56691xdfac0a65, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.IFinderMediaViewLayout");
                cw2.v9.j((cw2.v9) mo56691xdfac0a65, false, 1, null);
            }
            if (mo58787xc00617a4) {
                it.mo58788x65825f6();
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
