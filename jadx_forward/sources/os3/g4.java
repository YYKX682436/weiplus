package os3;

/* loaded from: classes8.dex */
public class g4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429623d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429623d = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429623d;
        if (viewOnCreateContextMenuListenerC16941x4db497e1.isFinishing() || viewOnCreateContextMenuListenerC16941x4db497e1.isDestroyed() || c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            return;
        }
        java.lang.String str = c10756x2a5d7b2d.f149939d;
        ks3.b0 b0Var = null;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailMsgHelper", "parse fail, maps is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailMsgHelper", "parse mail msg %s", str);
            b0Var = new ks3.b0();
            b0Var.f393159a = (java.lang.String) d17.get(".msg.pushmail.mailid");
            b0Var.f393160b = (java.lang.String) d17.get(".msg.pushmail.content.date");
            b0Var.f393161c = (java.lang.String) d17.get(".msg.pushmail.content.subject");
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.pushmail.content.fromlist.$count"), 0);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.pushmail.content.tolist.$count"), 0);
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.pushmail.content.cclist.$count"), 0);
            for (int i17 = 0; i17 < P; i17++) {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str2 = ".msg.pushmail.content.fromlist.item";
                if (i17 > 0) {
                    str2 = ".msg.pushmail.content.fromlist.item" + i17;
                }
                bundle.putString(ya.b.f77485x2838ac37, (java.lang.String) d17.get(str2 + ".name"));
                bundle.putString("item_addr", (java.lang.String) d17.get(str2 + ".addr"));
                b0Var.f393162d.add(bundle);
            }
            for (int i18 = 0; i18 < P2; i18++) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.lang.String str3 = ".msg.pushmail.content.tolist.item";
                if (i18 > 0) {
                    str3 = ".msg.pushmail.content.tolist.item" + i18;
                }
                bundle2.putString(ya.b.f77485x2838ac37, (java.lang.String) d17.get(str3 + ".name"));
                bundle2.putString("item_addr", (java.lang.String) d17.get(str3 + ".addr"));
                b0Var.f393163e.add(bundle2);
            }
            for (int i19 = 0; i19 < P3; i19++) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                java.lang.String str4 = ".msg.pushmail.content.cclist.item";
                if (i19 > 0) {
                    str4 = ".msg.pushmail.content.cclist.item" + i19;
                }
                bundle3.putString(ya.b.f77485x2838ac37, (java.lang.String) d17.get(str4 + ".name"));
                bundle3.putString("item_addr", (java.lang.String) d17.get(str4 + ".addr"));
                b0Var.f393164f.add(bundle3);
            }
        }
        viewOnCreateContextMenuListenerC16941x4db497e1.f236460f = b0Var;
        if (b0Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new os3.q3(this));
        }
    }
}
