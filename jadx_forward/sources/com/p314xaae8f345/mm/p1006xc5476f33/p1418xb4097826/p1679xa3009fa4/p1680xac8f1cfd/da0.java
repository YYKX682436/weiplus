package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class da0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f215630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(android.content.Context context) {
        super(1);
        this.f215630d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int r17 = it.getR();
        android.content.Context context = this.f215630d;
        if (r17 == (context != null ? context.hashCode() : -1)) {
            if (it.getIsViewFocused()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) it : null;
                if ((c15188xd8bd4bd == null || c15188xd8bd4bd.getEnterSeekMode()) ? false : true) {
                    it.mo56706x561757e0(true);
                }
            }
            it.mo56716x4121a19(false);
            it.w();
        }
        return java.lang.Boolean.FALSE;
    }
}
