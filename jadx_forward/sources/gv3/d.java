package gv3;

/* loaded from: classes5.dex */
public final class d extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 f357645p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 contentView, int i17) {
        super(context, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        this.f357645p = contentView;
    }

    @Override // cv3.c
    public vu3.c a() {
        return new vu3.b(this.f304102d, 0, 2, null);
    }

    @Override // cv3.c
    public void b() {
    }

    @Override // cv3.h
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 c() {
        return this.f357645p;
    }

    @Override // cv3.h, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setOnVisibleChangeCallback */
    public void mo68199x466a35c6(yz5.l lVar) {
        this.f304109i = new gv3.c(lVar, this);
    }
}
