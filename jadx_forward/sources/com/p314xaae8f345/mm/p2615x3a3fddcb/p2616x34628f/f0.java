package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes14.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f274993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q85.g f274994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p093xedfae76a.y yVar, q85.g gVar) {
        super(1);
        this.f274993d = yVar;
        this.f274994e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        final q85.g gVar = this.f274994e;
        p012xc85e97e9.p093xedfae76a.v vVar = new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.sns_compose.page.ListItemsKt$VideoContent$1$observer$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m event) {
                pk4.d dVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<anonymous parameter 0>");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event != p012xc85e97e9.p093xedfae76a.m.ON_START) {
                    p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE;
                    q85.g gVar2 = q85.g.this;
                    if (event == mVar) {
                        pk4.d dVar2 = gVar2.f442340i;
                        if (dVar2 != null) {
                            dVar2.m158656x65825f6();
                            return;
                        }
                        return;
                    }
                    if (event != p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                        if (event == p012xc85e97e9.p093xedfae76a.m.ON_RESUME && gVar2.f442341m && (dVar = gVar2.f442340i) != null) {
                            dVar.m158665x68ac462();
                            return;
                        }
                        return;
                    }
                    pk4.d dVar3 = gVar2.f442340i;
                    if (dVar3 != null) {
                        dVar3.m158666x360802();
                    }
                    gVar2.f442340i = null;
                    java.util.List list = q85.g.f442334o;
                    java.util.List list2 = q85.g.f442334o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "access$getPlayerRecycler$cp(...)");
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((pk4.d) it.next()).m158666x360802();
                    }
                    q85.g.f442334o.clear();
                }
            }
        };
        p012xc85e97e9.p093xedfae76a.y yVar = this.f274993d;
        yVar.mo273xed6858b4().a(vVar);
        return new com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.e0(yVar, vVar);
    }
}
