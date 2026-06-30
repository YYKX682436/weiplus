package uo2;

/* loaded from: classes2.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f511177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f511177d = new java.util.HashMap();
    }

    public final void O6() {
        java.util.HashMap hashMap = this.f511177d;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((vo2.c) ((vo2.d) ((java.util.Map.Entry) it.next()).getValue())).e();
        }
        hashMap.clear();
    }

    public final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.HashMap hashMap = this.f511177d;
        vo2.d dVar = (vo2.d) hashMap.get(view);
        if (dVar != null) {
            ((vo2.c) dVar).e();
        }
        hashMap.remove(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderImgFeedMusicPlayer", view.getId() + " dettach, player size:" + hashMap.size());
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 Q6(android.view.View view) {
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566402fs3) : null;
        if (findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041) findViewById;
        }
        return null;
    }

    public final void R6(yz5.l lVar) {
        vo2.d dVar;
        for (java.util.Map.Entry entry : this.f511177d.entrySet()) {
            if (!(lVar != null ? ((java.lang.Boolean) lVar.mo146xb9724478(entry.getKey())).booleanValue() : false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 Q6 = Q6((android.view.View) entry.getKey());
                if (Q6 != null) {
                    Q6.o();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) entry.getKey();
                if (c14493xfdc11530.musicInfo == null || (dVar = c14493xfdc11530.player) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderImgFeedMusicTag", "[pauseMusicAuto] musicInfo = " + c14493xfdc11530.musicInfo + ",player = " + c14493xfdc11530.player);
                } else {
                    c14493xfdc11530.isMusicFocused = false;
                    c14493xfdc11530.shouldMusicResume = false;
                    c14493xfdc11530.isMusicPauseManually = false;
                    if (((vo2.c) dVar).b() ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderImgFeedMusicTag", "[pauseMusicAuto] music paused");
                    } else if (c14493xfdc11530.musicInfo != null) {
                        vo2.d dVar2 = c14493xfdc11530.player;
                        if (dVar2 != null) {
                            ((vo2.c) dVar2).c();
                        }
                        c14493xfdc11530.f();
                        c14493xfdc11530.onPlayCallback.mo146xb9724478(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
    }

    public final void S6() {
        for (java.util.Map.Entry entry : this.f511177d.entrySet()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) entry.getKey()).isMusicFocused) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) entry.getKey()).m58353x8ab65abd(((vo2.c) ((vo2.d) entry.getValue())).b());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) entry.getKey()).d(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 Q6 = Q6((android.view.View) entry.getKey());
                if (Q6 != null) {
                    Q6.o();
                }
            }
        }
    }

    public final void T6() {
        for (java.util.Map.Entry entry : this.f511177d.entrySet()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) entry.getKey()).isMusicFocused && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) entry.getKey()).getShouldMusicResume()) {
                ((vo2.c) ((vo2.d) entry.getValue())).d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 Q6 = Q6((android.view.View) entry.getKey());
                if (Q6 != null) {
                    Q6.m();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        O6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f511177d = new java.util.HashMap();
    }
}
