package hi4;

/* loaded from: classes11.dex */
public final class d implements wn.b {

    /* renamed from: a, reason: collision with root package name */
    public int f363078a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f363079b = jz5.h.b(hi4.c.f363077d);

    public d(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // wn.b
    public java.util.List a(int i17) {
        l75.n0 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusGreetingItemStorage");
        java.util.List Ca = ((li4.b) c17).Ca(i17, 60);
        d(Ca);
        return Ca;
    }

    @Override // wn.b
    public java.util.List b() {
        l75.n0 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusGreetingItemStorage");
        java.util.List Ca = ((li4.b) c17).Ca(0, 15);
        d(Ca);
        return Ca;
    }

    @Override // wn.b
    public l75.n0 c() {
        return ni4.x.f419309d.k();
    }

    public final void d(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hi4.e eVar = (hi4.e) it.next();
            int i17 = 2;
            if (this.f363078a == 2) {
                eVar.M = 0;
            } else if (java.lang.Math.abs(((java.lang.Number) ((jz5.n) this.f363079b).mo141623x754a37bb()).intValue() - eVar.f76591xac3be4e) < 259200) {
                if (this.f363078a == 0) {
                    this.f363078a = 1;
                    i17 = 1;
                    eVar.M = i17;
                }
                i17 = 0;
                eVar.M = i17;
            } else {
                int i18 = this.f363078a;
                if (i18 == 0 || i18 == 1) {
                    this.f363078a = 2;
                    eVar.M = i17;
                }
                i17 = 0;
                eVar.M = i17;
            }
        }
    }
}
