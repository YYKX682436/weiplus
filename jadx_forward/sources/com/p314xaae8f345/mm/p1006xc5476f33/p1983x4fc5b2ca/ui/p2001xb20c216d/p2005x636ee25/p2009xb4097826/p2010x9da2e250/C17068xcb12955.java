package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerEditRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment */
/* loaded from: classes5.dex */
public class C17068xcb12955 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 {
    public boolean S1;

    public C17068xcb12955(ev3.d dVar, boolean z17, boolean z18) {
        super(dVar, z17);
        this.S1 = z18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3
    public wt3.e F0(yu3.a createInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createInfo, "createInfo");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(createInfo.f547386c) ? new wt3.e0(this.f237918i, createInfo, 0, 4, null) : new qv3.b(this.f237918i, createInfo, 102);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3
    public boolean G0() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3
    public boolean H0() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3
    public int J0() {
        return 18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3
    public void K0() {
        java.lang.Object obj = this.f237930p;
        wt3.j0 j0Var = obj instanceof wt3.j0 ? (wt3.j0) obj : null;
        if (j0Var == null) {
            return;
        }
        j0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.a(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3
    public void Q0(java.lang.String str) {
        java.lang.Object obj = this.f237930p;
        wt3.j0 j0Var = obj instanceof wt3.j0 ? (wt3.j0) obj : null;
        if (j0Var != null) {
            j0Var.mo160996x1c5132a4();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U0(java.util.LinkedList r10, boolean r11, boolean r12, long r13) {
        /*
            r9 = this;
            java.lang.String r0 = "audioList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
            r2 = 0
            r3 = r2
        L10:
            boolean r4 = r1.hasNext()
            r5 = 0
            java.lang.String r6 = "FinderMusicPickerEditRecommendFragment"
            r7 = 1
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            int r8 = r3 + 1
            if (r3 < 0) goto L4a
            r45.vv0 r4 = (r45.vv0) r4
            wt3.g r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M     // Catch: java.lang.Exception -> L40
            boolean r5 = r9.f237928n     // Catch: java.lang.Exception -> L40
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r3 = r3.a(r4, r7, r5)     // Catch: java.lang.Exception -> L40
            r4 = 18
            r3.f237252p = r4     // Catch: java.lang.Exception -> L40
            r3.f237259w = r2     // Catch: java.lang.Exception -> L40
            r4 = 0
            r3.f237260x = r4     // Catch: java.lang.Exception -> L40
            r9.l0()     // Catch: java.lang.Exception -> L40
            r0.add(r3)     // Catch: java.lang.Exception -> L40
            r3.h()     // Catch: java.lang.Exception -> L40
            goto L48
        L40:
            r3 = move-exception
            java.lang.String r4 = "handleResult"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r3, r4, r5)
        L48:
            r3 = r8
            goto L10
        L4a:
            kz5.c0.p()
            throw r5
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "handleResult:audioList size="
            r1.<init>(r3)
            int r3 = r10.size()
            r1.append(r3)
            java.lang.String r3 = ", loadFirstPage="
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = ", hasNextPage="
            r1.append(r3)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            if (r12 == 0) goto L80
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r12 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r12.<init>()
            r1 = 5
            r12.f237251o = r1
            r0.add(r12)
        L80:
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L98
            dv3.c r12 = r9.f237914e
            if (r12 == 0) goto L91
            int r12 = r12.mo1894x7e414b06()
            if (r12 != 0) goto L91
            goto L92
        L91:
            r7 = r2
        L92:
            if (r7 == 0) goto L98
            r9.y0()
            goto La3
        L98:
            r9.z0()
            dv3.c r12 = r9.f237914e
            if (r12 == 0) goto La3
            r1 = 2
            dv3.c.F0(r12, r0, r2, r1, r5)
        La3:
            if (r11 == 0) goto La8
            r9.A0()
        La8:
            ev3.d r11 = r9.f237913d
            if (r11 == 0) goto Lba
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a r11 = r11.f()
            if (r11 == 0) goto Lba
            r12 = 7
            int r10 = r10.size()
            r11.n(r12, r10, r13)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17068xcb12955.U0(java.util.LinkedList, boolean, boolean, long):void");
    }

    @Override // ev3.b
    public void X(android.view.View itemView, rv3.h feed, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        nv3.k.f422219a.a(itemView, feed);
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        nv3.c.f422187a.a(feed, i17, z17, 7, this.f237914e, this.f237913d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    /* renamed from: j0, reason: from getter */
    public boolean getS1() {
        return this.S1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public boolean l0() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f404944g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public boolean m0() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad
    public int n0() {
        return 7;
    }
}
