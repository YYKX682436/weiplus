package b93;

/* loaded from: classes.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (java.lang.System.currentTimeMillis() - ((java.lang.Long) c01.d9.b().p().l(209408, 0L)).longValue() > 86400000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.PostTaskGetContactLabelListener", "cpan[callback] get contact label list.");
            c01.d9.e().g(new e93.d());
            c01.d9.b().p().w(209408, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 86400000) + 1800000));
        }
        return false;
    }
}
