package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/FinderLiveVideoCompositionPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/video/EditorVideoCompositionPluginLayout;", "Lju3/d0;", "", "getMuteOrigin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.FinderLiveVideoCompositionPluginLayout */
/* loaded from: classes10.dex */
public final class C18822x107377e extends com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 {
    public boolean S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18822x107377e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839
    public void A() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVideoCompositionPluginLayout", "afterPreviewInit >> " + this.S);
        m72685x2ae1b181().d(this.S);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839
    /* renamed from: getMuteOrigin, reason: from getter */
    public boolean getS() {
        return this.S;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17009xe70f98fd, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
        boolean z17 = false;
        if (configProvider != null && (bundle = configProvider.M) != null) {
            z17 = bundle.getBoolean("key_mute_video", false);
        }
        this.S = z17;
        super.r(bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveVideoCompositionPluginLayout", "afterDetach");
        p3325xe03a0797.p3326xc267989b.r2 previewJob = getPreviewJob();
        if (previewJob != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(previewJob, null, 1, null);
        }
    }
}
