package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui;

/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceTutorial$TutorialOne */
/* loaded from: classes3.dex */
public class C13524xa7be3bdf extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f181622e = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f181623d;

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreate");
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreateView()");
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aak, viewGroup, false);
        this.f181623d = inflate;
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.doo)).setOnClickListener(new g72.b0(this));
        return this.f181623d;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo onDestroy");
    }
}
