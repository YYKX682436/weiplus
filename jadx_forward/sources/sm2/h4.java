package sm2;

/* loaded from: classes2.dex */
public final class h4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f491020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(sm2.o4 o4Var, yz5.a aVar) {
        super(1);
        this.f491019d = o4Var;
        this.f491020e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        re2.h failure = (re2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failure, "failure");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f491019d.f491143f, "runCoLiveAvatarMerger: FAILED (non-blocking), stage=" + failure.f475950a + ", errCode=" + failure.f475951b + ", errMsg=" + failure.f475952c);
        this.f491020e.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
