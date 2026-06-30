package cw4;

@j95.b
/* loaded from: classes12.dex */
public class s extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        ku4.i iVar = ku4.i.f394047a;
        ((ku5.t0) ku5.t0.f394148d).l(ku4.c.f394041d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "WebCanvasPackageDownManager");
        ku4.z.f394072a.c(false);
        q25.b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j1(), "//webcompt");
        q25.b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1(), "//webview");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        pv1.c cVar;
        super.mo8845x3e5a77bb(context);
        km0.b a17 = gm0.j1.p().a();
        if (!a17.a()) {
            a17.b(":tools");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
            synchronized (pv1.c.class) {
                if (pv1.c.f440102c == null) {
                    pv1.c.f440102c = new pv1.c();
                }
                hv1.d.f();
                cVar = pv1.c.f440102c;
            }
            by5.c4.f("WXFileDownloaderBridge", "setFileDownloaderProxy:" + cVar);
            rx5.c.f482883b = cVar;
            cw4.r rVar = new cw4.r(new cw4.q(this));
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                rVar.run();
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(rVar);
            }
        }
    }
}
