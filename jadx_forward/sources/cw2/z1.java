package cw2;

/* loaded from: classes2.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f305662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        super(0);
        this.f305662d = c15178x4303ff90;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f305662d;
        java.lang.Object parent = c15178x4303ff90.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15180x393a0b2f c15180x393a0b2f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15180x393a0b2f) ((android.view.View) parent).findViewById(com.p314xaae8f345.mm.R.id.qma);
        if (c15180x393a0b2f == null) {
            return null;
        }
        c15180x393a0b2f.setOnTouchListener(c15178x4303ff90.f212091p0);
        return c15180x393a0b2f;
    }
}
