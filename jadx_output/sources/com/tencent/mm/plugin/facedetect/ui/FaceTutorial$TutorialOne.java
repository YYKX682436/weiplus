package com.tencent.mm.plugin.facedetect.ui;

/* loaded from: classes3.dex */
public class FaceTutorial$TutorialOne extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f100089e = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f100090d;

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreate");
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreateView()");
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.aak, viewGroup, false);
        this.f100090d = inflate;
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.doo)).setOnClickListener(new g72.b0(this));
        return this.f100090d;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo onDestroy");
    }
}
