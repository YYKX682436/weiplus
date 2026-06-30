package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 f236949d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77) {
        this.f236949d = c16974xc8e7af77;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77 = this.f236949d;
        java.lang.String str = c16974xc8e7af77.f236871m;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = c16974xc8e7af77.f236869h.f105729d;
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
        } else {
            ((sl.j) c1Var).c();
        }
        android.content.Context context = c16974xc8e7af77.f236868g;
        if (iq.b.C(context) || iq.b.v(context) || iq.b.e(context)) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16974xc8e7af77.f236871m)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str2 = c16974xc8e7af77.f236871m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(c16974xc8e7af77.f236869h.f105730e)) {
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var2 = c16974xc8e7af77.f236869h.f105729d;
            boolean z18 = false;
            if (c1Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
                c17 = false;
            } else {
                c17 = ((sl.j) c1Var2).c();
            }
            if (c17) {
                c16974xc8e7af77.c();
                c16974xc8e7af77.f236869h.c();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVoiceBaseView", "resume play");
                bt3.a3 a3Var = c16974xc8e7af77.f236869h;
                a3Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVoiceHelper", "resume play");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
                com.p314xaae8f345.mm.p944x882e457a.c1 c1Var3 = a3Var.f105729d;
                if (c1Var3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
                } else {
                    z18 = ((sl.j) c1Var3).e();
                }
                if (!z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77.a(c16974xc8e7af77);
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77.a(c16974xc8e7af77);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
