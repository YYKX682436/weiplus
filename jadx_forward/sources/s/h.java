package s;

/* loaded from: classes16.dex */
public final class h extends qz5.l implements yz5.p {
    public final /* synthetic */ s.i L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.L = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s.h(this.L, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        s.i iVar = this.L;
        boolean z17 = iVar.f483371h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "show: skip after released");
            return f0Var;
        }
        int i17 = s.i.f483362j + 1;
        s.i.f483362j = i17;
        iVar.f483369f = i17;
        s.i.f483363k.put(new java.lang.Integer(i17), iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCLoadingUI", "show: " + iVar.f483369f);
        int i18 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c.Y1;
        int i19 = iVar.f483369f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.LoadingCard", "show uiId=" + i19);
        android.app.Activity a17 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af.B.a();
        if (a17 instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "openLoading: reuse existing A2ACardActivity");
            com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af activityC11198x400818af = (com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af) a17;
            activityC11198x400818af.getClass();
            com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c c11200x558f7a4c = new com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("ui_id", i19);
            c11200x558f7a4c.mo7562xe26dab14(bundle);
            activityC11198x400818af.T6(c11200x558f7a4c);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.A2AActivity", "openLoading: no available context, cannot show card");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "openLoading: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af.class);
                intent.putExtra("ui_id", i19);
                f41.c cVar = f41.c.f341003d;
                intent.putExtra("card_type", 3);
                intent.addFlags(268435456);
                android.os.Bundle bundle2 = android.app.ActivityOptions.makeCustomAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559254i, 0).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle2);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openLoading", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openLoading", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
