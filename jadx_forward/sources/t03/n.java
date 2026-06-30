package t03;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f496021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t03.k0 k0Var) {
        super(1);
        this.f496021d = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = (com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6) obj;
        long mo100924x2d67b867 = interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100924x2d67b867(205) : 0L;
        int mo100929x8d5c7601 = interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100929x8d5c7601() : 0;
        int mo100928x463504c = interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100928x463504c() : 0;
        t03.k0 k0Var = this.f496021d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "setInputContentInfo, size:[" + mo100929x8d5c7601 + ", " + mo100928x463504c + "], rotate:" + mo100924x2d67b867);
        k0Var.f496000i.m(mo100929x8d5c7601, mo100928x463504c, (int) mo100924x2d67b867);
        yz5.a aVar = k0Var.f496007s;
        if (aVar != null) {
            ((t03.a0) aVar).mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
