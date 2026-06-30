package sg0;

@j95.b
/* loaded from: classes.dex */
public class y3 extends i95.w implements tg0.o1 {
    public void Ai(android.content.Context context, r45.un6 un6Var, int i17) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("key_context", un6Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
        }
        if (un6Var.f469038h == 100203) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.j(context, ".ui.video.fs.TopStoryFSVideoUI", intent, i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.j(context, ".ui.video.list.TopStoryListVideoUI", intent, i17);
        }
    }

    public void Bi(android.content.Context context, android.content.Intent intent, double d17, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar, com.p314xaae8f345.mm.ui.zc zcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        zg0.s3 s3Var = new zg0.s3(context, intent, true, 0.0d, false, null, null, false, 248, null);
        s3Var.f554315c = false;
        s3Var.f554316d = d17;
        s3Var.f554317e = true;
        s3Var.f554318f = aVar;
        s3Var.f554319g = zcVar;
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(s3Var);
    }

    public void wi(android.content.Intent intent, int i17, boolean z17, int i18) {
        intent.putExtra("ftsbizscene", i17);
        java.util.Map b17 = su4.r2.b(i17, z17, i18);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        java.lang.String f17 = su4.r2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0));
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        intent.putExtra("rawUrl", su4.r2.e(b17, 0));
        intent.putExtra("ftsType", i18);
    }
}
