package av2;

/* loaded from: classes2.dex */
public final class c extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f14203g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public long f14204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI f14205i;

    public c(com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI) {
        this.f14205i = finderHomeSlideProfileUI;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            this.f14203g.post(new av2.b(ev6, this, this.f14205i));
        }
    }
}
