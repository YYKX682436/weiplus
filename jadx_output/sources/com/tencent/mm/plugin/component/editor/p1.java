package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f96622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96623e;

    public p1(com.tencent.mm.plugin.component.editor.EditorUI editorUI, int i17) {
        this.f96623e = editorUI;
        this.f96622d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f96622d;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "huahuastart: onNotifyItemChanged,position is %d", java.lang.Integer.valueOf(i17));
        this.f96623e.f96498e.notifyItemChanged(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "huahuaend: onNotifyItemChanged,position is %d", java.lang.Integer.valueOf(i17));
    }
}
