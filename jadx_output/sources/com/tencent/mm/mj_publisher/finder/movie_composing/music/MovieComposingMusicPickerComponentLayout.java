package com.tencent.mm.mj_publisher.finder.movie_composing.music;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/music/MovieComposingMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getRecommendFeedTabType", "getRecentPlayedType", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "fragment", "Ljz5/f0;", "setTemplateId", "getRecommendDataFragment", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment;", "getRecommendFeedFragment", "", "getPageTypeArray", "getLikeTabType", "getDefaultSelectPageTabType", "getPagerDefaultSelectTabType", "", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Lcom/tencent/mm/plugin/vlog/model/i0;", "getPageType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MovieComposingMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f69181m;

    /* renamed from: n, reason: collision with root package name */
    public kv3.h f69182n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69183o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f69184p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieComposingMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69181m = "MicroMsg.Finder.RecordMusicPickerComponentLayout";
        this.f69184p = kz5.c0.i(m40.j0.f323408d, m40.j0.f323409e, m40.j0.f323411g);
    }

    private final int getRecentPlayedType() {
        return 14;
    }

    private final com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment getRecommendDataFragment() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var != null ? h0Var.o(getDefaultSelectPageTabType()) : null;
        if (o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment) {
            return (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment) o17;
        }
        return null;
    }

    private final com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment getRecommendFeedFragment() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var != null ? h0Var.o(getRecommendFeedTabType()) : null;
        if (o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment) {
            return (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment) o17;
        }
        return null;
    }

    private final int getRecommendFeedTabType() {
        return 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setTemplateId(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto Lc
            android.app.Activity r0 = (android.app.Activity) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L42
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r3 = "KEY_SHOOT_COMPOSING_TEMPLATE_INFO"
            boolean r1 = r1.hasExtra(r3)
            if (r1 == 0) goto L42
            android.content.Intent r0 = r0.getIntent()
            byte[] r0 = r0.getByteArrayExtra(r3)
            if (r0 == 0) goto L3a
            r45.q23 r1 = new r45.q23
            r1.<init>()
            r1.parseFrom(r0)     // Catch: java.lang.Exception -> L2e
            goto L3b
        L2e:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r3, r1, r0)
        L3a:
            r1 = r2
        L3b:
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.f383585d
        L3f:
            r5.Q0(r2)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout.setTemplateId(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public boolean f() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public boolean g() {
        return ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).hj(m40.j0.f323408d);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getDefaultSelectPageTabType() {
        return 7;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getLikeTabType() {
        return 9;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.vlog.model.i0 getPageType() {
        return com.tencent.mm.plugin.vlog.model.i0.f175614f;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int[] getPageTypeArray() {
        java.util.List k17 = kz5.c0.k(java.lang.Integer.valueOf(getDefaultSelectPageTabType()), java.lang.Integer.valueOf(getLikeTabType()));
        if (g()) {
            k17.add(0, java.lang.Integer.valueOf(getRecommendFeedTabType()));
        }
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323411g)) {
            k17.add(java.lang.Integer.valueOf(getRecentPlayedType()));
        }
        return kz5.n0.R0(k17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getPagerDefaultSelectTabType() {
        return g() ? getRecommendFeedTabType() : getDefaultSelectPageTabType();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public void i(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment = getRecommendFeedFragment();
        if (recommendFeedFragment != null) {
            recommendFeedFragment.f156344w = z17;
            nv3.t tVar = recommendFeedFragment.f156345x;
            if (tVar != null) {
                tVar.f340710h = z17;
                if (z17) {
                    tVar.b(false);
                } else {
                    tVar.f("onDrawerVisibleChanged");
                }
            }
        }
        kv3.h hVar = this.f69182n;
        if (hVar != null && hVar.G) {
            java.util.Iterator it = hVar.K.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) it.next()).H0(z17);
            }
        }
        if (!z17 || this.f69183o) {
            return;
        }
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        for (m40.j0 expType : this.f69184p) {
            c61.p7 p7Var = (c61.p7) k0Var;
            p7Var.getClass();
            kotlin.jvm.internal.o.g(expType, "expType");
            lb2.j jVar = (lb2.j) p7Var.f39227e.get(expType);
            if (jVar != null) {
                jVar.l();
            }
        }
        this.f69183o = true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout, fv3.c
    public void j(fv3.d status, android.os.Bundle bundle) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment;
        kotlin.jvm.internal.o.g(status, "status");
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156255r) {
            if (bundle != null) {
                com.tencent.mars.xlog.Log.i(this.f69181m, "statusChange: type " + bundle.getInt("key_option_type") + ", isCurrentSelect:" + bundle.getBoolean("key_boolean", false));
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
                if (d17 instanceof kv3.a) {
                }
            }
        } else if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156246f) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment2 = getRecommendFeedFragment();
            if (recommendFeedFragment2 != null) {
                recommendFeedFragment2.B0(true);
            }
        } else if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156248h && (recommendFeedFragment = getRecommendFeedFragment()) != null) {
            recommendFeedFragment.B0(false);
        }
        super.j(status, bundle);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f k() {
        return new kv3.a(this, this, getDefaultSelectPageTabType());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 l() {
        return super.l();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 n() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        return new kv3.b(this, this, getPageTypeArray(), getPagerDefaultSelectTabType(), new ev0.d(this), d17 != null ? d17.w() : null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        kv3.h hVar = new kv3.h(this, this, true, null, ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).hj(m40.j0.f323409e), getPageType(), this.f156142s, 8, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        hVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        hVar.B = d18 != null ? d18.f156223p : null;
        this.f69182n = hVar;
        return hVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public void p(boolean z17, boolean z18) {
        super.p(z17, z18);
    }

    public final boolean r() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        boolean z17 = recommendDataFragment != null ? recommendDataFragment.f156399r : false;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment = getRecommendFeedFragment();
        return z17 || (recommendFeedFragment != null && recommendFeedFragment.f156340s && !recommendFeedFragment.f156342u);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            r3 = this;
            com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment r0 = r3.getRecommendFeedFragment()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            nv3.t r0 = r0.f156345x
            if (r0 == 0) goto Lf
            boolean r0 = r0.f340716n
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 != r1) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 != 0) goto L28
            kv3.h r0 = r3.f69182n
            if (r0 == 0) goto L23
            boolean r0 = r0.E()
            if (r0 != r1) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = r2
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout.s():boolean");
    }

    public final void setLocalAudioList(java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        if (recommendDataFragment != null) {
            recommendDataFragment.P0(audioList);
        }
    }

    public final void t(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        if (recommendDataFragment != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markRefreshKeepingSelected: keep=");
            sb6.append(audioCacheInfo != null ? audioCacheInfo.f155723t : null);
            com.tencent.mars.xlog.Log.i(recommendDataFragment.f156396o, sb6.toString());
            recommendDataFragment.f156402u = audioCacheInfo;
            recommendDataFragment.f156403v = true;
        }
    }

    public void u() {
        if (g()) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment = getRecommendFeedFragment();
            if (recommendFeedFragment != null) {
                recommendFeedFragment.A0();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        if (recommendDataFragment != null) {
            recommendDataFragment.M0();
        }
    }

    public final void v(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        if (recommendDataFragment != null) {
            int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment.f156394x;
            recommendDataFragment.N0(info, false);
        }
    }

    public final void w() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        if (recommendDataFragment != null) {
            recommendDataFragment.f156399r = false;
            recommendDataFragment.f156400s = false;
            dv3.c cVar = recommendDataFragment.f156381e;
            if (cVar != null) {
                cVar.I.clear();
                cVar.K = 0;
            }
            recommendDataFragment.L0();
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment = getRecommendFeedFragment();
        if (recommendFeedFragment != null) {
            recommendFeedFragment.f156342u = true;
            recommendFeedFragment.A0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(yu3.b r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout.x(yu3.b, boolean):void");
    }
}
