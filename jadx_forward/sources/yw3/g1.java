package yw3;

/* loaded from: classes12.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI f548280d;

    public g1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
        this.f548280d = repairerFlutterEmojiBridgeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI = this.f548280d;
        repairerFlutterEmojiBridgeUI.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.e6.class))).getClass();
        gr.t g17 = gr.t.g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = g17.f356224j;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) r2Var.get("download_custom");
        if (arrayList2 == null || g17.f356215a) {
            g17.f356215a = false;
            if (!((km0.c) gm0.j1.p().a()).a()) {
                throw new java.lang.UnsupportedOperationException("need get from main process");
            }
            z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
            c17.getClass();
            arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(c17.K1(81, true));
            r2Var.put("download_custom", arrayList2);
        }
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) arrayList2.get(i17);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d6.class))).getClass();
                wq.a f17 = wq.a.f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getInstance(...)");
                byte[] c18 = f17.c(interfaceC4987x84e327cb);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(c18) && c18 != null) {
                    if (!(c18.length == 0)) {
                        java.lang.String str = lp0.b.h() + "emoji/temp/decrypt/";
                        com.p314xaae8f345.mm.vfs.w6.u(str);
                        java.lang.String str2 = str + interfaceC4987x84e327cb.mo42933xb5885648();
                        com.p314xaae8f345.mm.vfs.w6.a(str2, c18);
                        repairerFlutterEmojiBridgeUI.d.put("EmojiText", str2);
                        android.widget.Toast.makeText((android.content.Context) repairerFlutterEmojiBridgeUI, (java.lang.CharSequence) ("decrypt first WXAM success, path:" + str2), 0).show();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerFlutterEmojiBridgeUI.f, "decrypt success, path:" + str2);
                        break;
                    }
                }
                i17++;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
