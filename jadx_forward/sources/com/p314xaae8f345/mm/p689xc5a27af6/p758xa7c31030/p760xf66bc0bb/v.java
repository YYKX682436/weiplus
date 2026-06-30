package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class v extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x xVar = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y.f149253h;
                    java.util.ArrayList arrayList = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y.f149254i;
                    java.lang.String action2 = intent.getAction();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(action2);
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x.a(xVar, arrayList, true, action2);
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x xVar2 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y.f149253h;
                java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y.f149254i;
                java.lang.String action3 = intent.getAction();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(action3);
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x.a(xVar2, arrayList2, false, action3);
            }
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.d.a(java.lang.String.valueOf(intent.getAction()));
    }
}
