package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class s4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f214548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        super(0);
        this.f214548d = c5445x963cab3;
        this.f214549e = c15260x406bbe1b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[LOOP:0: B:16:0x0062->B:28:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[EDGE_INSN: B:29:0x0097->B:30:0x0097 BREAK  A[LOOP:0: B:16:0x0062->B:28:0x0093], SYNTHETIC] */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r11 = this;
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r11.f214548d
            am.ia r1 = r0.f135785g
            int r1 = r1.f88452b
            r2 = 8
            if (r1 != r2) goto Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FeedUpdateEvent TYPE_LIVE_CHANGE id:"
            r1.<init>(r2)
            am.ia r0 = r0.f135785g
            long r2 = r0.f88451a
            r1.append(r2)
            java.lang.String r2 = ",username:"
            r1.append(r2)
            java.lang.String r2 = r0.f88457g
            r1.append(r2)
            java.lang.String r2 = ",liveStaus:"
            r1.append(r2)
            int r2 = r0.f88458h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderColumnFrameLayout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            long r1 = r0.f88451a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lcb
            int r1 = r0.f88454d
            r2 = 1
            if (r1 != r2) goto Lcb
            com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout r1 = r11.f214549e
            ey2.u r3 = r1.f212447r
            if (r3 == 0) goto Lcb
            androidx.lifecycle.j0 r3 = r3.f339075x
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r3.mo3195x754a37bb()
            jz5.l r3 = (jz5.l) r3
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r3.f384366d
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) r3
            if (r3 != 0) goto L5c
            goto Lcb
        L5c:
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
            r6 = r5
        L62:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L96
            java.lang.Object r7 = r4.next()
            so2.j5 r7 = (so2.j5) r7
            boolean r8 = r7 instanceof so2.h1
            if (r8 == 0) goto L8f
            so2.h1 r7 = (so2.h1) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.getFeedObject()
            r45.nw1 r7 = r7.m59258xd0557130()
            if (r7 == 0) goto L8a
            long r7 = r7.m75942xfb822ef2(r5)
            long r9 = r0.f88451a
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L8a
            r7 = r2
            goto L8b
        L8a:
            r7 = r5
        L8b:
            if (r7 == 0) goto L8f
            r7 = r2
            goto L90
        L8f:
            r7 = r5
        L90:
            if (r7 == 0) goto L93
            goto L97
        L93:
            int r6 = r6 + 1
            goto L62
        L96:
            r6 = -1
        L97:
            if (r6 < 0) goto Lcb
            java.lang.Object r2 = r3.get(r6)
            so2.j5 r2 = (so2.j5) r2
            boolean r3 = r2 instanceof so2.h1
            if (r3 == 0) goto La6
            so2.h1 r2 = (so2.h1) r2
            goto La7
        La6:
            r2 = 0
        La7:
            if (r2 == 0) goto Lcb
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.getFeedObject()
            r45.nw1 r2 = r2.m59258xd0557130()
            if (r2 != 0) goto Lb4
            goto Lbe
        Lb4:
            int r0 = r0.f88458h
            r3 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.set(r3, r0)
        Lbe:
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r0 = r1.m61759x4905e9fa()
            androidx.recyclerview.widget.f2 r0 = r0.mo7946xf939df19()
            if (r0 == 0) goto Lcb
            r0.m8147xed6e4d18(r6)
        Lcb:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s4.mo152xb9724478():java.lang.Object");
    }
}
