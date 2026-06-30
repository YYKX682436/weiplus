package vq;

/* loaded from: classes5.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520732d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList;
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f432221a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UDR Project Id: ilinkres_c42c04f5");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w Zi = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Zi("ilinkres_c42c04f5");
        if (Zi != null && (linkedList = Zi.f299119d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x) it.next();
                sb6.append("\n\n");
                sb6.append(xVar.m117638xfb82e301());
                sb6.append("\n版本：");
                sb6.append(xVar.f299123e);
                sb6.append("\n大小：");
                long j17 = xVar.f299126h;
                if (j17 > 1000000) {
                    sb6.append(j17 / 1000000.0d);
                    sb6.append("MB");
                } else {
                    sb6.append(j17 / 1000.0d);
                    sb6.append("KB");
                }
                sb6.append("\n路径：");
                sb6.append(xVar.K[20] ? xVar.f299141z : "");
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f520732d);
        u1Var.g(sb7);
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
