package ee5;

/* loaded from: classes9.dex */
public final class q0 extends ee5.t2 implements zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc f333534r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        return new android.text.SpannableString("");
    }

    @Override // ee5.t2
    public zd5.n P6() {
        return null;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemEmojiUIC", "[onItemClick] position:%s", java.lang.Integer.valueOf(i17));
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemEmojiUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
    }
}
