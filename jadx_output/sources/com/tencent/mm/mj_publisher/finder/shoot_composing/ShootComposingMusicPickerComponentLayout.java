package com.tencent.mm.mj_publisher.finder.shoot_composing;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getRecommendFeedTabType", "getRecentPlayedType", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerShootRecommendFragment;", "getMusicPickerMaasRecommendFragment", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment;", "getRecommendFeedFragment", "", "getPageTypeArray", "getLikeTabType", "getDefaultSelectPageTabType", "getPagerDefaultSelectTabType", "", "templateId", "Ljz5/f0;", "setTemplateId", "", "isFront", "setCameraFacing", "Lcom/tencent/mm/plugin/vlog/model/i0;", "getPageType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShootComposingMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f69537p = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f69538m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69539n;

    /* renamed from: o, reason: collision with root package name */
    public kv3.h f69540o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShootComposingMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69538m = "MicroMsg.Finder.RecordMusicPickerComponentLayout";
    }

    private final com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment getMusicPickerMaasRecommendFragment() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var != null ? h0Var.o(getDefaultSelectPageTabType()) : null;
        if (o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment) {
            return (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment) o17;
        }
        return null;
    }

    private final int getRecentPlayedType() {
        return 14;
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
    public boolean a() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323416o);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public boolean f() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public boolean g() {
        return ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).hj(m40.j0.f323410f);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getDefaultSelectPageTabType() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getLikeTabType() {
        return 9;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.vlog.model.i0 getPageType() {
        return com.tencent.mm.plugin.vlog.model.i0.f175613e;
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
        if (!z17 || this.f69539n) {
            return;
        }
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        m40.j0 j0Var = m40.j0.f323411g;
        c61.p7 p7Var = (c61.p7) k0Var;
        p7Var.getClass();
        lb2.j jVar = (lb2.j) p7Var.f39227e.get(j0Var);
        if (jVar != null) {
            jVar.l();
        }
        this.f69539n = true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout, fv3.c
    public void j(fv3.d status, android.os.Bundle bundle) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment;
        kotlin.jvm.internal.o.g(status, "status");
        if (status == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156255r) {
            if (bundle != null) {
                com.tencent.mars.xlog.Log.i(this.f69538m, "statusChange: type " + bundle.getInt("key_option_type") + ", isCurrentSelect:" + bundle.getBoolean("key_boolean", false));
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
        return new kv3.b(this, this, getPageTypeArray(), getPagerDefaultSelectTabType(), new mx0.m3(this), d17 != null ? d17.w() : null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        kv3.h hVar = new kv3.h(this, this, true, null, g(), getPageType(), a(), 8, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        hVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        hVar.B = d18 != null ? d18.f156223p : null;
        this.f69540o = hVar;
        return hVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public void p(boolean z17, boolean z18) {
        super.p(z17, z18);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public boolean q() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323415n);
    }

    public void r() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment musicPickerMaasRecommendFragment = getMusicPickerMaasRecommendFragment();
        if (musicPickerMaasRecommendFragment != null) {
            musicPickerMaasRecommendFragment.M0();
            musicPickerMaasRecommendFragment.f156404w = new mx0.l3(musicPickerMaasRecommendFragment, this);
        }
    }

    public final void s(int i17, java.lang.String musicId, boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment musicPickerMaasRecommendFragment;
        kotlin.jvm.internal.o.g(musicId, "musicId");
        if (getDefaultSelectPageTabType() != i17 && (musicPickerMaasRecommendFragment = getMusicPickerMaasRecommendFragment()) != null) {
            musicPickerMaasRecommendFragment.f156401t = false;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        if (h0Var != null) {
            int V = kz5.z.V(h0Var.f156234h, i17);
            androidx.viewpager.widget.ViewPager q17 = h0Var.q();
            if (q17 != null) {
                q17.setCurrentItem(V);
            }
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var2 = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var2 != null ? h0Var2.o(i17) : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment musicPickerDataFragment = o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment) o17 : null;
        if (musicPickerDataFragment != null) {
            musicPickerDataFragment.u0(musicId, z17);
        }
    }

    public final void setCameraFacing(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment musicPickerMaasRecommendFragment = getMusicPickerMaasRecommendFragment();
        if (musicPickerMaasRecommendFragment != null) {
            int i17 = z17 ? 1 : 2;
            java.lang.Object obj = musicPickerMaasRecommendFragment.f156397p;
            wt3.j0 j0Var = obj instanceof wt3.j0 ? (wt3.j0) obj : null;
            nv3.f helper = j0Var != null ? j0Var.getHelper() : null;
            if (helper == null) {
                return;
            }
            helper.f340669k = i17;
        }
    }

    public final void setTemplateId(java.lang.String str) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment musicPickerMaasRecommendFragment = getMusicPickerMaasRecommendFragment();
        if (musicPickerMaasRecommendFragment != null) {
            musicPickerMaasRecommendFragment.Q0(str);
        }
    }

    public final void t(java.util.List audioList, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment musicPickerMaasRecommendFragment = getMusicPickerMaasRecommendFragment();
        if (musicPickerMaasRecommendFragment != null) {
            musicPickerMaasRecommendFragment.f156358y = z17;
            musicPickerMaasRecommendFragment.f156359z = z18;
            musicPickerMaasRecommendFragment.P0(audioList);
        }
    }

    public final void u(yu3.b setupInfo, boolean z17) {
        kotlin.jvm.internal.o.g(setupInfo, "setupInfo");
        com.tencent.mars.xlog.Log.i(this.f69538m, "setupConfig: ");
        st3.k kVar = setupInfo.f465863c;
        if (setupInfo.f465862b) {
            kVar.f412549d = false;
        }
        setupLyricsGroup(kVar.f412547b);
        super.p(kVar.f412549d, kVar.f412548c);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            java.lang.String r17 = i65.a.r(e0Var.f156168g, com.tencent.mm.R.string.g0w);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            e0Var.G(r17);
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment musicPickerMaasRecommendFragment = getMusicPickerMaasRecommendFragment();
        yu3.a aVar = setupInfo.f465861a;
        if (musicPickerMaasRecommendFragment != null) {
            musicPickerMaasRecommendFragment.f156401t = z17;
            musicPickerMaasRecommendFragment.R0(aVar);
            musicPickerMaasRecommendFragment.f156358y = false;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment recommendFeedFragment = getRecommendFeedFragment();
        if (recommendFeedFragment != null) {
            recommendFeedFragment.F0(aVar);
            recommendFeedFragment.f156338q = getMusicPickerDrawer();
        }
        kv3.h hVar = this.f69540o;
        if (hVar != null) {
            hVar.R = aVar.f465856f - aVar.f465855e;
        }
        if (hVar != null) {
            hVar.G(getMusicPickerDrawer());
        }
    }
}
