package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f96570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f96571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96572g;

    public i(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI, int i17, long j17, long j18) {
        this.f96572g = editorFileUI;
        this.f96569d = i17;
        this.f96570e = j17;
        this.f96571f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96572g;
        editorFileUI.f96464m.setProgress(this.f96569d);
        editorFileUI.f96465n.setText(editorFileUI.getString(com.tencent.mm.R.string.f491193ca2, com.tencent.mm.sdk.platformtools.t8.T((float) this.f96570e), com.tencent.mm.sdk.platformtools.t8.T((float) this.f96571f)));
    }
}
