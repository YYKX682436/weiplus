package com.tencent.mm.mj_publisher.finder.composing_creation.music;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\b\u0010\u0017\u001a\u00020\u0016H\u0016¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/composing_creation/music/CreationComposingMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getRecommendFeedTabType", "getRecentPlayedType", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "getRecommendDataFragment", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment;", "getRecommendFeedFragment", "", "getPageTypeArray", "getLikeTabType", "getDefaultSelectPageTabType", "getPagerDefaultSelectTabType", "Lyu3/b;", "setupInfo", "Ljz5/f0;", "setupConfig", "", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Lcom/tencent/mm/plugin/vlog/model/i0;", "getPageType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreationComposingMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f69170r = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f69171m;

    /* renamed from: n, reason: collision with root package name */
    public kv3.h f69172n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.util.Set f69173o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69174p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f69175q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreationComposingMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69171m = "MicroMsg.CreationComposingMusicPickerComponentLayout";
        this.f69173o = kz5.r0.f314002d;
        this.f69175q = kz5.c0.i(m40.j0.f323408d, m40.j0.f323409e, m40.j0.f323411g);
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
        kv3.h hVar = this.f69172n;
        if (hVar != null && hVar.G) {
            java.util.Iterator it = hVar.K.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) it.next()).H0(z17);
            }
        }
        if (!z17 || this.f69174p) {
            return;
        }
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        for (m40.j0 expType : this.f69175q) {
            c61.p7 p7Var = (c61.p7) k0Var;
            p7Var.getClass();
            kotlin.jvm.internal.o.g(expType, "expType");
            lb2.j jVar = (lb2.j) p7Var.f39227e.get(expType);
            if (jVar != null) {
                jVar.l();
            }
        }
        this.f69174p = true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout, fv3.c
    public void j(fv3.d status, android.os.Bundle bundle) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment;
        kotlin.jvm.internal.o.g(status, "status");
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156255r) {
            if (bundle != null) {
                com.tencent.mars.xlog.Log.i(this.f69171m, "statusChange: type " + bundle.getInt("key_option_type") + ", isCurrentSelect:" + bundle.getBoolean("key_boolean", false));
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
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 n() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        return new kv3.b(this, this, getPageTypeArray(), getPagerDefaultSelectTabType(), new fu0.s(this), d17 != null ? d17.w() : null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        kv3.h hVar = new kv3.h(this, this, true, null, ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).hj(m40.j0.f323409e), getPageType(), false, 72, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        hVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        hVar.B = d18 != null ? d18.f156223p : null;
        this.f69172n = hVar;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r() {
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
            kv3.h r0 = r3.f69172n
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout.r():boolean");
    }

    public void s() {
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

    public final void setLocalAudioList(java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = audioList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) it.next()).C;
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        this.f69173o = kz5.n0.X0(arrayList);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        if (recommendDataFragment != null) {
            recommendDataFragment.P0(audioList);
        }
    }

    public final void setupConfig(yu3.b setupInfo) {
        kotlin.jvm.internal.o.g(setupInfo, "setupInfo");
        com.tencent.mars.xlog.Log.i(this.f69171m, "setupConfig: ");
        st3.k kVar = setupInfo.f465863c;
        setupLyricsGroup(kVar.f412547b);
        p(kVar.f412549d, kVar.f412548c);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            java.lang.String r17 = i65.a.r(e0Var.f156168g, com.tencent.mm.R.string.lll);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            e0Var.G(r17);
            int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k0.f156284a;
            e0Var.H(2, true);
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment recommendDataFragment = getRecommendDataFragment();
        yu3.a aVar = setupInfo.f465861a;
        if (recommendDataFragment != null) {
            recommendDataFragment.f156401t = false;
            recommendDataFragment.f156404w = new fu0.t(recommendDataFragment);
            recommendDataFragment.R0(aVar);
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment = getRecommendFeedFragment();
        if (recommendFeedFragment != null) {
            recommendFeedFragment.F0(aVar);
            recommendFeedFragment.f156338q = getMusicPickerDrawer();
        }
        kv3.h hVar = this.f69172n;
        if (hVar != null) {
            hVar.G(getMusicPickerDrawer());
        }
        kv3.h hVar2 = this.f69172n;
        if (hVar2 != null) {
            hVar2.R = aVar.f465856f - aVar.f465855e;
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
}
