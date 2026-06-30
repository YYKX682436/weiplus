package qb0;

/* loaded from: classes7.dex */
public class n implements com.p314xaae8f345.mm.app.a3 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: getHandler */
    public android.os.Handler mo14497x67189314() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        boolean z17 = false;
        xp3.i.a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f.class).j(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.l(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.v0.f234673g.f234674d = false;
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2.f149067g != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2.f149067g.mo8889x3be51a90(str);
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (z65.c.a()) {
            try {
                z17 = z2.n1.b(context).contains(context.getPackageName());
            } catch (java.lang.Exception unused) {
            }
            if (z17) {
                try {
                    context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.C12951xc91ca5c3.class));
                } catch (java.lang.Exception unused2) {
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        boolean z17;
        xp3.i.a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f.class).j(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.l(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.v0.f234673g.f234674d = true;
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2.f149067g != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2.f149067g.mo8890x1952ea5(str);
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (z65.c.a()) {
            try {
                z17 = z2.n1.b(context).contains(context.getPackageName());
            } catch (java.lang.Exception unused) {
                z17 = false;
            }
            if (z17) {
                try {
                    context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.C12951xc91ca5c3.class));
                } catch (java.lang.Exception unused2) {
                }
            }
        }
    }
}
