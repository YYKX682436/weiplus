package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f201919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 f201920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38) {
        super(0);
        this.f201919d = z17;
        this.f201920e = c14408x406bfa38;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f201919d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38 = this.f201920e;
        if (z17) {
            android.view.View view = c14408x406bfa38.f199221f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                throw null;
            }
            view.setBackground(c14408x406bfa38.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563325cv1));
        } else {
            android.view.View view2 = c14408x406bfa38.f199221f;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                throw null;
            }
            view2.setBackground(c14408x406bfa38.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563324cv0));
        }
        return jz5.f0.f384359a;
    }
}
