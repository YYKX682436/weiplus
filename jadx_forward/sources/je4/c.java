package je4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.c f380850a = new je4.c();

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMediaDir", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("draft") + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFilePathUtil", "create sns draft dir:" + str + " result:" + com.p314xaae8f345.mm.vfs.w6.u(str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediaDir", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        return str;
    }

    public final jz5.l b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMediaPath", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String a17 = a();
        jz5.l lVar = new jz5.l(a17 + "video_" + currentTimeMillis + ".mp4", a17 + "thumb_" + currentTimeMillis + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediaPath", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        return lVar;
    }
}
