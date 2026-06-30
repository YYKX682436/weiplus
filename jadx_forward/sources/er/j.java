package er;

/* loaded from: classes12.dex */
public final class j extends er.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        super(emojiInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
    }

    @Override // er.f
    public java.lang.String e() {
        java.lang.String mo42933xb5885648 = this.f337463f.mo42933xb5885648();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
        return mo42933xb5885648;
    }

    @Override // er.f, java.lang.Runnable
    public void run() {
        super.run();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("KEY_DATA", this.f337463f);
        bundle.setClassLoader(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.class.getClassLoader());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, er.h.class, new er.i(this));
    }
}
