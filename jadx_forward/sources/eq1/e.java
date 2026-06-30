package eq1;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f337330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s40.t0 t0Var, java.lang.String str) {
        super(1);
        this.f337330d = t0Var;
        this.f337331e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        if ((c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null) != null) {
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76794xd0557130);
            if (m76794xd0557130.m75942xfb822ef2(0) != 0) {
                i95.m c17 = i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76794xd05571302);
                long m75942xfb822ef2 = m76794xd05571302.m75942xfb822ef2(0);
                s40.t0 t0Var = this.f337330d;
                qs5.d dVar = qs5.d.f447959e;
                java.lang.String str = this.f337331e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                s40.w0.u9((s40.w0) c17, m75942xfb822ef2, false, null, t0Var, 3, str, null, null, 192, null);
                return jz5.f0.f384359a;
            }
        }
        eq1.h hVar = eq1.h.f337345a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "cgi get finderObject fail!");
        this.f337330d.mo44975x964762a2(0L, 1, new r45.l71());
        return jz5.f0.f384359a;
    }
}
