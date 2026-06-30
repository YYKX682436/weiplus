package ox2;

/* loaded from: classes2.dex */
public final class c implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e f431178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f431179b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f431178a = c15408x626e05e;
        this.f431179b = interfaceC4987x84e327cb;
    }

    @Override // sr.b
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f431178a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emoji = c15408x626e05e.getEmoji();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f431179b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(emoji, interfaceC4987x84e327cb)) {
            if (!interfaceC4987x84e327cb.E0() && i17 != 1) {
                if (i17 == -1) {
                    c15408x626e05e.m62764x9f055305(false);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = c15408x626e05e.f213906h;
                if (c15276x168ec665 != null) {
                    hc2.f1.z(c15276x168ec665, interfaceC4987x84e327cb, new ox2.a(c15408x626e05e), new ox2.b(c15408x626e05e));
                }
                c15408x626e05e.m62764x9f055305(true);
            }
        }
    }
}
