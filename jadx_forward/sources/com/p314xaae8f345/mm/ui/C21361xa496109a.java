package com.p314xaae8f345.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.FindMoreGameRedLogic$1 */
/* loaded from: classes8.dex */
public class C21361xa496109a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.g6 f278218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21361xa496109a(com.p314xaae8f345.mm.ui.g6 g6Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f278218d = g6Var;
        this.f39173x3fe91575 = -550720006;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a c5473x47b32e0a) {
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a c5473x47b32e0a2 = c5473x47b32e0a;
        if (!this.f278218d.b()) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.FindMoreGameRedLogic$1$$a
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
            
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Game.Entrance");
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r11 = this;
                    com.tencent.mm.ui.FindMoreGameRedLogic$1 r0 = com.p314xaae8f345.mm.ui.C21361xa496109a.this
                    com.tencent.mm.autogen.events.FinderGameRedDotEvent r1 = r2
                    com.tencent.mm.ui.g6 r2 = r0.f278218d
                    java.lang.Object r2 = r2.f290153b
                    monitor-enter(r2)
                    com.tencent.mm.ui.g6 r3 = r0.f278218d     // Catch: java.lang.Throwable -> L77
                    com.tencent.mm.ui.FindMoreFriendsUI r3 = r3.f290152a     // Catch: java.lang.Throwable -> L77
                    if (r3 == 0) goto L6e
                    com.tencent.mm.ui.base.preference.h0 r3 = r3.f278189w     // Catch: java.lang.Throwable -> L77
                    if (r3 != 0) goto L14
                    goto L6e
                L14:
                    java.lang.String r4 = "more_tab_game_recommend"
                    com.tencent.mm.ui.base.preference.Preference r3 = r3.h(r4)     // Catch: java.lang.Throwable -> L77
                    r6 = r3
                    com.tencent.mm.ui.GameIconViewTipPreference r6 = (com.p314xaae8f345.mm.ui.C21370x5ce6d0c6) r6     // Catch: java.lang.Throwable -> L77
                    if (r6 != 0) goto L21
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    goto L76
                L21:
                    am.ib r1 = r1.f135811g     // Catch: java.lang.Throwable -> L77
                    int r1 = r1.f88468a     // Catch: java.lang.Throwable -> L77
                    r3 = 3
                    if (r3 == r1) goto L53
                    r4 = 2
                    if (r1 != r4) goto L2c
                    goto L53
                L2c:
                    r3 = 1
                    if (r3 != r1) goto L6c
                    java.lang.Class<zy2.b6> r1 = zy2.b6.class
                    i95.m r1 = i95.n0.c(r1)     // Catch: java.lang.Throwable -> L77
                    zy2.b6 r1 = (zy2.b6) r1     // Catch: java.lang.Throwable -> L77
                    c61.l7 r1 = (c61.l7) r1     // Catch: java.lang.Throwable -> L77
                    zy2.fa r1 = r1.nk()     // Catch: java.lang.Throwable -> L77
                    java.lang.String r3 = "Game.Entrance"
                    r45.f03 r5 = r1.I0(r3)     // Catch: java.lang.Throwable -> L77
                    if (r5 != 0) goto L47
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    goto L76
                L47:
                    com.tencent.mm.ui.g6 r0 = r0.f278218d     // Catch: java.lang.Throwable -> L77
                    com.tencent.mm.ui.FindMoreFriendsUI r4 = r0.f290152a     // Catch: java.lang.Throwable -> L77
                    r7 = 0
                    r8 = 1
                    r9 = 1
                    r10 = 0
                    r4.z0(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77
                    goto L6c
                L53:
                    if (r3 != r1) goto L68
                    java.lang.Class<zy2.b6> r0 = zy2.b6.class
                    i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Throwable -> L77
                    zy2.b6 r0 = (zy2.b6) r0     // Catch: java.lang.Throwable -> L77
                    c61.l7 r0 = (c61.l7) r0     // Catch: java.lang.Throwable -> L77
                    zy2.fa r0 = r0.nk()     // Catch: java.lang.Throwable -> L77
                    java.lang.String r1 = "Game.Entrance"
                    r0.N(r1)     // Catch: java.lang.Throwable -> L77
                L68:
                    r0 = 0
                    r6.y(r0)     // Catch: java.lang.Throwable -> L77
                L6c:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    goto L76
                L6e:
                    java.lang.String r0 = "MicroMsg.FindMoreGameRedLogic"
                    java.lang.String r1 = "findMoreFriendsUI get screen fail"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L77
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                L76:
                    return
                L77:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.RunnableC21360x13367d07.run():void");
            }
        });
        return false;
    }
}
