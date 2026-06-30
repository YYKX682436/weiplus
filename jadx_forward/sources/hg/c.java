package hg;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f362812d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg.h f362813e;

    public c(hg.h hVar) {
        this.f362813e = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        this.f362812d = z17;
        hg.h hVar = this.f362813e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = hVar.f362830a;
        if (oaVar == null || oaVar.a() == null || hVar.f362830a.a().mo51310xc2a54588() == null || sf.c.f488472a.b()) {
            b(z17);
        } else {
            if (hVar.f362838i) {
                return;
            }
            hVar.f362838i = true;
            hVar.f362830a.a().mo51310xc2a54588().postDelayed(new java.lang.Runnable() { // from class: hg.c$$a
                @Override // java.lang.Runnable
                public final void run() {
                    hg.c cVar = hg.c.this;
                    hg.h hVar2 = cVar.f362813e;
                    if (hVar2.f362836g) {
                        cVar.b(cVar.f362812d);
                    }
                    hVar2.f362838i = false;
                }
            }, 250L);
        }
    }

    public final void b(final boolean z17) {
        hg.h hVar = this.f362813e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 b17 = hVar.b();
        if (b17 != null) {
            android.widget.EditText editText = hVar.f362833d;
            if (editText != null) {
                if (z17) {
                    b17.f173224x = editText;
                } else {
                    b17.e(editText);
                }
            }
            b17.d(z17 ? hVar.f362835f : 0);
        }
        sf.c.f488472a.a(hVar.f362830a.a(), hVar.f362830a.b(), new sf.b(z17 ? hVar.f362835f : 0, hVar.c(hVar.f362835f), java.lang.Integer.valueOf(hVar.f362837h), new yz5.a() { // from class: hg.c$$c
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                hg.h hVar2 = hg.c.this.f362813e;
                boolean z18 = z17;
                hVar2.m120231x88a99e47(z18, z18 ? hVar2.f362835f : 0, false);
                return null;
            }
        }));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(final int i17) {
        int i18;
        hg.h hVar = this.f362813e;
        boolean z17 = (i17 == 0 || (i18 = hVar.f362835f) == 0 || i17 == i18) ? false : true;
        hVar.f362835f = i17;
        if (z17) {
            sf.c.f488472a.a(hVar.f362830a.a(), hVar.f362830a.b(), new sf.b(i17, hVar.c(i17), java.lang.Integer.valueOf(hVar.f362837h), new yz5.a() { // from class: hg.c$$b
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    hg.c cVar = hg.c.this;
                    cVar.getClass();
                    int i19 = i17;
                    cVar.f362813e.m120231x88a99e47(i19 > 0, i19, false);
                    return null;
                }
            }));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 b17 = hVar.b();
        if (b17 != null) {
            b17.d(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    /* renamed from: getHeight */
    public int mo53489x1c4fb41d() {
        return this.f362813e.f362835f;
    }
}
