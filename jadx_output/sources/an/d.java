package an;

/* loaded from: classes8.dex */
public class d implements com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase {
    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public java.lang.String anchorOfBadgeAtLiveCell() {
        return null;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public boolean badgeAtChannelsCell() {
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderEntrance");
            if (L0 != null) {
                return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "FinderEntrance") != null;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public boolean badgeAtDiscover() {
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Discovery");
            if (L0 != null) {
                return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "Discovery") != null;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public boolean badgeAtLiveCell() {
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            if (L0 != null) {
                return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "FinderLiveEntrance") != null;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public boolean badgeAtMomentsCell() {
        try {
            return !android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().l(68377, null));
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public boolean badgeAtTopStoriesCell() {
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Search.Entrance");
            if (L0 != null) {
                return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "Search.Entrance") != null;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public java.lang.String titleOfBadgeAtLiveCell() {
        return null;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public int unreadAtChannelsCell() {
        r45.f03 Dj;
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderEntrance");
            if (L0 == null || (Dj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "FinderEntrance")) == null) {
                return 0;
            }
            return Dj.f373888e;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public int unreadAtDiscover() {
        r45.f03 Dj;
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Discovery");
            if (L0 == null || (Dj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "Discovery")) == null) {
                return 0;
            }
            return Dj.f373888e;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public int unreadAtLiveCell() {
        r45.f03 Dj;
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            if (L0 == null || (Dj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "FinderLiveEntrance")) == null) {
                return 0;
            }
            return Dj.f373888e;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public int unreadAtMomentsCell() {
        return ((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).f();
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase
    public int unreadAtTopStoriesCell() {
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Search.Entrance");
            if (L0 != null) {
                return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, "Search.Entrance") != null ? 1 : 0;
            }
            return 0;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}
