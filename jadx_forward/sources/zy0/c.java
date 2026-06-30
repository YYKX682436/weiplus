package zy0;

/* loaded from: classes5.dex */
public final class c implements ev3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy0.e f558843a;

    public c(zy0.e eVar) {
        this.f558843a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
        zy0.e eVar = this.f558843a;
        yz5.l lVar = eVar.f558847c;
        if (lVar != null) {
            lVar.mo146xb9724478(new dz0.i(null, java.lang.Boolean.valueOf(z17), 1, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = eVar.f558849e;
        if (aVar != null) {
            aVar.g(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.lang.String sourceTabID, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceTabID, "sourceTabID");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "bgm_panel_song_item");
        aVar.Ai(view, new zy0.a(c16997xb0aa383a, sourceTabID));
        zy0.e eVar = this.f558843a;
        aVar.Vj(view, 40, new zy0.b(eVar, "bgm_panel_song_item"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar2 = eVar.f558849e;
        if (aVar2 != null) {
            aVar2.k(c16997xb0aa383a, sourceTabID, view, z17, z18, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        t(c16997xb0aa383a, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void s(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = this.f558843a.f558849e;
        if (aVar != null) {
            aVar.s(z17, c16997xb0aa383a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r7, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c r8) {
        /*
            r6 = this;
            zy0.e r0 = r6.f558843a
            java.lang.String r1 = r0.f558851g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onAudioSelected: new:"
            r2.<init>(r3)
            r3 = 0
            if (r7 == 0) goto L11
            java.lang.String r4 = r7.C
            goto L12
        L11:
            r4 = r3
        L12:
            r2.append(r4)
            java.lang.String r4 = " cur:"
            r2.append(r4)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r0.f558853i
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.C
            goto L22
        L21:
            r4 = r3
        L22:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r1 = 2
            if (r7 == 0) goto L5e
            java.lang.String r2 = r7.C
            int r2 = r2.length()
            if (r2 != 0) goto L39
            r2 = 1
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L44
            java.lang.String r7 = r0.f558851g
            java.lang.String r8 = "onAudioSelected: mjMusicId null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r8)
            return
        L44:
            yz5.l r2 = r0.f558847c
            if (r2 == 0) goto L52
            dz0.i r4 = new dz0.i
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.<init>(r5, r3, r1, r3)
            r2.mo146xb9724478(r4)
        L52:
            yz5.p r2 = r0.f558846b
            if (r2 == 0) goto L5e
            java.lang.String r4 = r7.C
            r2.mo149xb9724478(r4, r8)
            jz5.f0 r8 = jz5.f0.f384359a
            goto L5f
        L5e:
            r8 = r3
        L5f:
            if (r8 != 0) goto L76
            yz5.l r8 = r0.f558847c
            if (r8 == 0) goto L6f
            dz0.i r2 = new dz0.i
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.<init>(r4, r3, r1, r3)
            r8.mo146xb9724478(r2)
        L6f:
            java.lang.String r8 = "clear music"
            java.lang.String r1 = r0.f558851g
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)
        L76:
            if (r7 == 0) goto L7b
            java.lang.String r8 = r7.C
            goto L7c
        L7b:
            r8 = r3
        L7c:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r0.f558853i
            if (r1 == 0) goto L83
            java.lang.String r1 = r1.C
            goto L84
        L83:
            r1 = r3
        L84:
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r1)
            if (r8 != 0) goto Lb0
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a r8 = r0.f558849e
            if (r8 == 0) goto L91
            r8.m(r7)
        L91:
            yz5.q r8 = r0.f558850f
            if (r8 == 0) goto Lb0
            if (r7 == 0) goto L9a
            java.lang.String r1 = r7.C
            goto L9b
        L9a:
            r1 = r3
        L9b:
            if (r7 == 0) goto La4
            r45.pg4 r2 = r7.A
            if (r2 == 0) goto La4
            java.lang.String r2 = r2.f464551d
            goto La5
        La4:
            r2 = r3
        La5:
            if (r7 == 0) goto Lad
            boolean r3 = r7.K
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        Lad:
            r8.mo147xb9724478(r1, r2, r3)
        Lb0:
            r0.f558853i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zy0.c.t(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c):void");
    }
}
