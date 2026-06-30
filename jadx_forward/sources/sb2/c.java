package sb2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb2.i f486940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sb2.i iVar) {
        super(0);
        this.f486940d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sb2.i iVar = this.f486940d;
        try {
            iVar.Z6(true);
            iVar.Y6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSlideEnterLiveTipController", "hideTip fail " + e17);
        }
        return jz5.f0.f384359a;
    }
}
