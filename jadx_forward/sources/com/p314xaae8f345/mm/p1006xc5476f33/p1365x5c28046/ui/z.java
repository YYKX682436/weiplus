package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class z implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b f180101d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b) {
        this.f180101d = activityC13279x3d93ec0b;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = this.f180101d;
        activityC13279x3d93ec0b.f179233f.I();
        activityC13279x3d93ec0b.V6(true);
        activityC13279x3d93ec0b.f179250y.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13378x554507f3 c13378x554507f3 = activityC13279x3d93ec0b.f179250y;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d layoutManager = activityC13279x3d93ec0b.f179234g;
        java.util.ArrayList emojis = activityC13279x3d93ec0b.f179244s;
        m22.x dragGesture = activityC13279x3d93ec0b.U;
        c13378x554507f3.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojis, "emojis");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragGesture, "dragGesture");
        c13378x554507f3.setVisibility(0);
        c13378x554507f3.removeAllViews();
        android.view.View mo7935xa188593e = layoutManager.mo7935xa188593e(layoutManager.w());
        if (mo7935xa188593e == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        android.view.ViewGroup.LayoutParams layoutParams = c13378x554507f3.getLayoutParams();
        layoutParams.width = mo7935xa188593e.getWidth();
        layoutParams.height = mo7935xa188593e.getHeight();
        if (emojis.size() >= 3) {
            android.view.View a17 = c13378x554507f3.a((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojis.get(emojis.size() - 3), mo7935xa188593e.getWidth(), mo7935xa188593e.getHeight(), null);
            a17.setTranslationX(ym5.x.a(c13378x554507f3.getContext(), -6.0f));
            a17.setTranslationY(ym5.x.a(c13378x554507f3.getContext(), -4.0f));
            a17.setRotation(3.0f);
            a17.setElevation(ym5.x.a(c13378x554507f3.getContext(), 4.0f));
            c13378x554507f3.addView(a17);
        }
        if (emojis.size() >= 2) {
            android.view.View a18 = c13378x554507f3.a((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojis.get(emojis.size() - 2), mo7935xa188593e.getWidth(), mo7935xa188593e.getHeight(), null);
            a18.setTranslationX(ym5.x.a(c13378x554507f3.getContext(), -4.0f));
            a18.setTranslationY(ym5.x.a(c13378x554507f3.getContext(), -4.0f));
            a18.setRotation(-3.0f);
            a18.setElevation(ym5.x.a(c13378x554507f3.getContext(), 8.0f));
            c13378x554507f3.addView(a18);
        }
        android.view.View a19 = c13378x554507f3.a((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojis.get(emojis.size() - 1), mo7935xa188593e.getWidth(), mo7935xa188593e.getHeight(), java.lang.Integer.valueOf(emojis.size()));
        a19.setElevation(ym5.x.a(c13378x554507f3.getContext(), 16.0f));
        c13378x554507f3.addView(a19);
        android.view.ViewGroup.LayoutParams layoutParams2 = c13378x554507f3.getLayoutParams();
        layoutParams2.width = mo7935xa188593e.getWidth() + ym5.x.a(c13378x554507f3.getContext(), 14.0f);
        layoutParams2.height = mo7935xa188593e.getHeight() + ym5.x.a(c13378x554507f3.getContext(), 12.0f);
        c13378x554507f3.setLayoutParams(layoutParams2);
        dragGesture.f404613p.set(0, 0, mo7935xa188593e.getWidth(), mo7935xa188593e.getHeight());
        activityC13279x3d93ec0b.f179232e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        activityC13279x3d93ec0b.f179232e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.z$$a
            @Override // java.lang.Runnable
            public final void run() {
                m22.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z.this.f180101d.f179249x;
                eVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToDragMode: ");
                eVar.f404574i = true;
                eVar.f404569d.D0();
            }
        });
        activityC13279x3d93ec0b.f179233f.m8151xc67946d3(activityC13279x3d93ec0b.f179234g.w(), activityC13279x3d93ec0b.f179234g.m8008x3d79f549());
    }
}
