package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class c0 extends m05.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        n05.d dVar = n05.d.f415462d;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity;
        n05.a aVar = new n05.a(true, true, 300L, null, com.p314xaae8f345.mm.R.id.f78271x5f31258e, dVar.toString(), activityC21401x6ce6f73f, false, 0, 0);
        aVar.f415457b = 500L;
        O6("keyboard_show_1", aVar);
        n05.a aVar2 = new n05.a(true, true, 300L, null, com.p314xaae8f345.mm.R.id.f78271x5f31258e, dVar.toString(), activityC21401x6ce6f73f, false, 0, 0);
        aVar.f415457b = 500L;
        O6("keyboard_show_2", aVar2);
    }

    public final void T6(int i17) {
        n05.d dVar = n05.d.f415462d;
        if (i17 == 1) {
            Q6(dVar.toString());
        } else {
            Q6(dVar.toString());
            Q6(n05.d.f415463e.toString());
        }
    }

    public final void U6(int i17) {
        if (i17 == 1) {
            R6(m05.n.f404113g, "keyboard_show_1");
        } else {
            if (i17 != 2) {
                return;
            }
            R6(m05.n.f404113g, "keyboard_show_2");
        }
    }
}
