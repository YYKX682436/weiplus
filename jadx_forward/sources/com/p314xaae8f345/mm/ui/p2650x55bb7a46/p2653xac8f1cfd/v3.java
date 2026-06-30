package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.u.class)
/* loaded from: classes9.dex */
public final class v3 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, sb5.u {

    /* renamed from: e, reason: collision with root package name */
    public hc5.b f281645e;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        hc5.b bVar = this.f281645e;
        if (bVar != null) {
            java.util.Iterator it = bVar.f361903a.iterator();
            while (it.hasNext()) {
                ((hc5.a) it.next()).f();
            }
        }
        this.f281645e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        yb5.d mChattingContext = this.f280113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext, "mChattingContext");
        this.f281645e = new hc5.b(mChattingContext);
    }
}
