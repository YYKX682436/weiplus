package hu2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final hu2.a f366614a = new hu2.a();

    public final void a(java.lang.String userName, java.lang.String textStatusId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusId, "textStatusId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommentSdkReporter", "commentErrorReport >> " + userName + ", " + textStatusId + ", " + z17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_self_textstatus", java.lang.Integer.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, c01.z1.r()) ? 1 : 2));
        hashMap.put("textstatusid", textStatusId);
        hashMap.put("is_textstatus_expired", java.lang.Integer.valueOf(z17 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("textstatus_expire_cannot_comment_toast", "view_exp", hashMap, 28809);
    }
}
