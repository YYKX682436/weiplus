package gh4;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353469d;

    public k0(java.util.List list) {
        this.f353469d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c> list = this.f353469d;
        if (list != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo : list) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
                java.lang.String field_id = multiTaskInfo.f66791xc8a07680;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = gh4.m0.f353472a;
                sb6.append(gh4.m0.f353472a);
                sb6.append(field_id);
                java.lang.String sb7 = sb6.toString();
                java.lang.String field_id2 = multiTaskInfo.f66791xc8a07680;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id2, "field_id");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String str2 = gh4.m0.f353472a;
                sb8.append(gh4.m0.f353473b);
                sb8.append(field_id2);
                java.lang.String sb9 = sb8.toString();
                if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                    if (!com.p314xaae8f345.mm.vfs.w6.j(sb9)) {
                        com.p314xaae8f345.mm.vfs.w6.c(sb7, sb9);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarLogic", "oldSrcImgPath:" + sb7 + ", newSrcImgPath:" + sb9);
                    com.p314xaae8f345.mm.vfs.w6.h(sb7);
                }
            }
        }
        java.lang.String str3 = gh4.m0.f353472a;
        if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.mm.vfs.w6.f(str3);
        }
        o11.g gVar = gh4.j0.f353466a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarConfig", "setTaskBarRecentFirstTransImgPathFlag flag:%b", java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("taskbar_config").putBoolean("taskbar_recent_first_trans_image_path", false);
    }
}
