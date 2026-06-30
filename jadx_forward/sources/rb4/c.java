package rb4;

/* loaded from: classes9.dex */
public final class c extends com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void O6(rb4.c cVar, android.view.ViewGroup viewGroup, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 c19719xa864b110 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110) cVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.vmg);
        android.widget.SeekBar seekBar = (android.widget.SeekBar) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.gzy);
        int progress = seekBar.getProgress() + (java.lang.Math.max(seekBar.getMax() / 10, 1) * (z17 ? 1 : -1));
        seekBar.setProgress(progress);
        c19719xa864b110.m(progress, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$moveVideoProcess", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf
    /* renamed from: initConfig */
    public void mo10031xf3d9c872() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initConfig", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
        m42284x3580e2(com.p314xaae8f345.mm.R.id.vly).m42298xc1088956().mo42301x338af3(com.p314xaae8f345.mm.R.id.v1w).mo42301x338af3(com.p314xaae8f345.mm.R.id.f569082vm3).mo42301x338af3(com.p314xaae8f345.mm.R.id.s0s).mo42301x338af3(com.p314xaae8f345.mm.R.id.v1v);
        m42293x373aa5(com.p314xaae8f345.mm.R.id.vmg, com.p314xaae8f345.mm.R.id.f569082vm3).m42368x368f3a(com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21348xd8bf9a5b).m42354x853e2dce(new rb4.a(this)).m42353x843391fa(new rb4.b(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initConfig", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility");
    }
}
