package gf;

/* loaded from: classes7.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.o0 f352668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2936x80def495.jni.InterfaceC25595x3146795c f352669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f352670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352671g;

    public n0(gf.o0 o0Var, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25595x3146795c interfaceC25595x3146795c, byte[] bArr, java.lang.String str) {
        this.f352668d = o0Var;
        this.f352669e = interfaceC25595x3146795c;
        this.f352670f = bArr;
        this.f352671g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = this.f352668d.f352687a.mo50354x59eafec1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50354x59eafec1);
        com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = mo50354x59eafec1.mo49614x6665a5c5("tmp" + java.lang.System.currentTimeMillis());
        if (mo49614x6665a5c5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineFileSystemImpl", "tmpFile is null, error");
            this.f352669e.mo95908x762af4d0(-1, "");
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.R(mo49614x6665a5c5.o(), this.f352670f);
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec12 = this.f352668d.f352687a.mo50354x59eafec1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50354x59eafec12);
        boolean z17 = true;
        mo50354x59eafec12.mo49619x6aa75256(mo49614x6665a5c5, this.f352671g, true, b0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.SkylineFileSystemImpl", "writeTempFileAsync success: " + ((java.lang.String) b0Var.f373357a));
        java.lang.CharSequence charSequence = (java.lang.CharSequence) b0Var.f373357a;
        if (charSequence != null && charSequence.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineFileSystemImpl", "pTempFilePath is null, error");
            this.f352669e.mo95908x762af4d0(-1, "");
        } else {
            com.p314xaae8f345.p2936x80def495.jni.InterfaceC25595x3146795c interfaceC25595x3146795c = this.f352669e;
            java.lang.Object value = b0Var.f373357a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            interfaceC25595x3146795c.mo95908x762af4d0(0, (java.lang.String) value);
        }
    }
}
