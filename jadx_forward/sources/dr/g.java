package dr;

/* loaded from: classes12.dex */
public final class g extends dr.s {

    /* renamed from: c, reason: collision with root package name */
    public final dr.r f323917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, dr.r rVar) {
        super(emojiInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f323917c = rVar;
    }

    @Override // dr.s
    public er.f b() {
        zq.h hVar = zq.h.f556505a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        return hVar.a((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb);
    }

    @Override // dr.s
    public void c(boolean z17) {
        pm0.v.X(new dr.f(z17, ar.c.f94889a.a(this.f323933a.mo42933xb5885648()), this));
    }

    @Override // dr.s
    public void f(boolean z17) {
        ar.c cVar = ar.c.f94889a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
        android.graphics.Bitmap a17 = cVar.a(interfaceC4987x84e327cb.mo42933xb5885648());
        interfaceC4987x84e327cb.mo42933xb5885648();
        java.util.Objects.toString(a17);
        if (a17 != null) {
            c(true);
            return;
        }
        dr.r rVar = this.f323917c;
        if (rVar != null) {
            rVar.a(0, interfaceC4987x84e327cb, null);
        }
        dr.s.e(this, false, 1, null);
    }
}
