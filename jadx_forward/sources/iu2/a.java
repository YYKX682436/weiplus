package iu2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final iu2.a f376516a = new iu2.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f376517b = new java.util.HashMap();

    public final java.lang.String a(jv2.a commentObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
        commentObj.m141444x9616526c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(commentObj.f67478xf9a02e3e);
        sb6.append('_');
        sb6.append(commentObj.t0());
        return sb6.toString();
    }

    public final void b(java.lang.String key, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveDraft() called with: key = ");
        sb6.append(key);
        sb6.append(" draft:");
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDraftCache", sb6.toString());
        f376517b.put(key, str);
    }
}
