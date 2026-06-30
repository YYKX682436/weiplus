package ni3;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9, java.lang.String str) {
        super(0);
        this.f419099d = c16559xedc507d9;
        this.f419100e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9 = this.f419099d;
        c16559xedc507d9.m66990x60c26fd2().setText(this.f419100e);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c16559xedc507d9.m66991x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        c16559xedc507d9.m66990x60c26fd2().setOnClickListener(new ni3.d0(c16559xedc507d9));
        return jz5.f0.f384359a;
    }
}
