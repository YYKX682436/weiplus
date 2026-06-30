package uo2;

/* loaded from: classes2.dex */
public abstract class m0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: b, reason: collision with root package name */
    public static final uo2.l0 f511166b = new uo2.l0(null);

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f511167a;

    public void a(java.lang.Object obj) {
    }

    public abstract boolean b(long j17, int i17);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "getEditingAudioUrl")) {
            return b(j17, i17);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finishMusicOriginInfo")) {
            return false;
        }
        a(obj);
        return false;
    }
}
