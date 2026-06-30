package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class r1 extends ir2.o {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.u1 f101944q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.finder.activity.uic.u1 u1Var, ir2.a1 a1Var, androidx.fragment.app.Fragment fragment, int i17) {
        super(a1Var, fragment, null, i17, 4, null);
        this.f101944q = u1Var;
    }

    @Override // ir2.o
    public void d(com.tencent.mm.autogen.events.FeedUpdateEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.activity.uic.u1 u1Var = this.f101944q;
        if (u1Var.a7() == 2) {
            am.ia iaVar = event.f54252g;
            if (iaVar.f6919b == 4) {
                ir2.a1 a1Var = u1Var.f101953p;
                if (a1Var == null) {
                    kotlin.jvm.internal.o.o("newLoader");
                    throw null;
                }
                java.util.Iterator it = ((java.util.ArrayList) a1Var.f294091d).iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == iaVar.f6918a) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    ir2.o.g(this, i17, 1, new jz5.l(3, 1), null, 8, null);
                }
            }
        }
    }
}
