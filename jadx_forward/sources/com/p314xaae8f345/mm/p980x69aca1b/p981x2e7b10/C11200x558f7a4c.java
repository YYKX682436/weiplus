package com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/LoadingCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.card.LoadingCard */
/* loaded from: classes16.dex */
public final class C11200x558f7a4c extends com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 {
    public static final /* synthetic */ int Y1 = 0;
    public final jz5.g U1;
    public final jz5.g V1;
    public final jz5.g W1;
    public yz5.a X1;

    public C11200x558f7a4c() {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571182b);
        this.U1 = jz5.h.b(new r.h(this));
        this.V1 = jz5.h.b(new r.g(this));
        this.W1 = jz5.h.b(new r.d(this));
    }

    @Override // com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1
    public void l0() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r rVar;
        ((android.view.View) ((jz5.n) this.V1).mo141623x754a37bb()).setOnClickListener(new r.e(this));
        ((android.view.View) ((jz5.n) this.W1).mo141623x754a37bb()).setOnClickListener(r.f.f449484d);
        s.e eVar = s.i.f483361i;
        jz5.g gVar = this.U1;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = s.i.f483363k;
        java.util.Set keySet = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", sb6.toString());
        s.i iVar = (s.i) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            m48373x63a3b28a();
        } else if (iVar.f483371h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "onCardCreated: already released, dismiss card");
            m48373x63a3b28a();
            eVar.a(iVar.f483369f);
            iVar.f483369f = 0;
        } else {
            iVar.f483367d = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", sb7.toString());
        s.i iVar2 = (s.i) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (iVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            m48373x63a3b28a();
            return;
        }
        if (iVar2.f483371h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "attach: already released, dismiss card");
            this.X1 = null;
            m48373x63a3b28a();
            eVar.a(iVar2.f483369f);
            iVar2.f483369f = 0;
            return;
        }
        if (iVar2.f483368e <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = iVar2.f483366c == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + iVar2.f483368e);
        iVar2.f483367d = null;
        iVar2.f483366c = this;
        this.X1 = new s.f(iVar2);
        if (!z17 || (rVar = iVar2.f483365b) == null) {
            return;
        }
        rVar.c(iVar2.f483368e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        s.e eVar = s.i.f483361i;
        int intValue = ((java.lang.Number) ((jz5.n) this.U1).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", "detach: " + intValue);
        s.i iVar = (s.i) s.i.f483363k.get(java.lang.Integer.valueOf(intValue));
        if (iVar != null) {
            if (iVar.f483366c == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", "detach: clear card reference");
                iVar.f483366c = null;
            }
            if (iVar.f483367d == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", "detach: clear pending card reference");
                iVar.f483367d = null;
            }
            this.X1 = null;
        }
        super.mo7399xa6664a60();
    }
}
