package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74687a;

    public b(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI) {
        this.f74687a = chatroomNoticeUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        int i19 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
        this.f74687a.q7(i17, i18, str);
        return null;
    }
}
