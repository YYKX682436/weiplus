package rt2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f481038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rt2.g gVar) {
        super(1);
        this.f481038d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f481038d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t8 t8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.Z = intent.getIntExtra("disableFullScreenSlideUpGuide", 0) != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80.f216129e = intent.getIntExtra("disableTeenModeGuide", 0) != 0;
        return jz5.f0.f384359a;
    }
}
