package h41;

/* loaded from: classes11.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f360364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(h41.o0 o0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360364d = o0Var;
        this.f360365e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.n0(this.f360364d, this.f360365e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.o0 o0Var = this.f360364d;
        boolean z17 = o0Var.f360378k;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "showAsync: skip after released");
            return f0Var;
        }
        int i17 = h41.o0.f360367f + 1;
        h41.o0.f360367f = i17;
        o0Var.f360374e = i17;
        h41.o0.f360368g.put(new java.lang.Integer(i17), o0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showAsync: ");
        sb6.append(o0Var.f360374e);
        sb6.append(" username=");
        java.lang.String username = this.f360365e;
        sb6.append(username);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", sb6.toString());
        int i18 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569.f153776v;
        int i19 = o0Var.f360374e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SendMsgCard", "show uiId=" + i19 + ", username=" + username);
        android.app.Activity a17 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af.B.a();
        if (a17 instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "openSendMsg: reuse existing A2ACardActivity");
            ((com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af) a17).V6(i19, username);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.A2AActivity", "openSendMsg: no available context, cannot show card");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "openSendMsg: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af.class);
                intent.putExtra("ui_id", i19);
                intent.putExtra(dm.i4.f66875xa013b0d5, username);
                f41.c cVar = f41.c.f341003d;
                intent.putExtra("card_type", 1);
                intent.addFlags(268435456);
                android.os.Bundle bundle = android.app.ActivityOptions.makeCustomAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559254i, com.p314xaae8f345.mm.R.C30854x2dc211.f559255j).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSendMsg", "(ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSendMsg", "(ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
