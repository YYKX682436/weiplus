package com.tencent.mm.open_voice_control.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/LoadingCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class LoadingCard extends com.tencent.mm.open_voice_control.card.BaseCard {
    public static final /* synthetic */ int Y1 = 0;
    public final jz5.g U1;
    public final jz5.g V1;
    public final jz5.g W1;
    public yz5.a X1;

    public LoadingCard() {
        super(com.tencent.mm.R.layout.f489649b);
        this.U1 = jz5.h.b(new r.h(this));
        this.V1 = jz5.h.b(new r.g(this));
        this.W1 = jz5.h.b(new r.d(this));
    }

    @Override // com.tencent.mm.open_voice_control.card.BaseCard
    public void l0() {
        com.tencent.wechat.aff.ovc.r rVar;
        ((android.view.View) ((jz5.n) this.V1).getValue()).setOnClickListener(new r.e(this));
        ((android.view.View) ((jz5.n) this.W1).getValue()).setOnClickListener(r.f.f367951d);
        s.e eVar = s.i.f401828i;
        jz5.g gVar = this.U1;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = s.i.f401830k;
        java.util.Set keySet = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", sb6.toString());
        s.i iVar = (s.i) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (iVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            dismiss();
        } else if (iVar.f401838h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "onCardCreated: already released, dismiss card");
            dismiss();
            eVar.a(iVar.f401836f);
            iVar.f401836f = 0;
        } else {
            iVar.f401834d = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", sb7.toString());
        s.i iVar2 = (s.i) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (iVar2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            dismiss();
            return;
        }
        if (iVar2.f401838h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "attach: already released, dismiss card");
            this.X1 = null;
            dismiss();
            eVar.a(iVar2.f401836f);
            iVar2.f401836f = 0;
            return;
        }
        if (iVar2.f401835e <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = iVar2.f401833c == null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + iVar2.f401835e);
        iVar2.f401834d = null;
        iVar2.f401833c = this;
        this.X1 = new s.f(iVar2);
        if (!z17 || (rVar = iVar2.f401832b) == null) {
            return;
        }
        rVar.c(iVar2.f401835e);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        s.e eVar = s.i.f401828i;
        int intValue = ((java.lang.Number) ((jz5.n) this.U1).getValue()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", "detach: " + intValue);
        s.i iVar = (s.i) s.i.f401830k.get(java.lang.Integer.valueOf(intValue));
        if (iVar != null) {
            if (iVar.f401833c == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", "detach: clear card reference");
                iVar.f401833c = null;
            }
            if (iVar.f401834d == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", "detach: clear pending card reference");
                iVar.f401834d = null;
            }
            this.X1 = null;
        }
        super.onDestroyView();
    }
}
