package ix3;

/* loaded from: classes9.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.x3 f377122e;

    public v3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ix3.x3 x3Var) {
        this.f377121d = f9Var;
        this.f377122e = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m126747x696739c;
        long j17;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f377121d;
        if (f9Var != null) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = f9Var.U1();
            java.lang.String str = "";
            if (U1 == null) {
                U1 = "";
            }
            cVar.m126731xdc93280d(U1, true);
            ix3.x3 x3Var = this.f377122e;
            x3Var.f377140e = cVar;
            v05.b k17 = cVar.k();
            int i17 = 0;
            if (k17 != null && (m75945x2fec8307 = k17.m75945x2fec8307(k17.f513848e + 44)) != null) {
                if (!(m75945x2fec8307.length() > 0)) {
                    m75945x2fec8307 = null;
                }
                if (m75945x2fec8307 != null) {
                    s15.w wVar = new s15.w();
                    wVar.m126728xdc93280d(m75945x2fec8307);
                    x3Var.f377141f = wVar;
                }
            }
            long j18 = 1000;
            long c17 = (c01.id.c() - 1296000000) / j18;
            s15.w wVar2 = x3Var.f377141f;
            if (wVar2 != null) {
                java.util.LinkedList j19 = wVar2.j();
                int size = j19 != null ? j19.size() : 0;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
                java.util.LinkedList j27 = wVar2.j();
                if (j27 != null) {
                    for (java.lang.Object obj : j27) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        s15.h hVar = (s15.h) obj;
                        hVar.Q();
                        if (hVar.Q() > c17) {
                            j17 = c17;
                            hVar.W0(hVar.Q() - 1296000);
                        } else {
                            j17 = c17;
                        }
                        if (hVar.Q() > 0) {
                            try {
                                java.lang.String format = simpleDateFormat.format(new java.util.Date(hVar.Q() * j18));
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                                hVar.T0(format);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RepairerRecordMsgDebugUIC", "时间戳转换失败: " + e17);
                            }
                        }
                        hVar.m163588xabfe893c();
                        hVar.Q();
                        hVar.O();
                        i17 = i18;
                        c17 = j17;
                    }
                }
                java.lang.String m126747x696739c2 = wVar2.m126747x696739c();
                l15.c cVar2 = x3Var.f377140e;
                v05.b k18 = cVar2 != null ? cVar2.k() : null;
                if (k18 != null) {
                    k18.set(k18.f513848e + 44, m126747x696739c2);
                }
                l15.c cVar3 = x3Var.f377140e;
                if (cVar3 != null && (m126747x696739c = cVar3.m126747x696739c()) != null) {
                    str = m126747x696739c;
                }
                f9Var.d1(str);
                pt0.f0.f439742b1.s(f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x3Var.m158354x19263085();
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
                e4Var.f293309c = "已将 " + size + " 条子消息的时间修改为15天前";
                e4Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
