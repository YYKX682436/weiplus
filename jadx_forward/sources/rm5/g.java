package rm5;

/* loaded from: classes10.dex */
public final class g implements com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rm5.h f479021a;

    public g(rm5.h hVar) {
        this.f479021a = hVar;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener
    /* renamed from: onCompletion */
    public final void mo96462xa6db431b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 requestedTime, android.graphics.Bitmap bitmap, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AssetImageGeneratorResult result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestedTime, "requestedTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (result != com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.AssetImageGeneratorResult.AssetImageGeneratorSucceeded) {
            bitmap = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = -1L;
        rm5.h hVar = this.f479021a;
        synchronized (hVar.f479028e) {
            kz5.h0.B(hVar.f479028e, new rm5.f(requestedTime, g0Var, bitmap));
        }
        xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "get " + this.f479021a.hashCode() + ": " + g0Var.f391654d + (char) 65292 + (requestedTime.m97232x31040141() / 1000), new java.lang.Object[0]);
        rm5.h hVar2 = this.f479021a;
        hVar2.f479029f = false;
        hVar2.e();
        if (g0Var.f391654d < 0 || bitmap == null) {
            return;
        }
        rm5.c cVar = rm5.h.f479022h;
        rm5.h.f479023i.put(this.f479021a.f479025b + '-' + g0Var.f391654d, bitmap);
    }
}
