package fu0;

/* loaded from: classes5.dex */
public final class u extends cu0.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(context, ignoreBackgroundTouchEvent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
    }

    @Override // cv3.c
    public void b() {
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) e()).s();
    }

    @Override // cv3.h
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 c() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4 c10925xc183e4a4 = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4(this.f304102d, null);
        c10925xc183e4a4.m68337xcc2991a2(this);
        return c10925xc183e4a4;
    }

    @Override // cv3.h, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: destroy */
    public void mo68177x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreationComposingMusicPickerDrawerImpl", "destroy: full cleanup");
        uu3.u uVar = this.f304104f;
        if (uVar != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            arrayDeque.add(uVar);
            while (!arrayDeque.isEmpty()) {
                android.view.View view = (android.view.View) arrayDeque.removeFirst();
                if (view != null) {
                    if (rVar != null) {
                        ((cy1.a) rVar).Mj(view);
                    }
                    if (view instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            android.view.View childAt = viewGroup.getChildAt(i17);
                            if (childAt != null) {
                                arrayDeque.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        super.mo68177x5cd39ffa();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0) ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) e()).b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0.class);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe q17 = h0Var != null ? h0Var.q() : null;
            if (q17 != null) {
                q17.m8315x6cab2c8d(null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreationComposingMusicPickerDrawerImpl", "destroy: clear adapter failed: " + e17.getMessage());
        }
        uu3.u uVar2 = this.f304104f;
        if (uVar2 != null) {
            android.view.ViewParent parent = uVar2.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(uVar2);
            }
        }
        this.f304104f = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: onSelectMusic */
    public void mo68301x28690f2a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) e()).v(info);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setLocalAudioList */
    public void mo68195x60eb836b(java.util.List audioList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) e()).m47002x60eb836b(audioList);
    }
}
