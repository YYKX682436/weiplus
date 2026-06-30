package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Landroid/widget/RelativeLayout;", "Lyt3/r2;", "", "visibility", "Ljz5/f0;", "setVisibility", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getPluginList", "()Ljava/util/ArrayList;", "pluginList", "", "e", "Z", "isAttached", "()Z", "setAttached", "(Z)V", "", "f", "J", "getStartTimeMs", "()J", "setStartTimeMs", "(J)V", "startTimeMs", "g", "getBrowserTimeMs", "setBrowserTimeMs", "browserTimeMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout */
/* loaded from: classes10.dex */
public abstract class AbstractC17010x26b2d1ce extends android.widget.RelativeLayout implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList pluginList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long startTimeMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long browserTimeMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17010x26b2d1ce(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.pluginList = new java.util.ArrayList();
    }

    public final long getBrowserTimeMs() {
        return this.browserTimeMs;
    }

    /* renamed from: getPluginList */
    public final java.util.ArrayList<yt3.r2> m67975xd72b7a67() {
        return this.pluginList;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final yt3.r2 j(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        for (yt3.r2 r2Var : this.pluginList) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2Var.mo122733x337a8b(), clazz.getName())) {
                return r2Var;
            }
        }
        return null;
    }

    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).t(configProvider);
        }
    }

    /* renamed from: onActivityResult */
    public void mo47332x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo47332x9d4787cb(i17, i18, intent);
        }
    }

    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BasePluginLayout", "onAttach: ");
        this.isAttached = true;
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo10988x3b13c504();
        }
    }

    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            if (((yt3.r2) it.next()).mo9064x4ceae47d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        this.browserTimeMs = java.lang.System.currentTimeMillis() - this.startTimeMs;
        this.isAttached = false;
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo10989x3f5eee52();
        }
    }

    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo11000xb01dfb57();
        }
    }

    /* renamed from: onRequestPermissionsResult */
    public void mo61366x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo61366x953457f1(i17, permissions, grantResults);
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo61366x953457f1(i17, permissions, grantResults);
        }
    }

    /* renamed from: onResume */
    public void mo11001x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BasePluginLayout", "onResume: ");
        this.startTimeMs = java.lang.System.currentTimeMillis();
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo11001x57429eec();
        }
    }

    public void p(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        m(navigator, configProvider);
    }

    public void r(ct0.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BasePluginLayout", "loadCurrentPage: start");
        mo10988x3b13c504();
        mo9066x6761d4f();
        mo9067x901b6914(0);
    }

    /* renamed from: release */
    public void mo9065x41012807() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo9065x41012807();
        }
    }

    /* renamed from: reset */
    public void mo9066x6761d4f() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).mo9066x6761d4f();
        }
    }

    public void s() {
    }

    /* renamed from: setAttached */
    public final void m67977x96af1c26(boolean z17) {
        this.isAttached = z17;
    }

    /* renamed from: setBrowserTimeMs */
    public final void m67978xe3341959(long j17) {
        this.browserTimeMs = j17;
    }

    /* renamed from: setStartTimeMs */
    public final void m67979x217f693(long j17) {
        this.startTimeMs = j17;
    }

    @Override // android.view.View, yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BasePluginLayout", "setVisibility: visibility = " + i17);
        super.setVisibility(i17);
        if (i17 == 0) {
            mo11001x57429eec();
        } else {
            mo11000xb01dfb57();
        }
    }

    public void u() {
    }

    public void x(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }
}
