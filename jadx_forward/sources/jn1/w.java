package jn1;

/* loaded from: classes11.dex */
public final class w extends g75.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.t
    public void e() {
        java.lang.String username = h().k("Avatar_Username");
        java.lang.String imageKey = h().k("Common_ImageKey");
        android.graphics.Bitmap Ui = ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Ui(imageKey);
        if (Ui == null) {
            gk0.k kVar = (gk0.k) h().d("Common_BitmapOptions");
            Ui = ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Ri(kVar != null ? kVar.f353966d : 0.1f);
        }
        hn1.s sVar = (hn1.s) i95.n0.c(hn1.s.class);
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        pm0.v.O("notifyAvatarCallback", new hn1.p(sVar, imageKey, Ui, username));
    }
}
