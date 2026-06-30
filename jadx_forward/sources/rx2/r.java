package rx2;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f482525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8) {
        super(0);
        this.f482525d = c15415x74224fd8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = this.f482525d;
        android.content.Context context = c15415x74224fd8.f214170v;
        if (context != null) {
            return new rx2.q(c15415x74224fd8, context);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
        throw null;
    }
}
