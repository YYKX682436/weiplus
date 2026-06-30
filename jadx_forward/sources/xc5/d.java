package xc5;

/* loaded from: classes12.dex */
public final class d extends lf3.n implements xc5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public mf3.k V6() {
        try {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.tzq);
            if (c22956x1a4bbf4 == null) {
                return null;
            }
            int m83649xfda78ef6 = c22956x1a4bbf4.m83649xfda78ef6();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83648xf939df19 = c22956x1a4bbf4.m83648xf939df19();
            mf3.t tVar = m83648xf939df19 instanceof mf3.t ? (mf3.t) m83648xf939df19 : null;
            if (tVar == null) {
                return null;
            }
            return (mf3.k) ((mf3.f) tVar.f407653c).get(m83649xfda78ef6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryCurrentMediaProvider", "getCurrentMediaInfo failed: " + e17.getMessage());
            return null;
        }
    }
}
