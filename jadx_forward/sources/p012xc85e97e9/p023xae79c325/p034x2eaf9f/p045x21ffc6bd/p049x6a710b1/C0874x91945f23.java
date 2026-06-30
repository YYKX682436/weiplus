package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.ZslRingBuffer */
/* loaded from: classes14.dex */
public final class C0874x91945f23 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0868x587631a9<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> {
    public C0874x91945f23(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0.OnRemoveCallback<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> onRemoveCallback) {
        super(i17, onRemoveCallback);
    }

    /* renamed from: isValidZslFrame */
    private boolean m6245x4e3babec(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 interfaceC0531x43157c89) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be m5256xf262a602 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0664x2fb35075.m5256xf262a602(interfaceC0531x43157c89);
        return (m5256xf262a602.mo2930xfbdfd336() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.LOCKED_FOCUSED || m5256xf262a602.mo2930xfbdfd336() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.PASSIVE_FOCUSED) && m5256xf262a602.mo2928xfa2afa97() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.CONVERGED && m5256xf262a602.mo2932x1b348a7b() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.CONVERGED;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0868x587631a9, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.InterfaceC0870x723b62b0
    /* renamed from: enqueue, reason: merged with bridge method [inline-methods] */
    public void mo6206xa0f98e08(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (m6245x4e3babec(interfaceC0536x1ffeadf3.mo4173xcb10cdf3())) {
            super.mo6206xa0f98e08((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0874x91945f23) interfaceC0536x1ffeadf3);
        } else {
            this.f2115xeb982b35.mo3687x573fcf43(interfaceC0536x1ffeadf3);
        }
    }
}
