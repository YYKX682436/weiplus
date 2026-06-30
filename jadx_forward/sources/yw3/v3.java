package yw3;

/* loaded from: classes4.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f548443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(1);
        this.f548443d = repairerMvvmDBDemoUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yw3.p pVar;
        o75.c event = (o75.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        o75.b bVar = o75.b.f425115c;
        o75.b bVar2 = event.f425120a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2, bVar);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f548443d;
        if (b17) {
            yw3.p pVar2 = (yw3.p) event.f425123d;
            if (pVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.q((com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) repairerMvvmDBDemoUI.f).mo141623x754a37bb(), new yw3.j(pVar2), false, 2, null);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2, o75.b.f425116d)) {
            yw3.p pVar3 = (yw3.p) event.f425123d;
            if (pVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A((com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) repairerMvvmDBDemoUI.f).mo141623x754a37bb(), new yw3.j(pVar3), false, 2, null);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2, o75.b.f425117e) && (pVar = (yw3.p) event.f425123d) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) repairerMvvmDBDemoUI.f).mo141623x754a37bb()).u(new yw3.j(pVar));
        }
        return jz5.f0.f384359a;
    }
}
