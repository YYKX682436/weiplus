package bv4;

/* loaded from: classes.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        if (checkResUpdateCacheFileEvent != null) {
            am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
            int i17 = r2Var.f7759a;
            int i18 = 1;
            if (i17 == 27 && r2Var.f7760b == 1) {
                i18 = 0;
            } else if (i17 != 187 || r2Var.f7760b != 1) {
                if (i17 == 62 && r2Var.f7760b == 1) {
                    i18 = 2;
                } else if (i17 == 40 && r2Var.f7760b == 1) {
                    i18 = 3;
                } else if (i17 == 64 && r2Var.f7760b == 1) {
                    i18 = 4;
                } else if (i17 == 66 && r2Var.f7760b == 1) {
                    i18 = 5;
                } else if (i17 == 79 && r2Var.f7760b == 1) {
                    i18 = 6;
                } else if (i17 == 85 && r2Var.f7760b == 1) {
                    i18 = 7;
                } else if (i17 == 84 && r2Var.f7760b == 1) {
                    i18 = 8;
                } else if (i17 == 84 && r2Var.f7760b == 2) {
                    i18 = 11;
                } else if (i17 == 95 && r2Var.f7760b == 1) {
                    i18 = 9;
                } else if (i17 == 79 && r2Var.f7760b == 2) {
                    i18 = 10;
                }
            }
            com.tencent.mm.plugin.websearch.l2.g(i18).a(r2Var.f7761c);
            ((ku5.t0) ku5.t0.f312615d).h(new su4.i3(i18), "WebSearchThread");
        }
        return false;
    }
}
