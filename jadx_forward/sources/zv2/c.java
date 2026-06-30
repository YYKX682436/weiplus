package zv2;

/* loaded from: classes4.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.app.Activity activity, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String stringExtra = activity.getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, Ri, stringExtra, 74, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), "post_good_icon", z18 ? "{\"if_have_good\":1}" : "{\"if_have_good\":2}");
    }
}
