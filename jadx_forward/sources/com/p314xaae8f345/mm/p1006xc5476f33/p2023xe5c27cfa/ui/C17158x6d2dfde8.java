package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$resUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI$resUpdateListener$1 */
/* loaded from: classes.dex */
public final class C17158x6d2dfde8 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI f239604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17158x6d2dfde8(com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI, com.p314xaae8f345.mm.app.a0 a0Var) {
        super(a0Var);
        this.f239604d = repairerResDownloadUI;
        this.f39173x3fe91575 = 905296653;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI = this.f239604d;
        repairerResDownloadUI.d.append("========================\n");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        am.r2 r2Var = event.f135586g;
        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f89292a) : null);
        sb6.append(" subtype:");
        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f89293b) : null);
        sb6.append(" version:");
        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f89295d) : null);
        sb6.append(" updated:");
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.f89296e) : null);
        sb6.append(" fileSize:");
        sb6.append(com.p314xaae8f345.mm.vfs.w6.k(r2Var != null ? r2Var.f89294c : null));
        sb6.append('\n');
        repairerResDownloadUI.d.append(sb6.toString());
        pm0.v.X(new vw3.o4(repairerResDownloadUI));
        return false;
    }
}
