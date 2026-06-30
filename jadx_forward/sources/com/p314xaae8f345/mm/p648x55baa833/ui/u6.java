package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class u6 {
    public u6(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(in.b info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ApplicationInfo: Inviter: ");
        in.c cVar = info.f374251d;
        sb6.append(cVar != null ? cVar.f374254d : null);
        sb6.append(' ');
        in.c cVar2 = info.f374251d;
        sb6.append(cVar2 != null ? cVar2.f374255e : null);
        sb6.append(" joinScene=");
        in.c cVar3 = info.f374251d;
        sb6.append(cVar3 != null ? java.lang.Integer.valueOf(cVar3.f374260m) : null);
        sb6.append(" joinQRCodeExpiredTime=");
        in.c cVar4 = info.f374251d;
        sb6.append(cVar4 != null ? java.lang.Long.valueOf(cVar4.f374262o) : null);
        sb6.append(" joinQRCodeUrl=");
        in.c cVar5 = info.f374251d;
        sb6.append(cVar5 != null ? cVar5.f374261n : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
        java.util.LinkedList linkedList = info.f374252e;
        if (linkedList != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                in.c cVar6 = (in.c) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "ApplicationInfo: Applicant " + i17 + ": " + cVar6.f374254d + ' ' + cVar6.f374255e + " sex=" + cVar6.f374263p + " quitChatroomInfo=" + cVar6.f374257g + " headimgurl=" + cVar6.f374256f);
                i17 = i18;
            }
        }
    }
}
