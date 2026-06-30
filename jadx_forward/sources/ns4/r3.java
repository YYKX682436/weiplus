package ns4;

/* loaded from: classes8.dex */
public final class r3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f421168a;

    public r3(ns4.b4 b4Var) {
        this.f421168a = b4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
    /* renamed from: onDismiss */
    public final void mo51018xb349b3ab() {
        ot5.g.c("WeCoinSubscribePanel", "dialog on dismiss");
        ns4.b4 b4Var = this.f421168a;
        if (b4Var.f420990q == null) {
            ot5.g.c("WeCoinSubscribePanel", "continuation == null)");
            return;
        }
        if (b4Var.f420991r) {
            return;
        }
        ot5.g.c("WeCoinSubscribePanel", "dialog dismiss & cancel");
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = b4Var.f420990q;
        if (interfaceC29045xdcb5ca57 != null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        b4Var.f420990q = null;
    }
}
