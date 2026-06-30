package x10;

/* loaded from: classes9.dex */
public final class a extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.FinderLotteryCompleteRecord", "handle FinderLotteryCompleteRecord jump");
        android.content.Context c17 = context.c();
        if (c17 == null) {
            callback.c("context.context is null");
            return;
        }
        ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Oj(c17, null, true);
        callback.d(null);
    }
}
