package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class u6 {
    public u6(kotlin.jvm.internal.i iVar) {
    }

    public final void a(in.b info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ApplicationInfo: Inviter: ");
        in.c cVar = info.f292718d;
        sb6.append(cVar != null ? cVar.f292721d : null);
        sb6.append(' ');
        in.c cVar2 = info.f292718d;
        sb6.append(cVar2 != null ? cVar2.f292722e : null);
        sb6.append(" joinScene=");
        in.c cVar3 = info.f292718d;
        sb6.append(cVar3 != null ? java.lang.Integer.valueOf(cVar3.f292727m) : null);
        sb6.append(" joinQRCodeExpiredTime=");
        in.c cVar4 = info.f292718d;
        sb6.append(cVar4 != null ? java.lang.Long.valueOf(cVar4.f292729o) : null);
        sb6.append(" joinQRCodeUrl=");
        in.c cVar5 = info.f292718d;
        sb6.append(cVar5 != null ? cVar5.f292728n : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
        java.util.LinkedList linkedList = info.f292719e;
        if (linkedList != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                in.c cVar6 = (in.c) obj;
                com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "ApplicationInfo: Applicant " + i17 + ": " + cVar6.f292721d + ' ' + cVar6.f292722e + " sex=" + cVar6.f292730p + " quitChatroomInfo=" + cVar6.f292724g + " headimgurl=" + cVar6.f292723f);
                i17 = i18;
            }
        }
    }
}
