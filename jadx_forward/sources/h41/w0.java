package h41;

/* loaded from: classes11.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f360414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f360416f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(h41.y0 y0Var, java.lang.String str, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360414d = y0Var;
        this.f360415e = str;
        this.f360416f = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.w0(this.f360414d, this.f360415e, this.f360416f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.y0 y0Var = this.f360414d;
        boolean z17 = y0Var.f360434j;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "show: skip after released");
            return f0Var;
        }
        int i17 = h41.y0.f360424e + 1;
        h41.y0.f360424e = i17;
        y0Var.f360430d = i17;
        h41.y0.f360425f.put(new java.lang.Integer(i17), y0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show: ");
        sb6.append(y0Var.f360430d);
        sb6.append(" scene=");
        java.lang.String str = this.f360415e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", sb6.toString());
        int i18 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094.f153767p;
        int i19 = y0Var.f360430d;
        java.lang.String[] usernames = (java.lang.String[]) this.f360416f.toArray(new java.lang.String[0]);
        f41.n a17 = h41.y0.a(y0Var, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SelectContactCard", "show uiId=" + i19 + ", usernames=" + kz5.z.d0(usernames, ",", null, null, 0, null, null, 62, null) + ", scene=" + a17);
        android.app.Activity a18 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af.B.a();
        if (a18 instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "openSelectContact: reuse existing A2ACardActivity");
            ((com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af) a18).U6(i19, usernames, a17);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.A2AActivity", "openSelectContact: no available context, cannot show card");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "openSelectContact: start new A2ACardActivity");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af.class);
                intent.putExtra("ui_id", i19);
                intent.putExtra("usernames", usernames);
                f41.c cVar = f41.c.f341003d;
                intent.putExtra("card_type", 0);
                intent.putExtra("select_contact_scene", a17.ordinal());
                intent.addFlags(268435456);
                android.os.Bundle bundle = android.app.ActivityOptions.makeCustomAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559254i, 0).toBundle();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(bundle);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSelectContact", "(I[Ljava/lang/String;Lcom/tencent/mm/open_voice_control/card/SelectContactCard$Scene;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
                context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
                yj0.a.f(context, "com/tencent/mm/open_voice_control/card/A2ACardActivity$Companion", "openSelectContact", "(I[Ljava/lang/String;Lcom/tencent/mm/open_voice_control/card/SelectContactCard$Scene;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            }
        }
        return f0Var;
    }
}
