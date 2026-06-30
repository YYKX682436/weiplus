package vr;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.u f520958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f520959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f520960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520962h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vr.u uVar, boolean z17, byte[] bArr, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f520958d = uVar;
        this.f520959e = z17;
        this.f520960f = bArr;
        this.f520961g = str;
        this.f520962h = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f520958d.f520971a;
        if (lVar != null) {
            jz5.l lVar2 = new jz5.l("fromSearch", java.lang.Boolean.valueOf(this.f520959e));
            byte[] emojiBytes = this.f520960f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiBytes, "$emojiBytes");
            lVar.mo146xb9724478(kz5.c1.k(lVar2, new jz5.l("emoji", emojiBytes), new jz5.l("thumbPath", this.f520961g), new jz5.l("coverPath", this.f520962h)));
        }
        return jz5.f0.f384359a;
    }
}
