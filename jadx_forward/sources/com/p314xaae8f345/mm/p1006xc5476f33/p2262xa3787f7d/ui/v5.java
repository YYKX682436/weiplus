package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 f254698d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0) {
        this.f254698d = activityC18589x3dbac5d0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        byte[] bArr;
        byte[] bArr2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0.f254430g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0 = this.f254698d;
        activityC18589x3dbac5d0.getClass();
        r45.v26 v26Var = new r45.v26();
        v26Var.f469363g = 1;
        java.lang.String stringExtra = activityC18589x3dbac5d0.getIntent().getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2);
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = stringExtra.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String j17 = gm0.j1.b().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getUinString(...)");
        byte[] bytes2 = j17.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new javax.crypto.spec.SecretKeySpec(bytes, "HmacSHA256"));
            bArr = mac.doFinal(bytes2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "doFinal(...)");
        } catch (java.lang.Throwable unused) {
            bArr = new byte[0];
        }
        java.lang.String j18 = gm0.j1.b().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j18, "getUinString(...)");
        byte[] bytes3 = j18.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
        try {
            javax.crypto.Mac mac2 = javax.crypto.Mac.getInstance("HmacSHA256");
            mac2.init(new javax.crypto.spec.SecretKeySpec(bArr, "HmacSHA256"));
            bArr2 = mac2.doFinal(bytes3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "doFinal(...)");
        } catch (java.lang.Throwable unused2) {
            bArr2 = new byte[0];
        }
        v26Var.f469360d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr2, 0, bArr2.length);
        v26Var.f469361e = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) activityC18589x3dbac5d0.f254431e).mo141623x754a37bb()).getText().toString();
        v26Var.f469362f = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) activityC18589x3dbac5d0.f254432f).mo141623x754a37bb()).getText().toString();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4277;
        lVar.f152199c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
        lVar.f152197a = v26Var;
        lVar.f152198b = new r45.w26();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC18589x3dbac5d0.mo55332x76847179(), "", activityC18589x3dbac5d0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a18 = o01.d.f423424a.a(a17);
        p012xc85e97e9.p093xedfae76a.c1 a19 = pf5.z.f435481a.a(activityC18589x3dbac5d0).a(um3.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = ((um3.b) a19).O6();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.c(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.s5(a18, Q, activityC18589x3dbac5d0, null));
        activityC18589x3dbac5d0.mo48674x36654fab();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
